/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayDataDataserviceCodeRecoModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1751177165719622671L;
/* 10:   */   @ApiField("config")
/* 11:   */   private String config;
/* 12:   */   @ApiField("content")
/* 13:   */   private String content;
/* 14:   */   @ApiField("strategy")
/* 15:   */   private String strategy;
/* 16:   */   
/* 17:   */   public String getConfig()
/* 18:   */   {
/* 19:35 */     return this.config;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setConfig(String config)
/* 23:   */   {
/* 24:38 */     this.config = config;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getContent()
/* 28:   */   {
/* 29:42 */     return this.content;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setContent(String content)
/* 33:   */   {
/* 34:45 */     this.content = content;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStrategy()
/* 38:   */   {
/* 39:49 */     return this.strategy;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStrategy(String strategy)
/* 43:   */   {
/* 44:52 */     this.strategy = strategy;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataDataserviceCodeRecoModel
 * JD-Core Version:    0.7.0.1
 */