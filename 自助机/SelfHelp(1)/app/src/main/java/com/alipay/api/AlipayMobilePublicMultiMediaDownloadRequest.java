//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alipay.api;

import com.alipay.api.internal.util.AlipayHashMap;

import java.io.OutputStream;
import java.util.Map;

public class AlipayMobilePublicMultiMediaDownloadRequest implements AlipayRequest<AlipayMobilePublicMultiMediaDownloadResponse> {
    private AlipayHashMap udfParams;
    private String apiVersion = "1.0";
    private String notifyUrl;
    private OutputStream outputStream;
    private String bizContent;
    private String terminalType;
    private String terminalInfo;
    private String prodCode;

    public AlipayMobilePublicMultiMediaDownloadRequest() {
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public String getBizContent() {
        return this.bizContent;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    public String getTerminalInfo() {
        return this.terminalInfo;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdCode() {
        return this.prodCode;
    }

    public String getApiMethodName() {
        return "alipay.mobile.public.multimedia.download";
    }

    public Map<String, String> getTextParams() {
        AlipayHashMap txtParams = new AlipayHashMap();
        txtParams.put("biz_content", this.bizContent);
        if(this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }

        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if(this.udfParams == null) {
            this.udfParams = new AlipayHashMap();
        }

        this.udfParams.put(key, value);
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Class<AlipayMobilePublicMultiMediaDownloadResponse> getResponseClass() {
        return AlipayMobilePublicMultiMediaDownloadResponse.class;
    }

    public boolean isNeedEncrypt() {
        return false;
    }

    public void setNeedEncrypt(boolean needEncrypt) {
        throw new RuntimeException("当前请求不支持加密！");
    }

    public String getReturnUrl() {
        return null;
    }

    public void setReturnUrl(String returnUrl) {
    }

    public AlipayObject getBizModel() {
        return null;
    }

    public void setBizModel(AlipayObject bizModel) {
    }
}
