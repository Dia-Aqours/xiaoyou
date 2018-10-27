/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoMycarMaintainServiceproductUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7747675121172877465L;
/* 10:   */   @ApiField("operation_type")
/* 11:   */   private String operationType;
/* 12:   */   @ApiField("out_product_id")
/* 13:   */   private String outProductId;
/* 14:   */   @ApiField("shop_product")
/* 15:   */   private MaitainShopProduct shopProduct;
/* 16:   */   
/* 17:   */   public String getOperationType()
/* 18:   */   {
/* 19:36 */     return this.operationType;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOperationType(String operationType)
/* 23:   */   {
/* 24:39 */     this.operationType = operationType;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOutProductId()
/* 28:   */   {
/* 29:43 */     return this.outProductId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOutProductId(String outProductId)
/* 33:   */   {
/* 34:46 */     this.outProductId = outProductId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public MaitainShopProduct getShopProduct()
/* 38:   */   {
/* 39:50 */     return this.shopProduct;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setShopProduct(MaitainShopProduct shopProduct)
/* 43:   */   {
/* 44:53 */     this.shopProduct = shopProduct;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainServiceproductUpdateModel

 * JD-Core Version:    0.7.0.1

 */