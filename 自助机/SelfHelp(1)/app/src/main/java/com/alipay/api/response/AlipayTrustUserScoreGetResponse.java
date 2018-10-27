/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AliTrustScore;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;

/*  6:   */
/*  7:   */ public class AlipayTrustUserScoreGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2883567925292916477L;
/* 11:   */   @ApiField("ali_trust_score")
/* 12:   */   private AliTrustScore aliTrustScore;
/* 13:   */   
/* 14:   */   public void setAliTrustScore(AliTrustScore aliTrustScore)
/* 15:   */   {
/* 16:25 */     this.aliTrustScore = aliTrustScore;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AliTrustScore getAliTrustScore()
/* 20:   */   {
/* 21:28 */     return this.aliTrustScore;
/* 22:   */   }
/* 23:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayTrustUserScoreGetResponse

 * JD-Core Version:    0.7.0.1

 */