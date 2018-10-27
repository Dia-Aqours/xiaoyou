/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ShopDiscountInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineMarketShopDiscountQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4419853541268364114L;
/* 13:   */   @ApiListField("discount_list")
/* 14:   */   @ApiField("shop_discount_info")
/* 15:   */   private List<ShopDiscountInfo> discountList;
/* 16:   */   @ApiListField("item_list")
/* 17:   */   @ApiField("shop_discount_info")
/* 18:   */   private List<ShopDiscountInfo> itemList;
/* 19:   */   
/* 20:   */   public void setDiscountList(List<ShopDiscountInfo> discountList)
/* 21:   */   {
/* 22:35 */     this.discountList = discountList;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public List<ShopDiscountInfo> getDiscountList()
/* 26:   */   {
/* 27:38 */     return this.discountList;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setItemList(List<ShopDiscountInfo> itemList)
/* 31:   */   {
/* 32:42 */     this.itemList = itemList;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public List<ShopDiscountInfo> getItemList()
/* 36:   */   {
/* 37:45 */     return this.itemList;
/* 38:   */   }
/* 39:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopDiscountQueryResponse
 * JD-Core Version:    0.7.0.1
 */