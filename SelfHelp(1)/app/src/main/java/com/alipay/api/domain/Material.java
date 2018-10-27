/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class Material
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1875659285863959175L;
/* 12:   */   @ApiListField("articles")
/* 13:   */   @ApiField("article")
/* 14:   */   private List<Article> articles;
/* 15:   */   @ApiField("msg_type")
/* 16:   */   private String msgType;
/* 17:   */   @ApiField("text")
/* 18:   */   private Text text;
/* 19:   */   
/* 20:   */   public List<Article> getArticles()
/* 21:   */   {
/* 22:39 */     return this.articles;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setArticles(List<Article> articles)
/* 26:   */   {
/* 27:42 */     this.articles = articles;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getMsgType()
/* 31:   */   {
/* 32:46 */     return this.msgType;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setMsgType(String msgType)
/* 36:   */   {
/* 37:49 */     this.msgType = msgType;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public Text getText()
/* 41:   */   {
/* 42:53 */     return this.text;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setText(Text text)
/* 46:   */   {
/* 47:56 */     this.text = text;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Material
 * JD-Core Version:    0.7.0.1
 */