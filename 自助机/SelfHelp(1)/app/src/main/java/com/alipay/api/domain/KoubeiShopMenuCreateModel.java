/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiShopMenuCreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1861583641262677592L;
/* 12:   */   @ApiField("cover")
/* 13:   */   private Picture cover;
/* 14:   */   @ApiListField("dishes")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> dishes;
/* 17:   */   @ApiListField("shop_ids")
/* 18:   */   @ApiField("string")
/* 19:   */   private List<String> shopIds;
/* 20:   */   @ApiField("title")
/* 21:   */   private String title;
/* 22:   */   
/* 23:   */   public Picture getCover()
/* 24:   */   {
/* 25:46 */     return this.cover;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCover(Picture cover)
/* 29:   */   {
/* 30:49 */     this.cover = cover;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public List<String> getDishes()
/* 34:   */   {
/* 35:53 */     return this.dishes;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setDishes(List<String> dishes)
/* 39:   */   {
/* 40:56 */     this.dishes = dishes;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public List<String> getShopIds()
/* 44:   */   {
/* 45:60 */     return this.shopIds;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setShopIds(List<String> shopIds)
/* 49:   */   {
/* 50:63 */     this.shopIds = shopIds;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getTitle()
/* 54:   */   {
/* 55:67 */     return this.title;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setTitle(String title)
/* 59:   */   {
/* 60:70 */     this.title = title;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiShopMenuCreateModel
 * JD-Core Version:    0.7.0.1
 */