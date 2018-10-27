package com.alipay.api.internal.util.json;

public abstract interface JSONErrorListener
{
  public abstract void start(String paramString);
  
  public abstract void error(String paramString, int paramInt);
  
  public abstract void end();
}


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.internal.util.json.JSONErrorListener
 * JD-Core Version:    0.7.0.1
 */