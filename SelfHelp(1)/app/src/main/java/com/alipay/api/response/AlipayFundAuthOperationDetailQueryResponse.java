/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayFundAuthOperationDetailQueryResponse
/*   8:    */   extends AlipayResponse
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1495233378775718699L;
/*  11:    */   @ApiField("amount")
/*  12:    */   private String amount;
/*  13:    */   @ApiField("auth_no")
/*  14:    */   private String authNo;
/*  15:    */   @ApiField("extra_param")
/*  16:    */   private String extraParam;
/*  17:    */   @ApiField("gmt_create")
/*  18:    */   private Date gmtCreate;
/*  19:    */   @ApiField("gmt_trans")
/*  20:    */   private Date gmtTrans;
/*  21:    */   @ApiField("operation_id")
/*  22:    */   private String operationId;
/*  23:    */   @ApiField("operation_type")
/*  24:    */   private String operationType;
/*  25:    */   @ApiField("order_title")
/*  26:    */   private String orderTitle;
/*  27:    */   @ApiField("out_order_no")
/*  28:    */   private String outOrderNo;
/*  29:    */   @ApiField("out_request_no")
/*  30:    */   private String outRequestNo;
/*  31:    */   @ApiField("payer_logon_id")
/*  32:    */   private String payerLogonId;
/*  33:    */   @ApiField("payer_user_id")
/*  34:    */   private String payerUserId;
/*  35:    */   @ApiField("remark")
/*  36:    */   private String remark;
/*  37:    */   @ApiField("rest_amount")
/*  38:    */   private String restAmount;
/*  39:    */   @ApiField("status")
/*  40:    */   private String status;
/*  41:    */   @ApiField("total_freeze_amount")
/*  42:    */   private String totalFreezeAmount;
/*  43:    */   @ApiField("total_pay_amount")
/*  44:    */   private String totalPayAmount;
/*  45:    */   
/*  46:    */   public void setAmount(String amount)
/*  47:    */   {
/*  48:131 */     this.amount = amount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAmount()
/*  52:    */   {
/*  53:134 */     return this.amount;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setAuthNo(String authNo)
/*  57:    */   {
/*  58:138 */     this.authNo = authNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getAuthNo()
/*  62:    */   {
/*  63:141 */     return this.authNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setExtraParam(String extraParam)
/*  67:    */   {
/*  68:145 */     this.extraParam = extraParam;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getExtraParam()
/*  72:    */   {
/*  73:148 */     return this.extraParam;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setGmtCreate(Date gmtCreate)
/*  77:    */   {
/*  78:152 */     this.gmtCreate = gmtCreate;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public Date getGmtCreate()
/*  82:    */   {
/*  83:155 */     return this.gmtCreate;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setGmtTrans(Date gmtTrans)
/*  87:    */   {
/*  88:159 */     this.gmtTrans = gmtTrans;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public Date getGmtTrans()
/*  92:    */   {
/*  93:162 */     return this.gmtTrans;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setOperationId(String operationId)
/*  97:    */   {
/*  98:166 */     this.operationId = operationId;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getOperationId()
/* 102:    */   {
/* 103:169 */     return this.operationId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setOperationType(String operationType)
/* 107:    */   {
/* 108:173 */     this.operationType = operationType;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getOperationType()
/* 112:    */   {
/* 113:176 */     return this.operationType;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setOrderTitle(String orderTitle)
/* 117:    */   {
/* 118:180 */     this.orderTitle = orderTitle;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getOrderTitle()
/* 122:    */   {
/* 123:183 */     return this.orderTitle;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setOutOrderNo(String outOrderNo)
/* 127:    */   {
/* 128:187 */     this.outOrderNo = outOrderNo;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getOutOrderNo()
/* 132:    */   {
/* 133:190 */     return this.outOrderNo;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setOutRequestNo(String outRequestNo)
/* 137:    */   {
/* 138:194 */     this.outRequestNo = outRequestNo;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getOutRequestNo()
/* 142:    */   {
/* 143:197 */     return this.outRequestNo;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setPayerLogonId(String payerLogonId)
/* 147:    */   {
/* 148:201 */     this.payerLogonId = payerLogonId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getPayerLogonId()
/* 152:    */   {
/* 153:204 */     return this.payerLogonId;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setPayerUserId(String payerUserId)
/* 157:    */   {
/* 158:208 */     this.payerUserId = payerUserId;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getPayerUserId()
/* 162:    */   {
/* 163:211 */     return this.payerUserId;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setRemark(String remark)
/* 167:    */   {
/* 168:215 */     this.remark = remark;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getRemark()
/* 172:    */   {
/* 173:218 */     return this.remark;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setRestAmount(String restAmount)
/* 177:    */   {
/* 178:222 */     this.restAmount = restAmount;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getRestAmount()
/* 182:    */   {
/* 183:225 */     return this.restAmount;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setStatus(String status)
/* 187:    */   {
/* 188:229 */     this.status = status;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getStatus()
/* 192:    */   {
/* 193:232 */     return this.status;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setTotalFreezeAmount(String totalFreezeAmount)
/* 197:    */   {
/* 198:236 */     this.totalFreezeAmount = totalFreezeAmount;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String getTotalFreezeAmount()
/* 202:    */   {
/* 203:239 */     return this.totalFreezeAmount;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setTotalPayAmount(String totalPayAmount)
/* 207:    */   {
/* 208:243 */     this.totalPayAmount = totalPayAmount;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getTotalPayAmount()
/* 212:    */   {
/* 213:246 */     return this.totalPayAmount;
/* 214:    */   }
/* 215:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayFundAuthOperationDetailQueryResponse
 * JD-Core Version:    0.7.0.1
 */