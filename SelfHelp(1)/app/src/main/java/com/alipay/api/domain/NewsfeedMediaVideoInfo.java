/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class NewsfeedMediaVideoInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5681694282415684749L;
/* 10:   */   @ApiField("height")
/* 11:   */   private String height;
/* 12:   */   @ApiField("img_id")
/* 13:   */   private String imgId;
/* 14:   */   @ApiField("video_id")
/* 15:   */   private String videoId;
/* 16:   */   @ApiField("width")
/* 17:   */   private String width;
/* 18:   */   
/* 19:   */   public String getHeight()
/* 20:   */   {
/* 21:41 */     return this.height;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setHeight(String height)
/* 25:   */   {
/* 26:44 */     this.height = height;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getImgId()
/* 30:   */   {
/* 31:48 */     return this.imgId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setImgId(String imgId)
/* 35:   */   {
/* 36:51 */     this.imgId = imgId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getVideoId()
/* 40:   */   {
/* 41:55 */     return this.videoId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setVideoId(String videoId)
/* 45:   */   {
/* 46:58 */     this.videoId = videoId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getWidth()
/* 50:   */   {
/* 51:62 */     return this.width;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setWidth(String width)
/* 55:   */   {
/* 56:65 */     this.width = width;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.NewsfeedMediaVideoInfo
 * JD-Core Version:    0.7.0.1
 */