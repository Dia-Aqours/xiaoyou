/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEcoWelfareCodeSyncModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2266844775585548729L;
/*  10:    */   @ApiField("alipay_user_id")
/*  11:    */   private String alipayUserId;
/*  12:    */   @ApiField("code")
/*  13:    */   private String code;
/*  14:    */   @ApiField("code_expire_date")
/*  15:    */   private String codeExpireDate;
/*  16:    */   @ApiField("code_num")
/*  17:    */   private Long codeNum;
/*  18:    */   @ApiField("code_pic_url")
/*  19:    */   private String codePicUrl;
/*  20:    */   @ApiField("code_start_date")
/*  21:    */   private String codeStartDate;
/*  22:    */   @ApiField("code_status")
/*  23:    */   private String codeStatus;
/*  24:    */   @ApiField("code_status_date")
/*  25:    */   private String codeStatusDate;
/*  26:    */   @ApiField("code_type")
/*  27:    */   private String codeType;
/*  28:    */   @ApiField("extend_params")
/*  29:    */   private String extendParams;
/*  30:    */   @ApiField("isv_code")
/*  31:    */   private String isvCode;
/*  32:    */   @ApiField("store_info")
/*  33:    */   private WelfareEcoStoreInfo storeInfo;
/*  34:    */   @ApiField("sync_date")
/*  35:    */   private String syncDate;
/*  36:    */   @ApiField("welfare_user_id")
/*  37:    */   private String welfareUserId;
/*  38:    */   
/*  39:    */   public String getAlipayUserId()
/*  40:    */   {
/*  41:114 */     return this.alipayUserId;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setAlipayUserId(String alipayUserId)
/*  45:    */   {
/*  46:117 */     this.alipayUserId = alipayUserId;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getCode()
/*  50:    */   {
/*  51:121 */     return this.code;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setCode(String code)
/*  55:    */   {
/*  56:124 */     this.code = code;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getCodeExpireDate()
/*  60:    */   {
/*  61:128 */     return this.codeExpireDate;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCodeExpireDate(String codeExpireDate)
/*  65:    */   {
/*  66:131 */     this.codeExpireDate = codeExpireDate;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public Long getCodeNum()
/*  70:    */   {
/*  71:135 */     return this.codeNum;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setCodeNum(Long codeNum)
/*  75:    */   {
/*  76:138 */     this.codeNum = codeNum;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getCodePicUrl()
/*  80:    */   {
/*  81:142 */     return this.codePicUrl;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setCodePicUrl(String codePicUrl)
/*  85:    */   {
/*  86:145 */     this.codePicUrl = codePicUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getCodeStartDate()
/*  90:    */   {
/*  91:149 */     return this.codeStartDate;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setCodeStartDate(String codeStartDate)
/*  95:    */   {
/*  96:152 */     this.codeStartDate = codeStartDate;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getCodeStatus()
/* 100:    */   {
/* 101:156 */     return this.codeStatus;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setCodeStatus(String codeStatus)
/* 105:    */   {
/* 106:159 */     this.codeStatus = codeStatus;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getCodeStatusDate()
/* 110:    */   {
/* 111:163 */     return this.codeStatusDate;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setCodeStatusDate(String codeStatusDate)
/* 115:    */   {
/* 116:166 */     this.codeStatusDate = codeStatusDate;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getCodeType()
/* 120:    */   {
/* 121:170 */     return this.codeType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setCodeType(String codeType)
/* 125:    */   {
/* 126:173 */     this.codeType = codeType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getExtendParams()
/* 130:    */   {
/* 131:177 */     return this.extendParams;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setExtendParams(String extendParams)
/* 135:    */   {
/* 136:180 */     this.extendParams = extendParams;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getIsvCode()
/* 140:    */   {
/* 141:184 */     return this.isvCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setIsvCode(String isvCode)
/* 145:    */   {
/* 146:187 */     this.isvCode = isvCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public WelfareEcoStoreInfo getStoreInfo()
/* 150:    */   {
/* 151:191 */     return this.storeInfo;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setStoreInfo(WelfareEcoStoreInfo storeInfo)
/* 155:    */   {
/* 156:194 */     this.storeInfo = storeInfo;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getSyncDate()
/* 160:    */   {
/* 161:198 */     return this.syncDate;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setSyncDate(String syncDate)
/* 165:    */   {
/* 166:201 */     this.syncDate = syncDate;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getWelfareUserId()
/* 170:    */   {
/* 171:205 */     return this.welfareUserId;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setWelfareUserId(String welfareUserId)
/* 175:    */   {
/* 176:208 */     this.welfareUserId = welfareUserId;
/* 177:    */   }
/* 178:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoWelfareCodeSyncModel
 * JD-Core Version:    0.7.0.1
 */