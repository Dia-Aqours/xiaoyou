/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.KbOrderActivityModel;
/*   5:    */ import com.alipay.api.domain.KbOrderFundsVoucherModel;
/*   6:    */ import com.alipay.api.domain.KbOrderShopModel;
/*   7:    */ import com.alipay.api.domain.KbOrderVoucherModel;
/*   8:    */ import com.alipay.api.internal.mapping.ApiField;
/*   9:    */ import com.alipay.api.internal.mapping.ApiListField;
/*  10:    */ import java.util.Date;
/*  11:    */ import java.util.List;
/*  12:    */ 
/*  13:    */ public class KoubeiTradeOrderQueryResponse
/*  14:    */   extends AlipayResponse
/*  15:    */ {
/*  16:    */   private static final long serialVersionUID = 8825757363986323482L;
/*  17:    */   @ApiListField("activity_infos")
/*  18:    */   @ApiField("kb_order_activity_model")
/*  19:    */   private List<KbOrderActivityModel> activityInfos;
/*  20:    */   @ApiField("buyer_id")
/*  21:    */   private String buyerId;
/*  22:    */   @ApiField("contact")
/*  23:    */   private String contact;
/*  24:    */   @ApiListField("funds_vouchers")
/*  25:    */   @ApiField("kb_order_funds_voucher_model")
/*  26:    */   private List<KbOrderFundsVoucherModel> fundsVouchers;
/*  27:    */   @ApiField("gmt_create")
/*  28:    */   private Date gmtCreate;
/*  29:    */   @ApiField("gmt_modified")
/*  30:    */   private Date gmtModified;
/*  31:    */   @ApiField("order_no")
/*  32:    */   private String orderNo;
/*  33:    */   @ApiField("out_biz_no")
/*  34:    */   private String outBizNo;
/*  35:    */   @ApiField("partner_id")
/*  36:    */   private String partnerId;
/*  37:    */   @ApiField("real_amount")
/*  38:    */   private String realAmount;
/*  39:    */   @ApiField("seller_id")
/*  40:    */   private String sellerId;
/*  41:    */   @ApiField("shop")
/*  42:    */   private KbOrderShopModel shop;
/*  43:    */   @ApiField("status")
/*  44:    */   private String status;
/*  45:    */   @ApiField("total_amount")
/*  46:    */   private String totalAmount;
/*  47:    */   @ApiField("trans_no")
/*  48:    */   private String transNo;
/*  49:    */   @ApiListField("vouchers")
/*  50:    */   @ApiField("kb_order_voucher_model")
/*  51:    */   private List<KbOrderVoucherModel> vouchers;
/*  52:    */   
/*  53:    */   public void setActivityInfos(List<KbOrderActivityModel> activityInfos)
/*  54:    */   {
/*  55:142 */     this.activityInfos = activityInfos;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public List<KbOrderActivityModel> getActivityInfos()
/*  59:    */   {
/*  60:145 */     return this.activityInfos;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBuyerId(String buyerId)
/*  64:    */   {
/*  65:149 */     this.buyerId = buyerId;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getBuyerId()
/*  69:    */   {
/*  70:152 */     return this.buyerId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setContact(String contact)
/*  74:    */   {
/*  75:156 */     this.contact = contact;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getContact()
/*  79:    */   {
/*  80:159 */     return this.contact;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setFundsVouchers(List<KbOrderFundsVoucherModel> fundsVouchers)
/*  84:    */   {
/*  85:163 */     this.fundsVouchers = fundsVouchers;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public List<KbOrderFundsVoucherModel> getFundsVouchers()
/*  89:    */   {
/*  90:166 */     return this.fundsVouchers;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setGmtCreate(Date gmtCreate)
/*  94:    */   {
/*  95:170 */     this.gmtCreate = gmtCreate;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public Date getGmtCreate()
/*  99:    */   {
/* 100:173 */     return this.gmtCreate;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setGmtModified(Date gmtModified)
/* 104:    */   {
/* 105:177 */     this.gmtModified = gmtModified;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public Date getGmtModified()
/* 109:    */   {
/* 110:180 */     return this.gmtModified;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setOrderNo(String orderNo)
/* 114:    */   {
/* 115:184 */     this.orderNo = orderNo;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getOrderNo()
/* 119:    */   {
/* 120:187 */     return this.orderNo;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setOutBizNo(String outBizNo)
/* 124:    */   {
/* 125:191 */     this.outBizNo = outBizNo;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getOutBizNo()
/* 129:    */   {
/* 130:194 */     return this.outBizNo;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setPartnerId(String partnerId)
/* 134:    */   {
/* 135:198 */     this.partnerId = partnerId;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getPartnerId()
/* 139:    */   {
/* 140:201 */     return this.partnerId;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setRealAmount(String realAmount)
/* 144:    */   {
/* 145:205 */     this.realAmount = realAmount;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getRealAmount()
/* 149:    */   {
/* 150:208 */     return this.realAmount;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setSellerId(String sellerId)
/* 154:    */   {
/* 155:212 */     this.sellerId = sellerId;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getSellerId()
/* 159:    */   {
/* 160:215 */     return this.sellerId;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setShop(KbOrderShopModel shop)
/* 164:    */   {
/* 165:219 */     this.shop = shop;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public KbOrderShopModel getShop()
/* 169:    */   {
/* 170:222 */     return this.shop;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setStatus(String status)
/* 174:    */   {
/* 175:226 */     this.status = status;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getStatus()
/* 179:    */   {
/* 180:229 */     return this.status;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setTotalAmount(String totalAmount)
/* 184:    */   {
/* 185:233 */     this.totalAmount = totalAmount;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getTotalAmount()
/* 189:    */   {
/* 190:236 */     return this.totalAmount;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setTransNo(String transNo)
/* 194:    */   {
/* 195:240 */     this.transNo = transNo;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getTransNo()
/* 199:    */   {
/* 200:243 */     return this.transNo;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setVouchers(List<KbOrderVoucherModel> vouchers)
/* 204:    */   {
/* 205:247 */     this.vouchers = vouchers;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public List<KbOrderVoucherModel> getVouchers()
/* 209:    */   {
/* 210:250 */     return this.vouchers;
/* 211:    */   }
/* 212:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiTradeOrderQueryResponse
 * JD-Core Version:    0.7.0.1
 */