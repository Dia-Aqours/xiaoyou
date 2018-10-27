/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiShopMenuModifyModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5689371754983682668L;
/* 12:   */   @ApiField("cover")
/* 13:   */   private Picture cover;
/* 14:   */   @ApiListField("dishes")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> dishes;
/* 17:   */   @ApiField("menu_id")
/* 18:   */   private String menuId;
/* 19:   */   @ApiListField("shop_ids")
/* 20:   */   @ApiField("string")
/* 21:   */   private List<String> shopIds;
/* 22:   */   @ApiField("title")
/* 23:   */   private String title;
/* 24:   */   
/* 25:   */   public Picture getCover()
/* 26:   */   {
/* 27:52 */     return this.cover;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCover(Picture cover)
/* 31:   */   {
/* 32:55 */     this.cover = cover;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public List<String> getDishes()
/* 36:   */   {
/* 37:59 */     return this.dishes;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setDishes(List<String> dishes)
/* 41:   */   {
/* 42:62 */     this.dishes = dishes;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getMenuId()
/* 46:   */   {
/* 47:66 */     return this.menuId;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setMenuId(String menuId)
/* 51:   */   {
/* 52:69 */     this.menuId = menuId;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public List<String> getShopIds()
/* 56:   */   {
/* 57:73 */     return this.shopIds;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setShopIds(List<String> shopIds)
/* 61:   */   {
/* 62:76 */     this.shopIds = shopIds;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public String getTitle()
/* 66:   */   {
/* 67:80 */     return this.title;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void setTitle(String title)
/* 71:   */   {
/* 72:83 */     this.title = title;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiShopMenuModifyModel
 * JD-Core Version:    0.7.0.1
 */