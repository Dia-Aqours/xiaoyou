/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CustomsDeclareBuyerInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8494491584751998223L;
/* 10:   */   @ApiField("buyer_cert_no")
/* 11:   */   private String buyerCertNo;
/* 12:   */   @ApiField("buyer_name")
/* 13:   */   private String buyerName;
/* 14:   */   
/* 15:   */   public String getBuyerCertNo()
/* 16:   */   {
/* 17:29 */     return this.buyerCertNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBuyerCertNo(String buyerCertNo)
/* 21:   */   {
/* 22:32 */     this.buyerCertNo = buyerCertNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getBuyerName()
/* 26:   */   {
/* 27:36 */     return this.buyerName;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setBuyerName(String buyerName)
/* 31:   */   {
/* 32:39 */     this.buyerName = buyerName;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CustomsDeclareBuyerInfo
 * JD-Core Version:    0.7.0.1
 */