/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class KoubeiMarketingDataSmartactivityConfigResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1866433112133272195L;
/*  10:    */   @ApiField("activity_type")
/*  11:    */   private String activityType;
/*  12:    */   @ApiField("activity_valid_days")
/*  13:    */   private String activityValidDays;
/*  14:    */   @ApiField("config_code")
/*  15:    */   private String configCode;
/*  16:    */   @ApiField("crowd_group")
/*  17:    */   private String crowdGroup;
/*  18:    */   @ApiField("min_consume")
/*  19:    */   private String minConsume;
/*  20:    */   @ApiField("min_cost")
/*  21:    */   private String minCost;
/*  22:    */   @ApiField("voucher_type")
/*  23:    */   private String voucherType;
/*  24:    */   @ApiField("voucher_valid_days")
/*  25:    */   private String voucherValidDays;
/*  26:    */   @ApiField("worth_value")
/*  27:    */   private String worthValue;
/*  28:    */   
/*  29:    */   public void setActivityType(String activityType)
/*  30:    */   {
/*  31: 82 */     this.activityType = activityType;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String getActivityType()
/*  35:    */   {
/*  36: 85 */     return this.activityType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setActivityValidDays(String activityValidDays)
/*  40:    */   {
/*  41: 89 */     this.activityValidDays = activityValidDays;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getActivityValidDays()
/*  45:    */   {
/*  46: 92 */     return this.activityValidDays;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setConfigCode(String configCode)
/*  50:    */   {
/*  51: 96 */     this.configCode = configCode;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getConfigCode()
/*  55:    */   {
/*  56: 99 */     return this.configCode;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setCrowdGroup(String crowdGroup)
/*  60:    */   {
/*  61:103 */     this.crowdGroup = crowdGroup;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getCrowdGroup()
/*  65:    */   {
/*  66:106 */     return this.crowdGroup;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setMinConsume(String minConsume)
/*  70:    */   {
/*  71:110 */     this.minConsume = minConsume;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getMinConsume()
/*  75:    */   {
/*  76:113 */     return this.minConsume;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setMinCost(String minCost)
/*  80:    */   {
/*  81:117 */     this.minCost = minCost;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getMinCost()
/*  85:    */   {
/*  86:120 */     return this.minCost;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setVoucherType(String voucherType)
/*  90:    */   {
/*  91:124 */     this.voucherType = voucherType;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getVoucherType()
/*  95:    */   {
/*  96:127 */     return this.voucherType;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setVoucherValidDays(String voucherValidDays)
/* 100:    */   {
/* 101:131 */     this.voucherValidDays = voucherValidDays;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getVoucherValidDays()
/* 105:    */   {
/* 106:134 */     return this.voucherValidDays;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setWorthValue(String worthValue)
/* 110:    */   {
/* 111:138 */     this.worthValue = worthValue;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getWorthValue()
/* 115:    */   {
/* 116:141 */     return this.worthValue;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataSmartactivityConfigResponse
 * JD-Core Version:    0.7.0.1
 */