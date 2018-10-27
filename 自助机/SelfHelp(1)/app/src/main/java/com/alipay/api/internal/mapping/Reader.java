package com.alipay.api.internal.mapping;

import com.alipay.api.AlipayApiException;
import java.util.List;

public abstract interface Reader
{
  public abstract boolean hasReturnField(Object paramObject);
  
  public abstract Object getPrimitiveObject(Object paramObject);
  
  public abstract Object getObject(Object paramObject, Class<?> paramClass)
    throws AlipayApiException;
  
  public abstract List<?> getListObjects(Object paramObject1, Object paramObject2, Class<?> paramClass)
    throws AlipayApiException;
}


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.internal.mapping.Reader
 * JD-Core Version:    0.7.0.1
 */