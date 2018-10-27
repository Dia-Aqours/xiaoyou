/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class KoubeiShopDishModifyModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1544761225763453923L;
/* 12:   */   @ApiField("desc")
/* 13:   */   private String desc;
/* 14:   */   @ApiField("dish_id")
/* 15:   */   private String dishId;
/* 16:   */   @ApiField("dish_name")
/* 17:   */   private String dishName;
/* 18:   */   @ApiField("price")
/* 19:   */   private String price;
/* 20:   */   @ApiListField("tags")
/* 21:   */   @ApiField("dish_tag")
/* 22:   */   private List<DishTag> tags;
/* 23:   */   
/* 24:   */   public String getDesc()
/* 25:   */   {
/* 26:51 */     return this.desc;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setDesc(String desc)
/* 30:   */   {
/* 31:54 */     this.desc = desc;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getDishId()
/* 35:   */   {
/* 36:58 */     return this.dishId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setDishId(String dishId)
/* 40:   */   {
/* 41:61 */     this.dishId = dishId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getDishName()
/* 45:   */   {
/* 46:65 */     return this.dishName;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setDishName(String dishName)
/* 50:   */   {
/* 51:68 */     this.dishName = dishName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getPrice()
/* 55:   */   {
/* 56:72 */     return this.price;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setPrice(String price)
/* 60:   */   {
/* 61:75 */     this.price = price;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public List<DishTag> getTags()
/* 65:   */   {
/* 66:79 */     return this.tags;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setTags(List<DishTag> tags)
/* 70:   */   {
/* 71:82 */     this.tags = tags;
/* 72:   */   }
/* 73:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiShopDishModifyModel

 * JD-Core Version:    0.7.0.1

 */