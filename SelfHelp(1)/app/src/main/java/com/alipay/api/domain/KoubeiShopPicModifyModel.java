/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiShopPicModifyModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5784863115758757313L;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiListField("shop_ids")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> shopIds;
/* 17:   */   @ApiField("shop_pic_id")
/* 18:   */   private String shopPicId;
/* 19:   */   
/* 20:   */   public String getName()
/* 21:   */   {
/* 22:39 */     return this.name;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setName(String name)
/* 26:   */   {
/* 27:42 */     this.name = name;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<String> getShopIds()
/* 31:   */   {
/* 32:46 */     return this.shopIds;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setShopIds(List<String> shopIds)
/* 36:   */   {
/* 37:49 */     this.shopIds = shopIds;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getShopPicId()
/* 41:   */   {
/* 42:53 */     return this.shopPicId;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setShopPicId(String shopPicId)
/* 46:   */   {
/* 47:56 */     this.shopPicId = shopPicId;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiShopPicModifyModel
 * JD-Core Version:    0.7.0.1
 */