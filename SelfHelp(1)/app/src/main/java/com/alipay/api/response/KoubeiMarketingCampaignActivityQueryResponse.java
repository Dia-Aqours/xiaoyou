/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CampDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class KoubeiMarketingCampaignActivityQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5593832386445492237L;
/* 11:   */   @ApiField("camp_detail")
/* 12:   */   private CampDetail campDetail;
/* 13:   */   
/* 14:   */   public void setCampDetail(CampDetail campDetail)
/* 15:   */   {
/* 16:25 */     this.campDetail = campDetail;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public CampDetail getCampDetail()
/* 20:   */   {
/* 21:28 */     return this.campDetail;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignActivityQueryResponse
 * JD-Core Version:    0.7.0.1
 */