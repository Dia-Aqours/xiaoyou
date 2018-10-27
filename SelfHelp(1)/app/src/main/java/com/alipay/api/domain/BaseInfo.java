/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class BaseInfo
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 6484414527279529489L;
/*  12:    */   @ApiField("alipay_fuwu_name")
/*  13:    */   private String alipayFuwuName;
/*  14:    */   @ApiField("app_name")
/*  15:    */   private String appName;
/*  16:    */   @ApiListField("contact_info")
/*  17:    */   @ApiField("contact_person_info")
/*  18:    */   private List<ContactPersonInfo> contactInfo;
/*  19:    */   @ApiField("logo_pic")
/*  20:    */   private String logoPic;
/*  21:    */   @ApiField("mcc_code")
/*  22:    */   private String mccCode;
/*  23:    */   @ApiField("short_name")
/*  24:    */   private String shortName;
/*  25:    */   @ApiListField("special_license_pic")
/*  26:    */   @ApiField("string")
/*  27:    */   private List<String> specialLicensePic;
/*  28:    */   @ApiField("usage_scenario")
/*  29:    */   private String usageScenario;
/*  30:    */   @ApiListField("web_address")
/*  31:    */   @ApiField("string")
/*  32:    */   private List<String> webAddress;
/*  33:    */   @ApiField("web_auth_pic")
/*  34:    */   private String webAuthPic;
/*  35:    */   @ApiField("weixin_public_name")
/*  36:    */   private String weixinPublicName;
/*  37:    */   
/*  38:    */   public String getAlipayFuwuName()
/*  39:    */   {
/*  40: 93 */     return this.alipayFuwuName;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setAlipayFuwuName(String alipayFuwuName)
/*  44:    */   {
/*  45: 96 */     this.alipayFuwuName = alipayFuwuName;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getAppName()
/*  49:    */   {
/*  50:100 */     return this.appName;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAppName(String appName)
/*  54:    */   {
/*  55:103 */     this.appName = appName;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public List<ContactPersonInfo> getContactInfo()
/*  59:    */   {
/*  60:107 */     return this.contactInfo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setContactInfo(List<ContactPersonInfo> contactInfo)
/*  64:    */   {
/*  65:110 */     this.contactInfo = contactInfo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getLogoPic()
/*  69:    */   {
/*  70:114 */     return this.logoPic;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setLogoPic(String logoPic)
/*  74:    */   {
/*  75:117 */     this.logoPic = logoPic;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getMccCode()
/*  79:    */   {
/*  80:121 */     return this.mccCode;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setMccCode(String mccCode)
/*  84:    */   {
/*  85:124 */     this.mccCode = mccCode;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getShortName()
/*  89:    */   {
/*  90:128 */     return this.shortName;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setShortName(String shortName)
/*  94:    */   {
/*  95:131 */     this.shortName = shortName;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public List<String> getSpecialLicensePic()
/*  99:    */   {
/* 100:135 */     return this.specialLicensePic;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setSpecialLicensePic(List<String> specialLicensePic)
/* 104:    */   {
/* 105:138 */     this.specialLicensePic = specialLicensePic;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getUsageScenario()
/* 109:    */   {
/* 110:142 */     return this.usageScenario;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setUsageScenario(String usageScenario)
/* 114:    */   {
/* 115:145 */     this.usageScenario = usageScenario;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public List<String> getWebAddress()
/* 119:    */   {
/* 120:149 */     return this.webAddress;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setWebAddress(List<String> webAddress)
/* 124:    */   {
/* 125:152 */     this.webAddress = webAddress;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getWebAuthPic()
/* 129:    */   {
/* 130:156 */     return this.webAuthPic;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setWebAuthPic(String webAuthPic)
/* 134:    */   {
/* 135:159 */     this.webAuthPic = webAuthPic;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getWeixinPublicName()
/* 139:    */   {
/* 140:163 */     return this.weixinPublicName;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setWeixinPublicName(String weixinPublicName)
/* 144:    */   {
/* 145:166 */     this.weixinPublicName = weixinPublicName;
/* 146:    */   }
/* 147:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BaseInfo
 * JD-Core Version:    0.7.0.1
 */