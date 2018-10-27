/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class MybankCreditLoantradeLoanarRepayModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5789937887299413769L;
/* 10:   */   @ApiField("cust_iprole_id")
/* 11:   */   private String custIproleId;
/* 12:   */   @ApiField("date")
/* 13:   */   private String date;
/* 14:   */   @ApiField("loan_ar_no")
/* 15:   */   private String loanArNo;
/* 16:   */   @ApiField("prin_amt")
/* 17:   */   private String prinAmt;
/* 18:   */   @ApiField("request_id")
/* 19:   */   private String requestId;
/* 20:   */   
/* 21:   */   public String getCustIproleId()
/* 22:   */   {
/* 23:47 */     return this.custIproleId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCustIproleId(String custIproleId)
/* 27:   */   {
/* 28:50 */     this.custIproleId = custIproleId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getDate()
/* 32:   */   {
/* 33:54 */     return this.date;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setDate(String date)
/* 37:   */   {
/* 38:57 */     this.date = date;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getLoanArNo()
/* 42:   */   {
/* 43:61 */     return this.loanArNo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setLoanArNo(String loanArNo)
/* 47:   */   {
/* 48:64 */     this.loanArNo = loanArNo;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getPrinAmt()
/* 52:   */   {
/* 53:68 */     return this.prinAmt;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setPrinAmt(String prinAmt)
/* 57:   */   {
/* 58:71 */     this.prinAmt = prinAmt;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getRequestId()
/* 62:   */   {
/* 63:75 */     return this.requestId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setRequestId(String requestId)
/* 67:   */   {
/* 68:78 */     this.requestId = requestId;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.MybankCreditLoantradeLoanarRepayModel

 * JD-Core Version:    0.7.0.1

 */