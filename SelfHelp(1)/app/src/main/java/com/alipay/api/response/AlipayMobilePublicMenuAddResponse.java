/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobilePublicMenuAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5869981323549294833L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("msg")
/* 13:   */   private String msg;
/* 14:   */   
/* 15:   */   public void setCode(String code)
/* 16:   */   {
/* 17:30 */     this.code = code;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCode()
/* 21:   */   {
/* 22:33 */     return this.code;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setMsg(String msg)
/* 26:   */   {
/* 27:37 */     this.msg = msg;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getMsg()
/* 31:   */   {
/* 32:40 */     return this.msg;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicMenuAddResponse
 * JD-Core Version:    0.7.0.1
 */