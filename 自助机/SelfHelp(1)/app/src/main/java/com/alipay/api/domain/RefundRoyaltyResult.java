/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RefundRoyaltyResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7434379167965956396L;
/* 10:   */   @ApiField("refund_amount")
/* 11:   */   private String refundAmount;
/* 12:   */   @ApiField("result_code")
/* 13:   */   private String resultCode;
/* 14:   */   @ApiField("trans_in")
/* 15:   */   private String transIn;
/* 16:   */   @ApiField("trans_in_email")
/* 17:   */   private String transInEmail;
/* 18:   */   @ApiField("trans_out")
/* 19:   */   private String transOut;
/* 20:   */   @ApiField("trans_out_email")
/* 21:   */   private String transOutEmail;
/* 22:   */   
/* 23:   */   public String getRefundAmount()
/* 24:   */   {
/* 25:53 */     return this.refundAmount;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setRefundAmount(String refundAmount)
/* 29:   */   {
/* 30:56 */     this.refundAmount = refundAmount;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getResultCode()
/* 34:   */   {
/* 35:60 */     return this.resultCode;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setResultCode(String resultCode)
/* 39:   */   {
/* 40:63 */     this.resultCode = resultCode;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getTransIn()
/* 44:   */   {
/* 45:67 */     return this.transIn;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setTransIn(String transIn)
/* 49:   */   {
/* 50:70 */     this.transIn = transIn;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getTransInEmail()
/* 54:   */   {
/* 55:74 */     return this.transInEmail;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setTransInEmail(String transInEmail)
/* 59:   */   {
/* 60:77 */     this.transInEmail = transInEmail;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getTransOut()
/* 64:   */   {
/* 65:81 */     return this.transOut;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setTransOut(String transOut)
/* 69:   */   {
/* 70:84 */     this.transOut = transOut;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getTransOutEmail()
/* 74:   */   {
/* 75:88 */     return this.transOutEmail;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setTransOutEmail(String transOutEmail)
/* 79:   */   {
/* 80:91 */     this.transOutEmail = transOutEmail;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RefundRoyaltyResult
 * JD-Core Version:    0.7.0.1
 */