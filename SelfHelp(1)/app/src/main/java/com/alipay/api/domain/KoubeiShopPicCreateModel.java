/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class KoubeiShopPicCreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4469488518558836155L;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiListField("pictures")
/* 15:   */   @ApiField("content_picture")
/* 16:   */   private List<ContentPicture> pictures;
/* 17:   */   @ApiListField("shop_ids")
/* 18:   */   @ApiField("string")
/* 19:   */   private List<String> shopIds;
/* 20:   */   
/* 21:   */   public String getName()
/* 22:   */   {
/* 23:40 */     return this.name;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setName(String name)
/* 27:   */   {
/* 28:43 */     this.name = name;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public List<ContentPicture> getPictures()
/* 32:   */   {
/* 33:47 */     return this.pictures;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setPictures(List<ContentPicture> pictures)
/* 37:   */   {
/* 38:50 */     this.pictures = pictures;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public List<String> getShopIds()
/* 42:   */   {
/* 43:54 */     return this.shopIds;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setShopIds(List<String> shopIds)
/* 47:   */   {
/* 48:57 */     this.shopIds = shopIds;
/* 49:   */   }
/* 50:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiShopPicCreateModel

 * JD-Core Version:    0.7.0.1

 */