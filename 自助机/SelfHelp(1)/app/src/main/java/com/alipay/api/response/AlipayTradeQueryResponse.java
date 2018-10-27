/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.TradeFundBill;
/*   5:    */ import com.alipay.api.domain.VoucherDetail;
/*   6:    */ import com.alipay.api.internal.mapping.ApiField;
/*   7:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   8:    */ import java.util.Date;
/*   9:    */ import java.util.List;

/*  10:    */
/*  11:    */ public class AlipayTradeQueryResponse
/*  12:    */   extends AlipayResponse
/*  13:    */ {
/*  14:    */   private static final long serialVersionUID = 4236751673144455883L;
/*  15:    */   @ApiField("alipay_store_id")
/*  16:    */   private String alipayStoreId;
/*  17:    */   @ApiField("buyer_logon_id")
/*  18:    */   private String buyerLogonId;
/*  19:    */   @ApiField("buyer_pay_amount")
/*  20:    */   private String buyerPayAmount;
/*  21:    */   @ApiField("buyer_user_id")
/*  22:    */   private String buyerUserId;
/*  23:    */   @ApiField("discount_goods_detail")
/*  24:    */   private String discountGoodsDetail;
/*  25:    */   @ApiListField("fund_bill_list")
/*  26:    */   @ApiField("trade_fund_bill")
/*  27:    */   private List<TradeFundBill> fundBillList;
/*  28:    */   @ApiField("industry_sepc_detail")
/*  29:    */   private String industrySepcDetail;
/*  30:    */   @ApiField("invoice_amount")
/*  31:    */   private String invoiceAmount;
/*  32:    */   @ApiField("open_id")
/*  33:    */   private String openId;
/*  34:    */   @ApiField("out_trade_no")
/*  35:    */   private String outTradeNo;
/*  36:    */   @ApiField("point_amount")
/*  37:    */   private String pointAmount;
/*  38:    */   @ApiField("receipt_amount")
/*  39:    */   private String receiptAmount;
/*  40:    */   @ApiField("send_pay_date")
/*  41:    */   private Date sendPayDate;
/*  42:    */   @ApiField("store_id")
/*  43:    */   private String storeId;
/*  44:    */   @ApiField("store_name")
/*  45:    */   private String storeName;
/*  46:    */   @ApiField("terminal_id")
/*  47:    */   private String terminalId;
/*  48:    */   @ApiField("total_amount")
/*  49:    */   private String totalAmount;
/*  50:    */   @ApiField("trade_no")
/*  51:    */   private String tradeNo;
/*  52:    */   @ApiField("trade_status")
/*  53:    */   private String tradeStatus;
/*  54:    */   @ApiListField("voucher_detail_list")
/*  55:    */   @ApiField("voucher_detail")
/*  56:    */   private List<VoucherDetail> voucherDetailList;
/*  57:    */   
/*  58:    */   public void setAlipayStoreId(String alipayStoreId)
/*  59:    */   {
/*  60:145 */     this.alipayStoreId = alipayStoreId;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getAlipayStoreId()
/*  64:    */   {
/*  65:148 */     return this.alipayStoreId;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setBuyerLogonId(String buyerLogonId)
/*  69:    */   {
/*  70:152 */     this.buyerLogonId = buyerLogonId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getBuyerLogonId()
/*  74:    */   {
/*  75:155 */     return this.buyerLogonId;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setBuyerPayAmount(String buyerPayAmount)
/*  79:    */   {
/*  80:159 */     this.buyerPayAmount = buyerPayAmount;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getBuyerPayAmount()
/*  84:    */   {
/*  85:162 */     return this.buyerPayAmount;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setBuyerUserId(String buyerUserId)
/*  89:    */   {
/*  90:166 */     this.buyerUserId = buyerUserId;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getBuyerUserId()
/*  94:    */   {
/*  95:169 */     return this.buyerUserId;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setDiscountGoodsDetail(String discountGoodsDetail)
/*  99:    */   {
/* 100:173 */     this.discountGoodsDetail = discountGoodsDetail;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getDiscountGoodsDetail()
/* 104:    */   {
/* 105:176 */     return this.discountGoodsDetail;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setFundBillList(List<TradeFundBill> fundBillList)
/* 109:    */   {
/* 110:180 */     this.fundBillList = fundBillList;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public List<TradeFundBill> getFundBillList()
/* 114:    */   {
/* 115:183 */     return this.fundBillList;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setIndustrySepcDetail(String industrySepcDetail)
/* 119:    */   {
/* 120:187 */     this.industrySepcDetail = industrySepcDetail;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getIndustrySepcDetail()
/* 124:    */   {
/* 125:190 */     return this.industrySepcDetail;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setInvoiceAmount(String invoiceAmount)
/* 129:    */   {
/* 130:194 */     this.invoiceAmount = invoiceAmount;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getInvoiceAmount()
/* 134:    */   {
/* 135:197 */     return this.invoiceAmount;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setOpenId(String openId)
/* 139:    */   {
/* 140:201 */     this.openId = openId;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getOpenId()
/* 144:    */   {
/* 145:204 */     return this.openId;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setOutTradeNo(String outTradeNo)
/* 149:    */   {
/* 150:208 */     this.outTradeNo = outTradeNo;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getOutTradeNo()
/* 154:    */   {
/* 155:211 */     return this.outTradeNo;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setPointAmount(String pointAmount)
/* 159:    */   {
/* 160:215 */     this.pointAmount = pointAmount;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getPointAmount()
/* 164:    */   {
/* 165:218 */     return this.pointAmount;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setReceiptAmount(String receiptAmount)
/* 169:    */   {
/* 170:222 */     this.receiptAmount = receiptAmount;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getReceiptAmount()
/* 174:    */   {
/* 175:225 */     return this.receiptAmount;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setSendPayDate(Date sendPayDate)
/* 179:    */   {
/* 180:229 */     this.sendPayDate = sendPayDate;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public Date getSendPayDate()
/* 184:    */   {
/* 185:232 */     return this.sendPayDate;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setStoreId(String storeId)
/* 189:    */   {
/* 190:236 */     this.storeId = storeId;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getStoreId()
/* 194:    */   {
/* 195:239 */     return this.storeId;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setStoreName(String storeName)
/* 199:    */   {
/* 200:243 */     this.storeName = storeName;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public String getStoreName()
/* 204:    */   {
/* 205:246 */     return this.storeName;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public void setTerminalId(String terminalId)
/* 209:    */   {
/* 210:250 */     this.terminalId = terminalId;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public String getTerminalId()
/* 214:    */   {
/* 215:253 */     return this.terminalId;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void setTotalAmount(String totalAmount)
/* 219:    */   {
/* 220:257 */     this.totalAmount = totalAmount;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public String getTotalAmount()
/* 224:    */   {
/* 225:260 */     return this.totalAmount;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public void setTradeNo(String tradeNo)
/* 229:    */   {
/* 230:264 */     this.tradeNo = tradeNo;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public String getTradeNo()
/* 234:    */   {
/* 235:267 */     return this.tradeNo;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public void setTradeStatus(String tradeStatus)
/* 239:    */   {
/* 240:271 */     this.tradeStatus = tradeStatus;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public String getTradeStatus()
/* 244:    */   {
/* 245:274 */     return this.tradeStatus;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public void setVoucherDetailList(List<VoucherDetail> voucherDetailList)
/* 249:    */   {
/* 250:278 */     this.voucherDetailList = voucherDetailList;
/* 251:    */   }
/* 252:    */   
/* 253:    */   public List<VoucherDetail> getVoucherDetailList()
/* 254:    */   {
/* 255:281 */     return this.voucherDetailList;
/* 256:    */   }
/* 257:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayTradeQueryResponse

 * JD-Core Version:    0.7.0.1

 */