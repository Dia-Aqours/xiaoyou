/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InsMktCouponCampaignDTO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6258636463669183232L;
/*  11:    */   @ApiField("campaign_end_time")
/*  12:    */   private Date campaignEndTime;
/*  13:    */   @ApiField("campaign_id")
/*  14:    */   private String campaignId;
/*  15:    */   @ApiField("campaign_memo")
/*  16:    */   private String campaignMemo;
/*  17:    */   @ApiField("campaign_name")
/*  18:    */   private String campaignName;
/*  19:    */   @ApiField("campaign_start_time")
/*  20:    */   private Date campaignStartTime;
/*  21:    */   @ApiField("coupon_type")
/*  22:    */   private String couponType;
/*  23:    */   @ApiField("coupon_upper_value")
/*  24:    */   private String couponUpperValue;
/*  25:    */   @ApiField("coupon_value")
/*  26:    */   private String couponValue;
/*  27:    */   
/*  28:    */   public Date getCampaignEndTime()
/*  29:    */   {
/*  30: 67 */     return this.campaignEndTime;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setCampaignEndTime(Date campaignEndTime)
/*  34:    */   {
/*  35: 70 */     this.campaignEndTime = campaignEndTime;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getCampaignId()
/*  39:    */   {
/*  40: 74 */     return this.campaignId;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setCampaignId(String campaignId)
/*  44:    */   {
/*  45: 77 */     this.campaignId = campaignId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getCampaignMemo()
/*  49:    */   {
/*  50: 81 */     return this.campaignMemo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setCampaignMemo(String campaignMemo)
/*  54:    */   {
/*  55: 84 */     this.campaignMemo = campaignMemo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getCampaignName()
/*  59:    */   {
/*  60: 88 */     return this.campaignName;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setCampaignName(String campaignName)
/*  64:    */   {
/*  65: 91 */     this.campaignName = campaignName;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Date getCampaignStartTime()
/*  69:    */   {
/*  70: 95 */     return this.campaignStartTime;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setCampaignStartTime(Date campaignStartTime)
/*  74:    */   {
/*  75: 98 */     this.campaignStartTime = campaignStartTime;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getCouponType()
/*  79:    */   {
/*  80:102 */     return this.couponType;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setCouponType(String couponType)
/*  84:    */   {
/*  85:105 */     this.couponType = couponType;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getCouponUpperValue()
/*  89:    */   {
/*  90:109 */     return this.couponUpperValue;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setCouponUpperValue(String couponUpperValue)
/*  94:    */   {
/*  95:112 */     this.couponUpperValue = couponUpperValue;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getCouponValue()
/*  99:    */   {
/* 100:116 */     return this.couponValue;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setCouponValue(String couponValue)
/* 104:    */   {
/* 105:119 */     this.couponValue = couponValue;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktCouponCampaignDTO
 * JD-Core Version:    0.7.0.1
 */