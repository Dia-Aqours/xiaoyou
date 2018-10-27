/* 1:  */ package com.alipay.api.internal.util.json;
/* 2:  */ 
/* 3:  */ public class ExceptionErrorListener
/* 4:  */   extends BufferErrorListener
/* 5:  */ {
/* 6:  */   public void error(String type, int col)
/* 7:  */   {
/* 8:6 */     super.error(type, col);
/* 9:7 */     throw new IllegalArgumentException(this.buffer.toString());
/* ::  */   }
/* ;:  */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.internal.util.json.ExceptionErrorListener
 * JD-Core Version:    0.7.0.1
 */