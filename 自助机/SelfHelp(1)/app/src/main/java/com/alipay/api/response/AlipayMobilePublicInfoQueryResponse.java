/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMobilePublicInfoQueryResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3626743141937748371L;
/*  10:    */   @ApiField("app_name")
/*  11:    */   private String appName;
/*  12:    */   @ApiField("audit_desc")
/*  13:    */   private String auditDesc;
/*  14:    */   @ApiField("audit_status")
/*  15:    */   private String auditStatus;
/*  16:    */   @ApiField("is_online")
/*  17:    */   private String isOnline;
/*  18:    */   @ApiField("is_release")
/*  19:    */   private String isRelease;
/*  20:    */   @ApiField("logo_url")
/*  21:    */   private String logoUrl;
/*  22:    */   @ApiField("public_greeting")
/*  23:    */   private String publicGreeting;
/*  24:    */   
/*  25:    */   public void setAppName(String appName)
/*  26:    */   {
/*  27: 60 */     this.appName = appName;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getAppName()
/*  31:    */   {
/*  32: 63 */     return this.appName;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setAuditDesc(String auditDesc)
/*  36:    */   {
/*  37: 67 */     this.auditDesc = auditDesc;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAuditDesc()
/*  41:    */   {
/*  42: 70 */     return this.auditDesc;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAuditStatus(String auditStatus)
/*  46:    */   {
/*  47: 74 */     this.auditStatus = auditStatus;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getAuditStatus()
/*  51:    */   {
/*  52: 77 */     return this.auditStatus;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setIsOnline(String isOnline)
/*  56:    */   {
/*  57: 81 */     this.isOnline = isOnline;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getIsOnline()
/*  61:    */   {
/*  62: 84 */     return this.isOnline;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setIsRelease(String isRelease)
/*  66:    */   {
/*  67: 88 */     this.isRelease = isRelease;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getIsRelease()
/*  71:    */   {
/*  72: 91 */     return this.isRelease;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setLogoUrl(String logoUrl)
/*  76:    */   {
/*  77: 95 */     this.logoUrl = logoUrl;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getLogoUrl()
/*  81:    */   {
/*  82: 98 */     return this.logoUrl;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setPublicGreeting(String publicGreeting)
/*  86:    */   {
/*  87:102 */     this.publicGreeting = publicGreeting;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getPublicGreeting()
/*  91:    */   {
/*  92:105 */     return this.publicGreeting;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicInfoQueryResponse
 * JD-Core Version:    0.7.0.1
 */