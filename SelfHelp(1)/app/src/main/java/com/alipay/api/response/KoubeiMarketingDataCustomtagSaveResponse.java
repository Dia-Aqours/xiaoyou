/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataCustomtagSaveResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4612287293375241236L;
/* 10:   */   @ApiField("tag_code")
/* 11:   */   private String tagCode;
/* 12:   */   
/* 13:   */   public void setTagCode(String tagCode)
/* 14:   */   {
/* 15:24 */     this.tagCode = tagCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getTagCode()
/* 19:   */   {
/* 20:27 */     return this.tagCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomtagSaveResponse
 * JD-Core Version:    0.7.0.1
 */