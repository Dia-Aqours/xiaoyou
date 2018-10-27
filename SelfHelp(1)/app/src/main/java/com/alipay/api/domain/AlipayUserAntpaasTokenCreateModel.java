/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayUserAntpaasTokenCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3723651533418977895L;
/*  10:    */   @ApiField("bind_mobile")
/*  11:    */   private String bindMobile;
/*  12:    */   @ApiField("country")
/*  13:    */   private String country;
/*  14:    */   @ApiField("login_password")
/*  15:    */   private String loginPassword;
/*  16:    */   @ApiField("logon_id")
/*  17:    */   private String logonId;
/*  18:    */   @ApiField("need_supply")
/*  19:    */   private Boolean needSupply;
/*  20:    */   @ApiField("security_password")
/*  21:    */   private String securityPassword;
/*  22:    */   @ApiField("source")
/*  23:    */   private String source;
/*  24:    */   @ApiField("user_type")
/*  25:    */   private String userType;
/*  26:    */   
/*  27:    */   public String getBindMobile()
/*  28:    */   {
/*  29: 66 */     return this.bindMobile;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setBindMobile(String bindMobile)
/*  33:    */   {
/*  34: 69 */     this.bindMobile = bindMobile;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getCountry()
/*  38:    */   {
/*  39: 73 */     return this.country;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setCountry(String country)
/*  43:    */   {
/*  44: 76 */     this.country = country;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getLoginPassword()
/*  48:    */   {
/*  49: 80 */     return this.loginPassword;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setLoginPassword(String loginPassword)
/*  53:    */   {
/*  54: 83 */     this.loginPassword = loginPassword;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getLogonId()
/*  58:    */   {
/*  59: 87 */     return this.logonId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setLogonId(String logonId)
/*  63:    */   {
/*  64: 90 */     this.logonId = logonId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public Boolean getNeedSupply()
/*  68:    */   {
/*  69: 94 */     return this.needSupply;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setNeedSupply(Boolean needSupply)
/*  73:    */   {
/*  74: 97 */     this.needSupply = needSupply;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getSecurityPassword()
/*  78:    */   {
/*  79:101 */     return this.securityPassword;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setSecurityPassword(String securityPassword)
/*  83:    */   {
/*  84:104 */     this.securityPassword = securityPassword;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getSource()
/*  88:    */   {
/*  89:108 */     return this.source;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setSource(String source)
/*  93:    */   {
/*  94:111 */     this.source = source;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getUserType()
/*  98:    */   {
/*  99:115 */     return this.userType;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setUserType(String userType)
/* 103:    */   {
/* 104:118 */     this.userType = userType;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserAntpaasTokenCreateModel
 * JD-Core Version:    0.7.0.1
 */