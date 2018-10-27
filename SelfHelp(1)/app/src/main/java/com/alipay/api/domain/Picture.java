/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class Picture
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1563153744641744342L;
/* 10:   */   @ApiField("location")
/* 11:   */   private String location;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   
/* 15:   */   public String getLocation()
/* 16:   */   {
/* 17:29 */     return this.location;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setLocation(String location)
/* 21:   */   {
/* 22:32 */     this.location = location;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getName()
/* 26:   */   {
/* 27:36 */     return this.name;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setName(String name)
/* 31:   */   {
/* 32:39 */     this.name = name;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Picture
 * JD-Core Version:    0.7.0.1
 */