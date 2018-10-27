/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayItemDescription
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7769176538139776446L;
/* 12:   */   @ApiListField("details")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> details;
/* 15:   */   @ApiListField("images")
/* 16:   */   @ApiField("string")
/* 17:   */   private List<String> images;
/* 18:   */   @ApiField("title")
/* 19:   */   private String title;
/* 20:   */   @ApiField("url")
/* 21:   */   private String url;
/* 22:   */   
/* 23:   */   public List<String> getDetails()
/* 24:   */   {
/* 25:46 */     return this.details;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setDetails(List<String> details)
/* 29:   */   {
/* 30:49 */     this.details = details;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public List<String> getImages()
/* 34:   */   {
/* 35:53 */     return this.images;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setImages(List<String> images)
/* 39:   */   {
/* 40:56 */     this.images = images;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getTitle()
/* 44:   */   {
/* 45:60 */     return this.title;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setTitle(String title)
/* 49:   */   {
/* 50:63 */     this.title = title;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getUrl()
/* 54:   */   {
/* 55:67 */     return this.url;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setUrl(String url)
/* 59:   */   {
/* 60:70 */     this.url = url;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayItemDescription
 * JD-Core Version:    0.7.0.1
 */