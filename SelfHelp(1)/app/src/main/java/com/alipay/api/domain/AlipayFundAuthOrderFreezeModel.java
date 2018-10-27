/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayFundAuthOrderFreezeModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1266176358466422874L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("auth_code")
/*  13:    */   private String authCode;
/*  14:    */   @ApiField("auth_code_type")
/*  15:    */   private String authCodeType;
/*  16:    */   @ApiField("extra_param")
/*  17:    */   private String extraParam;
/*  18:    */   @ApiField("order_title")
/*  19:    */   private String orderTitle;
/*  20:    */   @ApiField("out_order_no")
/*  21:    */   private String outOrderNo;
/*  22:    */   @ApiField("out_request_no")
/*  23:    */   private String outRequestNo;
/*  24:    */   @ApiField("pay_timeout")
/*  25:    */   private String payTimeout;
/*  26:    */   @ApiField("payee_logon_id")
/*  27:    */   private String payeeLogonId;
/*  28:    */   @ApiField("payee_user_id")
/*  29:    */   private String payeeUserId;
/*  30:    */   
/*  31:    */   public String getAmount()
/*  32:    */   {
/*  33: 82 */     return this.amount;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAmount(String amount)
/*  37:    */   {
/*  38: 85 */     this.amount = amount;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAuthCode()
/*  42:    */   {
/*  43: 89 */     return this.authCode;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAuthCode(String authCode)
/*  47:    */   {
/*  48: 92 */     this.authCode = authCode;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAuthCodeType()
/*  52:    */   {
/*  53: 96 */     return this.authCodeType;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setAuthCodeType(String authCodeType)
/*  57:    */   {
/*  58: 99 */     this.authCodeType = authCodeType;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getExtraParam()
/*  62:    */   {
/*  63:103 */     return this.extraParam;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setExtraParam(String extraParam)
/*  67:    */   {
/*  68:106 */     this.extraParam = extraParam;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getOrderTitle()
/*  72:    */   {
/*  73:110 */     return this.orderTitle;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setOrderTitle(String orderTitle)
/*  77:    */   {
/*  78:113 */     this.orderTitle = orderTitle;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getOutOrderNo()
/*  82:    */   {
/*  83:117 */     return this.outOrderNo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setOutOrderNo(String outOrderNo)
/*  87:    */   {
/*  88:120 */     this.outOrderNo = outOrderNo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getOutRequestNo()
/*  92:    */   {
/*  93:124 */     return this.outRequestNo;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setOutRequestNo(String outRequestNo)
/*  97:    */   {
/*  98:127 */     this.outRequestNo = outRequestNo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getPayTimeout()
/* 102:    */   {
/* 103:131 */     return this.payTimeout;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setPayTimeout(String payTimeout)
/* 107:    */   {
/* 108:134 */     this.payTimeout = payTimeout;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getPayeeLogonId()
/* 112:    */   {
/* 113:138 */     return this.payeeLogonId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setPayeeLogonId(String payeeLogonId)
/* 117:    */   {
/* 118:141 */     this.payeeLogonId = payeeLogonId;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getPayeeUserId()
/* 122:    */   {
/* 123:145 */     return this.payeeUserId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setPayeeUserId(String payeeUserId)
/* 127:    */   {
/* 128:148 */     this.payeeUserId = payeeUserId;
/* 129:    */   }
/* 130:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayFundAuthOrderFreezeModel

 * JD-Core Version:    0.7.0.1

 */