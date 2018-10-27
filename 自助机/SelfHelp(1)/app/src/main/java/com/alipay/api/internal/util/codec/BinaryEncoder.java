package com.alipay.api.internal.util.codec;

public abstract interface BinaryEncoder
  extends Encoder
{
  public abstract byte[] encode(byte[] paramArrayOfByte)
    throws EncoderException;
}


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.internal.util.codec.BinaryEncoder
 * JD-Core Version:    0.7.0.1
 */