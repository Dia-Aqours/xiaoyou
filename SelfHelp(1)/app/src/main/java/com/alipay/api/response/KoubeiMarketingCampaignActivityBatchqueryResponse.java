/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CampBaseDto;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMarketingCampaignActivityBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6249951936487895919L;
/* 13:   */   @ApiListField("camp_sets")
/* 14:   */   @ApiField("camp_base_dto")
/* 15:   */   private List<CampBaseDto> campSets;
/* 16:   */   @ApiField("total_number")
/* 17:   */   private String totalNumber;
/* 18:   */   
/* 19:   */   public void setCampSets(List<CampBaseDto> campSets)
/* 20:   */   {
/* 21:34 */     this.campSets = campSets;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<CampBaseDto> getCampSets()
/* 25:   */   {
/* 26:37 */     return this.campSets;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setTotalNumber(String totalNumber)
/* 30:   */   {
/* 31:41 */     this.totalNumber = totalNumber;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getTotalNumber()
/* 35:   */   {
/* 36:44 */     return this.totalNumber;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignActivityBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */