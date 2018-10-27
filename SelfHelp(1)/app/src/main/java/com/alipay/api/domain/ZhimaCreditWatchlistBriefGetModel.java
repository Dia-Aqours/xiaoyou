/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCreditWatchlistBriefGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7394926529875764851L;
/* 10:   */   @ApiField("cert_no")
/* 11:   */   private String certNo;
/* 12:   */   @ApiField("cert_type")
/* 13:   */   private String certType;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("product_code")
/* 17:   */   private String productCode;
/* 18:   */   @ApiField("transaction_id")
/* 19:   */   private String transactionId;
/* 20:   */   
/* 21:   */   public String getCertNo()
/* 22:   */   {
/* 23:47 */     return this.certNo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCertNo(String certNo)
/* 27:   */   {
/* 28:50 */     this.certNo = certNo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCertType()
/* 32:   */   {
/* 33:54 */     return this.certType;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCertType(String certType)
/* 37:   */   {
/* 38:57 */     this.certType = certType;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getName()
/* 42:   */   {
/* 43:61 */     return this.name;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setName(String name)
/* 47:   */   {
/* 48:64 */     this.name = name;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getProductCode()
/* 52:   */   {
/* 53:68 */     return this.productCode;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setProductCode(String productCode)
/* 57:   */   {
/* 58:71 */     this.productCode = productCode;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getTransactionId()
/* 62:   */   {
/* 63:75 */     return this.transactionId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setTransactionId(String transactionId)
/* 67:   */   {
/* 68:78 */     this.transactionId = transactionId;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaCreditWatchlistBriefGetModel
 * JD-Core Version:    0.7.0.1
 */