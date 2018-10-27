/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOpenPublicInfoModifyModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1261481445792986696L;
/* 12:   */   @ApiField("app_name")
/* 13:   */   private String appName;
/* 14:   */   @ApiField("auth_pic")
/* 15:   */   private String authPic;
/* 16:   */   @ApiField("license_url")
/* 17:   */   private String licenseUrl;
/* 18:   */   @ApiField("logo_url")
/* 19:   */   private String logoUrl;
/* 20:   */   @ApiField("public_greeting")
/* 21:   */   private String publicGreeting;
/* 22:   */   @ApiListField("shop_pics")
/* 23:   */   @ApiField("string")
/* 24:   */   private List<String> shopPics;
/* 25:   */   
/* 26:   */   public String getAppName()
/* 27:   */   {
/* 28:57 */     return this.appName;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setAppName(String appName)
/* 32:   */   {
/* 33:60 */     this.appName = appName;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getAuthPic()
/* 37:   */   {
/* 38:64 */     return this.authPic;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setAuthPic(String authPic)
/* 42:   */   {
/* 43:67 */     this.authPic = authPic;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getLicenseUrl()
/* 47:   */   {
/* 48:71 */     return this.licenseUrl;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setLicenseUrl(String licenseUrl)
/* 52:   */   {
/* 53:74 */     this.licenseUrl = licenseUrl;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getLogoUrl()
/* 57:   */   {
/* 58:78 */     return this.logoUrl;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setLogoUrl(String logoUrl)
/* 62:   */   {
/* 63:81 */     this.logoUrl = logoUrl;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getPublicGreeting()
/* 67:   */   {
/* 68:85 */     return this.publicGreeting;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void setPublicGreeting(String publicGreeting)
/* 72:   */   {
/* 73:88 */     this.publicGreeting = publicGreeting;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public List<String> getShopPics()
/* 77:   */   {
/* 78:92 */     return this.shopPics;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void setShopPics(List<String> shopPics)
/* 82:   */   {
/* 83:95 */     this.shopPics = shopPics;
/* 84:   */   }
/* 85:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicInfoModifyModel
 * JD-Core Version:    0.7.0.1
 */