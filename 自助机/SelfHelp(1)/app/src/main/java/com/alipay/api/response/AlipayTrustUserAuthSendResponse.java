/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayTrustUserAuthSendResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6625873224312959835L;
/* 10:   */   @ApiField("result")
/* 11:   */   private String result;
/* 12:   */   
/* 13:   */   public void setResult(String result)
/* 14:   */   {
/* 15:24 */     this.result = result;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getResult()
/* 19:   */   {
/* 20:27 */     return this.result;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayTrustUserAuthSendResponse

 * JD-Core Version:    0.7.0.1

 */