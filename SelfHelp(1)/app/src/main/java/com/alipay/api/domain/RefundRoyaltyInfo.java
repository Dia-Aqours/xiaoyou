/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RefundRoyaltyInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2527371388245129634L;
/* 10:   */   @ApiField("memo")
/* 11:   */   private String memo;
/* 12:   */   @ApiField("refund_amount")
/* 13:   */   private String refundAmount;
/* 14:   */   @ApiField("trans_in")
/* 15:   */   private String transIn;
/* 16:   */   @ApiField("trans_in_email")
/* 17:   */   private String transInEmail;
/* 18:   */   @ApiField("trans_out")
/* 19:   */   private String transOut;
/* 20:   */   @ApiField("trans_out_email")
/* 21:   */   private String transOutEmail;
/* 22:   */   
/* 23:   */   public String getMemo()
/* 24:   */   {
/* 25:57 */     return this.memo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setMemo(String memo)
/* 29:   */   {
/* 30:60 */     this.memo = memo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getRefundAmount()
/* 34:   */   {
/* 35:64 */     return this.refundAmount;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setRefundAmount(String refundAmount)
/* 39:   */   {
/* 40:67 */     this.refundAmount = refundAmount;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getTransIn()
/* 44:   */   {
/* 45:71 */     return this.transIn;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setTransIn(String transIn)
/* 49:   */   {
/* 50:74 */     this.transIn = transIn;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getTransInEmail()
/* 54:   */   {
/* 55:78 */     return this.transInEmail;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setTransInEmail(String transInEmail)
/* 59:   */   {
/* 60:81 */     this.transInEmail = transInEmail;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getTransOut()
/* 64:   */   {
/* 65:85 */     return this.transOut;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setTransOut(String transOut)
/* 69:   */   {
/* 70:88 */     this.transOut = transOut;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getTransOutEmail()
/* 74:   */   {
/* 75:92 */     return this.transOutEmail;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setTransOutEmail(String transOutEmail)
/* 79:   */   {
/* 80:95 */     this.transOutEmail = transOutEmail;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RefundRoyaltyInfo
 * JD-Core Version:    0.7.0.1
 */