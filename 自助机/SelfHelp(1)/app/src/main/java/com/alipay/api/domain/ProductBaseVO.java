/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ProductBaseVO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4333113384921843819L;
/*  10:    */   @ApiField("biz_status")
/*  11:    */   private String bizStatus;
/*  12:    */   @ApiField("is_combinate")
/*  13:    */   private String isCombinate;
/*  14:    */   @ApiField("prod_env")
/*  15:    */   private String prodEnv;
/*  16:    */   @ApiField("prod_name")
/*  17:    */   private String prodName;
/*  18:    */   @ApiField("prod_template_code")
/*  19:    */   private String prodTemplateCode;
/*  20:    */   @ApiField("prod_template_version")
/*  21:    */   private String prodTemplateVersion;
/*  22:    */   @ApiField("prod_type")
/*  23:    */   private String prodType;
/*  24:    */   @ApiField("prod_version")
/*  25:    */   private String prodVersion;
/*  26:    */   @ApiField("status")
/*  27:    */   private String status;
/*  28:    */   @ApiField("std_prod_code")
/*  29:    */   private String stdProdCode;
/*  30:    */   @ApiField("std_prod_version")
/*  31:    */   private String stdProdVersion;
/*  32:    */   
/*  33:    */   public String getBizStatus()
/*  34:    */   {
/*  35: 83 */     return this.bizStatus;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setBizStatus(String bizStatus)
/*  39:    */   {
/*  40: 86 */     this.bizStatus = bizStatus;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getIsCombinate()
/*  44:    */   {
/*  45: 90 */     return this.isCombinate;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setIsCombinate(String isCombinate)
/*  49:    */   {
/*  50: 93 */     this.isCombinate = isCombinate;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getProdEnv()
/*  54:    */   {
/*  55: 97 */     return this.prodEnv;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setProdEnv(String prodEnv)
/*  59:    */   {
/*  60:100 */     this.prodEnv = prodEnv;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getProdName()
/*  64:    */   {
/*  65:104 */     return this.prodName;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setProdName(String prodName)
/*  69:    */   {
/*  70:107 */     this.prodName = prodName;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getProdTemplateCode()
/*  74:    */   {
/*  75:111 */     return this.prodTemplateCode;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setProdTemplateCode(String prodTemplateCode)
/*  79:    */   {
/*  80:114 */     this.prodTemplateCode = prodTemplateCode;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getProdTemplateVersion()
/*  84:    */   {
/*  85:118 */     return this.prodTemplateVersion;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setProdTemplateVersion(String prodTemplateVersion)
/*  89:    */   {
/*  90:121 */     this.prodTemplateVersion = prodTemplateVersion;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getProdType()
/*  94:    */   {
/*  95:125 */     return this.prodType;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setProdType(String prodType)
/*  99:    */   {
/* 100:128 */     this.prodType = prodType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getProdVersion()
/* 104:    */   {
/* 105:132 */     return this.prodVersion;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setProdVersion(String prodVersion)
/* 109:    */   {
/* 110:135 */     this.prodVersion = prodVersion;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getStatus()
/* 114:    */   {
/* 115:139 */     return this.status;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setStatus(String status)
/* 119:    */   {
/* 120:142 */     this.status = status;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getStdProdCode()
/* 124:    */   {
/* 125:146 */     return this.stdProdCode;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setStdProdCode(String stdProdCode)
/* 129:    */   {
/* 130:149 */     this.stdProdCode = stdProdCode;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getStdProdVersion()
/* 134:    */   {
/* 135:153 */     return this.stdProdVersion;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setStdProdVersion(String stdProdVersion)
/* 139:    */   {
/* 140:156 */     this.stdProdVersion = stdProdVersion;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ProductBaseVO
 * JD-Core Version:    0.7.0.1
 */