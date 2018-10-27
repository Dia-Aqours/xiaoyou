/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CplifeNoticeImg
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3182617797137474726L;
/* 10:   */   @ApiField("image_url")
/* 11:   */   private String imageUrl;
/* 12:   */   @ApiField("thumbnail_url")
/* 13:   */   private String thumbnailUrl;
/* 14:   */   
/* 15:   */   public String getImageUrl()
/* 16:   */   {
/* 17:29 */     return this.imageUrl;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setImageUrl(String imageUrl)
/* 21:   */   {
/* 22:32 */     this.imageUrl = imageUrl;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getThumbnailUrl()
/* 26:   */   {
/* 27:36 */     return this.thumbnailUrl;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setThumbnailUrl(String thumbnailUrl)
/* 31:   */   {
/* 32:39 */     this.thumbnailUrl = thumbnailUrl;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CplifeNoticeImg
 * JD-Core Version:    0.7.0.1
 */