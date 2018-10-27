/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ArticlePicture
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8716931514735295947L;
/* 10:   */   @ApiField("desc")
/* 11:   */   private String desc;
/* 12:   */   @ApiField("location")
/* 13:   */   private String location;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("type")
/* 17:   */   private String type;
/* 18:   */   
/* 19:   */   public String getDesc()
/* 20:   */   {
/* 21:41 */     return this.desc;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setDesc(String desc)
/* 25:   */   {
/* 26:44 */     this.desc = desc;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getLocation()
/* 30:   */   {
/* 31:48 */     return this.location;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setLocation(String location)
/* 35:   */   {
/* 36:51 */     this.location = location;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getName()
/* 40:   */   {
/* 41:55 */     return this.name;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setName(String name)
/* 45:   */   {
/* 46:58 */     this.name = name;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getType()
/* 50:   */   {
/* 51:62 */     return this.type;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setType(String type)
/* 55:   */   {
/* 56:65 */     this.type = type;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ArticlePicture

 * JD-Core Version:    0.7.0.1

 */