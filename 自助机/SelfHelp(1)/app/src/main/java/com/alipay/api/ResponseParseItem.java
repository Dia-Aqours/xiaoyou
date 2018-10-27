/*  1:   */ package com.alipay.api;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ 
/*  5:   */ public class ResponseParseItem
/*  6:   */   implements Serializable
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = -27707404159419651L;
/*  9:20 */   private int startIndex = -1;
/* 10:23 */   private int endIndex = -1;
/* 11:26 */   private String encryptContent = null;
/* 12:   */   
/* 13:   */   public ResponseParseItem(int startIndex, int endIndex, String encryptContent)
/* 14:   */   {
/* 15:35 */     this.startIndex = startIndex;
/* 16:36 */     this.endIndex = endIndex;
/* 17:37 */     this.encryptContent = encryptContent;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int getStartIndex()
/* 21:   */   {
/* 22:46 */     return this.startIndex;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public int getEndIndex()
/* 26:   */   {
/* 27:55 */     return this.endIndex;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getEncryptContent()
/* 31:   */   {
/* 32:64 */     return this.encryptContent;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.ResponseParseItem
 * JD-Core Version:    0.7.0.1
 */