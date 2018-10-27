/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineProviderStaffUpdateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2672186866912298529L;
/*  10:    */   @ApiField("alipay_no")
/*  11:    */   private String alipayNo;
/*  12:    */   @ApiField("biz_type")
/*  13:    */   private String bizType;
/*  14:    */   @ApiField("client_ip")
/*  15:    */   private String clientIp;
/*  16:    */   @ApiField("description")
/*  17:    */   private String description;
/*  18:    */   @ApiField("email")
/*  19:    */   private String email;
/*  20:    */   @ApiField("login_staff_id")
/*  21:    */   private String loginStaffId;
/*  22:    */   @ApiField("merchant_id")
/*  23:    */   private String merchantId;
/*  24:    */   @ApiField("merchant_id_type")
/*  25:    */   private String merchantIdType;
/*  26:    */   @ApiField("ope_pid")
/*  27:    */   private String opePid;
/*  28:    */   @ApiField("operate_type")
/*  29:    */   private String operateType;
/*  30:    */   @ApiField("request_id")
/*  31:    */   private String requestId;
/*  32:    */   @ApiField("role_type")
/*  33:    */   private String roleType;
/*  34:    */   @ApiField("staff_id")
/*  35:    */   private String staffId;
/*  36:    */   @ApiField("staff_mobile")
/*  37:    */   private String staffMobile;
/*  38:    */   @ApiField("staff_name")
/*  39:    */   private String staffName;
/*  40:    */   @ApiField("staff_type")
/*  41:    */   private String staffType;
/*  42:    */   
/*  43:    */   public String getAlipayNo()
/*  44:    */   {
/*  45:113 */     return this.alipayNo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setAlipayNo(String alipayNo)
/*  49:    */   {
/*  50:116 */     this.alipayNo = alipayNo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getBizType()
/*  54:    */   {
/*  55:120 */     return this.bizType;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setBizType(String bizType)
/*  59:    */   {
/*  60:123 */     this.bizType = bizType;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getClientIp()
/*  64:    */   {
/*  65:127 */     return this.clientIp;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setClientIp(String clientIp)
/*  69:    */   {
/*  70:130 */     this.clientIp = clientIp;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getDescription()
/*  74:    */   {
/*  75:134 */     return this.description;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setDescription(String description)
/*  79:    */   {
/*  80:137 */     this.description = description;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getEmail()
/*  84:    */   {
/*  85:141 */     return this.email;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setEmail(String email)
/*  89:    */   {
/*  90:144 */     this.email = email;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getLoginStaffId()
/*  94:    */   {
/*  95:148 */     return this.loginStaffId;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setLoginStaffId(String loginStaffId)
/*  99:    */   {
/* 100:151 */     this.loginStaffId = loginStaffId;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getMerchantId()
/* 104:    */   {
/* 105:155 */     return this.merchantId;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setMerchantId(String merchantId)
/* 109:    */   {
/* 110:158 */     this.merchantId = merchantId;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getMerchantIdType()
/* 114:    */   {
/* 115:162 */     return this.merchantIdType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setMerchantIdType(String merchantIdType)
/* 119:    */   {
/* 120:165 */     this.merchantIdType = merchantIdType;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getOpePid()
/* 124:    */   {
/* 125:169 */     return this.opePid;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setOpePid(String opePid)
/* 129:    */   {
/* 130:172 */     this.opePid = opePid;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getOperateType()
/* 134:    */   {
/* 135:176 */     return this.operateType;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setOperateType(String operateType)
/* 139:    */   {
/* 140:179 */     this.operateType = operateType;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getRequestId()
/* 144:    */   {
/* 145:183 */     return this.requestId;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setRequestId(String requestId)
/* 149:    */   {
/* 150:186 */     this.requestId = requestId;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getRoleType()
/* 154:    */   {
/* 155:190 */     return this.roleType;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setRoleType(String roleType)
/* 159:    */   {
/* 160:193 */     this.roleType = roleType;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getStaffId()
/* 164:    */   {
/* 165:197 */     return this.staffId;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setStaffId(String staffId)
/* 169:    */   {
/* 170:200 */     this.staffId = staffId;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getStaffMobile()
/* 174:    */   {
/* 175:204 */     return this.staffMobile;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setStaffMobile(String staffMobile)
/* 179:    */   {
/* 180:207 */     this.staffMobile = staffMobile;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getStaffName()
/* 184:    */   {
/* 185:211 */     return this.staffName;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setStaffName(String staffName)
/* 189:    */   {
/* 190:214 */     this.staffName = staffName;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getStaffType()
/* 194:    */   {
/* 195:218 */     return this.staffType;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setStaffType(String staffType)
/* 199:    */   {
/* 200:221 */     this.staffType = staffType;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderStaffUpdateModel
 * JD-Core Version:    0.7.0.1
 */