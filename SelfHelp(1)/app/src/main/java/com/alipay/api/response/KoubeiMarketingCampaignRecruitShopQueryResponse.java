/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.RecruitShopInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class KoubeiMarketingCampaignRecruitShopQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 8414999912585568354L;
/* 13:   */   @ApiField("plan_id")
/* 14:   */   private String planId;
/* 15:   */   @ApiField("shop_count")
/* 16:   */   private String shopCount;
/* 17:   */   @ApiListField("shop_info")
/* 18:   */   @ApiField("recruit_shop_info")
/* 19:   */   private List<RecruitShopInfo> shopInfo;
/* 20:   */   
/* 21:   */   public void setPlanId(String planId)
/* 22:   */   {
/* 23:40 */     this.planId = planId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getPlanId()
/* 27:   */   {
/* 28:43 */     return this.planId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setShopCount(String shopCount)
/* 32:   */   {
/* 33:47 */     this.shopCount = shopCount;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getShopCount()
/* 37:   */   {
/* 38:50 */     return this.shopCount;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setShopInfo(List<RecruitShopInfo> shopInfo)
/* 42:   */   {
/* 43:54 */     this.shopInfo = shopInfo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<RecruitShopInfo> getShopInfo()
/* 47:   */   {
/* 48:57 */     return this.shopInfo;
/* 49:   */   }
/* 50:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignRecruitShopQueryResponse

 * JD-Core Version:    0.7.0.1

 */