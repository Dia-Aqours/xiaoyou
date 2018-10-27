/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCdpRecommendQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1516615161251675589L;
/* 10:   */   @ApiField("recommend_id")
/* 11:   */   private String recommendId;
/* 12:   */   @ApiField("shop_info")
/* 13:   */   private String shopInfo;
/* 14:   */   
/* 15:   */   public void setRecommendId(String recommendId)
/* 16:   */   {
/* 17:30 */     this.recommendId = recommendId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getRecommendId()
/* 21:   */   {
/* 22:33 */     return this.recommendId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setShopInfo(String shopInfo)
/* 26:   */   {
/* 27:37 */     this.shopInfo = shopInfo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getShopInfo()
/* 31:   */   {
/* 32:40 */     return this.shopInfo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCdpRecommendQueryResponse
 * JD-Core Version:    0.7.0.1
 */