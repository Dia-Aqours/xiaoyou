/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class PointAccountLog
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4482474253395526925L;
/*  11:    */   @ApiField("account_log_id")
/*  12:    */   private String accountLogId;
/*  13:    */   @ApiField("balance")
/*  14:    */   private Long balance;
/*  15:    */   @ApiField("order_no")
/*  16:    */   private String orderNo;
/*  17:    */   @ApiField("out_biz_no")
/*  18:    */   private String outBizNo;
/*  19:    */   @ApiField("point_amount")
/*  20:    */   private Long pointAmount;
/*  21:    */   @ApiField("sub_trans_code")
/*  22:    */   private String subTransCode;
/*  23:    */   @ApiField("sub_trans_code_cn")
/*  24:    */   private String subTransCodeCn;
/*  25:    */   @ApiField("trans_code")
/*  26:    */   private String transCode;
/*  27:    */   @ApiField("trans_date")
/*  28:    */   private Date transDate;
/*  29:    */   @ApiField("trans_memo")
/*  30:    */   private String transMemo;
/*  31:    */   
/*  32:    */   public String getAccountLogId()
/*  33:    */   {
/*  34: 79 */     return this.accountLogId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setAccountLogId(String accountLogId)
/*  38:    */   {
/*  39: 82 */     this.accountLogId = accountLogId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public Long getBalance()
/*  43:    */   {
/*  44: 86 */     return this.balance;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBalance(Long balance)
/*  48:    */   {
/*  49: 89 */     this.balance = balance;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getOrderNo()
/*  53:    */   {
/*  54: 93 */     return this.orderNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setOrderNo(String orderNo)
/*  58:    */   {
/*  59: 96 */     this.orderNo = orderNo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getOutBizNo()
/*  63:    */   {
/*  64:100 */     return this.outBizNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setOutBizNo(String outBizNo)
/*  68:    */   {
/*  69:103 */     this.outBizNo = outBizNo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public Long getPointAmount()
/*  73:    */   {
/*  74:107 */     return this.pointAmount;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setPointAmount(Long pointAmount)
/*  78:    */   {
/*  79:110 */     this.pointAmount = pointAmount;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getSubTransCode()
/*  83:    */   {
/*  84:114 */     return this.subTransCode;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setSubTransCode(String subTransCode)
/*  88:    */   {
/*  89:117 */     this.subTransCode = subTransCode;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getSubTransCodeCn()
/*  93:    */   {
/*  94:121 */     return this.subTransCodeCn;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setSubTransCodeCn(String subTransCodeCn)
/*  98:    */   {
/*  99:124 */     this.subTransCodeCn = subTransCodeCn;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTransCode()
/* 103:    */   {
/* 104:128 */     return this.transCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setTransCode(String transCode)
/* 108:    */   {
/* 109:131 */     this.transCode = transCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public Date getTransDate()
/* 113:    */   {
/* 114:135 */     return this.transDate;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setTransDate(Date transDate)
/* 118:    */   {
/* 119:138 */     this.transDate = transDate;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getTransMemo()
/* 123:    */   {
/* 124:142 */     return this.transMemo;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setTransMemo(String transMemo)
/* 128:    */   {
/* 129:145 */     this.transMemo = transMemo;
/* 130:    */   }
/* 131:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PointAccountLog
 * JD-Core Version:    0.7.0.1
 */