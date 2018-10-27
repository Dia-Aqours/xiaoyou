/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ContactPersonInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5645194579336838389L;
/* 10:   */   @ApiField("contact_email")
/* 11:   */   private String contactEmail;
/* 12:   */   @ApiField("contact_mobile")
/* 13:   */   private String contactMobile;
/* 14:   */   @ApiField("contact_name")
/* 15:   */   private String contactName;
/* 16:   */   @ApiField("contact_type")
/* 17:   */   private String contactType;
/* 18:   */   
/* 19:   */   public String getContactEmail()
/* 20:   */   {
/* 21:41 */     return this.contactEmail;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setContactEmail(String contactEmail)
/* 25:   */   {
/* 26:44 */     this.contactEmail = contactEmail;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getContactMobile()
/* 30:   */   {
/* 31:48 */     return this.contactMobile;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setContactMobile(String contactMobile)
/* 35:   */   {
/* 36:51 */     this.contactMobile = contactMobile;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getContactName()
/* 40:   */   {
/* 41:55 */     return this.contactName;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setContactName(String contactName)
/* 45:   */   {
/* 46:58 */     this.contactName = contactName;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getContactType()
/* 50:   */   {
/* 51:62 */     return this.contactType;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setContactType(String contactType)
/* 55:   */   {
/* 56:65 */     this.contactType = contactType;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ContactPersonInfo
 * JD-Core Version:    0.7.0.1
 */