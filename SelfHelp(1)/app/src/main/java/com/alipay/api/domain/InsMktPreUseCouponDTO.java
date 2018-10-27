/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InsMktPreUseCouponDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7869368177911213714L;
/* 10:   */   @ApiField("asset_id")
/* 11:   */   private String assetId;
/* 12:   */   @ApiField("coupon_id")
/* 13:   */   private String couponId;
/* 14:   */   @ApiField("coupon_type")
/* 15:   */   private String couponType;
/* 16:   */   @ApiField("coupon_value")
/* 17:   */   private String couponValue;
/* 18:   */   @ApiField("pre_use")
/* 19:   */   private Boolean preUse;
/* 20:   */   @ApiField("reason")
/* 21:   */   private String reason;
/* 22:   */   
/* 23:   */   public String getAssetId()
/* 24:   */   {
/* 25:53 */     return this.assetId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAssetId(String assetId)
/* 29:   */   {
/* 30:56 */     this.assetId = assetId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCouponId()
/* 34:   */   {
/* 35:60 */     return this.couponId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCouponId(String couponId)
/* 39:   */   {
/* 40:63 */     this.couponId = couponId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getCouponType()
/* 44:   */   {
/* 45:67 */     return this.couponType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setCouponType(String couponType)
/* 49:   */   {
/* 50:70 */     this.couponType = couponType;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getCouponValue()
/* 54:   */   {
/* 55:74 */     return this.couponValue;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setCouponValue(String couponValue)
/* 59:   */   {
/* 60:77 */     this.couponValue = couponValue;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public Boolean getPreUse()
/* 64:   */   {
/* 65:81 */     return this.preUse;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setPreUse(Boolean preUse)
/* 69:   */   {
/* 70:84 */     this.preUse = preUse;
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
 * Qualified Name:     com.alipay.api.domain.InsMktPreUseCouponDTO
 * JD-Core Version:    0.7.0.1
 */