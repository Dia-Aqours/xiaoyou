/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMdataTagGetResponse;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayMdataTagGetRequest
/*  11:    */   implements AlipayRequest<AlipayMdataTagGetResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private List<String> requiredTags;
/*  16:    */   private String userId;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   private String returnUrl;
/*  22:    */   
/*  23:    */   public void setRequiredTags(List<String> requiredTags)
/*  24:    */   {
/*  25: 33 */     this.requiredTags = requiredTags;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public List<String> getRequiredTags()
/*  29:    */   {
/*  30: 36 */     return this.requiredTags;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setUserId(String userId)
/*  34:    */   {
/*  35: 40 */     this.userId = userId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getUserId()
/*  39:    */   {
/*  40: 43 */     return this.userId;
/*  41:    */   }
/*  42:    */   
/*  43: 50 */   private boolean needEncrypt = false;
/*  44: 51 */   private AlipayObject bizModel = null;
/*  45:    */   
/*  46:    */   public String getNotifyUrl()
/*  47:    */   {
/*  48: 54 */     return this.notifyUrl;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setNotifyUrl(String notifyUrl)
/*  52:    */   {
/*  53: 58 */     this.notifyUrl = notifyUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getReturnUrl()
/*  57:    */   {
/*  58: 62 */     return this.returnUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setReturnUrl(String returnUrl)
/*  62:    */   {
/*  63: 66 */     this.returnUrl = returnUrl;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getApiVersion()
/*  67:    */   {
/*  68: 70 */     return this.apiVersion;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setApiVersion(String apiVersion)
/*  72:    */   {
/*  73: 74 */     this.apiVersion = apiVersion;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setTerminalType(String terminalType)
/*  77:    */   {
/*  78: 78 */     this.terminalType = terminalType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getTerminalType()
/*  82:    */   {
/*  83: 82 */     return this.terminalType;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setTerminalInfo(String terminalInfo)
/*  87:    */   {
/*  88: 86 */     this.terminalInfo = terminalInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getTerminalInfo()
/*  92:    */   {
/*  93: 90 */     return this.terminalInfo;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setProdCode(String prodCode)
/*  97:    */   {
/*  98: 94 */     this.prodCode = prodCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getProdCode()
/* 102:    */   {
/* 103: 98 */     return this.prodCode;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getApiMethodName()
/* 107:    */   {
/* 108:102 */     return "alipay.mdata.tag.get";
/* 109:    */   }
/* 110:    */   
/* 111:    */   public Map<String, String> getTextParams()
/* 112:    */   {
/* 113:106 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 114:107 */     txtParams.put("required_tags", this.requiredTags);
/* 115:108 */     txtParams.put("user_id", this.userId);
/* 116:109 */     if (this.udfParams != null) {
/* 117:110 */       txtParams.putAll(this.udfParams);
/* 118:    */     }
/* 119:112 */     return txtParams;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void putOtherTextParam(String key, String value)
/* 123:    */   {
/* 124:116 */     if (this.udfParams == null) {
/* 125:117 */       this.udfParams = new AlipayHashMap();
/* 126:    */     }
/* 127:119 */     this.udfParams.put(key, value);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public Class<AlipayMdataTagGetResponse> getResponseClass()
/* 131:    */   {
/* 132:123 */     return AlipayMdataTagGetResponse.class;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public boolean isNeedEncrypt()
/* 136:    */   {
/* 137:129 */     return this.needEncrypt;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 141:    */   {
/* 142:135 */     this.needEncrypt = needEncrypt;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public AlipayObject getBizModel()
/* 146:    */   {
/* 147:140 */     return this.bizModel;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setBizModel(AlipayObject bizModel)
/* 151:    */   {
/* 152:146 */     this.bizModel = bizModel;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMdataTagGetRequest
 * JD-Core Version:    0.7.0.1
 */