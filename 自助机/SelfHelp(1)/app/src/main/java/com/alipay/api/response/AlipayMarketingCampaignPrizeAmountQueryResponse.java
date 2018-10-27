/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignPrizeAmountQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4694635651773599423L;
/* 10:   */   @ApiField("remain_amount")
/* 11:   */   private String remainAmount;
/* 12:   */   
/* 13:   */   public void setRemainAmount(String remainAmount)
/* 14:   */   {
/* 15:24 */     this.remainAmount = remainAmount;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getRemainAmount()
/* 19:   */   {
/* 20:27 */     return this.remainAmount;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignPrizeAmountQueryResponse
 * JD-Core Version:    0.7.0.1
 */