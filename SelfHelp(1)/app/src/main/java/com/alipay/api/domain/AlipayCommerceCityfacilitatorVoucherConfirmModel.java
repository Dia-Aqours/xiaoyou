/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayCommerceCityfacilitatorVoucherConfirmModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3141488693334347954L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("biz_info_ext")
/*  13:    */   private String bizInfoExt;
/*  14:    */   @ApiField("biz_request_id")
/*  15:    */   private String bizRequestId;
/*  16:    */   @ApiField("city_code")
/*  17:    */   private String cityCode;
/*  18:    */   @ApiField("end_station")
/*  19:    */   private String endStation;
/*  20:    */   @ApiField("exchange_ids")
/*  21:    */   private String exchangeIds;
/*  22:    */   @ApiField("operate_time")
/*  23:    */   private String operateTime;
/*  24:    */   @ApiField("out_biz_no")
/*  25:    */   private String outBizNo;
/*  26:    */   @ApiField("quantity")
/*  27:    */   private String quantity;
/*  28:    */   @ApiField("seller_id")
/*  29:    */   private String sellerId;
/*  30:    */   @ApiField("start_station")
/*  31:    */   private String startStation;
/*  32:    */   @ApiField("ticket_no")
/*  33:    */   private String ticketNo;
/*  34:    */   @ApiField("ticket_price")
/*  35:    */   private String ticketPrice;
/*  36:    */   @ApiField("ticket_type")
/*  37:    */   private String ticketType;
/*  38:    */   @ApiField("trade_no")
/*  39:    */   private String tradeNo;
/*  40:    */   
/*  41:    */   public String getAmount()
/*  42:    */   {
/*  43:107 */     return this.amount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAmount(String amount)
/*  47:    */   {
/*  48:110 */     this.amount = amount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getBizInfoExt()
/*  52:    */   {
/*  53:114 */     return this.bizInfoExt;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBizInfoExt(String bizInfoExt)
/*  57:    */   {
/*  58:117 */     this.bizInfoExt = bizInfoExt;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBizRequestId()
/*  62:    */   {
/*  63:121 */     return this.bizRequestId;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBizRequestId(String bizRequestId)
/*  67:    */   {
/*  68:124 */     this.bizRequestId = bizRequestId;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getCityCode()
/*  72:    */   {
/*  73:128 */     return this.cityCode;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setCityCode(String cityCode)
/*  77:    */   {
/*  78:131 */     this.cityCode = cityCode;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getEndStation()
/*  82:    */   {
/*  83:135 */     return this.endStation;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setEndStation(String endStation)
/*  87:    */   {
/*  88:138 */     this.endStation = endStation;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getExchangeIds()
/*  92:    */   {
/*  93:142 */     return this.exchangeIds;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setExchangeIds(String exchangeIds)
/*  97:    */   {
/*  98:145 */     this.exchangeIds = exchangeIds;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getOperateTime()
/* 102:    */   {
/* 103:149 */     return this.operateTime;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setOperateTime(String operateTime)
/* 107:    */   {
/* 108:152 */     this.operateTime = operateTime;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getOutBizNo()
/* 112:    */   {
/* 113:156 */     return this.outBizNo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setOutBizNo(String outBizNo)
/* 117:    */   {
/* 118:159 */     this.outBizNo = outBizNo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getQuantity()
/* 122:    */   {
/* 123:163 */     return this.quantity;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setQuantity(String quantity)
/* 127:    */   {
/* 128:166 */     this.quantity = quantity;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getSellerId()
/* 132:    */   {
/* 133:170 */     return this.sellerId;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setSellerId(String sellerId)
/* 137:    */   {
/* 138:173 */     this.sellerId = sellerId;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getStartStation()
/* 142:    */   {
/* 143:177 */     return this.startStation;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setStartStation(String startStation)
/* 147:    */   {
/* 148:180 */     this.startStation = startStation;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getTicketNo()
/* 152:    */   {
/* 153:184 */     return this.ticketNo;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setTicketNo(String ticketNo)
/* 157:    */   {
/* 158:187 */     this.ticketNo = ticketNo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getTicketPrice()
/* 162:    */   {
/* 163:191 */     return this.ticketPrice;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setTicketPrice(String ticketPrice)
/* 167:    */   {
/* 168:194 */     this.ticketPrice = ticketPrice;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getTicketType()
/* 172:    */   {
/* 173:198 */     return this.ticketType;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setTicketType(String ticketType)
/* 177:    */   {
/* 178:201 */     this.ticketType = ticketType;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getTradeNo()
/* 182:    */   {
/* 183:205 */     return this.tradeNo;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setTradeNo(String tradeNo)
/* 187:    */   {
/* 188:208 */     this.tradeNo = tradeNo;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherConfirmModel
 * JD-Core Version:    0.7.0.1
 */