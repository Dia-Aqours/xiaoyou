//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alipay.api.internal.parser.json;

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
import com.alipay.api.internal.util.json.ExceptionErrorListener;
import com.alipay.api.internal.util.json.JSONValidatingReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonConverter implements Converter {
    public JsonConverter() {
    }

    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz) throws AlipayApiException {
        JSONValidatingReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        if(rootObj instanceof Map) {
            Map rootJson = (Map)rootObj;
            Collection values = rootJson.values();
            Iterator i$ = values.iterator();

            while(i$.hasNext()) {
                Object rspObj = i$.next();
                if(rspObj instanceof Map) {
                    Map rspJson = (Map)rspObj;
                    return (T)(AlipayResponse)this.fromJson(rspJson, clazz);
                }
            }
        }

        return null;
    }

    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws AlipayApiException {
        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            public Object getObject(Object name, Class<?> type) throws AlipayApiException {
                Object tmp = json.get(name);
                if(tmp instanceof Map) {
                    Map map = (Map)tmp;
                    return JsonConverter.this.fromJson(map, type);
                } else {
                    return null;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws AlipayApiException {
                List listObjs = null;
                Object listTmp = json.get(listName);
                if(listTmp instanceof Map) {
                    Map jsonMap = (Map)listTmp;
                    Object itemTmp = jsonMap.get(itemName);
                    if(itemTmp == null && listName != null) {
                        String listNameStr = listName.toString();
                        itemTmp = jsonMap.get(listNameStr.substring(0, listNameStr.length() - 1));
                    }

                    if(itemTmp instanceof List) {
                        listObjs = this.getListObjectsInner(subType, itemTmp);
                    }
                } else if(listTmp instanceof List) {
                    listObjs = this.getListObjectsInner(subType, listTmp);
                }

                return listObjs;
            }

            private List<Object> getListObjectsInner(Class<?> subType, Object itemTmp) throws AlipayApiException {
                ArrayList listObjs = new ArrayList();
                List tmpList = (List)itemTmp;
                Iterator i$ = tmpList.iterator();

                while(i$.hasNext()) {
                    Object subTmp = i$.next();
                    Object obj = null;
                    if(String.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if(Long.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if(Integer.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if(Boolean.class.isAssignableFrom(subType)) {
                        obj = subTmp;
                    } else if(Date.class.isAssignableFrom(subType)) {
                        SimpleDateFormat subMap = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        try {
                            obj = subMap.parse(String.valueOf(subTmp));
                        } catch (ParseException var10) {
                            throw new AlipayApiException(var10);
                        }
                    } else if(subTmp instanceof Map) {
                        Map subMap1 = (Map)subTmp;
                        obj = JsonConverter.this.fromJson(subMap1, subType);
                    }

                    if(obj != null) {
                        listObjs.add(obj);
                    }
                }

                return listObjs;
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

    private String parseSignSourceData(String body, String rootNode, int indexOfRootNode) {
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
        int indexOfSign = body.indexOf("\"sign\"");
        if(indexOfSign < 0) {
            return null;
        } else {
            int signDataEndIndex = indexOfSign - 1;
            return body.substring(signDataStartIndex, signDataEndIndex);
        }
    }

    private String getSign(String body) {
        JSONValidatingReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(body);
        Map rootJson = (Map)rootObj;
        return (String)rootJson.get("sign");
    }

    public String encryptSourceData(AlipayRequest<?> request, String body, String format, String encryptType, String encryptKey, String charset) throws AlipayApiException {
        ResponseParseItem respSignSourceData = this.getJSONSignSourceData(request, body);
        String bodyIndexContent = body.substring(0, respSignSourceData.getStartIndex());
        String bodyEndContent = body.substring(respSignSourceData.getEndIndex());
        return bodyIndexContent + AlipayEncrypt.decryptContent(respSignSourceData.getEncryptContent(), encryptType, encryptKey, charset) + bodyEndContent;
    }

    private ResponseParseItem getJSONSignSourceData(AlipayRequest<?> request, String body) {
        String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
        String errorRootNode = "error_response";
        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);
        return indexOfRootNode > 0?this.parseJSONSignSourceData(body, rootNode, indexOfRootNode):(indexOfErrorRoot > 0?this.parseJSONSignSourceData(body, errorRootNode, indexOfErrorRoot):null);
    }

    private ResponseParseItem parseJSONSignSourceData(String body, String rootNode, int indexOfRootNode) {
        int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
        int indexOfSign = body.indexOf("\"sign\"");
        if(indexOfSign < 0) {
            indexOfSign = body.length();
        }

        int signDataEndIndex = indexOfSign - 1;
        String encryptContent = body.substring(signDataStartIndex + 1, signDataEndIndex - 1);
        return new ResponseParseItem(signDataStartIndex, signDataEndIndex, encryptContent);
    }
}
