/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayFundTransToaccountTransferModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8567218842255393474L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("ext_param")
/*  13:    */   private String extParam;
/*  14:    */   @ApiField("out_biz_no")
/*  15:    */   private String outBizNo;
/*  16:    */   @ApiField("payee_account")
/*  17:    */   private String payeeAccount;
/*  18:    */   @ApiField("payee_real_name")
/*  19:    */   private String payeeRealName;
/*  20:    */   @ApiField("payee_type")
/*  21:    */   private String payeeType;
/*  22:    */   @ApiField("payer_real_name")
/*  23:    */   private String payerRealName;
/*  24:    */   @ApiField("payer_show_name")
/*  25:    */   private String payerShowName;
/*  26:    */   @ApiField("remark")
/*  27:    */   private String remark;
/*  28:    */   
/*  29:    */   public String getAmount()
/*  30:    */   {
/*  31: 81 */     return this.amount;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setAmount(String amount)
/*  35:    */   {
/*  36: 84 */     this.amount = amount;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getExtParam()
/*  40:    */   {
/*  41: 88 */     return this.extParam;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setExtParam(String extParam)
/*  45:    */   {
/*  46: 91 */     this.extParam = extParam;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getOutBizNo()
/*  50:    */   {
/*  51: 95 */     return this.outBizNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setOutBizNo(String outBizNo)
/*  55:    */   {
/*  56: 98 */     this.outBizNo = outBizNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getPayeeAccount()
/*  60:    */   {
/*  61:102 */     return this.payeeAccount;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setPayeeAccount(String payeeAccount)
/*  65:    */   {
/*  66:105 */     this.payeeAccount = payeeAccount;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getPayeeRealName()
/*  70:    */   {
/*  71:109 */     return this.payeeRealName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setPayeeRealName(String payeeRealName)
/*  75:    */   {
/*  76:112 */     this.payeeRealName = payeeRealName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getPayeeType()
/*  80:    */   {
/*  81:116 */     return this.payeeType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setPayeeType(String payeeType)
/*  85:    */   {
/*  86:119 */     this.payeeType = payeeType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getPayerRealName()
/*  90:    */   {
/*  91:123 */     return this.payerRealName;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setPayerRealName(String payerRealName)
/*  95:    */   {
/*  96:126 */     this.payerRealName = payerRealName;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getPayerShowName()
/* 100:    */   {
/* 101:130 */     return this.payerShowName;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setPayerShowName(String payerShowName)
/* 105:    */   {
/* 106:133 */     this.payerShowName = payerShowName;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getRemark()
/* 110:    */   {
/* 111:137 */     return this.remark;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setRemark(String remark)
/* 115:    */   {
/* 116:140 */     this.remark = remark;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransToaccountTransferModel
 * JD-Core Version:    0.7.0.1
 */