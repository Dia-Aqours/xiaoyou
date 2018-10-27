/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ZhimaMerchantOrderRentCompleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6518826612997823183L;
/* 10:   */   @ApiField("order_no")
/* 11:   */   private String orderNo;
/* 12:   */   @ApiField("pay_amount")
/* 13:   */   private String payAmount;
/* 14:   */   @ApiField("pay_amount_type")
/* 15:   */   private String payAmountType;
/* 16:   */   @ApiField("product_code")
/* 17:   */   private String productCode;
/* 18:   */   @ApiField("restore_shop_name")
/* 19:   */   private String restoreShopName;
/* 20:   */   @ApiField("restore_time")
/* 21:   */   private String restoreTime;
/* 22:   */   
/* 23:   */   public String getOrderNo()
/* 24:   */   {
/* 25:55 */     return this.orderNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setOrderNo(String orderNo)
/* 29:   */   {
/* 30:58 */     this.orderNo = orderNo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getPayAmount()
/* 34:   */   {
/* 35:62 */     return this.payAmount;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setPayAmount(String payAmount)
/* 39:   */   {
/* 40:65 */     this.payAmount = payAmount;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getPayAmountType()
/* 44:   */   {
/* 45:69 */     return this.payAmountType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setPayAmountType(String payAmountType)
/* 49:   */   {
/* 50:72 */     this.payAmountType = payAmountType;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getProductCode()
/* 54:   */   {
/* 55:76 */     return this.productCode;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setProductCode(String productCode)
/* 59:   */   {
/* 60:79 */     this.productCode = productCode;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getRestoreShopName()
/* 64:   */   {
/* 65:83 */     return this.restoreShopName;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setRestoreShopName(String restoreShopName)
/* 69:   */   {
/* 70:86 */     this.restoreShopName = restoreShopName;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getRestoreTime()
/* 74:   */   {
/* 75:90 */     return this.restoreTime;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setRestoreTime(String restoreTime)
/* 79:   */   {
/* 80:93 */     this.restoreTime = restoreTime;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ZhimaMerchantOrderRentCompleteModel

 * JD-Core Version:    0.7.0.1

 */