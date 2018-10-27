/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCustomerCertificationCertifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4759414269281557951L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   @ApiField("failed_reason")
/* 13:   */   private String failedReason;
/* 14:   */   @ApiField("passed")
/* 15:   */   private String passed;
/* 16:   */   
/* 17:   */   public void setBizNo(String bizNo)
/* 18:   */   {
/* 19:36 */     this.bizNo = bizNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getBizNo()
/* 23:   */   {
/* 24:39 */     return this.bizNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setFailedReason(String failedReason)
/* 28:   */   {
/* 29:43 */     this.failedReason = failedReason;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getFailedReason()
/* 33:   */   {
/* 34:46 */     return this.failedReason;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setPassed(String passed)
/* 38:   */   {
/* 39:50 */     this.passed = passed;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getPassed()
/* 43:   */   {
/* 44:53 */     return this.passed;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaCustomerCertificationCertifyResponse
 * JD-Core Version:    0.7.0.1
 */