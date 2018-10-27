/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayDataDataserviceBillDownloadurlQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7591112716954997784L;
/* 10:   */   @ApiField("bill_date")
/* 11:   */   private String billDate;
/* 12:   */   @ApiField("bill_type")
/* 13:   */   private String billType;
/* 14:   */   
/* 15:   */   public String getBillDate()
/* 16:   */   {
/* 17:29 */     return this.billDate;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBillDate(String billDate)
/* 21:   */   {
/* 22:32 */     this.billDate = billDate;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getBillType()
/* 26:   */   {
/* 27:36 */     return this.billType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setBillType(String billType)
/* 31:   */   {
/* 32:39 */     this.billType = billType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataDataserviceBillDownloadurlQueryModel
 * JD-Core Version:    0.7.0.1
 */