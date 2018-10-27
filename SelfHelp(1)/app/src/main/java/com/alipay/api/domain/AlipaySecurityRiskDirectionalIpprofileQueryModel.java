/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityRiskDirectionalIpprofileQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8438274678456819818L;
/* 10:   */   @ApiField("cert_no")
/* 11:   */   private String certNo;
/* 12:   */   @ApiField("ip_address")
/* 13:   */   private String ipAddress;
/* 14:   */   @ApiField("phone")
/* 15:   */   private String phone;
/* 16:   */   
/* 17:   */   public String getCertNo()
/* 18:   */   {
/* 19:35 */     return this.certNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCertNo(String certNo)
/* 23:   */   {
/* 24:38 */     this.certNo = certNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getIpAddress()
/* 28:   */   {
/* 29:42 */     return this.ipAddress;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setIpAddress(String ipAddress)
/* 33:   */   {
/* 34:45 */     this.ipAddress = ipAddress;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPhone()
/* 38:   */   {
/* 39:49 */     return this.phone;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPhone(String phone)
/* 43:   */   {
/* 44:52 */     this.phone = phone;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskDirectionalIpprofileQueryModel
 * JD-Core Version:    0.7.0.1
 */