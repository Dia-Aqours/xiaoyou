/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMicropayOrderConfirmpayurlGetResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMicropayOrderConfirmpayurlGetRequest
/*  10:    */   implements AlipayRequest<AlipayMicropayOrderConfirmpayurlGetResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String alipayOrderNo;
/*  15:    */   private String amount;
/*  16:    */   private String memo;
/*  17:    */   private String receiveUserId;
/*  18:    */   private String transferOutOrderNo;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   private String returnUrl;
/*  24:    */   
/*  25:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  26:    */   {
/*  27: 47 */     this.alipayOrderNo = alipayOrderNo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getAlipayOrderNo()
/*  31:    */   {
/*  32: 50 */     return this.alipayOrderNo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setAmount(String amount)
/*  36:    */   {
/*  37: 54 */     this.amount = amount;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAmount()
/*  41:    */   {
/*  42: 57 */     return this.amount;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setMemo(String memo)
/*  46:    */   {
/*  47: 61 */     this.memo = memo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getMemo()
/*  51:    */   {
/*  52: 64 */     return this.memo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setReceiveUserId(String receiveUserId)
/*  56:    */   {
/*  57: 68 */     this.receiveUserId = receiveUserId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getReceiveUserId()
/*  61:    */   {
/*  62: 71 */     return this.receiveUserId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setTransferOutOrderNo(String transferOutOrderNo)
/*  66:    */   {
/*  67: 75 */     this.transferOutOrderNo = transferOutOrderNo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getTransferOutOrderNo()
/*  71:    */   {
/*  72: 78 */     return this.transferOutOrderNo;
/*  73:    */   }
/*  74:    */   
/*  75: 85 */   private boolean needEncrypt = false;
/*  76: 86 */   private AlipayObject bizModel = null;
/*  77:    */   
/*  78:    */   public String getNotifyUrl()
/*  79:    */   {
/*  80: 89 */     return this.notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setNotifyUrl(String notifyUrl)
/*  84:    */   {
/*  85: 93 */     this.notifyUrl = notifyUrl;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getReturnUrl()
/*  89:    */   {
/*  90: 97 */     return this.returnUrl;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setReturnUrl(String returnUrl)
/*  94:    */   {
/*  95:101 */     this.returnUrl = returnUrl;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getApiVersion()
/*  99:    */   {
/* 100:105 */     return this.apiVersion;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setApiVersion(String apiVersion)
/* 104:    */   {
/* 105:109 */     this.apiVersion = apiVersion;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setTerminalType(String terminalType)
/* 109:    */   {
/* 110:113 */     this.terminalType = terminalType;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getTerminalType()
/* 114:    */   {
/* 115:117 */     return this.terminalType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setTerminalInfo(String terminalInfo)
/* 119:    */   {
/* 120:121 */     this.terminalInfo = terminalInfo;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getTerminalInfo()
/* 124:    */   {
/* 125:125 */     return this.terminalInfo;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setProdCode(String prodCode)
/* 129:    */   {
/* 130:129 */     this.prodCode = prodCode;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getProdCode()
/* 134:    */   {
/* 135:133 */     return this.prodCode;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getApiMethodName()
/* 139:    */   {
/* 140:137 */     return "alipay.micropay.order.confirmpayurl.get";
/* 141:    */   }
/* 142:    */   
/* 143:    */   public Map<String, String> getTextParams()
/* 144:    */   {
/* 145:141 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 146:142 */     txtParams.put("alipay_order_no", this.alipayOrderNo);
/* 147:143 */     txtParams.put("amount", this.amount);
/* 148:144 */     txtParams.put("memo", this.memo);
/* 149:145 */     txtParams.put("receive_user_id", this.receiveUserId);
/* 150:146 */     txtParams.put("transfer_out_order_no", this.transferOutOrderNo);
/* 151:147 */     if (this.udfParams != null) {
/* 152:148 */       txtParams.putAll(this.udfParams);
/* 153:    */     }
/* 154:150 */     return txtParams;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void putOtherTextParam(String key, String value)
/* 158:    */   {
/* 159:154 */     if (this.udfParams == null) {
/* 160:155 */       this.udfParams = new AlipayHashMap();
/* 161:    */     }
/* 162:157 */     this.udfParams.put(key, value);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Class<AlipayMicropayOrderConfirmpayurlGetResponse> getResponseClass()
/* 166:    */   {
/* 167:161 */     return AlipayMicropayOrderConfirmpayurlGetResponse.class;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean isNeedEncrypt()
/* 171:    */   {
/* 172:167 */     return this.needEncrypt;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 176:    */   {
/* 177:173 */     this.needEncrypt = needEncrypt;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public AlipayObject getBizModel()
/* 181:    */   {
/* 182:178 */     return this.bizModel;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setBizModel(AlipayObject bizModel)
/* 186:    */   {
/* 187:184 */     this.bizModel = bizModel;
/* 188:    */   }
/* 189:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMicropayOrderConfirmpayurlGetRequest
 * JD-Core Version:    0.7.0.1
 */