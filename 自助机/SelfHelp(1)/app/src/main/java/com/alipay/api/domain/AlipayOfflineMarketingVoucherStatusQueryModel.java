/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherStatusQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5558156367679334749L;
/* 10:   */   @ApiField("out_biz_no")
/* 11:   */   private String outBizNo;
/* 12:   */   @ApiField("voucher_id")
/* 13:   */   private String voucherId;
/* 14:   */   
/* 15:   */   public String getOutBizNo()
/* 16:   */   {
/* 17:29 */     return this.outBizNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOutBizNo(String outBizNo)
/* 21:   */   {
/* 22:32 */     this.outBizNo = outBizNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getVoucherId()
/* 26:   */   {
/* 27:36 */     return this.voucherId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setVoucherId(String voucherId)
/* 31:   */   {
/* 32:39 */     this.voucherId = voucherId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketingVoucherStatusQueryModel
 * JD-Core Version:    0.7.0.1
 */