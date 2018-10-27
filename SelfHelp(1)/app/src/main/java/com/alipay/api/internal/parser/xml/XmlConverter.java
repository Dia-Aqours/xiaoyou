//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alipay.api.internal.parser.xml;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.ResponseParseItem;
import com.alipay.api.SignItem;
import com.alipay.api.internal.mapping.Converter;
import com.alipay.api.internal.mapping.Converters;
import com.alipay.api.internal.mapping.Reader;
import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.XmlUtils;

import org.w3c.dom.Element;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XmlConverter implements Converter {
    public XmlConverter() {
    }

    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz) throws AlipayApiException {
        Element root = XmlUtils.getRootElementFromString(rsp);
        return (T)(AlipayResponse)this.getModelFromXML(root, clazz);
    }

    private <T> T getModelFromXML(final Element element, Class<T> clazz) throws AlipayApiException {
        return element == null?null:Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                Element childE = XmlUtils.getChildElement(element, (String)name);
                return childE != null;
            }

            public Object getPrimitiveObject(Object name) {
                return XmlUtils.getElementValue(element, (String)name);
            }

            public Object getObject(Object name, Class<?> type) throws AlipayApiException {
                Element childE = XmlUtils.getChildElement(element, (String)name);
                return childE != null?XmlConverter.this.getModelFromXML(childE, type):null;
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws AlipayApiException {
                ArrayList list = null;
                Element listE = XmlUtils.getChildElement(element, (String)listName);
                if(listE != null) {
                    list = new ArrayList();
                    List itemEs = XmlUtils.getChildElements(listE, (String)itemName);
                    Iterator i$ = itemEs.iterator();

                    while(i$.hasNext()) {
                        Element itemE = (Element)i$.next();
                        Object obj = null;
                        String value = XmlUtils.getElementValue(itemE);
                        if(String.class.isAssignableFrom(subType)) {
                            obj = value;
                        } else if(Long.class.isAssignableFrom(subType)) {
                            obj = Long.valueOf(value);
                        } else if(Integer.class.isAssignableFrom(subType)) {
                            obj = Integer.valueOf(value);
                        } else if(Boolean.class.isAssignableFrom(subType)) {
                            obj = Boolean.valueOf(value);
                        } else if(Date.class.isAssignableFrom(subType)) {
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                            try {
                                obj = format.parse(value);
                            } catch (ParseException var13) {
                                throw new AlipayApiException(var13);
                            }
                        } else {
                            obj = XmlConverter.this.getModelFromXML(itemE, subType);
                        }

                        if(obj != null) {
                            list.add(obj);
                        }
                    }
                }

                return list;
            }
        });
    }

    public SignItem getSignItem(AlipayRequest<?> request, String responseBody) throws AlipayApiException {
        if(StringUtils.isEmpty(responseBody)) {
            return null;
        } else {
            SignItem signItem = new SignItem();
            String sign = this.getSign(responseBody);
            signItem.setSign(sign);
            String signSourceData = this.getSignSourceData(request, responseBody);
            signItem.setSignSourceDate(signSourceData);
            return signItem;
        }
    }

    private String getSignSourceData(AlipayRequest<?> request, String body) {
        String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
        String errorRootNode = "error_response";
        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);
        return indexOfRootNode > 0?this.parseSignSourceData(body, rootNode, indexOfRootNode):(indexOfErrorRoot > 0?this.parseSignSourceData(body, errorRootNode, indexOfErrorRoot):null);
    }

    private String getSign(String body) {
        String signNodeName = "<sign>";
        String signEndNodeName = "</sign>";
        int indexOfSignNode = body.indexOf(signNodeName);
        int indexOfSignEndNode = body.indexOf(signEndNodeName);
        return indexOfSignNode >= 0 && indexOfSignEndNode >= 0?body.substring(indexOfSignNode + signNodeName.length(), indexOfSignEndNode):null;
    }

    private String parseSignSourceData(String body, String rootNode, int indexOfRootNode) {
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 1;
        int indexOfSign = body.indexOf("<sign");
        return indexOfSign < 0?null:body.substring(signDataStartIndex, indexOfSign);
    }

    public String encryptSourceData(AlipayRequest<?> request, String body, String format, String encryptType, String encryptKey, String charset) throws AlipayApiException {
        ResponseParseItem respSignSourceData = this.getXMLSignSourceData(request, body);
        String bodyIndexContent = body.substring(0, respSignSourceData.getStartIndex());
        String bodyEndContent = body.substring(respSignSourceData.getEndIndex());
        return bodyIndexContent + AlipayEncrypt.decryptContent(respSignSourceData.getEncryptContent(), encryptType, encryptKey, charset) + bodyEndContent;
    }

    private ResponseParseItem getXMLSignSourceData(AlipayRequest<?> request, String body) {
        String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
        String errorRootNode = "error_response";
        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);
        return indexOfRootNode > 0?this.parseXMLSignSourceData(body, rootNode, indexOfRootNode):(indexOfErrorRoot > 0?this.parseXMLSignSourceData(body, errorRootNode, indexOfErrorRoot):null);
    }

    private ResponseParseItem parseXMLSignSourceData(String body, String rootNode, int indexOfRootNode) {
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 1;
        String xmlStartNode = "<response_encrypted>";
        String xmlEndNode = "</response_encrypted>";
        int indexOfSign = body.indexOf(xmlEndNode);
        if(indexOfSign < 0) {
            return new ResponseParseItem(0, 0, "");
        } else {
            int signDataEndIndex = indexOfSign + xmlEndNode.length();
            String encryptBizContent = body.substring(signDataStartIndex, signDataEndIndex);
            String bizContent = encryptBizContent.substring(xmlStartNode.length(), encryptBizContent.length() - xmlEndNode.length());
            return new ResponseParseItem(signDataStartIndex, signDataEndIndex, bizContent);
        }
    }
}
