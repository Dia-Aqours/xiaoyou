/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class VoucherModifyInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8239387397561875861L;
/* 12:   */   @ApiListField("suitable_shops")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> suitableShops;
/* 15:   */   @ApiField("voucher_desc")
/* 16:   */   private String voucherDesc;
/* 17:   */   @ApiField("voucher_id")
/* 18:   */   private String voucherId;
/* 19:   */   @ApiField("voucher_name")
/* 20:   */   private String voucherName;
/* 21:   */   @ApiListField("voucher_terms")
/* 22:   */   @ApiField("voucher_term_info")
/* 23:   */   private List<VoucherTermInfo> voucherTerms;
/* 24:   */   
/* 25:   */   public List<String> getSuitableShops()
/* 26:   */   {
/* 27:52 */     return this.suitableShops;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setSuitableShops(List<String> suitableShops)
/* 31:   */   {
/* 32:55 */     this.suitableShops = suitableShops;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getVoucherDesc()
/* 36:   */   {
/* 37:59 */     return this.voucherDesc;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setVoucherDesc(String voucherDesc)
/* 41:   */   {
/* 42:62 */     this.voucherDesc = voucherDesc;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getVoucherId()
/* 46:   */   {
/* 47:66 */     return this.voucherId;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setVoucherId(String voucherId)
/* 51:   */   {
/* 52:69 */     this.voucherId = voucherId;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getVoucherName()
/* 56:   */   {
/* 57:73 */     return this.voucherName;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setVoucherName(String voucherName)
/* 61:   */   {
/* 62:76 */     this.voucherName = voucherName;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public List<VoucherTermInfo> getVoucherTerms()
/* 66:   */   {
/* 67:80 */     return this.voucherTerms;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void setVoucherTerms(List<VoucherTermInfo> voucherTerms)
/* 71:   */   {
/* 72:83 */     this.voucherTerms = voucherTerms;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.VoucherModifyInfo
 * JD-Core Version:    0.7.0.1
 */