/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMaterialImageUploadResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7837761665218588328L;
/* 10:   */   @ApiField("image_id")
/* 11:   */   private String imageId;
/* 12:   */   @ApiField("image_url")
/* 13:   */   private String imageUrl;
/* 14:   */   
/* 15:   */   public void setImageId(String imageId)
/* 16:   */   {
/* 17:30 */     this.imageId = imageId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getImageId()
/* 21:   */   {
/* 22:33 */     return this.imageId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setImageUrl(String imageUrl)
/* 26:   */   {
/* 27:37 */     this.imageUrl = imageUrl;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getImageUrl()
/* 31:   */   {
/* 32:40 */     return this.imageUrl;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse
 * JD-Core Version:    0.7.0.1
 */