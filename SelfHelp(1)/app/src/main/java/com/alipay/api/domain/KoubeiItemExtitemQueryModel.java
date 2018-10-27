/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiItemExtitemQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2168799945495211385L;
/* 10:   */   @ApiField("item_code")
/* 11:   */   private String itemCode;
/* 12:   */   
/* 13:   */   public String getItemCode()
/* 14:   */   {
/* 15:23 */     return this.itemCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setItemCode(String itemCode)
/* 19:   */   {
/* 20:26 */     this.itemCode = itemCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemExtitemQueryModel
 * JD-Core Version:    0.7.0.1
 */