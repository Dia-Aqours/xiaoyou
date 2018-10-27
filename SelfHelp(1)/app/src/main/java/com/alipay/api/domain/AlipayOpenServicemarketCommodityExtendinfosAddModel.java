/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOpenServicemarketCommodityExtendinfosAddModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8625312862768539267L;
/* 12:   */   @ApiListField("commodity_ext_infos")
/* 13:   */   @ApiField("commodity_public_ext_infos")
/* 14:   */   private List<CommodityPublicExtInfos> commodityExtInfos;
/* 15:   */   @ApiField("commodity_id")
/* 16:   */   private String commodityId;
/* 17:   */   @ApiField("user_id")
/* 18:   */   private String userId;
/* 19:   */   
/* 20:   */   public List<CommodityPublicExtInfos> getCommodityExtInfos()
/* 21:   */   {
/* 22:39 */     return this.commodityExtInfos;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setCommodityExtInfos(List<CommodityPublicExtInfos> commodityExtInfos)
/* 26:   */   {
/* 27:42 */     this.commodityExtInfos = commodityExtInfos;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCommodityId()
/* 31:   */   {
/* 32:46 */     return this.commodityId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setCommodityId(String commodityId)
/* 36:   */   {
/* 37:49 */     this.commodityId = commodityId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getUserId()
/* 41:   */   {
/* 42:53 */     return this.userId;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setUserId(String userId)
/* 46:   */   {
/* 47:56 */     this.userId = userId;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenServicemarketCommodityExtendinfosAddModel
 * JD-Core Version:    0.7.0.1
 */