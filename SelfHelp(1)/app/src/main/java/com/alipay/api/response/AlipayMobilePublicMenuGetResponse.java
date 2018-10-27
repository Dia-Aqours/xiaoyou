/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobilePublicMenuGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2384586823775378165L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("menu_content")
/* 13:   */   private String menuContent;
/* 14:   */   @ApiField("msg")
/* 15:   */   private String msg;
/* 16:   */   
/* 17:   */   public void setCode(String code)
/* 18:   */   {
/* 19:36 */     this.code = code;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getCode()
/* 23:   */   {
/* 24:39 */     return this.code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setMenuContent(String menuContent)
/* 28:   */   {
/* 29:43 */     this.menuContent = menuContent;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getMenuContent()
/* 33:   */   {
/* 34:46 */     return this.menuContent;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setMsg(String msg)
/* 38:   */   {
/* 39:50 */     this.msg = msg;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getMsg()
/* 43:   */   {
/* 44:53 */     return this.msg;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicMenuGetResponse
 * JD-Core Version:    0.7.0.1
 */