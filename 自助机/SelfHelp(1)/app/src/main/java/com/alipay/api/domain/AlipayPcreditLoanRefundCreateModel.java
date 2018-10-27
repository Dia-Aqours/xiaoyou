/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPcreditLoanRefundCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5577184716396273741L;
/* 10:   */   @ApiField("loan_apply_no")
/* 11:   */   private String loanApplyNo;
/* 12:   */   @ApiField("out_biz_no")
/* 13:   */   private String outBizNo;
/* 14:   */   @ApiField("repay_amt")
/* 15:   */   private String repayAmt;
/* 16:   */   @ApiField("req_id")
/* 17:   */   private String reqId;
/* 18:   */   
/* 19:   */   public String getLoanApplyNo()
/* 20:   */   {
/* 21:41 */     return this.loanApplyNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setLoanApplyNo(String loanApplyNo)
/* 25:   */   {
/* 26:44 */     this.loanApplyNo = loanApplyNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOutBizNo()
/* 30:   */   {
/* 31:48 */     return this.outBizNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOutBizNo(String outBizNo)
/* 35:   */   {
/* 36:51 */     this.outBizNo = outBizNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getRepayAmt()
/* 40:   */   {
/* 41:55 */     return this.repayAmt;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setRepayAmt(String repayAmt)
/* 45:   */   {
/* 46:58 */     this.repayAmt = repayAmt;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getReqId()
/* 50:   */   {
/* 51:62 */     return this.reqId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setReqId(String reqId)
/* 55:   */   {
/* 56:65 */     this.reqId = reqId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayPcreditLoanRefundCreateModel
 * JD-Core Version:    0.7.0.1
 */