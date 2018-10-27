/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class PreOrderResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5227921244186362728L;
/* 10:   */   @ApiField("app_id")
/* 11:   */   private String appId;
/* 12:   */   @ApiField("out_trade_no")
/* 13:   */   private String outTradeNo;
/* 14:   */   @ApiField("result_code")
/* 15:   */   private String resultCode;
/* 16:   */   @ApiField("success")
/* 17:   */   private Boolean success;
/* 18:   */   
/* 19:   */   public String getAppId()
/* 20:   */   {
/* 21:41 */     return this.appId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAppId(String appId)
/* 25:   */   {
/* 26:44 */     this.appId = appId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOutTradeNo()
/* 30:   */   {
/* 31:48 */     return this.outTradeNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOutTradeNo(String outTradeNo)
/* 35:   */   {
/* 36:51 */     this.outTradeNo = outTradeNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getResultCode()
/* 40:   */   {
/* 41:55 */     return this.resultCode;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setResultCode(String resultCode)
/* 45:   */   {
/* 46:58 */     this.resultCode = resultCode;
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

 * Qualified Name:     com.alipay.api.domain.PreOrderResult

 * JD-Core Version:    0.7.0.1

 */