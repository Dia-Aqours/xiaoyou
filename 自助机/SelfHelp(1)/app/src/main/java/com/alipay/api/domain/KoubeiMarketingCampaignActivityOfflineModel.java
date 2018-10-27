/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignActivityOfflineModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7882526698826249732L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("operator_id")
/* 15:   */   private String operatorId;
/* 16:   */   @ApiField("operator_type")
/* 17:   */   private String operatorType;
/* 18:   */   @ApiField("out_biz_no")
/* 19:   */   private String outBizNo;
/* 20:   */   @ApiField("reason")
/* 21:   */   private String reason;
/* 22:   */   
/* 23:   */   public String getCampId()
/* 24:   */   {
/* 25:53 */     return this.campId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCampId(String campId)
/* 29:   */   {
/* 30:56 */     this.campId = campId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getExtInfo()
/* 34:   */   {
/* 35:60 */     return this.extInfo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setExtInfo(String extInfo)
/* 39:   */   {
/* 40:63 */     this.extInfo = extInfo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getOperatorId()
/* 44:   */   {
/* 45:67 */     return this.operatorId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setOperatorId(String operatorId)
/* 49:   */   {
/* 50:70 */     this.operatorId = operatorId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOperatorType()
/* 54:   */   {
/* 55:74 */     return this.operatorType;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOperatorType(String operatorType)
/* 59:   */   {
/* 60:77 */     this.operatorType = operatorType;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getOutBizNo()
/* 64:   */   {
/* 65:81 */     return this.outBizNo;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setOutBizNo(String outBizNo)
/* 69:   */   {
/* 70:84 */     this.outBizNo = outBizNo;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getReason()
/* 74:   */   {
/* 75:88 */     return this.reason;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setReason(String reason)
/* 79:   */   {
/* 80:91 */     this.reason = reason;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignActivityOfflineModel
 * JD-Core Version:    0.7.0.1
 */