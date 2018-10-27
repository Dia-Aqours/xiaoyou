/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiShopMenuDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4592333625234149832L;
/* 10:   */   @ApiField("menu_id")
/* 11:   */   private String menuId;
/* 12:   */   
/* 13:   */   public String getMenuId()
/* 14:   */   {
/* 15:23 */     return this.menuId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMenuId(String menuId)
/* 19:   */   {
/* 20:26 */     this.menuId = menuId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiShopMenuDeleteModel
 * JD-Core Version:    0.7.0.1
 */