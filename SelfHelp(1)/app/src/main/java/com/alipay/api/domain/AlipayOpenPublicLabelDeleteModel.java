/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicLabelDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3311231683256525459L;
/* 10:   */   @ApiField("id")
/* 11:   */   private String id;
/* 12:   */   
/* 13:   */   public String getId()
/* 14:   */   {
/* 15:23 */     return this.id;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setId(String id)
/* 19:   */   {
/* 20:26 */     this.id = id;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicLabelDeleteModel
 * JD-Core Version:    0.7.0.1
 */