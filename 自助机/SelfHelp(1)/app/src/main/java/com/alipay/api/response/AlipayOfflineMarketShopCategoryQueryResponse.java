/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ShopCategoryConfigInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineMarketShopCategoryQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5124982535891724364L;
/* 13:   */   @ApiListField("shop_category_config_infos")
/* 14:   */   @ApiField("shop_category_config_info")
/* 15:   */   private List<ShopCategoryConfigInfo> shopCategoryConfigInfos;
/* 16:   */   
/* 17:   */   public void setShopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos)
/* 18:   */   {
/* 19:28 */     this.shopCategoryConfigInfos = shopCategoryConfigInfos;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ShopCategoryConfigInfo> getShopCategoryConfigInfos()
/* 23:   */   {
/* 24:31 */     return this.shopCategoryConfigInfos;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopCategoryQueryResponse
 * JD-Core Version:    0.7.0.1
 */