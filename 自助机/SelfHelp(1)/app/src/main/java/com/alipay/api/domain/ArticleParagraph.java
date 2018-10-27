/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class ArticleParagraph
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6664972945342621386L;
/* 12:   */   @ApiListField("pictures")
/* 13:   */   @ApiField("article_picture")
/* 14:   */   private List<ArticlePicture> pictures;
/* 15:   */   @ApiField("text")
/* 16:   */   private String text;
/* 17:   */   
/* 18:   */   public List<ArticlePicture> getPictures()
/* 19:   */   {
/* 20:33 */     return this.pictures;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setPictures(List<ArticlePicture> pictures)
/* 24:   */   {
/* 25:36 */     this.pictures = pictures;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getText()
/* 29:   */   {
/* 30:40 */     return this.text;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setText(String text)
/* 34:   */   {
/* 35:43 */     this.text = text;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ArticleParagraph
 * JD-Core Version:    0.7.0.1
 */