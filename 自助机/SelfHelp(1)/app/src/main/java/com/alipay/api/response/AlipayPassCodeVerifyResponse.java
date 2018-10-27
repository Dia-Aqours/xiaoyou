/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPassCodeVerifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4194861217997472822L;
/* 10:   */   @ApiField("biz_result")
/* 11:   */   private String bizResult;
/* 12:   */   @ApiField("error_code")
/* 13:   */   private String errorCode;
/* 14:   */   @ApiField("success")
/* 15:   */   private Boolean success;
/* 16:   */   
/* 17:   */   public void setBizResult(String bizResult)
/* 18:   */   {
/* 19:36 */     this.bizResult = bizResult;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getBizResult()
/* 23:   */   {
/* 24:39 */     return this.bizResult;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setErrorCode(String errorCode)
/* 28:   */   {
/* 29:43 */     this.errorCode = errorCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getErrorCode()
/* 33:   */   {
/* 34:46 */     return this.errorCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setSuccess(Boolean success)
/* 38:   */   {
/* 39:50 */     this.success = success;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Boolean getSuccess()
/* 43:   */   {
/* 44:53 */     return this.success;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayPassCodeVerifyResponse
 * JD-Core Version:    0.7.0.1
 */