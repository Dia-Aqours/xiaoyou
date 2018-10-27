package com.alipay.api;

import java.util.Map;

public abstract interface AlipayClient
{
  public abstract <T extends AlipayResponse> T execute(AlipayRequest<T> paramAlipayRequest)
    throws AlipayApiException;
  
  public abstract <T extends AlipayResponse> T execute(AlipayRequest<T> paramAlipayRequest, String paramString)
    throws AlipayApiException;
  
  public abstract <T extends AlipayResponse> T execute(AlipayRequest<T> paramAlipayRequest, String paramString1, String paramString2)
    throws AlipayApiException;
  
  public abstract <T extends AlipayResponse> T pageExecute(AlipayRequest<T> paramAlipayRequest)
    throws AlipayApiException;
  
  public abstract <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> paramAlipayRequest)
    throws AlipayApiException;
  
  public abstract <T extends AlipayResponse> T pageExecute(AlipayRequest<T> paramAlipayRequest, String paramString)
    throws AlipayApiException;
  
  public abstract <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> paramMap, Class<T> paramClass)
    throws AlipayApiException;
}


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.AlipayClient
 * JD-Core Version:    0.7.0.1
 */