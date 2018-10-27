/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMarketingCampaignCrowdCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3489385691426513989L;
/* 10:   */   @ApiField("conditions")
/* 11:   */   private String conditions;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("operator_id")
/* 15:   */   private String operatorId;
/* 16:   */   @ApiField("operator_type")
/* 17:   */   private String operatorType;
/* 18:   */   @ApiField("out_biz_no")
/* 19:   */   private String outBizNo;
/* 20:   */   
/* 21:   */   public String getConditions()
/* 22:   */   {
/* 23:50 */     return this.conditions;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setConditions(String conditions)
/* 27:   */   {
/* 28:53 */     this.conditions = conditions;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getName()
/* 32:   */   {
/* 33:57 */     return this.name;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setName(String name)
/* 37:   */   {
/* 38:60 */     this.name = name;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOperatorId()
/* 42:   */   {
/* 43:64 */     return this.operatorId;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOperatorId(String operatorId)
/* 47:   */   {
/* 48:67 */     this.operatorId = operatorId;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOperatorType()
/* 52:   */   {
/* 53:71 */     return this.operatorType;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOperatorType(String operatorType)
/* 57:   */   {
/* 58:74 */     this.operatorType = operatorType;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getOutBizNo()
/* 62:   */   {
/* 63:78 */     return this.outBizNo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setOutBizNo(String outBizNo)
/* 67:   */   {
/* 68:81 */     this.outBizNo = outBizNo;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignCrowdCreateModel

 * JD-Core Version:    0.7.0.1

 */