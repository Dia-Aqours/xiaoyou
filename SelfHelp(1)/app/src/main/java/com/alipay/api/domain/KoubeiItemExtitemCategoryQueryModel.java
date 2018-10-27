/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiItemExtitemCategoryQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6587551198144712867L;
/* 10:   */   @ApiField("parent_id")
/* 11:   */   private String parentId;
/* 12:   */   
/* 13:   */   public String getParentId()
/* 14:   */   {
/* 15:23 */     return this.parentId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setParentId(String parentId)
/* 19:   */   {
/* 20:26 */     this.parentId = parentId;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiItemExtitemCategoryQueryModel

 * JD-Core Version:    0.7.0.1

 */