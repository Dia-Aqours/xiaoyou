/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class BusinessLicenceInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2289918847433184723L;
/*  10:    */   @ApiField("business_license_auth_pic")
/*  11:    */   private String businessLicenseAuthPic;
/*  12:    */   @ApiField("business_license_city")
/*  13:    */   private String businessLicenseCity;
/*  14:    */   @ApiField("business_license_indate")
/*  15:    */   private String businessLicenseIndate;
/*  16:    */   @ApiField("business_license_is_three_in_one")
/*  17:    */   private Boolean businessLicenseIsThreeInOne;
/*  18:    */   @ApiField("business_license_no")
/*  19:    */   private String businessLicenseNo;
/*  20:    */   @ApiField("business_license_pic")
/*  21:    */   private String businessLicensePic;
/*  22:    */   @ApiField("business_license_province")
/*  23:    */   private String businessLicenseProvince;
/*  24:    */   @ApiField("business_scope")
/*  25:    */   private String businessScope;
/*  26:    */   @ApiField("company_address")
/*  27:    */   private String companyAddress;
/*  28:    */   @ApiField("company_name")
/*  29:    */   private String companyName;
/*  30:    */   @ApiField("org_code_certificate_no")
/*  31:    */   private String orgCodeCertificateNo;
/*  32:    */   @ApiField("org_code_certificate_pic")
/*  33:    */   private String orgCodeCertificatePic;
/*  34:    */   
/*  35:    */   public String getBusinessLicenseAuthPic()
/*  36:    */   {
/*  37: 89 */     return this.businessLicenseAuthPic;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setBusinessLicenseAuthPic(String businessLicenseAuthPic)
/*  41:    */   {
/*  42: 92 */     this.businessLicenseAuthPic = businessLicenseAuthPic;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getBusinessLicenseCity()
/*  46:    */   {
/*  47: 96 */     return this.businessLicenseCity;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setBusinessLicenseCity(String businessLicenseCity)
/*  51:    */   {
/*  52: 99 */     this.businessLicenseCity = businessLicenseCity;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getBusinessLicenseIndate()
/*  56:    */   {
/*  57:103 */     return this.businessLicenseIndate;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setBusinessLicenseIndate(String businessLicenseIndate)
/*  61:    */   {
/*  62:106 */     this.businessLicenseIndate = businessLicenseIndate;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public Boolean getBusinessLicenseIsThreeInOne()
/*  66:    */   {
/*  67:110 */     return this.businessLicenseIsThreeInOne;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setBusinessLicenseIsThreeInOne(Boolean businessLicenseIsThreeInOne)
/*  71:    */   {
/*  72:113 */     this.businessLicenseIsThreeInOne = businessLicenseIsThreeInOne;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getBusinessLicenseNo()
/*  76:    */   {
/*  77:117 */     return this.businessLicenseNo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setBusinessLicenseNo(String businessLicenseNo)
/*  81:    */   {
/*  82:120 */     this.businessLicenseNo = businessLicenseNo;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getBusinessLicensePic()
/*  86:    */   {
/*  87:124 */     return this.businessLicensePic;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setBusinessLicensePic(String businessLicensePic)
/*  91:    */   {
/*  92:127 */     this.businessLicensePic = businessLicensePic;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getBusinessLicenseProvince()
/*  96:    */   {
/*  97:131 */     return this.businessLicenseProvince;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setBusinessLicenseProvince(String businessLicenseProvince)
/* 101:    */   {
/* 102:134 */     this.businessLicenseProvince = businessLicenseProvince;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getBusinessScope()
/* 106:    */   {
/* 107:138 */     return this.businessScope;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setBusinessScope(String businessScope)
/* 111:    */   {
/* 112:141 */     this.businessScope = businessScope;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getCompanyAddress()
/* 116:    */   {
/* 117:145 */     return this.companyAddress;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setCompanyAddress(String companyAddress)
/* 121:    */   {
/* 122:148 */     this.companyAddress = companyAddress;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getCompanyName()
/* 126:    */   {
/* 127:152 */     return this.companyName;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setCompanyName(String companyName)
/* 131:    */   {
/* 132:155 */     this.companyName = companyName;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getOrgCodeCertificateNo()
/* 136:    */   {
/* 137:159 */     return this.orgCodeCertificateNo;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setOrgCodeCertificateNo(String orgCodeCertificateNo)
/* 141:    */   {
/* 142:162 */     this.orgCodeCertificateNo = orgCodeCertificateNo;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getOrgCodeCertificatePic()
/* 146:    */   {
/* 147:166 */     return this.orgCodeCertificatePic;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setOrgCodeCertificatePic(String orgCodeCertificatePic)
/* 151:    */   {
/* 152:169 */     this.orgCodeCertificatePic = orgCodeCertificatePic;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BusinessLicenceInfo
 * JD-Core Version:    0.7.0.1
 */