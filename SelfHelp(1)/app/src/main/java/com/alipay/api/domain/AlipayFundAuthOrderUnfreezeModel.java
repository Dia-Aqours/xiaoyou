/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayFundAuthOrderUnfreezeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4764786115667885335L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("auth_no")
/* 13:   */   private String authNo;
/* 14:   */   @ApiField("out_request_no")
/* 15:   */   private String outRequestNo;
/* 16:   */   @ApiField("remark")
/* 17:   */   private String remark;
/* 18:   */   
/* 19:   */   public String getAmount()
/* 20:   */   {
/* 21:41 */     return this.amount;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAmount(String amount)
/* 25:   */   {
/* 26:44 */     this.amount = amount;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getAuthNo()
/* 30:   */   {
/* 31:48 */     return this.authNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setAuthNo(String authNo)
/* 35:   */   {
/* 36:51 */     this.authNo = authNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getOutRequestNo()
/* 40:   */   {
/* 41:55 */     return this.outRequestNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setOutRequestNo(String outRequestNo)
/* 45:   */   {
/* 46:58 */     this.outRequestNo = outRequestNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getRemark()
/* 50:   */   {
/* 51:62 */     return this.remark;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setRemark(String remark)
/* 55:   */   {
/* 56:65 */     this.remark = remark;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayFundAuthOrderUnfreezeModel

 * JD-Core Version:    0.7.0.1

 */