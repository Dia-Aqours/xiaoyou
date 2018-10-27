/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarImageUploadModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5544776323819143775L;
/* 10:   */   @ApiField("img_content")
/* 11:   */   private String imgContent;
/* 12:   */   @ApiField("img_type")
/* 13:   */   private String imgType;
/* 14:   */   @ApiField("scene_type")
/* 15:   */   private String sceneType;
/* 16:   */   
/* 17:   */   public String getImgContent()
/* 18:   */   {
/* 19:47 */     return this.imgContent;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setImgContent(String imgContent)
/* 23:   */   {
/* 24:50 */     this.imgContent = imgContent;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getImgType()
/* 28:   */   {
/* 29:54 */     return this.imgType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setImgType(String imgType)
/* 33:   */   {
/* 34:57 */     this.imgType = imgType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getSceneType()
/* 38:   */   {
/* 39:61 */     return this.sceneType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSceneType(String sceneType)
/* 43:   */   {
/* 44:64 */     this.sceneType = sceneType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarImageUploadModel
 * JD-Core Version:    0.7.0.1
 */