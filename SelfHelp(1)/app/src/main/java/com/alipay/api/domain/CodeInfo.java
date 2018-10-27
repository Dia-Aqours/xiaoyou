/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CodeInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5658816616251145268L;
/* 10:   */   @ApiField("goto_url")
/* 11:   */   private String gotoUrl;
/* 12:   */   @ApiField("scene")
/* 13:   */   private Scene scene;
/* 14:   */   
/* 15:   */   public String getGotoUrl()
/* 16:   */   {
/* 17:29 */     return this.gotoUrl;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setGotoUrl(String gotoUrl)
/* 21:   */   {
/* 22:32 */     this.gotoUrl = gotoUrl;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Scene getScene()
/* 26:   */   {
/* 27:36 */     return this.scene;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setScene(Scene scene)
/* 31:   */   {
/* 32:39 */     this.scene = scene;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CodeInfo
 * JD-Core Version:    0.7.0.1
 */