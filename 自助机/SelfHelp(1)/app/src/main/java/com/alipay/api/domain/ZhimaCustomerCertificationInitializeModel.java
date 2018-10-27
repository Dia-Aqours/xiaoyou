/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ZhimaCustomerCertificationInitializeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7246487964283375892L;
/* 10:   */   @ApiField("biz_code")
/* 11:   */   private String bizCode;
/* 12:   */   @ApiField("ext_biz_param")
/* 13:   */   private String extBizParam;
/* 14:   */   @ApiField("identity_param")
/* 15:   */   private String identityParam;
/* 16:   */   @ApiField("product_code")
/* 17:   */   private String productCode;
/* 18:   */   @ApiField("transaction_id")
/* 19:   */   private String transactionId;
/* 20:   */   
/* 21:   */   public String getBizCode()
/* 22:   */   {
/* 23:56 */     return this.bizCode;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setBizCode(String bizCode)
/* 27:   */   {
/* 28:59 */     this.bizCode = bizCode;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getExtBizParam()
/* 32:   */   {
/* 33:63 */     return this.extBizParam;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setExtBizParam(String extBizParam)
/* 37:   */   {
/* 38:66 */     this.extBizParam = extBizParam;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getIdentityParam()
/* 42:   */   {
/* 43:70 */     return this.identityParam;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setIdentityParam(String identityParam)
/* 47:   */   {
/* 48:73 */     this.identityParam = identityParam;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getProductCode()
/* 52:   */   {
/* 53:77 */     return this.productCode;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setProductCode(String productCode)
/* 57:   */   {
/* 58:80 */     this.productCode = productCode;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getTransactionId()
/* 62:   */   {
/* 63:84 */     return this.transactionId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setTransactionId(String transactionId)
/* 67:   */   {
/* 68:87 */     this.transactionId = transactionId;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ZhimaCustomerCertificationInitializeModel

 * JD-Core Version:    0.7.0.1

 */