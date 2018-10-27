/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class NewsfeedMediaImg
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6361534564594238375L;
/* 10:   */   @ApiField("height")
/* 11:   */   private String height;
/* 12:   */   @ApiField("src")
/* 13:   */   private String src;
/* 14:   */   @ApiField("width")
/* 15:   */   private String width;
/* 16:   */   
/* 17:   */   public String getHeight()
/* 18:   */   {
/* 19:35 */     return this.height;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setHeight(String height)
/* 23:   */   {
/* 24:38 */     this.height = height;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getSrc()
/* 28:   */   {
/* 29:42 */     return this.src;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setSrc(String src)
/* 33:   */   {
/* 34:45 */     this.src = src;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getWidth()
/* 38:   */   {
/* 39:49 */     return this.width;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setWidth(String width)
/* 43:   */   {
/* 44:52 */     this.width = width;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.NewsfeedMediaImg
 * JD-Core Version:    0.7.0.1
 */