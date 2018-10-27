/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InsMktCouponBaseDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5145866624247636338L;
/* 10:   */   @ApiField("coupon_id")
/* 11:   */   private String couponId;
/* 12:   */   @ApiField("coupon_type")
/* 13:   */   private String couponType;
/* 14:   */   @ApiField("coupon_value")
/* 15:   */   private String couponValue;
/* 16:   */   
/* 17:   */   public String getCouponId()
/* 18:   */   {
/* 19:35 */     return this.couponId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCouponId(String couponId)
/* 23:   */   {
/* 24:38 */     this.couponId = couponId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCouponType()
/* 28:   */   {
/* 29:42 */     return this.couponType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCouponType(String couponType)
/* 33:   */   {
/* 34:45 */     this.couponType = couponType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getCouponValue()
/* 38:   */   {
/* 39:49 */     return this.couponValue;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setCouponValue(String couponValue)
/* 43:   */   {
/* 44:52 */     this.couponValue = couponValue;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktCouponBaseDTO
 * JD-Core Version:    0.7.0.1
 */