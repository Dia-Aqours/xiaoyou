/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOperatorMobileBindResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4233583896363932492L;
/* 10:   */   @ApiField("alipay_user_id")
/* 11:   */   private String alipayUserId;
/* 12:   */   @ApiField("certificate")
/* 13:   */   private String certificate;
/* 14:   */   @ApiField("mobile_no")
/* 15:   */   private String mobileNo;
/* 16:   */   @ApiField("status")
/* 17:   */   private String status;
/* 18:   */   @ApiField("user_name")
/* 19:   */   private String userName;
/* 20:   */   
/* 21:   */   public void setAlipayUserId(String alipayUserId)
/* 22:   */   {
/* 23:51 */     this.alipayUserId = alipayUserId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getAlipayUserId()
/* 27:   */   {
/* 28:54 */     return this.alipayUserId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setCertificate(String certificate)
/* 32:   */   {
/* 33:58 */     this.certificate = certificate;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getCertificate()
/* 37:   */   {
/* 38:61 */     return this.certificate;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setMobileNo(String mobileNo)
/* 42:   */   {
/* 43:65 */     this.mobileNo = mobileNo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getMobileNo()
/* 47:   */   {
/* 48:68 */     return this.mobileNo;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setStatus(String status)
/* 52:   */   {
/* 53:72 */     this.status = status;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getStatus()
/* 57:   */   {
/* 58:75 */     return this.status;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setUserName(String userName)
/* 62:   */   {
/* 63:79 */     this.userName = userName;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getUserName()
/* 67:   */   {
/* 68:82 */     return this.userName;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOperatorMobileBindResponse
 * JD-Core Version:    0.7.0.1
 */