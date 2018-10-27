/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCreditWatchlistBriefGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8275945633586855544L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   @ApiField("level")
/* 13:   */   private String level;
/* 14:   */   
/* 15:   */   public void setBizNo(String bizNo)
/* 16:   */   {
/* 17:35 */     this.bizNo = bizNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getBizNo()
/* 21:   */   {
/* 22:38 */     return this.bizNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setLevel(String level)
/* 26:   */   {
/* 27:42 */     this.level = level;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getLevel()
/* 31:   */   {
/* 32:45 */     return this.level;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaCreditWatchlistBriefGetResponse
 * JD-Core Version:    0.7.0.1
 */