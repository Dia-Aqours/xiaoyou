/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayTradeWapPayModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7558131418246516862L;
/*  10:    */   @ApiField("auth_token")
/*  11:    */   private String authToken;
/*  12:    */   @ApiField("body")
/*  13:    */   private String body;
/*  14:    */   @ApiField("disable_pay_channels")
/*  15:    */   private String disablePayChannels;
/*  16:    */   @ApiField("enable_pay_channels")
/*  17:    */   private String enablePayChannels;
/*  18:    */   @ApiField("extend_params")
/*  19:    */   private ExtendParams extendParams;
/*  20:    */   @ApiField("goods_type")
/*  21:    */   private String goodsType;
/*  22:    */   @ApiField("out_trade_no")
/*  23:    */   private String outTradeNo;
/*  24:    */   @ApiField("passback_params")
/*  25:    */   private String passbackParams;
/*  26:    */   @ApiField("product_code")
/*  27:    */   private String productCode;
/*  28:    */   @ApiField("promo_params")
/*  29:    */   private String promoParams;
/*  30:    */   @ApiField("seller_id")
/*  31:    */   private String sellerId;
/*  32:    */   @ApiField("subject")
/*  33:    */   private String subject;
/*  34:    */   @ApiField("timeout_express")
/*  35:    */   private String timeoutExpress;
/*  36:    */   @ApiField("total_amount")
/*  37:    */   private String totalAmount;
/*  38:    */   
/*  39:    */   public String getAuthToken()
/*  40:    */   {
/*  41:106 */     return this.authToken;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setAuthToken(String authToken)
/*  45:    */   {
/*  46:109 */     this.authToken = authToken;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getBody()
/*  50:    */   {
/*  51:113 */     return this.body;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setBody(String body)
/*  55:    */   {
/*  56:116 */     this.body = body;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getDisablePayChannels()
/*  60:    */   {
/*  61:120 */     return this.disablePayChannels;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setDisablePayChannels(String disablePayChannels)
/*  65:    */   {
/*  66:123 */     this.disablePayChannels = disablePayChannels;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getEnablePayChannels()
/*  70:    */   {
/*  71:127 */     return this.enablePayChannels;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setEnablePayChannels(String enablePayChannels)
/*  75:    */   {
/*  76:130 */     this.enablePayChannels = enablePayChannels;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public ExtendParams getExtendParams()
/*  80:    */   {
/*  81:134 */     return this.extendParams;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setExtendParams(ExtendParams extendParams)
/*  85:    */   {
/*  86:137 */     this.extendParams = extendParams;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getGoodsType()
/*  90:    */   {
/*  91:141 */     return this.goodsType;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setGoodsType(String goodsType)
/*  95:    */   {
/*  96:144 */     this.goodsType = goodsType;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getOutTradeNo()
/* 100:    */   {
/* 101:148 */     return this.outTradeNo;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setOutTradeNo(String outTradeNo)
/* 105:    */   {
/* 106:151 */     this.outTradeNo = outTradeNo;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getPassbackParams()
/* 110:    */   {
/* 111:155 */     return this.passbackParams;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setPassbackParams(String passbackParams)
/* 115:    */   {
/* 116:158 */     this.passbackParams = passbackParams;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getProductCode()
/* 120:    */   {
/* 121:162 */     return this.productCode;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProductCode(String productCode)
/* 125:    */   {
/* 126:165 */     this.productCode = productCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getPromoParams()
/* 130:    */   {
/* 131:169 */     return this.promoParams;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setPromoParams(String promoParams)
/* 135:    */   {
/* 136:172 */     this.promoParams = promoParams;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getSellerId()
/* 140:    */   {
/* 141:176 */     return this.sellerId;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setSellerId(String sellerId)
/* 145:    */   {
/* 146:179 */     this.sellerId = sellerId;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getSubject()
/* 150:    */   {
/* 151:183 */     return this.subject;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setSubject(String subject)
/* 155:    */   {
/* 156:186 */     this.subject = subject;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getTimeoutExpress()
/* 160:    */   {
/* 161:190 */     return this.timeoutExpress;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setTimeoutExpress(String timeoutExpress)
/* 165:    */   {
/* 166:193 */     this.timeoutExpress = timeoutExpress;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getTotalAmount()
/* 170:    */   {
/* 171:197 */     return this.totalAmount;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setTotalAmount(String totalAmount)
/* 175:    */   {
/* 176:200 */     this.totalAmount = totalAmount;
/* 177:    */   }
/* 178:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeWapPayModel
 * JD-Core Version:    0.7.0.1
 */