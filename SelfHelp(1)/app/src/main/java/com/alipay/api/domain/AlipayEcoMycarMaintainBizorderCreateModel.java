/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayEcoMycarMaintainBizorderCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2465338496632963999L;
/*  12:    */   @ApiField("appoint_affirm_time")
/*  13:    */   private String appointAffirmTime;
/*  14:    */   @ApiField("appoint_end_time")
/*  15:    */   private String appointEndTime;
/*  16:    */   @ApiField("appoint_start_time")
/*  17:    */   private String appointStartTime;
/*  18:    */   @ApiField("appoint_status")
/*  19:    */   private Long appointStatus;
/*  20:    */   @ApiField("arrive_time")
/*  21:    */   private String arriveTime;
/*  22:    */   @ApiField("biz_status_txt")
/*  23:    */   private String bizStatusTxt;
/*  24:    */   @ApiField("biz_type")
/*  25:    */   private Long bizType;
/*  26:    */   @ApiField("car_id")
/*  27:    */   private String carId;
/*  28:    */   @ApiListField("order_server_list")
/*  29:    */   @ApiField("maintain_biz_order")
/*  30:    */   private List<MaintainBizOrder> orderServerList;
/*  31:    */   @ApiField("order_status")
/*  32:    */   private Long orderStatus;
/*  33:    */   @ApiField("original_cost")
/*  34:    */   private String originalCost;
/*  35:    */   @ApiField("out_order_no")
/*  36:    */   private String outOrderNo;
/*  37:    */   @ApiField("out_shop_id")
/*  38:    */   private String outShopId;
/*  39:    */   @ApiField("pay_time")
/*  40:    */   private String payTime;
/*  41:    */   @ApiField("real_cost")
/*  42:    */   private String realCost;
/*  43:    */   @ApiField("shop_id")
/*  44:    */   private Long shopId;
/*  45:    */   @ApiField("user_id")
/*  46:    */   private String userId;
/*  47:    */   
/*  48:    */   public String getAppointAffirmTime()
/*  49:    */   {
/*  50:133 */     return this.appointAffirmTime;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAppointAffirmTime(String appointAffirmTime)
/*  54:    */   {
/*  55:136 */     this.appointAffirmTime = appointAffirmTime;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getAppointEndTime()
/*  59:    */   {
/*  60:140 */     return this.appointEndTime;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setAppointEndTime(String appointEndTime)
/*  64:    */   {
/*  65:143 */     this.appointEndTime = appointEndTime;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getAppointStartTime()
/*  69:    */   {
/*  70:147 */     return this.appointStartTime;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setAppointStartTime(String appointStartTime)
/*  74:    */   {
/*  75:150 */     this.appointStartTime = appointStartTime;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Long getAppointStatus()
/*  79:    */   {
/*  80:154 */     return this.appointStatus;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setAppointStatus(Long appointStatus)
/*  84:    */   {
/*  85:157 */     this.appointStatus = appointStatus;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getArriveTime()
/*  89:    */   {
/*  90:161 */     return this.arriveTime;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setArriveTime(String arriveTime)
/*  94:    */   {
/*  95:164 */     this.arriveTime = arriveTime;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getBizStatusTxt()
/*  99:    */   {
/* 100:168 */     return this.bizStatusTxt;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setBizStatusTxt(String bizStatusTxt)
/* 104:    */   {
/* 105:171 */     this.bizStatusTxt = bizStatusTxt;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public Long getBizType()
/* 109:    */   {
/* 110:175 */     return this.bizType;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setBizType(Long bizType)
/* 114:    */   {
/* 115:178 */     this.bizType = bizType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getCarId()
/* 119:    */   {
/* 120:182 */     return this.carId;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setCarId(String carId)
/* 124:    */   {
/* 125:185 */     this.carId = carId;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public List<MaintainBizOrder> getOrderServerList()
/* 129:    */   {
/* 130:189 */     return this.orderServerList;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setOrderServerList(List<MaintainBizOrder> orderServerList)
/* 134:    */   {
/* 135:192 */     this.orderServerList = orderServerList;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Long getOrderStatus()
/* 139:    */   {
/* 140:196 */     return this.orderStatus;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setOrderStatus(Long orderStatus)
/* 144:    */   {
/* 145:199 */     this.orderStatus = orderStatus;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getOriginalCost()
/* 149:    */   {
/* 150:203 */     return this.originalCost;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setOriginalCost(String originalCost)
/* 154:    */   {
/* 155:206 */     this.originalCost = originalCost;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getOutOrderNo()
/* 159:    */   {
/* 160:210 */     return this.outOrderNo;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setOutOrderNo(String outOrderNo)
/* 164:    */   {
/* 165:213 */     this.outOrderNo = outOrderNo;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getOutShopId()
/* 169:    */   {
/* 170:217 */     return this.outShopId;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setOutShopId(String outShopId)
/* 174:    */   {
/* 175:220 */     this.outShopId = outShopId;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getPayTime()
/* 179:    */   {
/* 180:224 */     return this.payTime;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setPayTime(String payTime)
/* 184:    */   {
/* 185:227 */     this.payTime = payTime;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getRealCost()
/* 189:    */   {
/* 190:231 */     return this.realCost;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setRealCost(String realCost)
/* 194:    */   {
/* 195:234 */     this.realCost = realCost;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public Long getShopId()
/* 199:    */   {
/* 200:238 */     return this.shopId;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setShopId(Long shopId)
/* 204:    */   {
/* 205:241 */     this.shopId = shopId;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getUserId()
/* 209:    */   {
/* 210:245 */     return this.userId;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setUserId(String userId)
/* 214:    */   {
/* 215:248 */     this.userId = userId;
/* 216:    */   }
/* 217:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainBizorderCreateModel
 * JD-Core Version:    0.7.0.1
 */