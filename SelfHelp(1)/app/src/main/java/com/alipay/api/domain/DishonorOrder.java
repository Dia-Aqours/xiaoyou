/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class DishonorOrder
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6853629617595554139L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("dishonor_date")
/*  13:    */   private String dishonorDate;
/*  14:    */   @ApiField("fail_reason")
/*  15:    */   private String failReason;
/*  16:    */   @ApiField("order_id")
/*  17:    */   private String orderId;
/*  18:    */   @ApiField("out_biz_no")
/*  19:    */   private String outBizNo;
/*  20:    */   @ApiField("pay_date")
/*  21:    */   private String payDate;
/*  22:    */   @ApiField("payer_account")
/*  23:    */   private String payerAccount;
/*  24:    */   @ApiField("payment_no")
/*  25:    */   private String paymentNo;
/*  26:    */   
/*  27:    */   public String getAmount()
/*  28:    */   {
/*  29: 66 */     return this.amount;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setAmount(String amount)
/*  33:    */   {
/*  34: 69 */     this.amount = amount;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getDishonorDate()
/*  38:    */   {
/*  39: 73 */     return this.dishonorDate;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setDishonorDate(String dishonorDate)
/*  43:    */   {
/*  44: 76 */     this.dishonorDate = dishonorDate;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getFailReason()
/*  48:    */   {
/*  49: 80 */     return this.failReason;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setFailReason(String failReason)
/*  53:    */   {
/*  54: 83 */     this.failReason = failReason;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getOrderId()
/*  58:    */   {
/*  59: 87 */     return this.orderId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setOrderId(String orderId)
/*  63:    */   {
/*  64: 90 */     this.orderId = orderId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getOutBizNo()
/*  68:    */   {
/*  69: 94 */     return this.outBizNo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setOutBizNo(String outBizNo)
/*  73:    */   {
/*  74: 97 */     this.outBizNo = outBizNo;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getPayDate()
/*  78:    */   {
/*  79:101 */     return this.payDate;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setPayDate(String payDate)
/*  83:    */   {
/*  84:104 */     this.payDate = payDate;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getPayerAccount()
/*  88:    */   {
/*  89:108 */     return this.payerAccount;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setPayerAccount(String payerAccount)
/*  93:    */   {
/*  94:111 */     this.payerAccount = payerAccount;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getPaymentNo()
/*  98:    */   {
/*  99:115 */     return this.paymentNo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setPaymentNo(String paymentNo)
/* 103:    */   {
/* 104:118 */     this.paymentNo = paymentNo;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DishonorOrder
 * JD-Core Version:    0.7.0.1
 */