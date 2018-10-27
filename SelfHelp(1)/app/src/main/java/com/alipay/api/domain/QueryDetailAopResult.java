/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class QueryDetailAopResult
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5499213281299835866L;
/*  11:    */   @ApiField("batch_no")
/*  12:    */   private String batchNo;
/*  13:    */   @ApiField("detail_no")
/*  14:    */   private String detailNo;
/*  15:    */   @ApiField("ext_param")
/*  16:    */   private String extParam;
/*  17:    */   @ApiField("fail_message")
/*  18:    */   private String failMessage;
/*  19:    */   @ApiField("last_modified")
/*  20:    */   private Date lastModified;
/*  21:    */   @ApiField("order_no")
/*  22:    */   private String orderNo;
/*  23:    */   @ApiField("pay_amount")
/*  24:    */   private String payAmount;
/*  25:    */   @ApiField("payee_id")
/*  26:    */   private String payeeId;
/*  27:    */   @ApiField("payer_id")
/*  28:    */   private String payerId;
/*  29:    */   @ApiField("service_charge")
/*  30:    */   private String serviceCharge;
/*  31:    */   @ApiField("status")
/*  32:    */   private String status;
/*  33:    */   
/*  34:    */   public String getBatchNo()
/*  35:    */   {
/*  36: 85 */     return this.batchNo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setBatchNo(String batchNo)
/*  40:    */   {
/*  41: 88 */     this.batchNo = batchNo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getDetailNo()
/*  45:    */   {
/*  46: 92 */     return this.detailNo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setDetailNo(String detailNo)
/*  50:    */   {
/*  51: 95 */     this.detailNo = detailNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getExtParam()
/*  55:    */   {
/*  56: 99 */     return this.extParam;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setExtParam(String extParam)
/*  60:    */   {
/*  61:102 */     this.extParam = extParam;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getFailMessage()
/*  65:    */   {
/*  66:106 */     return this.failMessage;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setFailMessage(String failMessage)
/*  70:    */   {
/*  71:109 */     this.failMessage = failMessage;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public Date getLastModified()
/*  75:    */   {
/*  76:113 */     return this.lastModified;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setLastModified(Date lastModified)
/*  80:    */   {
/*  81:116 */     this.lastModified = lastModified;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getOrderNo()
/*  85:    */   {
/*  86:120 */     return this.orderNo;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setOrderNo(String orderNo)
/*  90:    */   {
/*  91:123 */     this.orderNo = orderNo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getPayAmount()
/*  95:    */   {
/*  96:127 */     return this.payAmount;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setPayAmount(String payAmount)
/* 100:    */   {
/* 101:130 */     this.payAmount = payAmount;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getPayeeId()
/* 105:    */   {
/* 106:134 */     return this.payeeId;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setPayeeId(String payeeId)
/* 110:    */   {
/* 111:137 */     this.payeeId = payeeId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getPayerId()
/* 115:    */   {
/* 116:141 */     return this.payerId;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setPayerId(String payerId)
/* 120:    */   {
/* 121:144 */     this.payerId = payerId;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getServiceCharge()
/* 125:    */   {
/* 126:148 */     return this.serviceCharge;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setServiceCharge(String serviceCharge)
/* 130:    */   {
/* 131:151 */     this.serviceCharge = serviceCharge;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getStatus()
/* 135:    */   {
/* 136:155 */     return this.status;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setStatus(String status)
/* 140:    */   {
/* 141:158 */     this.status = status;
/* 142:    */   }
/* 143:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.QueryDetailAopResult

 * JD-Core Version:    0.7.0.1

 */