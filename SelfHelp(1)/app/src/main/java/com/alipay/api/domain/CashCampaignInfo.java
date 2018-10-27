/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CashCampaignInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7364298994671544182L;
/* 10:   */   @ApiField("camp_status")
/* 11:   */   private String campStatus;
/* 12:   */   @ApiField("coupon_name")
/* 13:   */   private String couponName;
/* 14:   */   @ApiField("crowd_no")
/* 15:   */   private String crowdNo;
/* 16:   */   @ApiField("origin_crowd_no")
/* 17:   */   private String originCrowdNo;
/* 18:   */   
/* 19:   */   public String getCampStatus()
/* 20:   */   {
/* 21:41 */     return this.campStatus;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCampStatus(String campStatus)
/* 25:   */   {
/* 26:44 */     this.campStatus = campStatus;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCouponName()
/* 30:   */   {
/* 31:48 */     return this.couponName;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCouponName(String couponName)
/* 35:   */   {
/* 36:51 */     this.couponName = couponName;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getCrowdNo()
/* 40:   */   {
/* 41:55 */     return this.crowdNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setCrowdNo(String crowdNo)
/* 45:   */   {
/* 46:58 */     this.crowdNo = crowdNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getOriginCrowdNo()
/* 50:   */   {
/* 51:62 */     return this.originCrowdNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setOriginCrowdNo(String originCrowdNo)
/* 55:   */   {
/* 56:65 */     this.originCrowdNo = originCrowdNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CashCampaignInfo
 * JD-Core Version:    0.7.0.1
 */