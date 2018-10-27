/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankCreditLoantradeLoanarQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7389411195415787719L;
/* 10:   */   @ApiField("iproleid")
/* 11:   */   private String iproleid;
/* 12:   */   @ApiField("loanarno")
/* 13:   */   private String loanarno;
/* 14:   */   
/* 15:   */   public String getIproleid()
/* 16:   */   {
/* 17:29 */     return this.iproleid;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setIproleid(String iproleid)
/* 21:   */   {
/* 22:32 */     this.iproleid = iproleid;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getLoanarno()
/* 26:   */   {
/* 27:36 */     return this.loanarno;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setLoanarno(String loanarno)
/* 31:   */   {
/* 32:39 */     this.loanarno = loanarno;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MybankCreditLoantradeLoanarQueryModel
 * JD-Core Version:    0.7.0.1
 */