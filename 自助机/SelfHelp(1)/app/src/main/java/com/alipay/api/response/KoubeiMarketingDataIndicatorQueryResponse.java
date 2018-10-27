/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataIndicatorQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3391575897245522422L;
/* 10:   */   @ApiField("indicator_infos")
/* 11:   */   private String indicatorInfos;
/* 12:   */   @ApiField("total_size")
/* 13:   */   private String totalSize;
/* 14:   */   
/* 15:   */   public void setIndicatorInfos(String indicatorInfos)
/* 16:   */   {
/* 17:30 */     this.indicatorInfos = indicatorInfos;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getIndicatorInfos()
/* 21:   */   {
/* 22:33 */     return this.indicatorInfos;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setTotalSize(String totalSize)
/* 26:   */   {
/* 27:37 */     this.totalSize = totalSize;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getTotalSize()
/* 31:   */   {
/* 32:40 */     return this.totalSize;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataIndicatorQueryResponse
 * JD-Core Version:    0.7.0.1
 */