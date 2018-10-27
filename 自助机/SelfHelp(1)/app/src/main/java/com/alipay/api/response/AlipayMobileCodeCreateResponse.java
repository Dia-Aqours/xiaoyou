/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayMobileCodeCreateResponse
/*   8:    */   extends AlipayResponse
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5877969848473992471L;
/*  11:    */   @ApiField("biz_linked_id")
/*  12:    */   private String bizLinkedId;
/*  13:    */   @ApiField("biz_type")
/*  14:    */   private String bizType;
/*  15:    */   @ApiField("code_status")
/*  16:    */   private String codeStatus;
/*  17:    */   @ApiField("context_str")
/*  18:    */   private String contextStr;
/*  19:    */   @ApiField("dynamic_img_url")
/*  20:    */   private String dynamicImgUrl;
/*  21:    */   @ApiField("expire_date")
/*  22:    */   private String expireDate;
/*  23:    */   @ApiField("is_direct")
/*  24:    */   private String isDirect;
/*  25:    */   @ApiField("memo")
/*  26:    */   private String memo;
/*  27:    */   @ApiField("qr_code")
/*  28:    */   private String qrCode;
/*  29:    */   @ApiField("qr_token")
/*  30:    */   private String qrToken;
/*  31:    */   @ApiField("source_id")
/*  32:    */   private String sourceId;
/*  33:    */   @ApiField("start_date")
/*  34:    */   private Date startDate;
/*  35:    */   @ApiField("user_id")
/*  36:    */   private String userId;
/*  37:    */   
/*  38:    */   public void setBizLinkedId(String bizLinkedId)
/*  39:    */   {
/*  40:102 */     this.bizLinkedId = bizLinkedId;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getBizLinkedId()
/*  44:    */   {
/*  45:105 */     return this.bizLinkedId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBizType(String bizType)
/*  49:    */   {
/*  50:109 */     this.bizType = bizType;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getBizType()
/*  54:    */   {
/*  55:112 */     return this.bizType;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setCodeStatus(String codeStatus)
/*  59:    */   {
/*  60:116 */     this.codeStatus = codeStatus;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getCodeStatus()
/*  64:    */   {
/*  65:119 */     return this.codeStatus;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setContextStr(String contextStr)
/*  69:    */   {
/*  70:123 */     this.contextStr = contextStr;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getContextStr()
/*  74:    */   {
/*  75:126 */     return this.contextStr;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setDynamicImgUrl(String dynamicImgUrl)
/*  79:    */   {
/*  80:130 */     this.dynamicImgUrl = dynamicImgUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getDynamicImgUrl()
/*  84:    */   {
/*  85:133 */     return this.dynamicImgUrl;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setExpireDate(String expireDate)
/*  89:    */   {
/*  90:137 */     this.expireDate = expireDate;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getExpireDate()
/*  94:    */   {
/*  95:140 */     return this.expireDate;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setIsDirect(String isDirect)
/*  99:    */   {
/* 100:144 */     this.isDirect = isDirect;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getIsDirect()
/* 104:    */   {
/* 105:147 */     return this.isDirect;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setMemo(String memo)
/* 109:    */   {
/* 110:151 */     this.memo = memo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getMemo()
/* 114:    */   {
/* 115:154 */     return this.memo;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setQrCode(String qrCode)
/* 119:    */   {
/* 120:158 */     this.qrCode = qrCode;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getQrCode()
/* 124:    */   {
/* 125:161 */     return this.qrCode;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setQrToken(String qrToken)
/* 129:    */   {
/* 130:165 */     this.qrToken = qrToken;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getQrToken()
/* 134:    */   {
/* 135:168 */     return this.qrToken;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setSourceId(String sourceId)
/* 139:    */   {
/* 140:172 */     this.sourceId = sourceId;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getSourceId()
/* 144:    */   {
/* 145:175 */     return this.sourceId;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setStartDate(Date startDate)
/* 149:    */   {
/* 150:179 */     this.startDate = startDate;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public Date getStartDate()
/* 154:    */   {
/* 155:182 */     return this.startDate;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setUserId(String userId)
/* 159:    */   {
/* 160:186 */     this.userId = userId;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getUserId()
/* 164:    */   {
/* 165:189 */     return this.userId;
/* 166:    */   }
/* 167:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobileCodeCreateResponse
 * JD-Core Version:    0.7.0.1
 */