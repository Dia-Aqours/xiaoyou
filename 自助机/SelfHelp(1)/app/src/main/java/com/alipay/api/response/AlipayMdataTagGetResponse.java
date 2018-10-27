/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMdataTagGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4345814661384623713L;
/* 10:   */   @ApiField("tag_values")
/* 11:   */   private String tagValues;
/* 12:   */   
/* 13:   */   public void setTagValues(String tagValues)
/* 14:   */   {
/* 15:24 */     this.tagValues = tagValues;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getTagValues()
/* 19:   */   {
/* 20:27 */     return this.tagValues;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMdataTagGetResponse
 * JD-Core Version:    0.7.0.1
 */