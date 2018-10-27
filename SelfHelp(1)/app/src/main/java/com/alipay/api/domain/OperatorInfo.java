/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class OperatorInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8211556261933782447L;
/* 10:   */   @ApiField("operator_cert_indate")
/* 11:   */   private String operatorCertIndate;
/* 12:   */   @ApiField("operator_cert_no")
/* 13:   */   private String operatorCertNo;
/* 14:   */   @ApiField("operator_cert_pic_back")
/* 15:   */   private String operatorCertPicBack;
/* 16:   */   @ApiField("operator_cert_pic_front")
/* 17:   */   private String operatorCertPicFront;
/* 18:   */   @ApiField("operator_cert_type")
/* 19:   */   private String operatorCertType;
/* 20:   */   @ApiField("operator_name")
/* 21:   */   private String operatorName;
/* 22:   */   
/* 23:   */   public String getOperatorCertIndate()
/* 24:   */   {
/* 25:53 */     return this.operatorCertIndate;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setOperatorCertIndate(String operatorCertIndate)
/* 29:   */   {
/* 30:56 */     this.operatorCertIndate = operatorCertIndate;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getOperatorCertNo()
/* 34:   */   {
/* 35:60 */     return this.operatorCertNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setOperatorCertNo(String operatorCertNo)
/* 39:   */   {
/* 40:63 */     this.operatorCertNo = operatorCertNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getOperatorCertPicBack()
/* 44:   */   {
/* 45:67 */     return this.operatorCertPicBack;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setOperatorCertPicBack(String operatorCertPicBack)
/* 49:   */   {
/* 50:70 */     this.operatorCertPicBack = operatorCertPicBack;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOperatorCertPicFront()
/* 54:   */   {
/* 55:74 */     return this.operatorCertPicFront;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOperatorCertPicFront(String operatorCertPicFront)
/* 59:   */   {
/* 60:77 */     this.operatorCertPicFront = operatorCertPicFront;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getOperatorCertType()
/* 64:   */   {
/* 65:81 */     return this.operatorCertType;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setOperatorCertType(String operatorCertType)
/* 69:   */   {
/* 70:84 */     this.operatorCertType = operatorCertType;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getOperatorName()
/* 74:   */   {
/* 75:88 */     return this.operatorName;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setOperatorName(String operatorName)
/* 79:   */   {
/* 80:91 */     this.operatorName = operatorName;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.OperatorInfo

 * JD-Core Version:    0.7.0.1

 */