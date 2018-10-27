/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AliTrustCert
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1177746878252225166L;
/* 10:   */   @ApiField("forward_url")
/* 11:   */   private String forwardUrl;
/* 12:   */   @ApiField("icon_url")
/* 13:   */   private String iconUrl;
/* 14:   */   @ApiField("is_certified")
/* 15:   */   private String isCertified;
/* 16:   */   @ApiField("level")
/* 17:   */   private String level;
/* 18:   */   @ApiField("message")
/* 19:   */   private String message;
/* 20:   */   
/* 21:   */   public String getForwardUrl()
/* 22:   */   {
/* 23:47 */     return this.forwardUrl;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setForwardUrl(String forwardUrl)
/* 27:   */   {
/* 28:50 */     this.forwardUrl = forwardUrl;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getIconUrl()
/* 32:   */   {
/* 33:54 */     return this.iconUrl;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setIconUrl(String iconUrl)
/* 37:   */   {
/* 38:57 */     this.iconUrl = iconUrl;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getIsCertified()
/* 42:   */   {
/* 43:61 */     return this.isCertified;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setIsCertified(String isCertified)
/* 47:   */   {
/* 48:64 */     this.isCertified = isCertified;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getLevel()
/* 52:   */   {
/* 53:68 */     return this.level;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setLevel(String level)
/* 57:   */   {
/* 58:71 */     this.level = level;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getMessage()
/* 62:   */   {
/* 63:75 */     return this.message;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setMessage(String message)
/* 67:   */   {
/* 68:78 */     this.message = message;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AliTrustCert
 * JD-Core Version:    0.7.0.1
 */