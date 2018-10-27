/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCreditScoreBriefGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8111223143622691682L;
/* 10:   */   @ApiField("admittance_score")
/* 11:   */   private Long admittanceScore;
/* 12:   */   @ApiField("cert_no")
/* 13:   */   private String certNo;
/* 14:   */   @ApiField("cert_type")
/* 15:   */   private String certType;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
/* 18:   */   @ApiField("product_code")
/* 19:   */   private String productCode;
/* 20:   */   @ApiField("transaction_id")
/* 21:   */   private String transactionId;
/* 22:   */   
/* 23:   */   public Long getAdmittanceScore()
/* 24:   */   {
/* 25:53 */     return this.admittanceScore;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAdmittanceScore(Long admittanceScore)
/* 29:   */   {
/* 30:56 */     this.admittanceScore = admittanceScore;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCertNo()
/* 34:   */   {
/* 35:60 */     return this.certNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCertNo(String certNo)
/* 39:   */   {
/* 40:63 */     this.certNo = certNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getCertType()
/* 44:   */   {
/* 45:67 */     return this.certType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setCertType(String certType)
/* 49:   */   {
/* 50:70 */     this.certType = certType;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getName()
/* 54:   */   {
/* 55:74 */     return this.name;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setName(String name)
/* 59:   */   {
/* 60:77 */     this.name = name;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getProductCode()
/* 64:   */   {
/* 65:81 */     return this.productCode;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setProductCode(String productCode)
/* 69:   */   {
/* 70:84 */     this.productCode = productCode;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getTransactionId()
/* 74:   */   {
/* 75:88 */     return this.transactionId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setTransactionId(String transactionId)
/* 79:   */   {
/* 80:91 */     this.transactionId = transactionId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaCreditScoreBriefGetModel
 * JD-Core Version:    0.7.0.1
 */