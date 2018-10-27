/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEcoMycarParkingOrderSyncModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4847616986819347712L;
/*  10:    */   @ApiField("car_number")
/*  11:    */   private String carNumber;
/*  12:    */   @ApiField("card_number")
/*  13:    */   private String cardNumber;
/*  14:    */   @ApiField("in_duration")
/*  15:    */   private String inDuration;
/*  16:    */   @ApiField("in_time")
/*  17:    */   private String inTime;
/*  18:    */   @ApiField("order_no")
/*  19:    */   private String orderNo;
/*  20:    */   @ApiField("order_status")
/*  21:    */   private String orderStatus;
/*  22:    */   @ApiField("order_time")
/*  23:    */   private String orderTime;
/*  24:    */   @ApiField("out_order_no")
/*  25:    */   private String outOrderNo;
/*  26:    */   @ApiField("out_parking_id")
/*  27:    */   private String outParkingId;
/*  28:    */   @ApiField("parking_id")
/*  29:    */   private String parkingId;
/*  30:    */   @ApiField("parking_name")
/*  31:    */   private String parkingName;
/*  32:    */   @ApiField("pay_money")
/*  33:    */   private String payMoney;
/*  34:    */   @ApiField("pay_time")
/*  35:    */   private String payTime;
/*  36:    */   @ApiField("pay_type")
/*  37:    */   private String payType;
/*  38:    */   @ApiField("user_id")
/*  39:    */   private String userId;
/*  40:    */   
/*  41:    */   public String getCarNumber()
/*  42:    */   {
/*  43:107 */     return this.carNumber;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setCarNumber(String carNumber)
/*  47:    */   {
/*  48:110 */     this.carNumber = carNumber;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getCardNumber()
/*  52:    */   {
/*  53:114 */     return this.cardNumber;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setCardNumber(String cardNumber)
/*  57:    */   {
/*  58:117 */     this.cardNumber = cardNumber;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getInDuration()
/*  62:    */   {
/*  63:121 */     return this.inDuration;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setInDuration(String inDuration)
/*  67:    */   {
/*  68:124 */     this.inDuration = inDuration;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getInTime()
/*  72:    */   {
/*  73:128 */     return this.inTime;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setInTime(String inTime)
/*  77:    */   {
/*  78:131 */     this.inTime = inTime;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getOrderNo()
/*  82:    */   {
/*  83:135 */     return this.orderNo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setOrderNo(String orderNo)
/*  87:    */   {
/*  88:138 */     this.orderNo = orderNo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getOrderStatus()
/*  92:    */   {
/*  93:142 */     return this.orderStatus;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setOrderStatus(String orderStatus)
/*  97:    */   {
/*  98:145 */     this.orderStatus = orderStatus;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getOrderTime()
/* 102:    */   {
/* 103:149 */     return this.orderTime;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setOrderTime(String orderTime)
/* 107:    */   {
/* 108:152 */     this.orderTime = orderTime;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getOutOrderNo()
/* 112:    */   {
/* 113:156 */     return this.outOrderNo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setOutOrderNo(String outOrderNo)
/* 117:    */   {
/* 118:159 */     this.outOrderNo = outOrderNo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getOutParkingId()
/* 122:    */   {
/* 123:163 */     return this.outParkingId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setOutParkingId(String outParkingId)
/* 127:    */   {
/* 128:166 */     this.outParkingId = outParkingId;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getParkingId()
/* 132:    */   {
/* 133:170 */     return this.parkingId;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setParkingId(String parkingId)
/* 137:    */   {
/* 138:173 */     this.parkingId = parkingId;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getParkingName()
/* 142:    */   {
/* 143:177 */     return this.parkingName;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setParkingName(String parkingName)
/* 147:    */   {
/* 148:180 */     this.parkingName = parkingName;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getPayMoney()
/* 152:    */   {
/* 153:184 */     return this.payMoney;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setPayMoney(String payMoney)
/* 157:    */   {
/* 158:187 */     this.payMoney = payMoney;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getPayTime()
/* 162:    */   {
/* 163:191 */     return this.payTime;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setPayTime(String payTime)
/* 167:    */   {
/* 168:194 */     this.payTime = payTime;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getPayType()
/* 172:    */   {
/* 173:198 */     return this.payType;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setPayType(String payType)
/* 177:    */   {
/* 178:201 */     this.payType = payType;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getUserId()
/* 182:    */   {
/* 183:205 */     return this.userId;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setUserId(String userId)
/* 187:    */   {
/* 188:208 */     this.userId = userId;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingOrderSyncModel
 * JD-Core Version:    0.7.0.1
 */