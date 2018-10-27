/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDiscountWhitelistUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5114627154286477676L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("user_white_list")
/* 13:   */   private String userWhiteList;
/* 14:   */   
/* 15:   */   public String getCampId()
/* 16:   */   {
/* 17:29 */     return this.campId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCampId(String campId)
/* 21:   */   {
/* 22:32 */     this.campId = campId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUserWhiteList()
/* 26:   */   {
/* 27:36 */     return this.userWhiteList;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUserWhiteList(String userWhiteList)
/* 31:   */   {
/* 32:39 */     this.userWhiteList = userWhiteList;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDiscountWhitelistUpdateModel
 * JD-Core Version:    0.7.0.1
 */