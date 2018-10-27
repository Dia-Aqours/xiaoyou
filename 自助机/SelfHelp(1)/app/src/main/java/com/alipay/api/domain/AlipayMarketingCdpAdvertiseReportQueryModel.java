/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCdpAdvertiseReportQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1262764777656711376L;
/* 10:   */   @ApiField("ad_id")
/* 11:   */   private String adId;
/* 12:   */   
/* 13:   */   public String getAdId()
/* 14:   */   {
/* 15:23 */     return this.adId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setAdId(String adId)
/* 19:   */   {
/* 20:26 */     this.adId = adId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCdpAdvertiseReportQueryModel
 * JD-Core Version:    0.7.0.1
 */