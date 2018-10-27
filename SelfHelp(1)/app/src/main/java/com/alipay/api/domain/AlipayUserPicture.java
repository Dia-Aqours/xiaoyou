/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserPicture
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4157639586998175995L;
/* 10:   */   @ApiField("picture_type")
/* 11:   */   private String pictureType;
/* 12:   */   @ApiField("picture_url")
/* 13:   */   private String pictureUrl;
/* 14:   */   
/* 15:   */   public String getPictureType()
/* 16:   */   {
/* 17:29 */     return this.pictureType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setPictureType(String pictureType)
/* 21:   */   {
/* 22:32 */     this.pictureType = pictureType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getPictureUrl()
/* 26:   */   {
/* 27:36 */     return this.pictureUrl;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPictureUrl(String pictureUrl)
/* 31:   */   {
/* 32:39 */     this.pictureUrl = pictureUrl;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserPicture
 * JD-Core Version:    0.7.0.1
 */