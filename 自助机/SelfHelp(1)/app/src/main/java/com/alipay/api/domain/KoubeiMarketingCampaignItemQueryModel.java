/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignItemQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6475385664129487259L;
/* 10:   */   @ApiField("item_id")
/* 11:   */   private String itemId;
/* 12:   */   @ApiField("operator_id")
/* 13:   */   private String operatorId;
/* 14:   */   @ApiField("operator_type")
/* 15:   */   private String operatorType;
/* 16:   */   
/* 17:   */   public String getItemId()
/* 18:   */   {
/* 19:35 */     return this.itemId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setItemId(String itemId)
/* 23:   */   {
/* 24:38 */     this.itemId = itemId;
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
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignItemQueryModel
 * JD-Core Version:    0.7.0.1
 */