/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppInvoiceInfoGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3824929986259459382L;
/* 10:   */   @ApiField("invoice_code")
/* 11:   */   private String invoiceCode;
/* 12:   */   @ApiField("invoice_no")
/* 13:   */   private String invoiceNo;
/* 14:   */   @ApiField("user_id")
/* 15:   */   private String userId;
/* 16:   */   
/* 17:   */   public String getInvoiceCode()
/* 18:   */   {
/* 19:35 */     return this.invoiceCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setInvoiceCode(String invoiceCode)
/* 23:   */   {
/* 24:38 */     this.invoiceCode = invoiceCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getInvoiceNo()
/* 28:   */   {
/* 29:42 */     return this.invoiceNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setInvoiceNo(String invoiceNo)
/* 33:   */   {
/* 34:45 */     this.invoiceNo = invoiceNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUserId()
/* 38:   */   {
/* 39:49 */     return this.userId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUserId(String userId)
/* 43:   */   {
/* 44:52 */     this.userId = userId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEbppInvoiceInfoGetModel
 * JD-Core Version:    0.7.0.1
 */