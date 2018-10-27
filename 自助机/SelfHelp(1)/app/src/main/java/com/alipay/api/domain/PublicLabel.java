/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PublicLabel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8723593557262241212L;
/* 10:   */   @ApiField("count")
/* 11:   */   private Long count;
/* 12:   */   @ApiField("id")
/* 13:   */   private String id;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   
/* 17:   */   public Long getCount()
/* 18:   */   {
/* 19:35 */     return this.count;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCount(Long count)
/* 23:   */   {
/* 24:38 */     this.count = count;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getId()
/* 28:   */   {
/* 29:42 */     return this.id;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setId(String id)
/* 33:   */   {
/* 34:45 */     this.id = id;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getName()
/* 38:   */   {
/* 39:49 */     return this.name;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setName(String name)
/* 43:   */   {
/* 44:52 */     this.name = name;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PublicLabel
 * JD-Core Version:    0.7.0.1
 */