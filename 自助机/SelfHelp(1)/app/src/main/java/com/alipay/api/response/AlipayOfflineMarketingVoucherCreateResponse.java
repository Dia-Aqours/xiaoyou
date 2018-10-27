/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3385399385673784573L;
/* 10:   */   @ApiField("activity_id")
/* 11:   */   private String activityId;
/* 12:   */   @ApiField("voucher_id")
/* 13:   */   private String voucherId;
/* 14:   */   
/* 15:   */   public void setActivityId(String activityId)
/* 16:   */   {
/* 17:30 */     this.activityId = activityId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getActivityId()
/* 21:   */   {
/* 22:33 */     return this.activityId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setVoucherId(String voucherId)
/* 26:   */   {
/* 27:37 */     this.voucherId = voucherId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getVoucherId()
/* 31:   */   {
/* 32:40 */     return this.voucherId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketingVoucherCreateResponse
 * JD-Core Version:    0.7.0.1
 */