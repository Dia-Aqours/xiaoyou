/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class BankPayApplyResult
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5697227446546686728L;
/*  11:    */   @ApiField("alipay_account_id")
/*  12:    */   private String alipayAccountId;
/*  13:    */   @ApiField("alipay_account_type")
/*  14:    */   private String alipayAccountType;
/*  15:    */   @ApiField("alipay_order_no")
/*  16:    */   private String alipayOrderNo;
/*  17:    */   @ApiField("amount")
/*  18:    */   private Long amount;
/*  19:    */   @ApiField("apply_time")
/*  20:    */   private Date applyTime;
/*  21:    */   @ApiField("bank_order_no")
/*  22:    */   private String bankOrderNo;
/*  23:    */   @ApiField("biz_order_no")
/*  24:    */   private String bizOrderNo;
/*  25:    */   @ApiField("biz_type")
/*  26:    */   private String bizType;
/*  27:    */   @ApiField("channel_desc")
/*  28:    */   private String channelDesc;
/*  29:    */   @ApiField("memo")
/*  30:    */   private String memo;
/*  31:    */   @ApiField("order_status")
/*  32:    */   private String orderStatus;
/*  33:    */   @ApiField("payer_card_account_type")
/*  34:    */   private String payerCardAccountType;
/*  35:    */   @ApiField("payer_card_id")
/*  36:    */   private String payerCardId;
/*  37:    */   @ApiField("payer_card_id_type")
/*  38:    */   private String payerCardIdType;
/*  39:    */   @ApiField("payer_card_type")
/*  40:    */   private String payerCardType;
/*  41:    */   @ApiField("payer_inst_id")
/*  42:    */   private String payerInstId;
/*  43:    */   @ApiField("success_time")
/*  44:    */   private Date successTime;
/*  45:    */   
/*  46:    */   public String getAlipayAccountId()
/*  47:    */   {
/*  48:133 */     return this.alipayAccountId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAlipayAccountId(String alipayAccountId)
/*  52:    */   {
/*  53:136 */     this.alipayAccountId = alipayAccountId;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getAlipayAccountType()
/*  57:    */   {
/*  58:140 */     return this.alipayAccountType;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setAlipayAccountType(String alipayAccountType)
/*  62:    */   {
/*  63:143 */     this.alipayAccountType = alipayAccountType;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getAlipayOrderNo()
/*  67:    */   {
/*  68:147 */     return this.alipayOrderNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  72:    */   {
/*  73:150 */     this.alipayOrderNo = alipayOrderNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Long getAmount()
/*  77:    */   {
/*  78:154 */     return this.amount;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setAmount(Long amount)
/*  82:    */   {
/*  83:157 */     this.amount = amount;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public Date getApplyTime()
/*  87:    */   {
/*  88:161 */     return this.applyTime;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setApplyTime(Date applyTime)
/*  92:    */   {
/*  93:164 */     this.applyTime = applyTime;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getBankOrderNo()
/*  97:    */   {
/*  98:168 */     return this.bankOrderNo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setBankOrderNo(String bankOrderNo)
/* 102:    */   {
/* 103:171 */     this.bankOrderNo = bankOrderNo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getBizOrderNo()
/* 107:    */   {
/* 108:175 */     return this.bizOrderNo;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setBizOrderNo(String bizOrderNo)
/* 112:    */   {
/* 113:178 */     this.bizOrderNo = bizOrderNo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getBizType()
/* 117:    */   {
/* 118:182 */     return this.bizType;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setBizType(String bizType)
/* 122:    */   {
/* 123:185 */     this.bizType = bizType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getChannelDesc()
/* 127:    */   {
/* 128:189 */     return this.channelDesc;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setChannelDesc(String channelDesc)
/* 132:    */   {
/* 133:192 */     this.channelDesc = channelDesc;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getMemo()
/* 137:    */   {
/* 138:196 */     return this.memo;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setMemo(String memo)
/* 142:    */   {
/* 143:199 */     this.memo = memo;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getOrderStatus()
/* 147:    */   {
/* 148:203 */     return this.orderStatus;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setOrderStatus(String orderStatus)
/* 152:    */   {
/* 153:206 */     this.orderStatus = orderStatus;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getPayerCardAccountType()
/* 157:    */   {
/* 158:210 */     return this.payerCardAccountType;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setPayerCardAccountType(String payerCardAccountType)
/* 162:    */   {
/* 163:213 */     this.payerCardAccountType = payerCardAccountType;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getPayerCardId()
/* 167:    */   {
/* 168:217 */     return this.payerCardId;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setPayerCardId(String payerCardId)
/* 172:    */   {
/* 173:220 */     this.payerCardId = payerCardId;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getPayerCardIdType()
/* 177:    */   {
/* 178:224 */     return this.payerCardIdType;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setPayerCardIdType(String payerCardIdType)
/* 182:    */   {
/* 183:227 */     this.payerCardIdType = payerCardIdType;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getPayerCardType()
/* 187:    */   {
/* 188:231 */     return this.payerCardType;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setPayerCardType(String payerCardType)
/* 192:    */   {
/* 193:234 */     this.payerCardType = payerCardType;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public String getPayerInstId()
/* 197:    */   {
/* 198:238 */     return this.payerInstId;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void setPayerInstId(String payerInstId)
/* 202:    */   {
/* 203:241 */     this.payerInstId = payerInstId;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public Date getSuccessTime()
/* 207:    */   {
/* 208:245 */     return this.successTime;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setSuccessTime(Date successTime)
/* 212:    */   {
/* 213:248 */     this.successTime = successTime;
/* 214:    */   }
/* 215:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BankPayApplyResult
 * JD-Core Version:    0.7.0.1
 */