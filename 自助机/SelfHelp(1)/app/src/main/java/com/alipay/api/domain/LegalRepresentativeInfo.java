/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class LegalRepresentativeInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2443589233298256171L;
/* 10:   */   @ApiField("legal_representative_cert_indate")
/* 11:   */   private String legalRepresentativeCertIndate;
/* 12:   */   @ApiField("legal_representative_cert_no")
/* 13:   */   private String legalRepresentativeCertNo;
/* 14:   */   @ApiField("legal_representative_cert_pic_back")
/* 15:   */   private String legalRepresentativeCertPicBack;
/* 16:   */   @ApiField("legal_representative_cert_pic_front")
/* 17:   */   private String legalRepresentativeCertPicFront;
/* 18:   */   @ApiField("legal_representative_cert_type")
/* 19:   */   private String legalRepresentativeCertType;
/* 20:   */   @ApiField("legal_representative_name")
/* 21:   */   private String legalRepresentativeName;
/* 22:   */   
/* 23:   */   public String getLegalRepresentativeCertIndate()
/* 24:   */   {
/* 25:53 */     return this.legalRepresentativeCertIndate;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setLegalRepresentativeCertIndate(String legalRepresentativeCertIndate)
/* 29:   */   {
/* 30:56 */     this.legalRepresentativeCertIndate = legalRepresentativeCertIndate;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getLegalRepresentativeCertNo()
/* 34:   */   {
/* 35:60 */     return this.legalRepresentativeCertNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setLegalRepresentativeCertNo(String legalRepresentativeCertNo)
/* 39:   */   {
/* 40:63 */     this.legalRepresentativeCertNo = legalRepresentativeCertNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getLegalRepresentativeCertPicBack()
/* 44:   */   {
/* 45:67 */     return this.legalRepresentativeCertPicBack;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setLegalRepresentativeCertPicBack(String legalRepresentativeCertPicBack)
/* 49:   */   {
/* 50:70 */     this.legalRepresentativeCertPicBack = legalRepresentativeCertPicBack;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getLegalRepresentativeCertPicFront()
/* 54:   */   {
/* 55:74 */     return this.legalRepresentativeCertPicFront;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setLegalRepresentativeCertPicFront(String legalRepresentativeCertPicFront)
/* 59:   */   {
/* 60:77 */     this.legalRepresentativeCertPicFront = legalRepresentativeCertPicFront;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getLegalRepresentativeCertType()
/* 64:   */   {
/* 65:81 */     return this.legalRepresentativeCertType;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setLegalRepresentativeCertType(String legalRepresentativeCertType)
/* 69:   */   {
/* 70:84 */     this.legalRepresentativeCertType = legalRepresentativeCertType;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getLegalRepresentativeName()
/* 74:   */   {
/* 75:88 */     return this.legalRepresentativeName;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setLegalRepresentativeName(String legalRepresentativeName)
/* 79:   */   {
/* 80:91 */     this.legalRepresentativeName = legalRepresentativeName;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.LegalRepresentativeInfo
 * JD-Core Version:    0.7.0.1
 */