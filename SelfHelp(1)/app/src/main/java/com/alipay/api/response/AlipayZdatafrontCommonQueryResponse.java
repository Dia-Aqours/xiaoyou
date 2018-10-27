/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayZdatafrontCommonQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7739112752535984966L;
/* 10:   */   @ApiField("cache_timestamp")
/* 11:   */   private Long cacheTimestamp;
/* 12:   */   @ApiField("values")
/* 13:   */   private String values;
/* 14:   */   
/* 15:   */   public void setCacheTimestamp(Long cacheTimestamp)
/* 16:   */   {
/* 17:32 */     this.cacheTimestamp = cacheTimestamp;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public Long getCacheTimestamp()
/* 21:   */   {
/* 22:35 */     return this.cacheTimestamp;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setValues(String values)
/* 26:   */   {
/* 27:39 */     this.values = values;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getValues()
/* 31:   */   {
/* 32:42 */     return this.values;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayZdatafrontCommonQueryResponse
 * JD-Core Version:    0.7.0.1
 */