/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InsMktCouponDTO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6591297724641197457L;
/*  11:    */   @ApiField("asset_id")
/*  12:    */   private String assetId;
/*  13:    */   @ApiField("coupon_id")
/*  14:    */   private String couponId;
/*  15:    */   @ApiField("coupon_type")
/*  16:    */   private String couponType;
/*  17:    */   @ApiField("coupon_value")
/*  18:    */   private String couponValue;
/*  19:    */   @ApiField("recommend")
/*  20:    */   private Boolean recommend;
/*  21:    */   @ApiField("use_end_time")
/*  22:    */   private Date useEndTime;
/*  23:    */   @ApiField("use_rule")
/*  24:    */   private String useRule;
/*  25:    */   @ApiField("use_start_time")
/*  26:    */   private Date useStartTime;
/*  27:    */   
/*  28:    */   public String getAssetId()
/*  29:    */   {
/*  30: 67 */     return this.assetId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setAssetId(String assetId)
/*  34:    */   {
/*  35: 70 */     this.assetId = assetId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getCouponId()
/*  39:    */   {
/*  40: 74 */     return this.couponId;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setCouponId(String couponId)
/*  44:    */   {
/*  45: 77 */     this.couponId = couponId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getCouponType()
/*  49:    */   {
/*  50: 81 */     return this.couponType;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setCouponType(String couponType)
/*  54:    */   {
/*  55: 84 */     this.couponType = couponType;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getCouponValue()
/*  59:    */   {
/*  60: 88 */     return this.couponValue;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setCouponValue(String couponValue)
/*  64:    */   {
/*  65: 91 */     this.couponValue = couponValue;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Boolean getRecommend()
/*  69:    */   {
/*  70: 95 */     return this.recommend;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setRecommend(Boolean recommend)
/*  74:    */   {
/*  75: 98 */     this.recommend = recommend;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Date getUseEndTime()
/*  79:    */   {
/*  80:102 */     return this.useEndTime;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setUseEndTime(Date useEndTime)
/*  84:    */   {
/*  85:105 */     this.useEndTime = useEndTime;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getUseRule()
/*  89:    */   {
/*  90:109 */     return this.useRule;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setUseRule(String useRule)
/*  94:    */   {
/*  95:112 */     this.useRule = useRule;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public Date getUseStartTime()
/*  99:    */   {
/* 100:116 */     return this.useStartTime;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setUseStartTime(Date useStartTime)
/* 104:    */   {
/* 105:119 */     this.useStartTime = useStartTime;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktCouponDTO
 * JD-Core Version:    0.7.0.1
 */