/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayHighValueCustomerResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3342563878297663218L;
/* 10:   */   @ApiField("level")
/* 11:   */   private String level;
/* 12:   */   
/* 13:   */   public String getLevel()
/* 14:   */   {
/* 15:23 */     return this.level;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setLevel(String level)
/* 19:   */   {
/* 20:26 */     this.level = level;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayHighValueCustomerResult
 * JD-Core Version:    0.7.0.1
 */