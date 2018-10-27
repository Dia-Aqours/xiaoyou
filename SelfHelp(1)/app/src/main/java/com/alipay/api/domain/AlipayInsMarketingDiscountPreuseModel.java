/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayInsMarketingDiscountPreuseModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2162734692217972563L;
/*  12:    */   @ApiField("account_id")
/*  13:    */   private String accountId;
/*  14:    */   @ApiField("account_type")
/*  15:    */   private Long accountType;
/*  16:    */   @ApiField("business_type")
/*  17:    */   private Long businessType;
/*  18:    */   @ApiListField("factors")
/*  19:    */   @ApiField("ins_mkt_factor_d_t_o")
/*  20:    */   private List<InsMktFactorDTO> factors;
/*  21:    */   @ApiListField("market_types")
/*  22:    */   @ApiField("number")
/*  23:    */   private List<Long> marketTypes;
/*  24:    */   @ApiListField("mkt_coupon_campaigns")
/*  25:    */   @ApiField("ins_mkt_coupon_cmpgn_base_d_t_o")
/*  26:    */   private List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns;
/*  27:    */   @ApiListField("mkt_coupons")
/*  28:    */   @ApiField("ins_mkt_coupon_base_d_t_o")
/*  29:    */   private List<InsMktCouponBaseDTO> mktCoupons;
/*  30:    */   @ApiListField("mkt_objects")
/*  31:    */   @ApiField("ins_mkt_object_d_t_o")
/*  32:    */   private List<InsMktObjectDTO> mktObjects;
/*  33:    */   @ApiField("request_id")
/*  34:    */   private String requestId;
/*  35:    */   
/*  36:    */   public String getAccountId()
/*  37:    */   {
/*  38: 79 */     return this.accountId;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAccountId(String accountId)
/*  42:    */   {
/*  43: 82 */     this.accountId = accountId;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Long getAccountType()
/*  47:    */   {
/*  48: 86 */     return this.accountType;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAccountType(Long accountType)
/*  52:    */   {
/*  53: 89 */     this.accountType = accountType;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public Long getBusinessType()
/*  57:    */   {
/*  58: 93 */     return this.businessType;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setBusinessType(Long businessType)
/*  62:    */   {
/*  63: 96 */     this.businessType = businessType;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public List<InsMktFactorDTO> getFactors()
/*  67:    */   {
/*  68:100 */     return this.factors;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setFactors(List<InsMktFactorDTO> factors)
/*  72:    */   {
/*  73:103 */     this.factors = factors;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public List<Long> getMarketTypes()
/*  77:    */   {
/*  78:107 */     return this.marketTypes;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setMarketTypes(List<Long> marketTypes)
/*  82:    */   {
/*  83:110 */     this.marketTypes = marketTypes;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public List<InsMktCouponCmpgnBaseDTO> getMktCouponCampaigns()
/*  87:    */   {
/*  88:114 */     return this.mktCouponCampaigns;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setMktCouponCampaigns(List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns)
/*  92:    */   {
/*  93:117 */     this.mktCouponCampaigns = mktCouponCampaigns;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public List<InsMktCouponBaseDTO> getMktCoupons()
/*  97:    */   {
/*  98:121 */     return this.mktCoupons;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setMktCoupons(List<InsMktCouponBaseDTO> mktCoupons)
/* 102:    */   {
/* 103:124 */     this.mktCoupons = mktCoupons;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public List<InsMktObjectDTO> getMktObjects()
/* 107:    */   {
/* 108:128 */     return this.mktObjects;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setMktObjects(List<InsMktObjectDTO> mktObjects)
/* 112:    */   {
/* 113:131 */     this.mktObjects = mktObjects;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getRequestId()
/* 117:    */   {
/* 118:135 */     return this.requestId;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setRequestId(String requestId)
/* 122:    */   {
/* 123:138 */     this.requestId = requestId;
/* 124:    */   }
/* 125:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingDiscountPreuseModel
 * JD-Core Version:    0.7.0.1
 */