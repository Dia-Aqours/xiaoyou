/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOpenPublicShortlinkCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1199693624931615724L;
/* 10:   */   @ApiField("shortlink")
/* 11:   */   private String shortlink;
/* 12:   */   
/* 13:   */   public void setShortlink(String shortlink)
/* 14:   */   {
/* 15:24 */     this.shortlink = shortlink;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getShortlink()
/* 19:   */   {
/* 20:27 */     return this.shortlink;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicShortlinkCreateResponse

 * JD-Core Version:    0.7.0.1

 */