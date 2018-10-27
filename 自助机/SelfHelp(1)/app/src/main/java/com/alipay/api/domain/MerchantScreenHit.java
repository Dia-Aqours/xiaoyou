/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MerchantScreenHit
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8389589846828716613L;
/* 10:   */   @ApiField("input_type")
/* 11:   */   private String inputType;
/* 12:   */   @ApiField("risk_detail")
/* 13:   */   private String riskDetail;
/* 14:   */   
/* 15:   */   public String getInputType()
/* 16:   */   {
/* 17:29 */     return this.inputType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setInputType(String inputType)
/* 21:   */   {
/* 22:32 */     this.inputType = inputType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRiskDetail()
/* 26:   */   {
/* 27:36 */     return this.riskDetail;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRiskDetail(String riskDetail)
/* 31:   */   {
/* 32:39 */     this.riskDetail = riskDetail;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantScreenHit
 * JD-Core Version:    0.7.0.1
 */