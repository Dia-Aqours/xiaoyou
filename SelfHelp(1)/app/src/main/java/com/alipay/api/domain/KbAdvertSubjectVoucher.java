/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KbAdvertSubjectVoucher
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4258927846675492271L;
/* 12:   */   @ApiField("brand_name")
/* 13:   */   private String brandName;
/* 14:   */   @ApiListField("city_ids")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> cityIds;
/* 17:   */   @ApiField("merchant_name")
/* 18:   */   private String merchantName;
/* 19:   */   @ApiField("voucher_id")
/* 20:   */   private String voucherId;
/* 21:   */   @ApiField("voucher_name")
/* 22:   */   private String voucherName;
/* 23:   */   @ApiField("voucher_type")
/* 24:   */   private String voucherType;
/* 25:   */   
/* 26:   */   public String getBrandName()
/* 27:   */   {
/* 28:60 */     return this.brandName;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setBrandName(String brandName)
/* 32:   */   {
/* 33:63 */     this.brandName = brandName;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public List<String> getCityIds()
/* 37:   */   {
/* 38:67 */     return this.cityIds;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setCityIds(List<String> cityIds)
/* 42:   */   {
/* 43:70 */     this.cityIds = cityIds;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getMerchantName()
/* 47:   */   {
/* 48:74 */     return this.merchantName;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setMerchantName(String merchantName)
/* 52:   */   {
/* 53:77 */     this.merchantName = merchantName;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getVoucherId()
/* 57:   */   {
/* 58:81 */     return this.voucherId;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setVoucherId(String voucherId)
/* 62:   */   {
/* 63:84 */     this.voucherId = voucherId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getVoucherName()
/* 67:   */   {
/* 68:88 */     return this.voucherName;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void setVoucherName(String voucherName)
/* 72:   */   {
/* 73:91 */     this.voucherName = voucherName;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public String getVoucherType()
/* 77:   */   {
/* 78:95 */     return this.voucherType;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void setVoucherType(String voucherType)
/* 82:   */   {
/* 83:98 */     this.voucherType = voucherType;
/* 84:   */   }
/* 85:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertSubjectVoucher
 * JD-Core Version:    0.7.0.1
 */