/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class Text
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7161974699611582199L;
/* 10:   */   @ApiField("content")
/* 11:   */   private String content;
/* 12:   */   
/* 13:   */   public String getContent()
/* 14:   */   {
/* 15:23 */     return this.content;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setContent(String content)
/* 19:   */   {
/* 20:26 */     this.content = content;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Text
 * JD-Core Version:    0.7.0.1
 */