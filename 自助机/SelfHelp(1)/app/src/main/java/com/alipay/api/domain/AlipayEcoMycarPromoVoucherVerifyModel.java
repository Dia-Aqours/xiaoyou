/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarPromoVoucherVerifyModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3345667131944947631L;
/* 10:   */   @ApiField("order_no")
/* 11:   */   private String orderNo;
/* 12:   */   @ApiField("order_status")
/* 13:   */   private String orderStatus;
/* 14:   */   @ApiField("sms_code")
/* 15:   */   private String smsCode;
/* 16:   */   
/* 17:   */   public String getOrderNo()
/* 18:   */   {
/* 19:35 */     return this.orderNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOrderNo(String orderNo)
/* 23:   */   {
/* 24:38 */     this.orderNo = orderNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOrderStatus()
/* 28:   */   {
/* 29:42 */     return this.orderStatus;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOrderStatus(String orderStatus)
/* 33:   */   {
/* 34:45 */     this.orderStatus = orderStatus;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getSmsCode()
/* 38:   */   {
/* 39:49 */     return this.smsCode;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSmsCode(String smsCode)
/* 43:   */   {
/* 44:52 */     this.smsCode = smsCode;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarPromoVoucherVerifyModel
 * JD-Core Version:    0.7.0.1
 */