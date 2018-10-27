/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignItemBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6635789773993265239L;
/* 10:   */   @ApiField("operator_id")
/* 11:   */   private String operatorId;
/* 12:   */   @ApiField("operator_type")
/* 13:   */   private String operatorType;
/* 14:   */   
/* 15:   */   public String getOperatorId()
/* 16:   */   {
/* 17:29 */     return this.operatorId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOperatorId(String operatorId)
/* 21:   */   {
/* 22:32 */     this.operatorId = operatorId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getOperatorType()
/* 26:   */   {
/* 27:36 */     return this.operatorType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setOperatorType(String operatorType)
/* 31:   */   {
/* 32:39 */     this.operatorType = operatorType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignItemBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */