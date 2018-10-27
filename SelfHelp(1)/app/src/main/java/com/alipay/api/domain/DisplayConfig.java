/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class DisplayConfig
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1121349985636398669L;
/* 10:   */   @ApiField("slogan")
/* 11:   */   private String slogan;
/* 12:   */   @ApiField("slogan_img")
/* 13:   */   private String sloganImg;
/* 14:   */   
/* 15:   */   public String getSlogan()
/* 16:   */   {
/* 17:31 */     return this.slogan;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setSlogan(String slogan)
/* 21:   */   {
/* 22:34 */     this.slogan = slogan;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getSloganImg()
/* 26:   */   {
/* 27:38 */     return this.sloganImg;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setSloganImg(String sloganImg)
/* 31:   */   {
/* 32:41 */     this.sloganImg = sloganImg;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DisplayConfig
 * JD-Core Version:    0.7.0.1
 */