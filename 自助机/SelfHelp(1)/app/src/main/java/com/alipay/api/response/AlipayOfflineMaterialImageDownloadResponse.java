/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOfflineMaterialImageDownloadResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1747832189149446882L;
/* 12:   */   @ApiListField("image_urls")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> imageUrls;
/* 15:   */   
/* 16:   */   public void setImageUrls(List<String> imageUrls)
/* 17:   */   {
/* 18:27 */     this.imageUrls = imageUrls;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public List<String> getImageUrls()
/* 22:   */   {
/* 23:30 */     return this.imageUrls;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMaterialImageDownloadResponse
 * JD-Core Version:    0.7.0.1
 */