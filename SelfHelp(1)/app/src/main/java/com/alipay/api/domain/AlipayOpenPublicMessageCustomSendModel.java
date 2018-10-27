/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOpenPublicMessageCustomSendModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5816577331719383198L;
/* 12:   */   @ApiListField("articles")
/* 13:   */   @ApiField("article")
/* 14:   */   private List<Article> articles;
/* 15:   */   @ApiField("msg_type")
/* 16:   */   private String msgType;
/* 17:   */   @ApiField("text")
/* 18:   */   private Text text;
/* 19:   */   @ApiField("to_user_id")
/* 20:   */   private String toUserId;
/* 21:   */   
/* 22:   */   public List<Article> getArticles()
/* 23:   */   {
/* 24:45 */     return this.articles;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setArticles(List<Article> articles)
/* 28:   */   {
/* 29:48 */     this.articles = articles;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getMsgType()
/* 33:   */   {
/* 34:52 */     return this.msgType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setMsgType(String msgType)
/* 38:   */   {
/* 39:55 */     this.msgType = msgType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Text getText()
/* 43:   */   {
/* 44:59 */     return this.text;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setText(Text text)
/* 48:   */   {
/* 49:62 */     this.text = text;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getToUserId()
/* 53:   */   {
/* 54:66 */     return this.toUserId;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setToUserId(String toUserId)
/* 58:   */   {
/* 59:69 */     this.toUserId = toUserId;
/* 60:   */   }
/* 61:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicMessageCustomSendModel
 * JD-Core Version:    0.7.0.1
 */