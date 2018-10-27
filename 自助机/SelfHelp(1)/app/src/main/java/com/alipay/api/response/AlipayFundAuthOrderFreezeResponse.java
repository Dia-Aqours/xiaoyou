/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayFundAuthOrderFreezeResponse
/*   8:    */   extends AlipayResponse
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 8869265482424816852L;
/*  11:    */   @ApiField("amount")
/*  12:    */   private String amount;
/*  13:    */   @ApiField("auth_no")
/*  14:    */   private String authNo;
/*  15:    */   @ApiField("gmt_trans")
/*  16:    */   private Date gmtTrans;
/*  17:    */   @ApiField("operation_id")
/*  18:    */   private String operationId;
/*  19:    */   @ApiField("out_order_no")
/*  20:    */   private String outOrderNo;
/*  21:    */   @ApiField("out_request_no")
/*  22:    */   private String outRequestNo;
/*  23:    */   @ApiField("payer_logon_id")
/*  24:    */   private String payerLogonId;
/*  25:    */   @ApiField("payer_user_id")
/*  26:    */   private String payerUserId;
/*  27:    */   @ApiField("status")
/*  28:    */   private String status;
/*  29:    */   
/*  30:    */   public void setAmount(String amount)
/*  31:    */   {
/*  32: 77 */     this.amount = amount;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getAmount()
/*  36:    */   {
/*  37: 80 */     return this.amount;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAuthNo(String authNo)
/*  41:    */   {
/*  42: 84 */     this.authNo = authNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getAuthNo()
/*  46:    */   {
/*  47: 87 */     return this.authNo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setGmtTrans(Date gmtTrans)
/*  51:    */   {
/*  52: 91 */     this.gmtTrans = gmtTrans;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public Date getGmtTrans()
/*  56:    */   {
/*  57: 94 */     return this.gmtTrans;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOperationId(String operationId)
/*  61:    */   {
/*  62: 98 */     this.operationId = operationId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOperationId()
/*  66:    */   {
/*  67:101 */     return this.operationId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutOrderNo(String outOrderNo)
/*  71:    */   {
/*  72:105 */     this.outOrderNo = outOrderNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getOutOrderNo()
/*  76:    */   {
/*  77:108 */     return this.outOrderNo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setOutRequestNo(String outRequestNo)
/*  81:    */   {
/*  82:112 */     this.outRequestNo = outRequestNo;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getOutRequestNo()
/*  86:    */   {
/*  87:115 */     return this.outRequestNo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setPayerLogonId(String payerLogonId)
/*  91:    */   {
/*  92:119 */     this.payerLogonId = payerLogonId;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getPayerLogonId()
/*  96:    */   {
/*  97:122 */     return this.payerLogonId;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setPayerUserId(String payerUserId)
/* 101:    */   {
/* 102:126 */     this.payerUserId = payerUserId;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getPayerUserId()
/* 106:    */   {
/* 107:129 */     return this.payerUserId;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setStatus(String status)
/* 111:    */   {
/* 112:133 */     this.status = status;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getStatus()
/* 116:    */   {
/* 117:136 */     return this.status;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayFundAuthOrderFreezeResponse
 * JD-Core Version:    0.7.0.1
 */