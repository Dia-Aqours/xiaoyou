/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ReduceInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6672429837396329786L;
/* 10:   */   @ApiField("brand_name")
/* 11:   */   private String brandName;
/* 12:   */   @ApiField("consume_amt")
/* 13:   */   private String consumeAmt;
/* 14:   */   @ApiField("consume_store_name")
/* 15:   */   private String consumeStoreName;
/* 16:   */   @ApiField("payment_time")
/* 17:   */   private String paymentTime;
/* 18:   */   @ApiField("promo_amt")
/* 19:   */   private String promoAmt;
/* 20:   */   @ApiField("user_name")
/* 21:   */   private String userName;
/* 22:   */   
/* 23:   */   public String getBrandName()
/* 24:   */   {
/* 25:53 */     return this.brandName;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBrandName(String brandName)
/* 29:   */   {
/* 30:56 */     this.brandName = brandName;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getConsumeAmt()
/* 34:   */   {
/* 35:60 */     return this.consumeAmt;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setConsumeAmt(String consumeAmt)
/* 39:   */   {
/* 40:63 */     this.consumeAmt = consumeAmt;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getConsumeStoreName()
/* 44:   */   {
/* 45:67 */     return this.consumeStoreName;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setConsumeStoreName(String consumeStoreName)
/* 49:   */   {
/* 50:70 */     this.consumeStoreName = consumeStoreName;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getPaymentTime()
/* 54:   */   {
/* 55:74 */     return this.paymentTime;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setPaymentTime(String paymentTime)
/* 59:   */   {
/* 60:77 */     this.paymentTime = paymentTime;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getPromoAmt()
/* 64:   */   {
/* 65:81 */     return this.promoAmt;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setPromoAmt(String promoAmt)
/* 69:   */   {
/* 70:84 */     this.promoAmt = promoAmt;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUserName()
/* 74:   */   {
/* 75:88 */     return this.userName;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUserName(String userName)
/* 79:   */   {
/* 80:91 */     this.userName = userName;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ReduceInfo
 * JD-Core Version:    0.7.0.1
 */