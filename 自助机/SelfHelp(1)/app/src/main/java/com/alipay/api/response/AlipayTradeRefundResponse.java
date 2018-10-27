/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.TradeFundBill;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.List;

/*   9:    */
/*  10:    */ public class AlipayTradeRefundResponse
/*  11:    */   extends AlipayResponse
/*  12:    */ {
/*  13:    */   private static final long serialVersionUID = 1186215837449797261L;
/*  14:    */   @ApiField("buyer_logon_id")
/*  15:    */   private String buyerLogonId;
/*  16:    */   @ApiField("buyer_user_id")
/*  17:    */   private String buyerUserId;
/*  18:    */   @ApiField("fund_change")
/*  19:    */   private String fundChange;
/*  20:    */   @ApiField("gmt_refund_pay")
/*  21:    */   private Date gmtRefundPay;
/*  22:    */   @ApiField("open_id")
/*  23:    */   private String openId;
/*  24:    */   @ApiField("out_trade_no")
/*  25:    */   private String outTradeNo;
/*  26:    */   @ApiListField("refund_detail_item_list")
/*  27:    */   @ApiField("trade_fund_bill")
/*  28:    */   private List<TradeFundBill> refundDetailItemList;
/*  29:    */   @ApiField("refund_fee")
/*  30:    */   private String refundFee;
/*  31:    */   @ApiField("send_back_fee")
/*  32:    */   private String sendBackFee;
/*  33:    */   @ApiField("store_name")
/*  34:    */   private String storeName;
/*  35:    */   @ApiField("trade_no")
/*  36:    */   private String tradeNo;
/*  37:    */   
/*  38:    */   public void setBuyerLogonId(String buyerLogonId)
/*  39:    */   {
/*  40: 89 */     this.buyerLogonId = buyerLogonId;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getBuyerLogonId()
/*  44:    */   {
/*  45: 92 */     return this.buyerLogonId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBuyerUserId(String buyerUserId)
/*  49:    */   {
/*  50: 96 */     this.buyerUserId = buyerUserId;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getBuyerUserId()
/*  54:    */   {
/*  55: 99 */     return this.buyerUserId;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setFundChange(String fundChange)
/*  59:    */   {
/*  60:103 */     this.fundChange = fundChange;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getFundChange()
/*  64:    */   {
/*  65:106 */     return this.fundChange;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setGmtRefundPay(Date gmtRefundPay)
/*  69:    */   {
/*  70:110 */     this.gmtRefundPay = gmtRefundPay;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public Date getGmtRefundPay()
/*  74:    */   {
/*  75:113 */     return this.gmtRefundPay;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setOpenId(String openId)
/*  79:    */   {
/*  80:117 */     this.openId = openId;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getOpenId()
/*  84:    */   {
/*  85:120 */     return this.openId;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setOutTradeNo(String outTradeNo)
/*  89:    */   {
/*  90:124 */     this.outTradeNo = outTradeNo;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getOutTradeNo()
/*  94:    */   {
/*  95:127 */     return this.outTradeNo;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList)
/*  99:    */   {
/* 100:131 */     this.refundDetailItemList = refundDetailItemList;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public List<TradeFundBill> getRefundDetailItemList()
/* 104:    */   {
/* 105:134 */     return this.refundDetailItemList;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setRefundFee(String refundFee)
/* 109:    */   {
/* 110:138 */     this.refundFee = refundFee;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getRefundFee()
/* 114:    */   {
/* 115:141 */     return this.refundFee;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setSendBackFee(String sendBackFee)
/* 119:    */   {
/* 120:145 */     this.sendBackFee = sendBackFee;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getSendBackFee()
/* 124:    */   {
/* 125:148 */     return this.sendBackFee;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setStoreName(String storeName)
/* 129:    */   {
/* 130:152 */     this.storeName = storeName;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getStoreName()
/* 134:    */   {
/* 135:155 */     return this.storeName;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setTradeNo(String tradeNo)
/* 139:    */   {
/* 140:159 */     this.tradeNo = tradeNo;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getTradeNo()
/* 144:    */   {
/* 145:162 */     return this.tradeNo;
/* 146:    */   }
/* 147:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayTradeRefundResponse

 * JD-Core Version:    0.7.0.1

 */