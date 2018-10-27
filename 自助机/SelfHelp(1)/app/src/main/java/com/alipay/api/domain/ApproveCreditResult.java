/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;

/*   8:    */
/*   9:    */ public class ApproveCreditResult
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 2428238314363553453L;
/*  13:    */   @ApiListField("charge_info_list")
/*  14:    */   @ApiField("loan_charge_info")
/*  15:    */   private List<LoanChargeInfo> chargeInfoList;
/*  16:    */   @ApiField("credit_amt")
/*  17:    */   private String creditAmt;
/*  18:    */   @ApiField("credit_no")
/*  19:    */   private String creditNo;
/*  20:    */   @ApiField("credit_term")
/*  21:    */   private String creditTerm;
/*  22:    */   @ApiField("expire_date")
/*  23:    */   private Date expireDate;
/*  24:    */   @ApiListField("instal_int_rate")
/*  25:    */   @ApiField("installment_meta_info")
/*  26:    */   private List<InstallmentMetaInfo> instalIntRate;
/*  27:    */   @ApiField("loan_term")
/*  28:    */   private String loanTerm;
/*  29:    */   @ApiListField("repay_modes")
/*  30:    */   @ApiField("installment_meta_info")
/*  31:    */   private List<InstallmentMetaInfo> repayModes;
/*  32:    */   @ApiField("start_date")
/*  33:    */   private Date startDate;
/*  34:    */   @ApiField("status")
/*  35:    */   private String status;
/*  36:    */   
/*  37:    */   public List<LoanChargeInfo> getChargeInfoList()
/*  38:    */   {
/*  39: 84 */     return this.chargeInfoList;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setChargeInfoList(List<LoanChargeInfo> chargeInfoList)
/*  43:    */   {
/*  44: 87 */     this.chargeInfoList = chargeInfoList;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getCreditAmt()
/*  48:    */   {
/*  49: 91 */     return this.creditAmt;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setCreditAmt(String creditAmt)
/*  53:    */   {
/*  54: 94 */     this.creditAmt = creditAmt;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getCreditNo()
/*  58:    */   {
/*  59: 98 */     return this.creditNo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCreditNo(String creditNo)
/*  63:    */   {
/*  64:101 */     this.creditNo = creditNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCreditTerm()
/*  68:    */   {
/*  69:105 */     return this.creditTerm;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCreditTerm(String creditTerm)
/*  73:    */   {
/*  74:108 */     this.creditTerm = creditTerm;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public Date getExpireDate()
/*  78:    */   {
/*  79:112 */     return this.expireDate;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setExpireDate(Date expireDate)
/*  83:    */   {
/*  84:115 */     this.expireDate = expireDate;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public List<InstallmentMetaInfo> getInstalIntRate()
/*  88:    */   {
/*  89:119 */     return this.instalIntRate;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setInstalIntRate(List<InstallmentMetaInfo> instalIntRate)
/*  93:    */   {
/*  94:122 */     this.instalIntRate = instalIntRate;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getLoanTerm()
/*  98:    */   {
/*  99:126 */     return this.loanTerm;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setLoanTerm(String loanTerm)
/* 103:    */   {
/* 104:129 */     this.loanTerm = loanTerm;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public List<InstallmentMetaInfo> getRepayModes()
/* 108:    */   {
/* 109:133 */     return this.repayModes;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setRepayModes(List<InstallmentMetaInfo> repayModes)
/* 113:    */   {
/* 114:136 */     this.repayModes = repayModes;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Date getStartDate()
/* 118:    */   {
/* 119:140 */     return this.startDate;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setStartDate(Date startDate)
/* 123:    */   {
/* 124:143 */     this.startDate = startDate;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getStatus()
/* 128:    */   {
/* 129:147 */     return this.status;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setStatus(String status)
/* 133:    */   {
/* 134:150 */     this.status = status;
/* 135:    */   }
/* 136:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ApproveCreditResult

 * JD-Core Version:    0.7.0.1

 */