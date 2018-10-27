/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiShopPicDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3618385919635286346L;
/* 10:   */   @ApiField("shop_pic_id")
/* 11:   */   private String shopPicId;
/* 12:   */   
/* 13:   */   public String getShopPicId()
/* 14:   */   {
/* 15:23 */     return this.shopPicId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setShopPicId(String shopPicId)
/* 19:   */   {
/* 20:26 */     this.shopPicId = shopPicId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiShopPicDeleteModel
 * JD-Core Version:    0.7.0.1
 */