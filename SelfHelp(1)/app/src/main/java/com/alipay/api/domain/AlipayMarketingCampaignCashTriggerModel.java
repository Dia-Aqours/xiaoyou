/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignCashTriggerModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3828168752146291861L;
/* 10:   */   @ApiField("crowd_no")
/* 11:   */   private String crowdNo;
/* 12:   */   @ApiField("login_id")
/* 13:   */   private String loginId;
/* 14:   */   @ApiField("user_id")
/* 15:   */   private String userId;
/* 16:   */   
/* 17:   */   public String getCrowdNo()
/* 18:   */   {
/* 19:35 */     return this.crowdNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCrowdNo(String crowdNo)
/* 23:   */   {
/* 24:38 */     this.crowdNo = crowdNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getLoginId()
/* 28:   */   {
/* 29:42 */     return this.loginId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setLoginId(String loginId)
/* 33:   */   {
/* 34:45 */     this.loginId = loginId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUserId()
/* 38:   */   {
/* 39:49 */     return this.userId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUserId(String userId)
/* 43:   */   {
/* 44:52 */     this.userId = userId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignCashTriggerModel
 * JD-Core Version:    0.7.0.1
 */