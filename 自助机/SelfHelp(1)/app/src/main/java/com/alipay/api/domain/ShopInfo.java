/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class ShopInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6546912749752475567L;
/* 12:   */   @ApiField("shop_name")
/* 13:   */   private String shopName;
/* 14:   */   @ApiListField("shop_scene_pic")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> shopScenePic;
/* 17:   */   @ApiField("shop_sign_board_pic")
/* 18:   */   private String shopSignBoardPic;
/* 19:   */   
/* 20:   */   public String getShopName()
/* 21:   */   {
/* 22:39 */     return this.shopName;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setShopName(String shopName)
/* 26:   */   {
/* 27:42 */     this.shopName = shopName;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<String> getShopScenePic()
/* 31:   */   {
/* 32:46 */     return this.shopScenePic;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setShopScenePic(List<String> shopScenePic)
/* 36:   */   {
/* 37:49 */     this.shopScenePic = shopScenePic;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getShopSignBoardPic()
/* 41:   */   {
/* 42:53 */     return this.shopSignBoardPic;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setShopSignBoardPic(String shopSignBoardPic)
/* 46:   */   {
/* 47:56 */     this.shopSignBoardPic = shopSignBoardPic;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ShopInfo
 * JD-Core Version:    0.7.0.1
 */