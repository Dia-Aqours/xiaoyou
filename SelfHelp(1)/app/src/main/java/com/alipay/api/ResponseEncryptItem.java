/*  1:   */ package com.alipay.api;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ 
/*  5:   */ public class ResponseEncryptItem
/*  6:   */   implements Serializable
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = 6680775791485372169L;
/*  9:   */   private String respContent;
/* 10:   */   private String realContent;
/* 11:   */   
/* 12:   */   public ResponseEncryptItem(String respContent, String realContent)
/* 13:   */   {
/* 14:36 */     this.respContent = respContent;
/* 15:37 */     this.realContent = realContent;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getRespContent()
/* 19:   */   {
/* 20:46 */     return this.respContent;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String getRealContent()
/* 24:   */   {
/* 25:55 */     return this.realContent;
/* 26:   */   }
/* 27:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.ResponseEncryptItem
 * JD-Core Version:    0.7.0.1
 */