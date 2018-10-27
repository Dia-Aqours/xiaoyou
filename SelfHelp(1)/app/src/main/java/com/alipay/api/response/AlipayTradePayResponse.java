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
/*  11:    */ public class AlipayTradePayResponse
/*  12:    */   extends AlipayResponse
/*  13:    */ {
/*  14:    */   private static final long serialVersionUID = 1154883976392515419L;
/*  15:    */   @ApiField("buyer_logon_id")
/*  16:    */   private String buyerLogonId;
/*  17:    */   @ApiField("buyer_pay_amount")
/*  18:    */   private String buyerPayAmount;
/*  19:    */   @ApiField("buyer_user_id")
/*  20:    */   private String buyerUserId;
/*  21:    */   @ApiField("card_balance")
/*  22:    */   private String cardBalance;
/*  23:    */   @ApiField("discount_goods_detail")
/*  24:    */   private String discountGoodsDetail;
/*  25:    */   @ApiListField("fund_bill_list")
/*  26:    */   @ApiField("trade_fund_bill")
/*  27:    */   private List<TradeFundBill> fundBillList;
/*  28:    */   @ApiField("gmt_payment")
/*  29:    */   private Date gmtPayment;
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
/*  40:    */   @ApiField("store_name")
/*  41:    */   private String storeName;
/*  42:    */   @ApiField("total_amount")
/*  43:    */   private String totalAmount;
/*  44:    */   @ApiField("trade_no")
/*  45:    */   private String tradeNo;
/*  46:    */   @ApiListField("voucher_detail_list")
/*  47:    */   @ApiField("voucher_detail")
/*  48:    */   private List<VoucherDetail> voucherDetailList;
/*  49:    */   
/*  50:    */   public void setBuyerLogonId(String buyerLogonId)
/*  51:    */   {
/*  52:121 */     this.buyerLogonId = buyerLogonId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getBuyerLogonId()
/*  56:    */   {
/*  57:124 */     return this.buyerLogonId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setBuyerPayAmount(String buyerPayAmount)
/*  61:    */   {
/*  62:128 */     this.buyerPayAmount = buyerPayAmount;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getBuyerPayAmount()
/*  66:    */   {
/*  67:131 */     return this.buyerPayAmount;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setBuyerUserId(String buyerUserId)
/*  71:    */   {
/*  72:135 */     this.buyerUserId = buyerUserId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getBuyerUserId()
/*  76:    */   {
/*  77:138 */     return this.buyerUserId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setCardBalance(String cardBalance)
/*  81:    */   {
/*  82:142 */     this.cardBalance = cardBalance;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getCardBalance()
/*  86:    */   {
/*  87:145 */     return this.cardBalance;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setDiscountGoodsDetail(String discountGoodsDetail)
/*  91:    */   {
/*  92:149 */     this.discountGoodsDetail = discountGoodsDetail;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getDiscountGoodsDetail()
/*  96:    */   {
/*  97:152 */     return this.discountGoodsDetail;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setFundBillList(List<TradeFundBill> fundBillList)
/* 101:    */   {
/* 102:156 */     this.fundBillList = fundBillList;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public List<TradeFundBill> getFundBillList()
/* 106:    */   {
/* 107:159 */     return this.fundBillList;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setGmtPayment(Date gmtPayment)
/* 111:    */   {
/* 112:163 */     this.gmtPayment = gmtPayment;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Date getGmtPayment()
/* 116:    */   {
/* 117:166 */     return this.gmtPayment;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setInvoiceAmount(String invoiceAmount)
/* 121:    */   {
/* 122:170 */     this.invoiceAmount = invoiceAmount;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getInvoiceAmount()
/* 126:    */   {
/* 127:173 */     return this.invoiceAmount;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setOpenId(String openId)
/* 131:    */   {
/* 132:177 */     this.openId = openId;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getOpenId()
/* 136:    */   {
/* 137:180 */     return this.openId;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setOutTradeNo(String outTradeNo)
/* 141:    */   {
/* 142:184 */     this.outTradeNo = outTradeNo;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getOutTradeNo()
/* 146:    */   {
/* 147:187 */     return this.outTradeNo;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setPointAmount(String pointAmount)
/* 151:    */   {
/* 152:191 */     this.pointAmount = pointAmount;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getPointAmount()
/* 156:    */   {
/* 157:194 */     return this.pointAmount;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setReceiptAmount(String receiptAmount)
/* 161:    */   {
/* 162:198 */     this.receiptAmount = receiptAmount;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getReceiptAmount()
/* 166:    */   {
/* 167:201 */     return this.receiptAmount;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setStoreName(String storeName)
/* 171:    */   {
/* 172:205 */     this.storeName = storeName;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getStoreName()
/* 176:    */   {
/* 177:208 */     return this.storeName;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setTotalAmount(String totalAmount)
/* 181:    */   {
/* 182:212 */     this.totalAmount = totalAmount;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getTotalAmount()
/* 186:    */   {
/* 187:215 */     return this.totalAmount;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setTradeNo(String tradeNo)
/* 191:    */   {
/* 192:219 */     this.tradeNo = tradeNo;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getTradeNo()
/* 196:    */   {
/* 197:222 */     return this.tradeNo;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void setVoucherDetailList(List<VoucherDetail> voucherDetailList)
/* 201:    */   {
/* 202:226 */     this.voucherDetailList = voucherDetailList;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public List<VoucherDetail> getVoucherDetailList()
/* 206:    */   {
/* 207:229 */     return this.voucherDetailList;
/* 208:    */   }
/* 209:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTradePayResponse
 * JD-Core Version:    0.7.0.1
 */