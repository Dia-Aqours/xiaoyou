/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketShopQuerydetailModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8617648519611165332L;
/* 10:   */   @ApiField("op_role")
/* 11:   */   private String opRole;
/* 12:   */   @ApiField("shop_id")
/* 13:   */   private String shopId;
/* 14:   */   
/* 15:   */   public String getOpRole()
/* 16:   */   {
/* 17:29 */     return this.opRole;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOpRole(String opRole)
/* 21:   */   {
/* 22:32 */     this.opRole = opRole;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getShopId()
/* 26:   */   {
/* 27:36 */     return this.shopId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setShopId(String shopId)
/* 31:   */   {
/* 32:39 */     this.shopId = shopId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopQuerydetailModel
 * JD-Core Version:    0.7.0.1
 */