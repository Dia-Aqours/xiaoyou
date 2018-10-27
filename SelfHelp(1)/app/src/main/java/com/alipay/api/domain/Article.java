/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class Article
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8582599717911232498L;
/* 10:   */   @ApiField("action_name")
/* 11:   */   private String actionName;
/* 12:   */   @ApiField("desc")
/* 13:   */   private String desc;
/* 14:   */   @ApiField("image_url")
/* 15:   */   private String imageUrl;
/* 16:   */   @ApiField("title")
/* 17:   */   private String title;
/* 18:   */   @ApiField("url")
/* 19:   */   private String url;
/* 20:   */   
/* 21:   */   public String getActionName()
/* 22:   */   {
/* 23:47 */     return this.actionName;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setActionName(String actionName)
/* 27:   */   {
/* 28:50 */     this.actionName = actionName;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getDesc()
/* 32:   */   {
/* 33:54 */     return this.desc;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setDesc(String desc)
/* 37:   */   {
/* 38:57 */     this.desc = desc;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getImageUrl()
/* 42:   */   {
/* 43:61 */     return this.imageUrl;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setImageUrl(String imageUrl)
/* 47:   */   {
/* 48:64 */     this.imageUrl = imageUrl;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getTitle()
/* 52:   */   {
/* 53:68 */     return this.title;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setTitle(String title)
/* 57:   */   {
/* 58:71 */     this.title = title;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getUrl()
/* 62:   */   {
/* 63:75 */     return this.url;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setUrl(String url)
/* 67:   */   {
/* 68:78 */     this.url = url;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Article
 * JD-Core Version:    0.7.0.1
 */