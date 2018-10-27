package com.alipay.api.internal.mapping;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.SignItem;

public abstract interface Converter
{
  public abstract <T extends AlipayResponse> T toResponse(String paramString, Class<T> paramClass)
    throws AlipayApiException;
  
  public abstract SignItem getSignItem(AlipayRequest<?> paramAlipayRequest, String paramString)
    throws AlipayApiException;
  
  public abstract String encryptSourceData(AlipayRequest<?> paramAlipayRequest, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws AlipayApiException;
}


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.internal.mapping.Converter
 * JD-Core Version:    0.7.0.1
 */