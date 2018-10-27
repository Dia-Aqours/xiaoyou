/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMaintainShopQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6374344695729942863L;
/* 10:   */   @ApiField("out_shop_id")
/* 11:   */   private String outShopId;
/* 12:   */   @ApiField("shop_id")
/* 13:   */   private Long shopId;
/* 14:   */   
/* 15:   */   public String getOutShopId()
/* 16:   */   {
/* 17:29 */     return this.outShopId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOutShopId(String outShopId)
/* 21:   */   {
/* 22:32 */     this.outShopId = outShopId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Long getShopId()
/* 26:   */   {
/* 27:36 */     return this.shopId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setShopId(Long shopId)
/* 31:   */   {
/* 32:39 */     this.shopId = shopId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainShopQueryModel
 * JD-Core Version:    0.7.0.1
 */