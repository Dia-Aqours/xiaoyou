/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class InsMktCouponCmpgnBaseDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7383887172815644295L;
/* 10:   */   @ApiField("campaign_id")
/* 11:   */   private String campaignId;
/* 12:   */   @ApiField("coupon_type")
/* 13:   */   private String couponType;
/* 14:   */   @ApiField("coupon_upper_value")
/* 15:   */   private String couponUpperValue;
/* 16:   */   @ApiField("coupon_value")
/* 17:   */   private String couponValue;
/* 18:   */   
/* 19:   */   public String getCampaignId()
/* 20:   */   {
/* 21:41 */     return this.campaignId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCampaignId(String campaignId)
/* 25:   */   {
/* 26:44 */     this.campaignId = campaignId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCouponType()
/* 30:   */   {
/* 31:48 */     return this.couponType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCouponType(String couponType)
/* 35:   */   {
/* 36:51 */     this.couponType = couponType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getCouponUpperValue()
/* 40:   */   {
/* 41:55 */     return this.couponUpperValue;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setCouponUpperValue(String couponUpperValue)
/* 45:   */   {
/* 46:58 */     this.couponUpperValue = couponUpperValue;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getCouponValue()
/* 50:   */   {
/* 51:62 */     return this.couponValue;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setCouponValue(String couponValue)
/* 55:   */   {
/* 56:65 */     this.couponValue = couponValue;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.InsMktCouponCmpgnBaseDTO

 * JD-Core Version:    0.7.0.1

 */