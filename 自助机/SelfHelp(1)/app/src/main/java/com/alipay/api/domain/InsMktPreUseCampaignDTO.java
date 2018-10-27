/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class InsMktPreUseCampaignDTO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6557946129576731438L;
/*  10:    */   @ApiField("campaign_id")
/*  11:    */   private String campaignId;
/*  12:    */   @ApiField("campaign_name")
/*  13:    */   private String campaignName;
/*  14:    */   @ApiField("coupon_type")
/*  15:    */   private String couponType;
/*  16:    */   @ApiField("coupon_upper_value")
/*  17:    */   private String couponUpperValue;
/*  18:    */   @ApiField("coupon_value")
/*  19:    */   private String couponValue;
/*  20:    */   @ApiField("pre_use")
/*  21:    */   private Boolean preUse;
/*  22:    */   @ApiField("reason")
/*  23:    */   private String reason;
/*  24:    */   
/*  25:    */   public String getCampaignId()
/*  26:    */   {
/*  27: 59 */     return this.campaignId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setCampaignId(String campaignId)
/*  31:    */   {
/*  32: 62 */     this.campaignId = campaignId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getCampaignName()
/*  36:    */   {
/*  37: 66 */     return this.campaignName;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setCampaignName(String campaignName)
/*  41:    */   {
/*  42: 69 */     this.campaignName = campaignName;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getCouponType()
/*  46:    */   {
/*  47: 73 */     return this.couponType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setCouponType(String couponType)
/*  51:    */   {
/*  52: 76 */     this.couponType = couponType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getCouponUpperValue()
/*  56:    */   {
/*  57: 80 */     return this.couponUpperValue;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setCouponUpperValue(String couponUpperValue)
/*  61:    */   {
/*  62: 83 */     this.couponUpperValue = couponUpperValue;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getCouponValue()
/*  66:    */   {
/*  67: 87 */     return this.couponValue;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setCouponValue(String couponValue)
/*  71:    */   {
/*  72: 90 */     this.couponValue = couponValue;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public Boolean getPreUse()
/*  76:    */   {
/*  77: 94 */     return this.preUse;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setPreUse(Boolean preUse)
/*  81:    */   {
/*  82: 97 */     this.preUse = preUse;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getReason()
/*  86:    */   {
/*  87:101 */     return this.reason;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setReason(String reason)
/*  91:    */   {
/*  92:104 */     this.reason = reason;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktPreUseCampaignDTO
 * JD-Core Version:    0.7.0.1
 */