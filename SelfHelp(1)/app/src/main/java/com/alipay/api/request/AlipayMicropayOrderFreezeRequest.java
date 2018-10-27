/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMicropayOrderFreezeResponse;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayMicropayOrderFreezeRequest
/*  11:    */   implements AlipayRequest<AlipayMicropayOrderFreezeResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private String amount;
/*  16:    */   private Date expireTime;
/*  17:    */   private String memo;
/*  18:    */   private String merchantOrderNo;
/*  19:    */   private String payConfirm;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setAmount(String amount)
/*  27:    */   {
/*  28: 48 */     this.amount = amount;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getAmount()
/*  32:    */   {
/*  33: 51 */     return this.amount;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setExpireTime(Date expireTime)
/*  37:    */   {
/*  38: 55 */     this.expireTime = expireTime;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public Date getExpireTime()
/*  42:    */   {
/*  43: 58 */     return this.expireTime;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setMemo(String memo)
/*  47:    */   {
/*  48: 62 */     this.memo = memo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getMemo()
/*  52:    */   {
/*  53: 65 */     return this.memo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  57:    */   {
/*  58: 69 */     this.merchantOrderNo = merchantOrderNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getMerchantOrderNo()
/*  62:    */   {
/*  63: 72 */     return this.merchantOrderNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setPayConfirm(String payConfirm)
/*  67:    */   {
/*  68: 76 */     this.payConfirm = payConfirm;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getPayConfirm()
/*  72:    */   {
/*  73: 79 */     return this.payConfirm;
/*  74:    */   }
/*  75:    */   
/*  76: 86 */   private boolean needEncrypt = false;
/*  77: 87 */   private AlipayObject bizModel = null;
/*  78:    */   
/*  79:    */   public String getNotifyUrl()
/*  80:    */   {
/*  81: 90 */     return this.notifyUrl;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setNotifyUrl(String notifyUrl)
/*  85:    */   {
/*  86: 94 */     this.notifyUrl = notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getReturnUrl()
/*  90:    */   {
/*  91: 98 */     return this.returnUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setReturnUrl(String returnUrl)
/*  95:    */   {
/*  96:102 */     this.returnUrl = returnUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getApiVersion()
/* 100:    */   {
/* 101:106 */     return this.apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setApiVersion(String apiVersion)
/* 105:    */   {
/* 106:110 */     this.apiVersion = apiVersion;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setTerminalType(String terminalType)
/* 110:    */   {
/* 111:114 */     this.terminalType = terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getTerminalType()
/* 115:    */   {
/* 116:118 */     return this.terminalType;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalInfo(String terminalInfo)
/* 120:    */   {
/* 121:122 */     this.terminalInfo = terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalInfo()
/* 125:    */   {
/* 126:126 */     return this.terminalInfo;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setProdCode(String prodCode)
/* 130:    */   {
/* 131:130 */     this.prodCode = prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getProdCode()
/* 135:    */   {
/* 136:134 */     return this.prodCode;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getApiMethodName()
/* 140:    */   {
/* 141:138 */     return "alipay.micropay.order.freeze";
/* 142:    */   }
/* 143:    */   
/* 144:    */   public Map<String, String> getTextParams()
/* 145:    */   {
/* 146:142 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 147:143 */     txtParams.put("amount", this.amount);
/* 148:144 */     txtParams.put("expire_time", this.expireTime);
/* 149:145 */     txtParams.put("memo", this.memo);
/* 150:146 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 151:147 */     txtParams.put("pay_confirm", this.payConfirm);
/* 152:148 */     if (this.udfParams != null) {
/* 153:149 */       txtParams.putAll(this.udfParams);
/* 154:    */     }
/* 155:151 */     return txtParams;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void putOtherTextParam(String key, String value)
/* 159:    */   {
/* 160:155 */     if (this.udfParams == null) {
/* 161:156 */       this.udfParams = new AlipayHashMap();
/* 162:    */     }
/* 163:158 */     this.udfParams.put(key, value);
/* 164:    */   }
/* 165:    */   
/* 166:    */   public Class<AlipayMicropayOrderFreezeResponse> getResponseClass()
/* 167:    */   {
/* 168:162 */     return AlipayMicropayOrderFreezeResponse.class;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public boolean isNeedEncrypt()
/* 172:    */   {
/* 173:168 */     return this.needEncrypt;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 177:    */   {
/* 178:174 */     this.needEncrypt = needEncrypt;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public AlipayObject getBizModel()
/* 182:    */   {
/* 183:179 */     return this.bizModel;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setBizModel(AlipayObject bizModel)
/* 187:    */   {
/* 188:185 */     this.bizModel = bizModel;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMicropayOrderFreezeRequest
 * JD-Core Version:    0.7.0.1
 */