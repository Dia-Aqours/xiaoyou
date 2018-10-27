/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KbAdvertSubjectResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6132975412321775565L;
/* 10:   */   @ApiField("commission_clause")
/* 11:   */   private KbAdvertCommissionClauseResponse commissionClause;
/* 12:   */   @ApiField("type")
/* 13:   */   private String type;
/* 14:   */   @ApiField("voucher")
/* 15:   */   private KbAdvertSubjectVoucherResponse voucher;
/* 16:   */   
/* 17:   */   public KbAdvertCommissionClauseResponse getCommissionClause()
/* 18:   */   {
/* 19:37 */     return this.commissionClause;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCommissionClause(KbAdvertCommissionClauseResponse commissionClause)
/* 23:   */   {
/* 24:40 */     this.commissionClause = commissionClause;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getType()
/* 28:   */   {
/* 29:44 */     return this.type;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setType(String type)
/* 33:   */   {
/* 34:47 */     this.type = type;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public KbAdvertSubjectVoucherResponse getVoucher()
/* 38:   */   {
/* 39:51 */     return this.voucher;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setVoucher(KbAdvertSubjectVoucherResponse voucher)
/* 43:   */   {
/* 44:54 */     this.voucher = voucher;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KbAdvertSubjectResponse

 * JD-Core Version:    0.7.0.1

 */