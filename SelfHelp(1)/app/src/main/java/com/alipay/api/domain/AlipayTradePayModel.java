/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayTradePayModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 3744185422297786753L;
/*  12:    */   @ApiField("alipay_store_id")
/*  13:    */   private String alipayStoreId;
/*  14:    */   @ApiField("auth_code")
/*  15:    */   private String authCode;
/*  16:    */   @ApiField("auth_no")
/*  17:    */   private String authNo;
/*  18:    */   @ApiField("body")
/*  19:    */   private String body;
/*  20:    */   @ApiField("discountable_amount")
/*  21:    */   private String discountableAmount;
/*  22:    */   @ApiField("extend_params")
/*  23:    */   private ExtendParams extendParams;
/*  24:    */   @ApiListField("goods_detail")
/*  25:    */   @ApiField("goods_detail")
/*  26:    */   private List<GoodsDetail> goodsDetail;
/*  27:    */   @ApiField("merchant_order_no")
/*  28:    */   private String merchantOrderNo;
/*  29:    */   @ApiField("operator_id")
/*  30:    */   private String operatorId;
/*  31:    */   @ApiField("out_trade_no")
/*  32:    */   private String outTradeNo;
/*  33:    */   @ApiField("royalty_info")
/*  34:    */   private RoyaltyInfo royaltyInfo;
/*  35:    */   @ApiField("scene")
/*  36:    */   private String scene;
/*  37:    */   @ApiField("seller_id")
/*  38:    */   private String sellerId;
/*  39:    */   @ApiField("store_id")
/*  40:    */   private String storeId;
/*  41:    */   @ApiField("sub_merchant")
/*  42:    */   private SubMerchant subMerchant;
/*  43:    */   @ApiField("subject")
/*  44:    */   private String subject;
/*  45:    */   @ApiField("terminal_id")
/*  46:    */   private String terminalId;
/*  47:    */   @ApiField("timeout_express")
/*  48:    */   private String timeoutExpress;
/*  49:    */   @ApiField("total_amount")
/*  50:    */   private String totalAmount;
/*  51:    */   @ApiField("undiscountable_amount")
/*  52:    */   private String undiscountableAmount;
/*  53:    */   
/*  54:    */   public String getAlipayStoreId()
/*  55:    */   {
/*  56:147 */     return this.alipayStoreId;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setAlipayStoreId(String alipayStoreId)
/*  60:    */   {
/*  61:150 */     this.alipayStoreId = alipayStoreId;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getAuthCode()
/*  65:    */   {
/*  66:154 */     return this.authCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setAuthCode(String authCode)
/*  70:    */   {
/*  71:157 */     this.authCode = authCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getAuthNo()
/*  75:    */   {
/*  76:161 */     return this.authNo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setAuthNo(String authNo)
/*  80:    */   {
/*  81:164 */     this.authNo = authNo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getBody()
/*  85:    */   {
/*  86:168 */     return this.body;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setBody(String body)
/*  90:    */   {
/*  91:171 */     this.body = body;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getDiscountableAmount()
/*  95:    */   {
/*  96:175 */     return this.discountableAmount;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setDiscountableAmount(String discountableAmount)
/* 100:    */   {
/* 101:178 */     this.discountableAmount = discountableAmount;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public ExtendParams getExtendParams()
/* 105:    */   {
/* 106:182 */     return this.extendParams;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setExtendParams(ExtendParams extendParams)
/* 110:    */   {
/* 111:185 */     this.extendParams = extendParams;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public List<GoodsDetail> getGoodsDetail()
/* 115:    */   {
/* 116:189 */     return this.goodsDetail;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setGoodsDetail(List<GoodsDetail> goodsDetail)
/* 120:    */   {
/* 121:192 */     this.goodsDetail = goodsDetail;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getMerchantOrderNo()
/* 125:    */   {
/* 126:196 */     return this.merchantOrderNo;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setMerchantOrderNo(String merchantOrderNo)
/* 130:    */   {
/* 131:199 */     this.merchantOrderNo = merchantOrderNo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getOperatorId()
/* 135:    */   {
/* 136:203 */     return this.operatorId;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setOperatorId(String operatorId)
/* 140:    */   {
/* 141:206 */     this.operatorId = operatorId;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getOutTradeNo()
/* 145:    */   {
/* 146:210 */     return this.outTradeNo;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setOutTradeNo(String outTradeNo)
/* 150:    */   {
/* 151:213 */     this.outTradeNo = outTradeNo;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public RoyaltyInfo getRoyaltyInfo()
/* 155:    */   {
/* 156:217 */     return this.royaltyInfo;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setRoyaltyInfo(RoyaltyInfo royaltyInfo)
/* 160:    */   {
/* 161:220 */     this.royaltyInfo = royaltyInfo;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getScene()
/* 165:    */   {
/* 166:224 */     return this.scene;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setScene(String scene)
/* 170:    */   {
/* 171:227 */     this.scene = scene;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getSellerId()
/* 175:    */   {
/* 176:231 */     return this.sellerId;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setSellerId(String sellerId)
/* 180:    */   {
/* 181:234 */     this.sellerId = sellerId;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getStoreId()
/* 185:    */   {
/* 186:238 */     return this.storeId;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setStoreId(String storeId)
/* 190:    */   {
/* 191:241 */     this.storeId = storeId;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public SubMerchant getSubMerchant()
/* 195:    */   {
/* 196:245 */     return this.subMerchant;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setSubMerchant(SubMerchant subMerchant)
/* 200:    */   {
/* 201:248 */     this.subMerchant = subMerchant;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getSubject()
/* 205:    */   {
/* 206:252 */     return this.subject;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setSubject(String subject)
/* 210:    */   {
/* 211:255 */     this.subject = subject;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getTerminalId()
/* 215:    */   {
/* 216:259 */     return this.terminalId;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setTerminalId(String terminalId)
/* 220:    */   {
/* 221:262 */     this.terminalId = terminalId;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getTimeoutExpress()
/* 225:    */   {
/* 226:266 */     return this.timeoutExpress;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setTimeoutExpress(String timeoutExpress)
/* 230:    */   {
/* 231:269 */     this.timeoutExpress = timeoutExpress;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getTotalAmount()
/* 235:    */   {
/* 236:273 */     return this.totalAmount;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setTotalAmount(String totalAmount)
/* 240:    */   {
/* 241:276 */     this.totalAmount = totalAmount;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getUndiscountableAmount()
/* 245:    */   {
/* 246:280 */     return this.undiscountableAmount;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setUndiscountableAmount(String undiscountableAmount)
/* 250:    */   {
/* 251:283 */     this.undiscountableAmount = undiscountableAmount;
/* 252:    */   }
/* 253:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradePayModel
 * JD-Core Version:    0.7.0.1
 */