/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignActivityQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6836385619934929715L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("operator_id")
/* 13:   */   private String operatorId;
/* 14:   */   @ApiField("operator_type")
/* 15:   */   private String operatorType;
/* 16:   */   
/* 17:   */   public String getCampId()
/* 18:   */   {
/* 19:35 */     return this.campId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCampId(String campId)
/* 23:   */   {
/* 24:38 */     this.campId = campId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOperatorId()
/* 28:   */   {
/* 29:42 */     return this.operatorId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOperatorId(String operatorId)
/* 33:   */   {
/* 34:45 */     this.operatorId = operatorId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getOperatorType()
/* 38:   */   {
/* 39:49 */     return this.operatorType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setOperatorType(String operatorType)
/* 43:   */   {
/* 44:52 */     this.operatorType = operatorType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignActivityQueryModel
 * JD-Core Version:    0.7.0.1
 */