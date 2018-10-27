/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class KoubeiShopDishCreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6512591991683725364L;
/* 12:   */   @ApiField("desc")
/* 13:   */   private String desc;
/* 14:   */   @ApiField("dish_name")
/* 15:   */   private String dishName;
/* 16:   */   @ApiListField("pictures")
/* 17:   */   @ApiField("picture")
/* 18:   */   private List<Picture> pictures;
/* 19:   */   @ApiField("price")
/* 20:   */   private String price;
/* 21:   */   @ApiListField("tags")
/* 22:   */   @ApiField("dish_tag")
/* 23:   */   private List<DishTag> tags;
/* 24:   */   
/* 25:   */   public String getDesc()
/* 26:   */   {
/* 27:52 */     return this.desc;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setDesc(String desc)
/* 31:   */   {
/* 32:55 */     this.desc = desc;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getDishName()
/* 36:   */   {
/* 37:59 */     return this.dishName;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setDishName(String dishName)
/* 41:   */   {
/* 42:62 */     this.dishName = dishName;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public List<Picture> getPictures()
/* 46:   */   {
/* 47:66 */     return this.pictures;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setPictures(List<Picture> pictures)
/* 51:   */   {
/* 52:69 */     this.pictures = pictures;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getPrice()
/* 56:   */   {
/* 57:73 */     return this.price;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setPrice(String price)
/* 61:   */   {
/* 62:76 */     this.price = price;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public List<DishTag> getTags()
/* 66:   */   {
/* 67:80 */     return this.tags;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void setTags(List<DishTag> tags)
/* 71:   */   {
/* 72:83 */     this.tags = tags;
/* 73:   */   }
/* 74:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiShopDishCreateModel

 * JD-Core Version:    0.7.0.1

 */