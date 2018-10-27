/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiContentBrandstoryOfflineModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8278189247144293812L;
/* 10:   */   @ApiField("brand_story_id")
/* 11:   */   private String brandStoryId;
/* 12:   */   
/* 13:   */   public String getBrandStoryId()
/* 14:   */   {
/* 15:23 */     return this.brandStoryId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setBrandStoryId(String brandStoryId)
/* 19:   */   {
/* 20:26 */     this.brandStoryId = brandStoryId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiContentBrandstoryOfflineModel
 * JD-Core Version:    0.7.0.1
 */