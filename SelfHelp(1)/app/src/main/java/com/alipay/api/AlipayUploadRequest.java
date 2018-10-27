package com.alipay.api;

import java.util.Map;

public abstract interface AlipayUploadRequest<T extends AlipayResponse>
  extends AlipayRequest<T>
{
  public abstract Map<String, FileItem> getFileParams();
}


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.AlipayUploadRequest
 * JD-Core Version:    0.7.0.1
 */