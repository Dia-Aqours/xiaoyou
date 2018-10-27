/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiShopDishDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5838574165229717449L;
/* 10:   */   @ApiField("dish_id")
/* 11:   */   private String dishId;
/* 12:   */   
/* 13:   */   public String getDishId()
/* 14:   */   {
/* 15:23 */     return this.dishId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setDishId(String dishId)
/* 19:   */   {
/* 20:26 */     this.dishId = dishId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiShopDishDeleteModel
 * JD-Core Version:    0.7.0.1
 */