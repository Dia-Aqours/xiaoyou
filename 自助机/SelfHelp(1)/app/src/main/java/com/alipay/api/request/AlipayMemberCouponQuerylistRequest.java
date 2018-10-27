/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMemberCouponQuerylistResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMemberCouponQuerylistRequest
/*  10:    */   implements AlipayRequest<AlipayMemberCouponQuerylistResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String merchantInfo;
/*  15:    */   private String pageNo;
/*  16:    */   private String pageSize;
/*  17:    */   private String status;
/*  18:    */   private String userInfo;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   private String returnUrl;
/*  24:    */   
/*  25:    */   public void setMerchantInfo(String merchantInfo)
/*  26:    */   {
/*  27: 63 */     this.merchantInfo = merchantInfo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getMerchantInfo()
/*  31:    */   {
/*  32: 66 */     return this.merchantInfo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setPageNo(String pageNo)
/*  36:    */   {
/*  37: 70 */     this.pageNo = pageNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getPageNo()
/*  41:    */   {
/*  42: 73 */     return this.pageNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setPageSize(String pageSize)
/*  46:    */   {
/*  47: 77 */     this.pageSize = pageSize;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getPageSize()
/*  51:    */   {
/*  52: 80 */     return this.pageSize;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setStatus(String status)
/*  56:    */   {
/*  57: 84 */     this.status = status;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getStatus()
/*  61:    */   {
/*  62: 87 */     return this.status;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setUserInfo(String userInfo)
/*  66:    */   {
/*  67: 91 */     this.userInfo = userInfo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getUserInfo()
/*  71:    */   {
/*  72: 94 */     return this.userInfo;
/*  73:    */   }
/*  74:    */   
/*  75:101 */   private boolean needEncrypt = false;
/*  76:102 */   private AlipayObject bizModel = null;
/*  77:    */   
/*  78:    */   public String getNotifyUrl()
/*  79:    */   {
/*  80:105 */     return this.notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setNotifyUrl(String notifyUrl)
/*  84:    */   {
/*  85:109 */     this.notifyUrl = notifyUrl;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getReturnUrl()
/*  89:    */   {
/*  90:113 */     return this.returnUrl;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setReturnUrl(String returnUrl)
/*  94:    */   {
/*  95:117 */     this.returnUrl = returnUrl;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getApiVersion()
/*  99:    */   {
/* 100:121 */     return this.apiVersion;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setApiVersion(String apiVersion)
/* 104:    */   {
/* 105:125 */     this.apiVersion = apiVersion;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setTerminalType(String terminalType)
/* 109:    */   {
/* 110:129 */     this.terminalType = terminalType;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getTerminalType()
/* 114:    */   {
/* 115:133 */     return this.terminalType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setTerminalInfo(String terminalInfo)
/* 119:    */   {
/* 120:137 */     this.terminalInfo = terminalInfo;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getTerminalInfo()
/* 124:    */   {
/* 125:141 */     return this.terminalInfo;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setProdCode(String prodCode)
/* 129:    */   {
/* 130:145 */     this.prodCode = prodCode;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getProdCode()
/* 134:    */   {
/* 135:149 */     return this.prodCode;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getApiMethodName()
/* 139:    */   {
/* 140:153 */     return "alipay.member.coupon.querylist";
/* 141:    */   }
/* 142:    */   
/* 143:    */   public Map<String, String> getTextParams()
/* 144:    */   {
/* 145:157 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 146:158 */     txtParams.put("merchant_info", this.merchantInfo);
/* 147:159 */     txtParams.put("page_no", this.pageNo);
/* 148:160 */     txtParams.put("page_size", this.pageSize);
/* 149:161 */     txtParams.put("status", this.status);
/* 150:162 */     txtParams.put("user_info", this.userInfo);
/* 151:163 */     if (this.udfParams != null) {
/* 152:164 */       txtParams.putAll(this.udfParams);
/* 153:    */     }
/* 154:166 */     return txtParams;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void putOtherTextParam(String key, String value)
/* 158:    */   {
/* 159:170 */     if (this.udfParams == null) {
/* 160:171 */       this.udfParams = new AlipayHashMap();
/* 161:    */     }
/* 162:173 */     this.udfParams.put(key, value);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Class<AlipayMemberCouponQuerylistResponse> getResponseClass()
/* 166:    */   {
/* 167:177 */     return AlipayMemberCouponQuerylistResponse.class;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean isNeedEncrypt()
/* 171:    */   {
/* 172:183 */     return this.needEncrypt;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 176:    */   {
/* 177:189 */     this.needEncrypt = needEncrypt;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public AlipayObject getBizModel()
/* 181:    */   {
/* 182:194 */     return this.bizModel;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setBizModel(AlipayObject bizModel)
/* 186:    */   {
/* 187:200 */     this.bizModel = bizModel;
/* 188:    */   }
/* 189:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMemberCouponQuerylistRequest
 * JD-Core Version:    0.7.0.1
 */