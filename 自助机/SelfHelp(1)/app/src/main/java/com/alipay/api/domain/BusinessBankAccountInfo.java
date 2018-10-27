/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class BusinessBankAccountInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2812973193315376265L;
/* 10:   */   @ApiField("business_bank_account_name")
/* 11:   */   private String businessBankAccountName;
/* 12:   */   @ApiField("business_bank_card_no")
/* 13:   */   private String businessBankCardNo;
/* 14:   */   @ApiField("business_bank_name")
/* 15:   */   private String businessBankName;
/* 16:   */   @ApiField("business_bank_sub")
/* 17:   */   private String businessBankSub;
/* 18:   */   
/* 19:   */   public String getBusinessBankAccountName()
/* 20:   */   {
/* 21:41 */     return this.businessBankAccountName;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBusinessBankAccountName(String businessBankAccountName)
/* 25:   */   {
/* 26:44 */     this.businessBankAccountName = businessBankAccountName;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getBusinessBankCardNo()
/* 30:   */   {
/* 31:48 */     return this.businessBankCardNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setBusinessBankCardNo(String businessBankCardNo)
/* 35:   */   {
/* 36:51 */     this.businessBankCardNo = businessBankCardNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getBusinessBankName()
/* 40:   */   {
/* 41:55 */     return this.businessBankName;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setBusinessBankName(String businessBankName)
/* 45:   */   {
/* 46:58 */     this.businessBankName = businessBankName;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getBusinessBankSub()
/* 50:   */   {
/* 51:62 */     return this.businessBankSub;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setBusinessBankSub(String businessBankSub)
/* 55:   */   {
/* 56:65 */     this.businessBankSub = businessBankSub;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BusinessBankAccountInfo
 * JD-Core Version:    0.7.0.1
 */