/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayBossProdSubmerchantQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7386858937368493384L;
/* 10:   */   @ApiField("external_id")
/* 11:   */   private String externalId;
/* 12:   */   @ApiField("sub_merchant_id")
/* 13:   */   private String subMerchantId;
/* 14:   */   
/* 15:   */   public String getExternalId()
/* 16:   */   {
/* 17:29 */     return this.externalId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setExternalId(String externalId)
/* 21:   */   {
/* 22:32 */     this.externalId = externalId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getSubMerchantId()
/* 26:   */   {
/* 27:36 */     return this.subMerchantId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setSubMerchantId(String subMerchantId)
/* 31:   */   {
/* 32:39 */     this.subMerchantId = subMerchantId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayBossProdSubmerchantQueryModel
 * JD-Core Version:    0.7.0.1
 */