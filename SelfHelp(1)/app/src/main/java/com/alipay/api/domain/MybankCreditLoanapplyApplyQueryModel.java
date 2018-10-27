/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankCreditLoanapplyApplyQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1545385779776758143L;
/* 10:   */   @ApiField("cert_no")
/* 11:   */   private String certNo;
/* 12:   */   @ApiField("cert_type")
/* 13:   */   private String certType;
/* 14:   */   @ApiField("ext_params")
/* 15:   */   private String extParams;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
/* 18:   */   @ApiField("subapply_no")
/* 19:   */   private String subapplyNo;
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
/* 41:   */   public String getExtParams()
/* 42:   */   {
/* 43:61 */     return this.extParams;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setExtParams(String extParams)
/* 47:   */   {
/* 48:64 */     this.extParams = extParams;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getName()
/* 52:   */   {
/* 53:68 */     return this.name;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setName(String name)
/* 57:   */   {
/* 58:71 */     this.name = name;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getSubapplyNo()
/* 62:   */   {
/* 63:75 */     return this.subapplyNo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setSubapplyNo(String subapplyNo)
/* 67:   */   {
/* 68:78 */     this.subapplyNo = subapplyNo;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MybankCreditLoanapplyApplyQueryModel
 * JD-Core Version:    0.7.0.1
 */