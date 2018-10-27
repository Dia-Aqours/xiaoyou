/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCdpAdvertiseCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4347575958956751138L;
/* 10:   */   @ApiField("ad_id")
/* 11:   */   private String adId;
/* 12:   */   
/* 13:   */   public void setAdId(String adId)
/* 14:   */   {
/* 15:24 */     this.adId = adId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getAdId()
/* 19:   */   {
/* 20:27 */     return this.adId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCdpAdvertiseCreateResponse
 * JD-Core Version:    0.7.0.1
 */