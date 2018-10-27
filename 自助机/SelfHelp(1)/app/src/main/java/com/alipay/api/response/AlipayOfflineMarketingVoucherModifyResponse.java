/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherModifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4558296438634279155L;
/* 10:   */   @ApiField("voucher_id")
/* 11:   */   private String voucherId;
/* 12:   */   @ApiField("voucher_status")
/* 13:   */   private String voucherStatus;
/* 14:   */   
/* 15:   */   public void setVoucherId(String voucherId)
/* 16:   */   {
/* 17:30 */     this.voucherId = voucherId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getVoucherId()
/* 21:   */   {
/* 22:33 */     return this.voucherId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setVoucherStatus(String voucherStatus)
/* 26:   */   {
/* 27:37 */     this.voucherStatus = voucherStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getVoucherStatus()
/* 31:   */   {
/* 32:40 */     return this.voucherStatus;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketingVoucherModifyResponse
 * JD-Core Version:    0.7.0.1
 */