/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ContentPicture
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4447111117162188477L;
/* 10:   */   @ApiField("location")
/* 11:   */   private String location;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("type")
/* 15:   */   private String type;
/* 16:   */   
/* 17:   */   public String getLocation()
/* 18:   */   {
/* 19:35 */     return this.location;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setLocation(String location)
/* 23:   */   {
/* 24:38 */     this.location = location;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getName()
/* 28:   */   {
/* 29:42 */     return this.name;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setName(String name)
/* 33:   */   {
/* 34:45 */     this.name = name;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getType()
/* 38:   */   {
/* 39:49 */     return this.type;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setType(String type)
/* 43:   */   {
/* 44:52 */     this.type = type;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ContentPicture

 * JD-Core Version:    0.7.0.1

 */