/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;

/*   7:    */
/*   8:    */ public class AlipayTradePrecreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 8287531322457857573L;
/*  12:    */   @ApiField("alipay_store_id")
/*  13:    */   private String alipayStoreId;
/*  14:    */   @ApiField("body")
/*  15:    */   private String body;
/*  16:    */   @ApiField("buyer_logon_id")
/*  17:    */   private String buyerLogonId;
/*  18:    */   @ApiField("discountable_amount")
/*  19:    */   private String discountableAmount;
/*  20:    */   @ApiField("extend_params")
/*  21:    */   private ExtendParams extendParams;
/*  22:    */   @ApiListField("goods_detail")
/*  23:    */   @ApiField("goods_detail")
/*  24:    */   private List<GoodsDetail> goodsDetail;
/*  25:    */   @ApiField("operator_id")
/*  26:    */   private String operatorId;
/*  27:    */   @ApiField("out_trade_no")
/*  28:    */   private String outTradeNo;
/*  29:    */   @ApiField("royalty_info")
/*  30:    */   private RoyaltyInfo royaltyInfo;
/*  31:    */   @ApiField("seller_id")
/*  32:    */   private String sellerId;
/*  33:    */   @ApiField("store_id")
/*  34:    */   private String storeId;
/*  35:    */   @ApiField("sub_merchant")
/*  36:    */   private SubMerchant subMerchant;
/*  37:    */   @ApiField("subject")
/*  38:    */   private String subject;
/*  39:    */   @ApiField("terminal_id")
/*  40:    */   private String terminalId;
/*  41:    */   @ApiField("timeout_express")
/*  42:    */   private String timeoutExpress;
/*  43:    */   @ApiField("total_amount")
/*  44:    */   private String totalAmount;
/*  45:    */   @ApiField("undiscountable_amount")
/*  46:    */   private String undiscountableAmount;
/*  47:    */   
/*  48:    */   public String getAlipayStoreId()
/*  49:    */   {
/*  50:124 */     return this.alipayStoreId;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAlipayStoreId(String alipayStoreId)
/*  54:    */   {
/*  55:127 */     this.alipayStoreId = alipayStoreId;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getBody()
/*  59:    */   {
/*  60:131 */     return this.body;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBody(String body)
/*  64:    */   {
/*  65:134 */     this.body = body;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getBuyerLogonId()
/*  69:    */   {
/*  70:138 */     return this.buyerLogonId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setBuyerLogonId(String buyerLogonId)
/*  74:    */   {
/*  75:141 */     this.buyerLogonId = buyerLogonId;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getDiscountableAmount()
/*  79:    */   {
/*  80:145 */     return this.discountableAmount;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setDiscountableAmount(String discountableAmount)
/*  84:    */   {
/*  85:148 */     this.discountableAmount = discountableAmount;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public ExtendParams getExtendParams()
/*  89:    */   {
/*  90:152 */     return this.extendParams;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setExtendParams(ExtendParams extendParams)
/*  94:    */   {
/*  95:155 */     this.extendParams = extendParams;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public List<GoodsDetail> getGoodsDetail()
/*  99:    */   {
/* 100:159 */     return this.goodsDetail;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setGoodsDetail(List<GoodsDetail> goodsDetail)
/* 104:    */   {
/* 105:162 */     this.goodsDetail = goodsDetail;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getOperatorId()
/* 109:    */   {
/* 110:166 */     return this.operatorId;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setOperatorId(String operatorId)
/* 114:    */   {
/* 115:169 */     this.operatorId = operatorId;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getOutTradeNo()
/* 119:    */   {
/* 120:173 */     return this.outTradeNo;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setOutTradeNo(String outTradeNo)
/* 124:    */   {
/* 125:176 */     this.outTradeNo = outTradeNo;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public RoyaltyInfo getRoyaltyInfo()
/* 129:    */   {
/* 130:180 */     return this.royaltyInfo;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setRoyaltyInfo(RoyaltyInfo royaltyInfo)
/* 134:    */   {
/* 135:183 */     this.royaltyInfo = royaltyInfo;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getSellerId()
/* 139:    */   {
/* 140:187 */     return this.sellerId;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setSellerId(String sellerId)
/* 144:    */   {
/* 145:190 */     this.sellerId = sellerId;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getStoreId()
/* 149:    */   {
/* 150:194 */     return this.storeId;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setStoreId(String storeId)
/* 154:    */   {
/* 155:197 */     this.storeId = storeId;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public SubMerchant getSubMerchant()
/* 159:    */   {
/* 160:201 */     return this.subMerchant;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setSubMerchant(SubMerchant subMerchant)
/* 164:    */   {
/* 165:204 */     this.subMerchant = subMerchant;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getSubject()
/* 169:    */   {
/* 170:208 */     return this.subject;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setSubject(String subject)
/* 174:    */   {
/* 175:211 */     this.subject = subject;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getTerminalId()
/* 179:    */   {
/* 180:215 */     return this.terminalId;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setTerminalId(String terminalId)
/* 184:    */   {
/* 185:218 */     this.terminalId = terminalId;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getTimeoutExpress()
/* 189:    */   {
/* 190:222 */     return this.timeoutExpress;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setTimeoutExpress(String timeoutExpress)
/* 194:    */   {
/* 195:225 */     this.timeoutExpress = timeoutExpress;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getTotalAmount()
/* 199:    */   {
/* 200:229 */     return this.totalAmount;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setTotalAmount(String totalAmount)
/* 204:    */   {
/* 205:232 */     this.totalAmount = totalAmount;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getUndiscountableAmount()
/* 209:    */   {
/* 210:236 */     return this.undiscountableAmount;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setUndiscountableAmount(String undiscountableAmount)
/* 214:    */   {
/* 215:239 */     this.undiscountableAmount = undiscountableAmount;
/* 216:    */   }
/* 217:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayTradePrecreateModel

 * JD-Core Version:    0.7.0.1

 */