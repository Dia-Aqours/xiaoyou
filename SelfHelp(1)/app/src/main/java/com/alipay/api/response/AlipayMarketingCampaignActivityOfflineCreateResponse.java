/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignActivityOfflineCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3785341633747899391L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("prize_id")
/* 13:   */   private String prizeId;
/* 14:   */   
/* 15:   */   public void setCampId(String campId)
/* 16:   */   {
/* 17:30 */     this.campId = campId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCampId()
/* 21:   */   {
/* 22:33 */     return this.campId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setPrizeId(String prizeId)
/* 26:   */   {
/* 27:37 */     this.prizeId = prizeId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getPrizeId()
/* 31:   */   {
/* 32:40 */     return this.prizeId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignActivityOfflineCreateResponse
 * JD-Core Version:    0.7.0.1
 */