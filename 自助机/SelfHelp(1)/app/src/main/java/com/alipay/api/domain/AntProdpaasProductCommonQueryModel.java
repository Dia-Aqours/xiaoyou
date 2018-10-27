/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AntProdpaasProductCommonQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1271827455565882865L;
/* 10:   */   @ApiField("product_code")
/* 11:   */   private String productCode;
/* 12:   */   @ApiField("product_options")
/* 13:   */   private ProductVOOptions productOptions;
/* 14:   */   @ApiField("product_version")
/* 15:   */   private String productVersion;
/* 16:   */   
/* 17:   */   public String getProductCode()
/* 18:   */   {
/* 19:35 */     return this.productCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setProductCode(String productCode)
/* 23:   */   {
/* 24:38 */     this.productCode = productCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public ProductVOOptions getProductOptions()
/* 28:   */   {
/* 29:42 */     return this.productOptions;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setProductOptions(ProductVOOptions productOptions)
/* 33:   */   {
/* 34:45 */     this.productOptions = productOptions;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getProductVersion()
/* 38:   */   {
/* 39:49 */     return this.productVersion;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setProductVersion(String productVersion)
/* 43:   */   {
/* 44:52 */     this.productVersion = productVersion;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AntProdpaasProductCommonQueryModel
 * JD-Core Version:    0.7.0.1
 */