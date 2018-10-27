/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AntMerchantExpandImageUploadResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7438849921369236341L;
/* 10:   */   @ApiField("image_id")
/* 11:   */   private String imageId;
/* 12:   */   
/* 13:   */   public void setImageId(String imageId)
/* 14:   */   {
/* 15:24 */     this.imageId = imageId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getImageId()
/* 19:   */   {
/* 20:27 */     return this.imageId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AntMerchantExpandImageUploadResponse
 * JD-Core Version:    0.7.0.1
 */