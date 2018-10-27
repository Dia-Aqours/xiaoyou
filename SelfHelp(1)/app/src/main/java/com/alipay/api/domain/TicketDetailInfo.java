/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class TicketDetailInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2359788561915116139L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("end_station")
/*  13:    */   private String endStation;
/*  14:    */   @ApiField("end_station_name")
/*  15:    */   private String endStationName;
/*  16:    */   @ApiField("quantity")
/*  17:    */   private String quantity;
/*  18:    */   @ApiField("start_station")
/*  19:    */   private String startStation;
/*  20:    */   @ApiField("start_station_name")
/*  21:    */   private String startStationName;
/*  22:    */   @ApiField("status")
/*  23:    */   private String status;
/*  24:    */   @ApiField("ticket_price")
/*  25:    */   private String ticketPrice;
/*  26:    */   @ApiField("ticket_type")
/*  27:    */   private String ticketType;
/*  28:    */   @ApiField("trade_no")
/*  29:    */   private String tradeNo;
/*  30:    */   
/*  31:    */   public String getAmount()
/*  32:    */   {
/*  33: 77 */     return this.amount;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAmount(String amount)
/*  37:    */   {
/*  38: 80 */     this.amount = amount;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getEndStation()
/*  42:    */   {
/*  43: 84 */     return this.endStation;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setEndStation(String endStation)
/*  47:    */   {
/*  48: 87 */     this.endStation = endStation;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getEndStationName()
/*  52:    */   {
/*  53: 91 */     return this.endStationName;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setEndStationName(String endStationName)
/*  57:    */   {
/*  58: 94 */     this.endStationName = endStationName;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getQuantity()
/*  62:    */   {
/*  63: 98 */     return this.quantity;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setQuantity(String quantity)
/*  67:    */   {
/*  68:101 */     this.quantity = quantity;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getStartStation()
/*  72:    */   {
/*  73:105 */     return this.startStation;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setStartStation(String startStation)
/*  77:    */   {
/*  78:108 */     this.startStation = startStation;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getStartStationName()
/*  82:    */   {
/*  83:112 */     return this.startStationName;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setStartStationName(String startStationName)
/*  87:    */   {
/*  88:115 */     this.startStationName = startStationName;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getStatus()
/*  92:    */   {
/*  93:119 */     return this.status;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setStatus(String status)
/*  97:    */   {
/*  98:122 */     this.status = status;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTicketPrice()
/* 102:    */   {
/* 103:126 */     return this.ticketPrice;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setTicketPrice(String ticketPrice)
/* 107:    */   {
/* 108:129 */     this.ticketPrice = ticketPrice;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getTicketType()
/* 112:    */   {
/* 113:133 */     return this.ticketType;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setTicketType(String ticketType)
/* 117:    */   {
/* 118:136 */     this.ticketType = ticketType;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getTradeNo()
/* 122:    */   {
/* 123:140 */     return this.tradeNo;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setTradeNo(String tradeNo)
/* 127:    */   {
/* 128:143 */     this.tradeNo = tradeNo;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TicketDetailInfo
 * JD-Core Version:    0.7.0.1
 */