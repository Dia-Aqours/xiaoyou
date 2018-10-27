/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherOfflineModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4797844841348699533L;
/* 10:   */   @ApiField("memo")
/* 11:   */   private String memo;
/* 12:   */   @ApiField("out_biz_no")
/* 13:   */   private String outBizNo;
/* 14:   */   @ApiField("voucher_id")
/* 15:   */   private String voucherId;
/* 16:   */   
/* 17:   */   public String getMemo()
/* 18:   */   {
/* 19:35 */     return this.memo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMemo(String memo)
/* 23:   */   {
/* 24:38 */     this.memo = memo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOutBizNo()
/* 28:   */   {
/* 29:42 */     return this.outBizNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOutBizNo(String outBizNo)
/* 33:   */   {
/* 34:45 */     this.outBizNo = outBizNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getVoucherId()
/* 38:   */   {
/* 39:49 */     return this.voucherId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setVoucherId(String voucherId)
/* 43:   */   {
/* 44:52 */     this.voucherId = voucherId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketingVoucherOfflineModel
 * JD-Core Version:    0.7.0.1
 */