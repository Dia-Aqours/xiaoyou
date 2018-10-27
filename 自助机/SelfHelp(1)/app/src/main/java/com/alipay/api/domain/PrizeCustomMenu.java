/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class PrizeCustomMenu
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2218318449125364441L;
/* 10:   */   @ApiField("text")
/* 11:   */   private String text;
/* 12:   */   @ApiField("title")
/* 13:   */   private String title;
/* 14:   */   
/* 15:   */   public String getText()
/* 16:   */   {
/* 17:29 */     return this.text;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setText(String text)
/* 21:   */   {
/* 22:32 */     this.text = text;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTitle()
/* 26:   */   {
/* 27:36 */     return this.title;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTitle(String title)
/* 31:   */   {
/* 32:39 */     this.title = title;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.PrizeCustomMenu

 * JD-Core Version:    0.7.0.1

 */