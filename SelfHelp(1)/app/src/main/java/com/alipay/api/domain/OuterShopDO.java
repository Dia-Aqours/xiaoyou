/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class OuterShopDO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4129378835764158463L;
/* 10:   */   @ApiField("outer_id")
/* 11:   */   private String outerId;
/* 12:   */   @ApiField("shop_id")
/* 13:   */   private String shopId;
/* 14:   */   @ApiField("type")
/* 15:   */   private String type;
/* 16:   */   
/* 17:   */   public String getOuterId()
/* 18:   */   {
/* 19:36 */     return this.outerId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOuterId(String outerId)
/* 23:   */   {
/* 24:39 */     this.outerId = outerId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getShopId()
/* 28:   */   {
/* 29:43 */     return this.shopId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setShopId(String shopId)
/* 33:   */   {
/* 34:46 */     this.shopId = shopId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getType()
/* 38:   */   {
/* 39:50 */     return this.type;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setType(String type)
/* 43:   */   {
/* 44:53 */     this.type = type;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OuterShopDO
 * JD-Core Version:    0.7.0.1
 */