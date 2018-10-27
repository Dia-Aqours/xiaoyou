//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alipay.api;

import com.alipay.api.internal.parser.json.ObjectJsonParser;
import com.alipay.api.internal.parser.xml.ObjectXmlParser;
import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.internal.util.AlipayLogger;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.AlipayUtils;
import com.alipay.api.internal.util.RequestParametersHolder;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.WebUtils;
import com.alipay.api.internal.util.json.JSONWriter;
import com.googlecode.openbeans.IntrospectionException;

import java.io.IOException;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class DefaultAlipayClient implements AlipayClient {
    private String serverUrl;
    private String appId;
    private String privateKey;
    private String prodCode;
    private String format;
    private String sign_type;
    private String encryptType;
    private String encryptKey;
    private String alipayPublicKey;
    private String charset;
    private int connectTimeout;
    private int readTimeout;

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey) {
        this.format = "json";
        this.sign_type = "RSA";
        this.encryptType = "AES";
        this.connectTimeout = 3000;
        this.readTimeout = 15000;
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.alipayPublicKey = null;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        this(serverUrl, appId, privateKey);
        this.format = format;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset) {
        this(serverUrl, appId, privateKey);
        this.format = format;
        this.charset = charset;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset, String alipayPulicKey) {
        this(serverUrl, appId, privateKey);
        this.format = format;
        this.charset = charset;
        this.alipayPublicKey = alipayPulicKey;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset, String alipayPulicKey, String signType) {
        this(serverUrl, appId, privateKey, format, charset, alipayPulicKey);
        this.sign_type = signType;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset, String alipayPulicKey, String signType, String encryptKey, String encryptType) {
        this(serverUrl, appId, privateKey, format, charset, alipayPulicKey, signType);
        this.encryptType = encryptType;
        this.encryptKey = encryptKey;
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request) throws AlipayApiException {
        return this.execute(request, (String)null);
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken) throws AlipayApiException {
        return this.execute(request, accessToken, (String)null);
    }

    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken, String appAuthToken) throws AlipayApiException {
        Object parser = null;
        if("xml".equals(this.format)) {
            parser = new ObjectXmlParser(request.getResponseClass());
        } else {
            parser = new ObjectJsonParser(request.getResponseClass());
        }

        return (T)this._execute(request, (AlipayParser)parser, accessToken, appAuthToken);
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException {
        return this.pageExecute(request, "POST");
    }

    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request, String httpMethod) throws AlipayApiException {
        RequestParametersHolder requestHolder = null;
        try {
            requestHolder = this.getRequestHolderWithSign(request, (String)null, (String)null);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        if(AlipayLogger.isBizDebugEnabled().booleanValue()) {
            AlipayLogger.logBizDebug(this.getRedirectUrl(requestHolder));
        }

        AlipayResponse rsp = null;

        try {
            Class baseUrl = request.getResponseClass();
            rsp = (AlipayResponse)baseUrl.newInstance();
        } catch (InstantiationException var6) {
            AlipayLogger.logBizError(var6);
        } catch (IllegalAccessException var7) {
            AlipayLogger.logBizError(var7);
        }

        if("GET".equalsIgnoreCase(httpMethod)) {
            rsp.setBody(this.getRedirectUrl(requestHolder));
        } else {
            String baseUrl1 = this.getRequestUrl(requestHolder);
            rsp.setBody(WebUtils.buildForm(baseUrl1, requestHolder.getApplicationParams()));
        }

        return (T)rsp;
    }

    public <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> request) throws AlipayApiException {
        RequestParametersHolder requestHolder = null;
        try {
            requestHolder = this.getRequestHolderWithSign(request, (String)null, (String)null);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        if(AlipayLogger.isBizDebugEnabled().booleanValue()) {
            AlipayLogger.logBizDebug(this.getSdkParams(requestHolder));
        }

        AlipayResponse rsp = null;

        try {
            Class e = request.getResponseClass();
            rsp = (AlipayResponse)e.newInstance();
        } catch (InstantiationException var5) {
            AlipayLogger.logBizError(var5);
        } catch (IllegalAccessException var6) {
            AlipayLogger.logBizError(var6);
        }

        rsp.setBody(this.getSdkParams(requestHolder));
        return (T)rsp;
    }

    public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result, Class<T> requsetClazz) throws AlipayApiException {
        AlipayResponse tRsp = null;
        String rsp = (String)result.get("result");

        try {
            AlipayRequest e = (AlipayRequest)requsetClazz.newInstance();
            Class responseClazz = e.getResponseClass();
            if(StringUtils.isEmpty(rsp)) {
                tRsp = (AlipayResponse)responseClazz.newInstance();
                tRsp.setCode("20000");
                tRsp.setSubCode("ACQ.SYSTEM_ERROR");
                tRsp.setSubMsg((String)result.get("memo"));
            } else {
                Object parser = null;
                if("xml".equals(this.format)) {
                    parser = new ObjectXmlParser(responseClazz);
                } else {
                    parser = new ObjectJsonParser(responseClazz);
                }

                tRsp = ((AlipayParser)parser).parse(rsp);
                tRsp.setBody(rsp);
                this.checkResponseSign(e, (AlipayParser)parser, rsp, tRsp.isSuccess());
                if(!tRsp.isSuccess()) {
                    AlipayLogger.logBizError(rsp);
                }
            }

            return (TR)tRsp;
        } catch (RuntimeException var8) {
            AlipayLogger.logBizError(rsp);
            throw var8;
        } catch (AlipayApiException var9) {
            AlipayLogger.logBizError(rsp);
            throw new AlipayApiException(var9);
        } catch (InstantiationException var10) {
            AlipayLogger.logBizError(rsp);
            throw new AlipayApiException(var10);
        } catch (IllegalAccessException var11) {
            AlipayLogger.logBizError(rsp);
            throw new AlipayApiException(var11);
        }
    }

    private <T extends AlipayResponse> RequestParametersHolder getRequestHolderWithSign(AlipayRequest<?> request, String accessToken, String appAuthToken) throws AlipayApiException, IntrospectionException {
        RequestParametersHolder requestHolder = new RequestParametersHolder();
        AlipayHashMap appParams = new AlipayHashMap(request.getTextParams());

        try {
            if(request.getClass().getMethod("getBizContent", new Class[0]) != null && StringUtils.isEmpty((String)appParams.get("biz_content")) && request.getBizModel() != null) {
                appParams.put("biz_content", (new JSONWriter()).write(request.getBizModel(), true));
            }
        } catch (NoSuchMethodException var11) {
            ;
        } catch (SecurityException var12) {
            AlipayLogger.logBizError(var12);
        }

        if(request.isNeedEncrypt()) {
            if(StringUtils.isEmpty((String)appParams.get("biz_content"))) {
                throw new AlipayApiException("当前API不支持加密请求");
            }

            if(!StringUtils.areNotEmpty(new String[]{this.encryptKey, this.encryptType})) {
                throw new AlipayApiException("API请求要求加密，则必须设置密钥和密钥类型：encryptKey=" + this.encryptKey + ",encryptType=" + this.encryptType);
            }

            String protocalMustParams = AlipayEncrypt.encryptContent((String)appParams.get("biz_content"), this.encryptType, this.encryptKey, this.charset);
            appParams.put("biz_content", protocalMustParams);
        }

        if(!StringUtils.isEmpty(appAuthToken)) {
            appParams.put("app_auth_token", appAuthToken);
        }

        requestHolder.setApplicationParams(appParams);
        if(StringUtils.isEmpty(this.charset)) {
            this.charset = "UTF-8";
        }

        AlipayHashMap protocalMustParams1 = new AlipayHashMap();
        protocalMustParams1.put("method", request.getApiMethodName());
        protocalMustParams1.put("version", request.getApiVersion());
        protocalMustParams1.put("app_id", this.appId);
        protocalMustParams1.put("sign_type", this.sign_type);
        protocalMustParams1.put("terminal_type", request.getTerminalType());
        protocalMustParams1.put("terminal_info", request.getTerminalInfo());
        protocalMustParams1.put("notify_url", request.getNotifyUrl());
        protocalMustParams1.put("return_url", request.getReturnUrl());
        protocalMustParams1.put("charset", this.charset);
        if(request.isNeedEncrypt()) {
            protocalMustParams1.put("encrypt_type", this.encryptType);
        }

        Long timestamp = Long.valueOf(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        protocalMustParams1.put("timestamp", df.format(new Date(timestamp.longValue())));
        requestHolder.setProtocalMustParams(protocalMustParams1);
        AlipayHashMap protocalOptParams = new AlipayHashMap();
        protocalOptParams.put("format", this.format);
        protocalOptParams.put("auth_token", accessToken);
        protocalOptParams.put("alipay_sdk", "alipay-sdk-java-dynamicVersionNo");
        protocalOptParams.put("prod_code", request.getProdCode());
        requestHolder.setProtocalOptParams(protocalOptParams);
        if(!StringUtils.isEmpty(this.sign_type)) {
            String signContent = AlipaySignature.getSignatureContent(requestHolder);
            protocalMustParams1.put("sign", AlipaySignature.rsaSign(signContent, this.privateKey, this.charset, this.sign_type));
        } else {
            protocalMustParams1.put("sign", "");
        }

        return requestHolder;
    }

    private String getRequestUrl(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer(this.serverUrl);

        try {
            String e = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), this.charset);
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), this.charset);
            urlSb.append("?");
            urlSb.append(e);
            if(sysOptQuery != null & sysOptQuery.length() > 0) {
                urlSb.append("&");
                urlSb.append(sysOptQuery);
            }
        } catch (IOException var5) {
            throw new AlipayApiException(var5);
        }

        return urlSb.toString();
    }

    private String getRedirectUrl(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer(this.serverUrl);

        try {
            Map e = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(e, this.charset);
            String sign = (String)requestHolder.getProtocalMustParams().get("sign");
            urlSb.append("?");
            urlSb.append(sortedQuery);
            if(sign != null & sign.length() > 0) {
                HashMap signMap = new HashMap();
                signMap.put("sign", sign);
                String signQuery = WebUtils.buildQuery(signMap, this.charset);
                urlSb.append("&");
                urlSb.append(signQuery);
            }
        } catch (IOException var8) {
            throw new AlipayApiException(var8);
        }

        return urlSb.toString();
    }

    private String getSdkParams(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer();

        try {
            Map e = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(e, this.charset);
            String sign = (String)requestHolder.getProtocalMustParams().get("sign");
            urlSb.append(sortedQuery);
            if(sign != null & sign.length() > 0) {
                HashMap signMap = new HashMap();
                signMap.put("sign", sign);
                String signQuery = WebUtils.buildQuery(signMap, this.charset);
                urlSb.append("&");
                urlSb.append(signQuery);
            }
        } catch (IOException var8) {
            throw new AlipayApiException(var8);
        }

        return urlSb.toString();
    }

    private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, AlipayParser<T> parser, String authToken, String appAuthToken) throws AlipayApiException {
        Map rt = this.doPost(request, authToken, appAuthToken);
        if(rt == null) {
            return null;
        } else {
            AlipayResponse tRsp = null;

            try {
                ResponseEncryptItem e = this.encryptResponse(request, rt, parser);
                tRsp = parser.parse(e.getRealContent());
                tRsp.setBody(e.getRealContent());
                this.checkResponseSign(request, parser, e.getRespContent(), tRsp.isSuccess());
            } catch (RuntimeException var8) {
                AlipayLogger.logBizError((String)rt.get("rsp"));
                throw var8;
            } catch (AlipayApiException var9) {
                AlipayLogger.logBizError((String)rt.get("rsp"));
                throw new AlipayApiException(var9);
            }

            tRsp.setParams((AlipayHashMap)rt.get("textParams"));
            if(!tRsp.isSuccess()) {
                AlipayLogger.logErrorScene(rt, tRsp, "");
            }

            return (T)tRsp;
        }
    }

    private <T extends AlipayResponse> Map<String, Object> doPost(AlipayRequest<T> request, String accessToken, String appAuthToken) throws AlipayApiException {
        HashMap result = new HashMap();
        RequestParametersHolder requestHolder = null;
        try {
            requestHolder = this.getRequestHolderWithSign(request, accessToken, appAuthToken);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        String url = this.getRequestUrl(requestHolder);
        if(AlipayLogger.isBizDebugEnabled().booleanValue()) {
            AlipayLogger.logBizDebug(this.getRedirectUrl(requestHolder));
        }

        String rsp = null;

        try {
            if(request instanceof AlipayUploadRequest) {
                AlipayUploadRequest e = (AlipayUploadRequest)request;
                Map fileParams = AlipayUtils.cleanupMap(e.getFileParams());
                rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), fileParams, this.charset, this.connectTimeout, this.readTimeout);
            } else {
                rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), this.charset, this.connectTimeout, this.readTimeout);
            }
        } catch (IOException var10) {
            throw new AlipayApiException(var10);
        }

        result.put("rsp", rsp);
        result.put("textParams", requestHolder.getApplicationParams());
        result.put("protocalMustParams", requestHolder.getProtocalMustParams());
        result.put("protocalOptParams", requestHolder.getProtocalOptParams());
        result.put("url", url);
        return result;
    }

    private <T extends AlipayResponse> void checkResponseSign(AlipayRequest<T> request, AlipayParser<T> parser, String responseBody, boolean responseIsSucess) throws AlipayApiException {
        if(!StringUtils.isEmpty(this.alipayPublicKey)) {
            SignItem signItem = parser.getSignItem(request, responseBody);
            if(signItem == null) {
                throw new AlipayApiException("sign check fail: Body is Empty!");
            }

            if(responseIsSucess || !responseIsSucess && !StringUtils.isEmpty(signItem.getSign())) {
                boolean rsaCheckContent = AlipaySignature.rsaCheck(signItem.getSignSourceDate(), signItem.getSign(), this.alipayPublicKey, this.charset, this.sign_type);
                if(!rsaCheckContent) {
                    if(StringUtils.isEmpty(signItem.getSignSourceDate()) || !signItem.getSignSourceDate().contains("\\/")) {
                        throw new AlipayApiException("sign check fail: check Sign and Data Fail!");
                    }

                    String srouceData = signItem.getSignSourceDate().replace("\\/", "/");
                    boolean jsonCheck = AlipaySignature.rsaCheck(srouceData, signItem.getSign(), this.alipayPublicKey, this.charset, this.sign_type);
                    if(!jsonCheck) {
                        throw new AlipayApiException("sign check fail: check Sign and Data Fail！JSON also！");
                    }
                }
            }
        }

    }

    private <T extends AlipayResponse> ResponseEncryptItem encryptResponse(AlipayRequest<T> request, Map<String, Object> rt, AlipayParser<T> parser) throws AlipayApiException {
        String responseBody = (String)rt.get("rsp");
        String realBody = null;
        if(request.isNeedEncrypt()) {
            realBody = parser.encryptSourceData(request, responseBody, this.format, this.encryptType, this.encryptKey, this.charset);
        } else {
            realBody = (String)rt.get("rsp");
        }

        return new ResponseEncryptItem(responseBody, realBody);
    }

    static {
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");
    }
}
