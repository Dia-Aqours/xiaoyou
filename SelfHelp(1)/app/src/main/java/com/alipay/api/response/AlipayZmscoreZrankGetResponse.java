/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayZmScoreZrankResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayZmscoreZrankGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2399621397883737893L;
/* 11:   */   @ApiField("zm_score_zrank")
/* 12:   */   private AlipayZmScoreZrankResult zmScoreZrank;
/* 13:   */   
/* 14:   */   public void setZmScoreZrank(AlipayZmScoreZrankResult zmScoreZrank)
/* 15:   */   {
/* 16:25 */     this.zmScoreZrank = zmScoreZrank;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayZmScoreZrankResult getZmScoreZrank()
/* 20:   */   {
/* 21:28 */     return this.zmScoreZrank;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayZmscoreZrankGetResponse
 * JD-Core Version:    0.7.0.1
 */