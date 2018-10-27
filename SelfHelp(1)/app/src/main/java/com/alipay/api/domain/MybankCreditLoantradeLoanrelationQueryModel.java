/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class MybankCreditLoantradeLoanrelationQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2187791196832718423L;
/* 10:   */   @ApiField("cert_no")
/* 11:   */   private String certNo;
/* 12:   */   @ApiField("cert_type")
/* 13:   */   private String certType;
/* 14:   */   @ApiField("ext_params")
/* 15:   */   private String extParams;
/* 16:   */   @ApiField("loan_policy_code")
/* 17:   */   private String loanPolicyCode;
/* 18:   */   @ApiField("name")
/* 19:   */   private String name;
/* 20:   */   @ApiField("product_code")
/* 21:   */   private String productCode;
/* 22:   */   
/* 23:   */   public String getCertNo()
/* 24:   */   {
/* 25:53 */     return this.certNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCertNo(String certNo)
/* 29:   */   {
/* 30:56 */     this.certNo = certNo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCertType()
/* 34:   */   {
/* 35:60 */     return this.certType;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCertType(String certType)
/* 39:   */   {
/* 40:63 */     this.certType = certType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getExtParams()
/* 44:   */   {
/* 45:67 */     return this.extParams;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setExtParams(String extParams)
/* 49:   */   {
/* 50:70 */     this.extParams = extParams;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getLoanPolicyCode()
/* 54:   */   {
/* 55:74 */     return this.loanPolicyCode;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setLoanPolicyCode(String loanPolicyCode)
/* 59:   */   {
/* 60:77 */     this.loanPolicyCode = loanPolicyCode;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getName()
/* 64:   */   {
/* 65:81 */     return this.name;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setName(String name)
/* 69:   */   {
/* 70:84 */     this.name = name;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getProductCode()
/* 74:   */   {
/* 75:88 */     return this.productCode;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setProductCode(String productCode)
/* 79:   */   {
/* 80:91 */     this.productCode = productCode;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.MybankCreditLoantradeLoanrelationQueryModel

 * JD-Core Version:    0.7.0.1

 */