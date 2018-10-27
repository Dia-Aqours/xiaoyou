/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDrawcampCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7468577644669441127L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   
/* 13:   */   public void setCampId(String campId)
/* 14:   */   {
/* 15:24 */     this.campId = campId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getCampId()
/* 19:   */   {
/* 20:27 */     return this.campId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDrawcampCreateResponse
 * JD-Core Version:    0.7.0.1
 */