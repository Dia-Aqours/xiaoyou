/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AliTrustAlipayCert
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7336182944866688838L;
/* 11:   */   @ApiField("birthday")
/* 12:   */   private Date birthday;
/* 13:   */   @ApiField("forward_url")
/* 14:   */   private String forwardUrl;
/* 15:   */   @ApiField("gender")
/* 16:   */   private String gender;
/* 17:   */   @ApiField("icon_url")
/* 18:   */   private String iconUrl;
/* 19:   */   @ApiField("is_certified")
/* 20:   */   private String isCertified;
/* 21:   */   @ApiField("name")
/* 22:   */   private String name;
/* 23:   */   
/* 24:   */   public Date getBirthday()
/* 25:   */   {
/* 26:55 */     return this.birthday;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setBirthday(Date birthday)
/* 30:   */   {
/* 31:58 */     this.birthday = birthday;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getForwardUrl()
/* 35:   */   {
/* 36:62 */     return this.forwardUrl;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setForwardUrl(String forwardUrl)
/* 40:   */   {
/* 41:65 */     this.forwardUrl = forwardUrl;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getGender()
/* 45:   */   {
/* 46:69 */     return this.gender;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setGender(String gender)
/* 50:   */   {
/* 51:72 */     this.gender = gender;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getIconUrl()
/* 55:   */   {
/* 56:76 */     return this.iconUrl;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setIconUrl(String iconUrl)
/* 60:   */   {
/* 61:79 */     this.iconUrl = iconUrl;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getIsCertified()
/* 65:   */   {
/* 66:83 */     return this.isCertified;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setIsCertified(String isCertified)
/* 70:   */   {
/* 71:86 */     this.isCertified = isCertified;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public String getName()
/* 75:   */   {
/* 76:90 */     return this.name;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setName(String name)
/* 80:   */   {
/* 81:93 */     this.name = name;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AliTrustAlipayCert
 * JD-Core Version:    0.7.0.1
 */