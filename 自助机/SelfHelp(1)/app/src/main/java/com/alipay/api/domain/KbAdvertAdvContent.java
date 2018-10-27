/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertAdvContent
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5656473763326929386L;
/* 10:   */   @ApiField("codec")
/* 11:   */   private String codec;
/* 12:   */   @ApiField("link_url")
/* 13:   */   private String linkUrl;
/* 14:   */   
/* 15:   */   public String getCodec()
/* 16:   */   {
/* 17:29 */     return this.codec;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCodec(String codec)
/* 21:   */   {
/* 22:32 */     this.codec = codec;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getLinkUrl()
/* 26:   */   {
/* 27:36 */     return this.linkUrl;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setLinkUrl(String linkUrl)
/* 31:   */   {
/* 32:39 */     this.linkUrl = linkUrl;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertAdvContent
 * JD-Core Version:    0.7.0.1
 */