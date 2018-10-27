/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class InvoiceTitleModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5146254317893216274L;
/*  10:    */   @ApiField("is_default")
/*  11:    */   private Boolean isDefault;
/*  12:    */   @ApiField("open_bank_account")
/*  13:    */   private String openBankAccount;
/*  14:    */   @ApiField("open_bank_name")
/*  15:    */   private String openBankName;
/*  16:    */   @ApiField("tax_register_no")
/*  17:    */   private String taxRegisterNo;
/*  18:    */   @ApiField("title_name")
/*  19:    */   private String titleName;
/*  20:    */   @ApiField("title_type")
/*  21:    */   private String titleType;
/*  22:    */   @ApiField("user_address")
/*  23:    */   private String userAddress;
/*  24:    */   @ApiField("user_email")
/*  25:    */   private String userEmail;
/*  26:    */   @ApiField("user_id")
/*  27:    */   private String userId;
/*  28:    */   @ApiField("user_mobile")
/*  29:    */   private String userMobile;
/*  30:    */   
/*  31:    */   public Boolean getIsDefault()
/*  32:    */   {
/*  33: 83 */     return this.isDefault;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setIsDefault(Boolean isDefault)
/*  37:    */   {
/*  38: 86 */     this.isDefault = isDefault;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getOpenBankAccount()
/*  42:    */   {
/*  43: 90 */     return this.openBankAccount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setOpenBankAccount(String openBankAccount)
/*  47:    */   {
/*  48: 93 */     this.openBankAccount = openBankAccount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getOpenBankName()
/*  52:    */   {
/*  53: 97 */     return this.openBankName;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setOpenBankName(String openBankName)
/*  57:    */   {
/*  58:100 */     this.openBankName = openBankName;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getTaxRegisterNo()
/*  62:    */   {
/*  63:104 */     return this.taxRegisterNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setTaxRegisterNo(String taxRegisterNo)
/*  67:    */   {
/*  68:107 */     this.taxRegisterNo = taxRegisterNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getTitleName()
/*  72:    */   {
/*  73:111 */     return this.titleName;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setTitleName(String titleName)
/*  77:    */   {
/*  78:114 */     this.titleName = titleName;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getTitleType()
/*  82:    */   {
/*  83:118 */     return this.titleType;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setTitleType(String titleType)
/*  87:    */   {
/*  88:121 */     this.titleType = titleType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getUserAddress()
/*  92:    */   {
/*  93:125 */     return this.userAddress;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setUserAddress(String userAddress)
/*  97:    */   {
/*  98:128 */     this.userAddress = userAddress;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getUserEmail()
/* 102:    */   {
/* 103:132 */     return this.userEmail;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setUserEmail(String userEmail)
/* 107:    */   {
/* 108:135 */     this.userEmail = userEmail;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getUserId()
/* 112:    */   {
/* 113:139 */     return this.userId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setUserId(String userId)
/* 117:    */   {
/* 118:142 */     this.userId = userId;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getUserMobile()
/* 122:    */   {
/* 123:146 */     return this.userMobile;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setUserMobile(String userMobile)
/* 127:    */   {
/* 128:149 */     this.userMobile = userMobile;
/* 129:    */   }
/* 130:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.InvoiceTitleModel

 * JD-Core Version:    0.7.0.1

 */