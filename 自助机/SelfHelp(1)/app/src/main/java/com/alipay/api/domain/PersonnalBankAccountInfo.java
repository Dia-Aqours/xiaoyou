/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PersonnalBankAccountInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5271679348489796381L;
/* 10:   */   @ApiField("personal_bank_account_mobile")
/* 11:   */   private String personalBankAccountMobile;
/* 12:   */   @ApiField("personal_bank_card_no")
/* 13:   */   private String personalBankCardNo;
/* 14:   */   @ApiField("personal_bank_holder_certno")
/* 15:   */   private String personalBankHolderCertno;
/* 16:   */   @ApiField("personal_bank_holder_name")
/* 17:   */   private String personalBankHolderName;
/* 18:   */   
/* 19:   */   public String getPersonalBankAccountMobile()
/* 20:   */   {
/* 21:41 */     return this.personalBankAccountMobile;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setPersonalBankAccountMobile(String personalBankAccountMobile)
/* 25:   */   {
/* 26:44 */     this.personalBankAccountMobile = personalBankAccountMobile;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getPersonalBankCardNo()
/* 30:   */   {
/* 31:48 */     return this.personalBankCardNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setPersonalBankCardNo(String personalBankCardNo)
/* 35:   */   {
/* 36:51 */     this.personalBankCardNo = personalBankCardNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getPersonalBankHolderCertno()
/* 40:   */   {
/* 41:55 */     return this.personalBankHolderCertno;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setPersonalBankHolderCertno(String personalBankHolderCertno)
/* 45:   */   {
/* 46:58 */     this.personalBankHolderCertno = personalBankHolderCertno;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getPersonalBankHolderName()
/* 50:   */   {
/* 51:62 */     return this.personalBankHolderName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setPersonalBankHolderName(String personalBankHolderName)
/* 55:   */   {
/* 56:65 */     this.personalBankHolderName = personalBankHolderName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PersonnalBankAccountInfo
 * JD-Core Version:    0.7.0.1
 */