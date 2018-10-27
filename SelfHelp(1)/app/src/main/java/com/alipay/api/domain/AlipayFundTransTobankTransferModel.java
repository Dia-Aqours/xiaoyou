/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayFundTransTobankTransferModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2757272431655476844L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("memo")
/*  13:    */   private String memo;
/*  14:    */   @ApiField("out_biz_no")
/*  15:    */   private String outBizNo;
/*  16:    */   @ApiField("payee_account_name")
/*  17:    */   private String payeeAccountName;
/*  18:    */   @ApiField("payee_account_type")
/*  19:    */   private String payeeAccountType;
/*  20:    */   @ApiField("payee_bank_code")
/*  21:    */   private String payeeBankCode;
/*  22:    */   @ApiField("payee_card_no")
/*  23:    */   private String payeeCardNo;
/*  24:    */   @ApiField("payee_inst_branch_name")
/*  25:    */   private String payeeInstBranchName;
/*  26:    */   @ApiField("payee_inst_city")
/*  27:    */   private String payeeInstCity;
/*  28:    */   @ApiField("payee_inst_name")
/*  29:    */   private String payeeInstName;
/*  30:    */   @ApiField("payee_inst_province")
/*  31:    */   private String payeeInstProvince;
/*  32:    */   @ApiField("payer_real_name")
/*  33:    */   private String payerRealName;
/*  34:    */   @ApiField("remark")
/*  35:    */   private String remark;
/*  36:    */   @ApiField("time_liness")
/*  37:    */   private String timeLiness;
/*  38:    */   
/*  39:    */   public String getAmount()
/*  40:    */   {
/*  41:123 */     return this.amount;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setAmount(String amount)
/*  45:    */   {
/*  46:126 */     this.amount = amount;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getMemo()
/*  50:    */   {
/*  51:130 */     return this.memo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setMemo(String memo)
/*  55:    */   {
/*  56:133 */     this.memo = memo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getOutBizNo()
/*  60:    */   {
/*  61:137 */     return this.outBizNo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setOutBizNo(String outBizNo)
/*  65:    */   {
/*  66:140 */     this.outBizNo = outBizNo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getPayeeAccountName()
/*  70:    */   {
/*  71:144 */     return this.payeeAccountName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setPayeeAccountName(String payeeAccountName)
/*  75:    */   {
/*  76:147 */     this.payeeAccountName = payeeAccountName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getPayeeAccountType()
/*  80:    */   {
/*  81:151 */     return this.payeeAccountType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setPayeeAccountType(String payeeAccountType)
/*  85:    */   {
/*  86:154 */     this.payeeAccountType = payeeAccountType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getPayeeBankCode()
/*  90:    */   {
/*  91:158 */     return this.payeeBankCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setPayeeBankCode(String payeeBankCode)
/*  95:    */   {
/*  96:161 */     this.payeeBankCode = payeeBankCode;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getPayeeCardNo()
/* 100:    */   {
/* 101:165 */     return this.payeeCardNo;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setPayeeCardNo(String payeeCardNo)
/* 105:    */   {
/* 106:168 */     this.payeeCardNo = payeeCardNo;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getPayeeInstBranchName()
/* 110:    */   {
/* 111:172 */     return this.payeeInstBranchName;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setPayeeInstBranchName(String payeeInstBranchName)
/* 115:    */   {
/* 116:175 */     this.payeeInstBranchName = payeeInstBranchName;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getPayeeInstCity()
/* 120:    */   {
/* 121:179 */     return this.payeeInstCity;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setPayeeInstCity(String payeeInstCity)
/* 125:    */   {
/* 126:182 */     this.payeeInstCity = payeeInstCity;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getPayeeInstName()
/* 130:    */   {
/* 131:186 */     return this.payeeInstName;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setPayeeInstName(String payeeInstName)
/* 135:    */   {
/* 136:189 */     this.payeeInstName = payeeInstName;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getPayeeInstProvince()
/* 140:    */   {
/* 141:193 */     return this.payeeInstProvince;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setPayeeInstProvince(String payeeInstProvince)
/* 145:    */   {
/* 146:196 */     this.payeeInstProvince = payeeInstProvince;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getPayerRealName()
/* 150:    */   {
/* 151:200 */     return this.payerRealName;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setPayerRealName(String payerRealName)
/* 155:    */   {
/* 156:203 */     this.payerRealName = payerRealName;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getRemark()
/* 160:    */   {
/* 161:207 */     return this.remark;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setRemark(String remark)
/* 165:    */   {
/* 166:210 */     this.remark = remark;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getTimeLiness()
/* 170:    */   {
/* 171:214 */     return this.timeLiness;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setTimeLiness(String timeLiness)
/* 175:    */   {
/* 176:217 */     this.timeLiness = timeLiness;
/* 177:    */   }
/* 178:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayFundTransTobankTransferModel

 * JD-Core Version:    0.7.0.1

 */