/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ItermInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4523715866947581575L;
/* 10:   */   @ApiField("error_message")
/* 11:   */   private String errorMessage;
/* 12:   */   @ApiField("is_for_sale")
/* 13:   */   private String isForSale;
/* 14:   */   @ApiField("item_code")
/* 15:   */   private String itemCode;
/* 16:   */   @ApiField("mark_price")
/* 17:   */   private String markPrice;
/* 18:   */   @ApiField("success")
/* 19:   */   private Boolean success;
/* 20:   */   @ApiField("supplier_price")
/* 21:   */   private String supplierPrice;
/* 22:   */   
/* 23:   */   public String getErrorMessage()
/* 24:   */   {
/* 25:53 */     return this.errorMessage;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setErrorMessage(String errorMessage)
/* 29:   */   {
/* 30:56 */     this.errorMessage = errorMessage;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getIsForSale()
/* 34:   */   {
/* 35:60 */     return this.isForSale;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setIsForSale(String isForSale)
/* 39:   */   {
/* 40:63 */     this.isForSale = isForSale;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getItemCode()
/* 44:   */   {
/* 45:67 */     return this.itemCode;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setItemCode(String itemCode)
/* 49:   */   {
/* 50:70 */     this.itemCode = itemCode;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getMarkPrice()
/* 54:   */   {
/* 55:74 */     return this.markPrice;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setMarkPrice(String markPrice)
/* 59:   */   {
/* 60:77 */     this.markPrice = markPrice;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public Boolean getSuccess()
/* 64:   */   {
/* 65:81 */     return this.success;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setSuccess(Boolean success)
/* 69:   */   {
/* 70:84 */     this.success = success;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getSupplierPrice()
/* 74:   */   {
/* 75:88 */     return this.supplierPrice;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setSupplierPrice(String supplierPrice)
/* 79:   */   {
/* 80:91 */     this.supplierPrice = supplierPrice;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ItermInfo

 * JD-Core Version:    0.7.0.1

 */