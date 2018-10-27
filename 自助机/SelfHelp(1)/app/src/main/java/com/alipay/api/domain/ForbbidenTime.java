/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ForbbidenTime
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1256665899142779526L;
/* 10:   */   @ApiField("days")
/* 11:   */   private String days;
/* 12:   */   
/* 13:   */   public String getDays()
/* 14:   */   {
/* 15:25 */     return this.days;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setDays(String days)
/* 19:   */   {
/* 20:28 */     this.days = days;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ForbbidenTime
 * JD-Core Version:    0.7.0.1
 */