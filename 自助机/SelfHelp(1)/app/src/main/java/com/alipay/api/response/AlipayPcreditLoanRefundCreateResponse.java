/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayPcreditLoanRefundCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3665881491512957588L;
/* 10:   */   @ApiField("loan_repay_no")
/* 11:   */   private String loanRepayNo;
/* 12:   */   
/* 13:   */   public void setLoanRepayNo(String loanRepayNo)
/* 14:   */   {
/* 15:24 */     this.loanRepayNo = loanRepayNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getLoanRepayNo()
/* 19:   */   {
/* 20:27 */     return this.loanRepayNo;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayPcreditLoanRefundCreateResponse

 * JD-Core Version:    0.7.0.1

 */