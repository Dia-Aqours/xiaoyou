/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMobileCodeQueryResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6125852638247915583L;
/*  10:    */   @ApiField("biz_linked_id")
/*  11:    */   private String bizLinkedId;
/*  12:    */   @ApiField("biz_type")
/*  13:    */   private String bizType;
/*  14:    */   @ApiField("code_status")
/*  15:    */   private String codeStatus;
/*  16:    */   @ApiField("context_str")
/*  17:    */   private String contextStr;
/*  18:    */   @ApiField("dynamic_img_url")
/*  19:    */   private String dynamicImgUrl;
/*  20:    */   @ApiField("expire_date")
/*  21:    */   private String expireDate;
/*  22:    */   @ApiField("is_direct")
/*  23:    */   private String isDirect;
/*  24:    */   @ApiField("memo")
/*  25:    */   private String memo;
/*  26:    */   @ApiField("qr_code")
/*  27:    */   private String qrCode;
/*  28:    */   @ApiField("qr_token")
/*  29:    */   private String qrToken;
/*  30:    */   @ApiField("source_id")
/*  31:    */   private String sourceId;
/*  32:    */   @ApiField("start_date")
/*  33:    */   private String startDate;
/*  34:    */   @ApiField("user_id")
/*  35:    */   private String userId;
/*  36:    */   
/*  37:    */   public void setBizLinkedId(String bizLinkedId)
/*  38:    */   {
/*  39:101 */     this.bizLinkedId = bizLinkedId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getBizLinkedId()
/*  43:    */   {
/*  44:104 */     return this.bizLinkedId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBizType(String bizType)
/*  48:    */   {
/*  49:108 */     this.bizType = bizType;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getBizType()
/*  53:    */   {
/*  54:111 */     return this.bizType;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setCodeStatus(String codeStatus)
/*  58:    */   {
/*  59:115 */     this.codeStatus = codeStatus;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getCodeStatus()
/*  63:    */   {
/*  64:118 */     return this.codeStatus;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setContextStr(String contextStr)
/*  68:    */   {
/*  69:122 */     this.contextStr = contextStr;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getContextStr()
/*  73:    */   {
/*  74:125 */     return this.contextStr;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setDynamicImgUrl(String dynamicImgUrl)
/*  78:    */   {
/*  79:129 */     this.dynamicImgUrl = dynamicImgUrl;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getDynamicImgUrl()
/*  83:    */   {
/*  84:132 */     return this.dynamicImgUrl;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setExpireDate(String expireDate)
/*  88:    */   {
/*  89:136 */     this.expireDate = expireDate;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getExpireDate()
/*  93:    */   {
/*  94:139 */     return this.expireDate;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setIsDirect(String isDirect)
/*  98:    */   {
/*  99:143 */     this.isDirect = isDirect;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getIsDirect()
/* 103:    */   {
/* 104:146 */     return this.isDirect;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setMemo(String memo)
/* 108:    */   {
/* 109:150 */     this.memo = memo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getMemo()
/* 113:    */   {
/* 114:153 */     return this.memo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setQrCode(String qrCode)
/* 118:    */   {
/* 119:157 */     this.qrCode = qrCode;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getQrCode()
/* 123:    */   {
/* 124:160 */     return this.qrCode;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setQrToken(String qrToken)
/* 128:    */   {
/* 129:164 */     this.qrToken = qrToken;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getQrToken()
/* 133:    */   {
/* 134:167 */     return this.qrToken;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setSourceId(String sourceId)
/* 138:    */   {
/* 139:171 */     this.sourceId = sourceId;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getSourceId()
/* 143:    */   {
/* 144:174 */     return this.sourceId;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setStartDate(String startDate)
/* 148:    */   {
/* 149:178 */     this.startDate = startDate;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getStartDate()
/* 153:    */   {
/* 154:181 */     return this.startDate;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setUserId(String userId)
/* 158:    */   {
/* 159:185 */     this.userId = userId;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getUserId()
/* 163:    */   {
/* 164:188 */     return this.userId;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobileCodeQueryResponse
 * JD-Core Version:    0.7.0.1
 */