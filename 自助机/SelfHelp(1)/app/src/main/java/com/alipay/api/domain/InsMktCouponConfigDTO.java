/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class InsMktCouponConfigDTO
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5832239168644587247L;
/* 11:   */   @ApiField("coupon_conf_id")
/* 12:   */   private String couponConfId;
/* 13:   */   @ApiField("coupon_type")
/* 14:   */   private String couponType;
/* 15:   */   @ApiField("coupon_value")
/* 16:   */   private String couponValue;
/* 17:   */   @ApiField("use_end_time")
/* 18:   */   private Date useEndTime;
/* 19:   */   @ApiField("use_rule")
/* 20:   */   private String useRule;
/* 21:   */   @ApiField("use_start_time")
/* 22:   */   private Date useStartTime;
/* 23:   */   
/* 24:   */   public String getCouponConfId()
/* 25:   */   {
/* 26:55 */     return this.couponConfId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setCouponConfId(String couponConfId)
/* 30:   */   {
/* 31:58 */     this.couponConfId = couponConfId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getCouponType()
/* 35:   */   {
/* 36:62 */     return this.couponType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setCouponType(String couponType)
/* 40:   */   {
/* 41:65 */     this.couponType = couponType;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getCouponValue()
/* 45:   */   {
/* 46:69 */     return this.couponValue;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setCouponValue(String couponValue)
/* 50:   */   {
/* 51:72 */     this.couponValue = couponValue;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Date getUseEndTime()
/* 55:   */   {
/* 56:76 */     return this.useEndTime;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setUseEndTime(Date useEndTime)
/* 60:   */   {
/* 61:79 */     this.useEndTime = useEndTime;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getUseRule()
/* 65:   */   {
/* 66:83 */     return this.useRule;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setUseRule(String useRule)
/* 70:   */   {
/* 71:86 */     this.useRule = useRule;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public Date getUseStartTime()
/* 75:   */   {
/* 76:90 */     return this.useStartTime;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setUseStartTime(Date useStartTime)
/* 80:   */   {
/* 81:93 */     this.useStartTime = useStartTime;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktCouponConfigDTO
 * JD-Core Version:    0.7.0.1
 */