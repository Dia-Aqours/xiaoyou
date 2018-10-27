/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayDataServiceResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8879231931215757787L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("message")
/* 13:   */   private String message;
/* 14:   */   @ApiField("result")
/* 15:   */   private String result;
/* 16:   */   @ApiField("success")
/* 17:   */   private Boolean success;
/* 18:   */   
/* 19:   */   public String getCode()
/* 20:   */   {
/* 21:41 */     return this.code;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCode(String code)
/* 25:   */   {
/* 26:44 */     this.code = code;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getMessage()
/* 30:   */   {
/* 31:48 */     return this.message;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setMessage(String message)
/* 35:   */   {
/* 36:51 */     this.message = message;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getResult()
/* 40:   */   {
/* 41:55 */     return this.result;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setResult(String result)
/* 45:   */   {
/* 46:58 */     this.result = result;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public Boolean getSuccess()
/* 50:   */   {
/* 51:62 */     return this.success;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setSuccess(Boolean success)
/* 55:   */   {
/* 56:65 */     this.success = success;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataServiceResult
 * JD-Core Version:    0.7.0.1
 */