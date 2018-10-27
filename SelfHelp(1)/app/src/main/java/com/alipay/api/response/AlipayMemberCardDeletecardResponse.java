/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMemberCardDeletecardResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4296624393595826278L;
/* 10:   */   @ApiField("error_code")
/* 11:   */   private String errorCode;
/* 12:   */   @ApiField("error_msg")
/* 13:   */   private String errorMsg;
/* 14:   */   @ApiField("success")
/* 15:   */   private String success;
/* 16:   */   
/* 17:   */   public void setErrorCode(String errorCode)
/* 18:   */   {
/* 19:38 */     this.errorCode = errorCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getErrorCode()
/* 23:   */   {
/* 24:41 */     return this.errorCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setErrorMsg(String errorMsg)
/* 28:   */   {
/* 29:45 */     this.errorMsg = errorMsg;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getErrorMsg()
/* 33:   */   {
/* 34:48 */     return this.errorMsg;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setSuccess(String success)
/* 38:   */   {
/* 39:52 */     this.success = success;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getSuccess()
/* 43:   */   {
/* 44:55 */     return this.success;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMemberCardDeletecardResponse
 * JD-Core Version:    0.7.0.1
 */