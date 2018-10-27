/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPlatformUseridGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4586584559549915423L;
/* 10:   */   @ApiField("dict")
/* 11:   */   private String dict;
/* 12:   */   
/* 13:   */   public void setDict(String dict)
/* 14:   */   {
/* 15:24 */     this.dict = dict;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getDict()
/* 19:   */   {
/* 20:27 */     return this.dict;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayPlatformUseridGetResponse
 * JD-Core Version:    0.7.0.1
 */