/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDrawcampWhitelistCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3572198121437128723L;
/* 10:   */   @ApiField("camp_result")
/* 11:   */   private Boolean campResult;
/* 12:   */   
/* 13:   */   public void setCampResult(Boolean campResult)
/* 14:   */   {
/* 15:24 */     this.campResult = campResult;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Boolean getCampResult()
/* 19:   */   {
/* 20:27 */     return this.campResult;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDrawcampWhitelistCreateResponse
 * JD-Core Version:    0.7.0.1
 */