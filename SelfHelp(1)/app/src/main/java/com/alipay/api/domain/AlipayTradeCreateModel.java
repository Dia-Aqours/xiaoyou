/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayTradeCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 7775228554624481963L;
/*  12:    */   @ApiField("alipay_store_id")
/*  13:    */   private String alipayStoreId;
/*  14:    */   @ApiField("body")
/*  15:    */   private String body;
/*  16:    */   @ApiField("buyer_id")
/*  17:    */   private String buyerId;
/*  18:    */   @ApiField("buyer_logon_id")
/*  19:    */   private String buyerLogonId;
/*  20:    */   @ApiField("discountable_amount")
/*  21:    */   private String discountableAmount;
/*  22:    */   @ApiField("extend_params")
/*  23:    */   private ExtendParams extendParams;
/*  24:    */   @ApiListField("goods_detail")
/*  25:    */   @ApiField("goods_detail")
/*  26:    */   private List<GoodsDetail> goodsDetail;
/*  27:    */   @ApiField("operator_id")
/*  28:    */   private String operatorId;
/*  29:    */   @ApiField("out_trade_no")
/*  30:    */   private String outTradeNo;
/*  31:    */   @ApiField("royalty_info")
/*  32:    */   private RoyaltyInfo royaltyInfo;
/*  33:    */   @ApiField("seller_id")
/*  34:    */   private String sellerId;
/*  35:    */   @ApiField("store_id")
/*  36:    */   private String storeId;
/*  37:    */   @ApiField("sub_merchant")
/*  38:    */   private SubMerchant subMerchant;
/*  39:    */   @ApiField("subject")
/*  40:    */   private String subject;
/*  41:    */   @ApiField("terminal_id")
/*  42:    */   private String terminalId;
/*  43:    */   @ApiField("timeout_express")
/*  44:    */   private String timeoutExpress;
/*  45:    */   @ApiField("total_amount")
/*  46:    */   private String totalAmount;
/*  47:    */   @ApiField("undiscountable_amount")
/*  48:    */   private String undiscountableAmount;
/*  49:    */   
/*  50:    */   public String getAlipayStoreId()
/*  51:    */   {
/*  52:136 */     return this.alipayStoreId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setAlipayStoreId(String alipayStoreId)
/*  56:    */   {
/*  57:139 */     this.alipayStoreId = alipayStoreId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getBody()
/*  61:    */   {
/*  62:143 */     return this.body;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setBody(String body)
/*  66:    */   {
/*  67:146 */     this.body = body;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getBuyerId()
/*  71:    */   {
/*  72:150 */     return this.buyerId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setBuyerId(String buyerId)
/*  76:    */   {
/*  77:153 */     this.buyerId = buyerId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getBuyerLogonId()
/*  81:    */   {
/*  82:157 */     return this.buyerLogonId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setBuyerLogonId(String buyerLogonId)
/*  86:    */   {
/*  87:160 */     this.buyerLogonId = buyerLogonId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getDiscountableAmount()
/*  91:    */   {
/*  92:164 */     return this.discountableAmount;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setDiscountableAmount(String discountableAmount)
/*  96:    */   {
/*  97:167 */     this.discountableAmount = discountableAmount;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public ExtendParams getExtendParams()
/* 101:    */   {
/* 102:171 */     return this.extendParams;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setExtendParams(ExtendParams extendParams)
/* 106:    */   {
/* 107:174 */     this.extendParams = extendParams;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public List<GoodsDetail> getGoodsDetail()
/* 111:    */   {
/* 112:178 */     return this.goodsDetail;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setGoodsDetail(List<GoodsDetail> goodsDetail)
/* 116:    */   {
/* 117:181 */     this.goodsDetail = goodsDetail;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getOperatorId()
/* 121:    */   {
/* 122:185 */     return this.operatorId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setOperatorId(String operatorId)
/* 126:    */   {
/* 127:188 */     this.operatorId = operatorId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getOutTradeNo()
/* 131:    */   {
/* 132:192 */     return this.outTradeNo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setOutTradeNo(String outTradeNo)
/* 136:    */   {
/* 137:195 */     this.outTradeNo = outTradeNo;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public RoyaltyInfo getRoyaltyInfo()
/* 141:    */   {
/* 142:199 */     return this.royaltyInfo;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setRoyaltyInfo(RoyaltyInfo royaltyInfo)
/* 146:    */   {
/* 147:202 */     this.royaltyInfo = royaltyInfo;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getSellerId()
/* 151:    */   {
/* 152:206 */     return this.sellerId;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setSellerId(String sellerId)
/* 156:    */   {
/* 157:209 */     this.sellerId = sellerId;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getStoreId()
/* 161:    */   {
/* 162:213 */     return this.storeId;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setStoreId(String storeId)
/* 166:    */   {
/* 167:216 */     this.storeId = storeId;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public SubMerchant getSubMerchant()
/* 171:    */   {
/* 172:220 */     return this.subMerchant;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setSubMerchant(SubMerchant subMerchant)
/* 176:    */   {
/* 177:223 */     this.subMerchant = subMerchant;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public String getSubject()
/* 181:    */   {
/* 182:227 */     return this.subject;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setSubject(String subject)
/* 186:    */   {
/* 187:230 */     this.subject = subject;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getTerminalId()
/* 191:    */   {
/* 192:234 */     return this.terminalId;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setTerminalId(String terminalId)
/* 196:    */   {
/* 197:237 */     this.terminalId = terminalId;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getTimeoutExpress()
/* 201:    */   {
/* 202:241 */     return this.timeoutExpress;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setTimeoutExpress(String timeoutExpress)
/* 206:    */   {
/* 207:244 */     this.timeoutExpress = timeoutExpress;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getTotalAmount()
/* 211:    */   {
/* 212:248 */     return this.totalAmount;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setTotalAmount(String totalAmount)
/* 216:    */   {
/* 217:251 */     this.totalAmount = totalAmount;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getUndiscountableAmount()
/* 221:    */   {
/* 222:255 */     return this.undiscountableAmount;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setUndiscountableAmount(String undiscountableAmount)
/* 226:    */   {
/* 227:258 */     this.undiscountableAmount = undiscountableAmount;
/* 228:    */   }
/* 229:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeCreateModel
 * JD-Core Version:    0.7.0.1
 */