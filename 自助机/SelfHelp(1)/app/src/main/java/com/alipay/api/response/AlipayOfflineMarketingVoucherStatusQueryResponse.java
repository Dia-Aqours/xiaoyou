/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherStatusQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8378576546611567126L;
/* 10:   */   @ApiField("ext_info")
/* 11:   */   private String extInfo;
/* 12:   */   @ApiField("voucher_id")
/* 13:   */   private String voucherId;
/* 14:   */   @ApiField("voucher_status")
/* 15:   */   private String voucherStatus;
/* 16:   */   
/* 17:   */   public void setExtInfo(String extInfo)
/* 18:   */   {
/* 19:36 */     this.extInfo = extInfo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getExtInfo()
/* 23:   */   {
/* 24:39 */     return this.extInfo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setVoucherId(String voucherId)
/* 28:   */   {
/* 29:43 */     this.voucherId = voucherId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getVoucherId()
/* 33:   */   {
/* 34:46 */     return this.voucherId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setVoucherStatus(String voucherStatus)
/* 38:   */   {
/* 39:50 */     this.voucherStatus = voucherStatus;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getVoucherStatus()
/* 43:   */   {
/* 44:53 */     return this.voucherStatus;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketingVoucherStatusQueryResponse
 * JD-Core Version:    0.7.0.1
 */