/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ZhimaCreditScoreGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1489144378191465631L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   @ApiField("zm_score")
/* 13:   */   private String zmScore;
/* 14:   */   
/* 15:   */   public void setBizNo(String bizNo)
/* 16:   */   {
/* 17:30 */     this.bizNo = bizNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getBizNo()
/* 21:   */   {
/* 22:33 */     return this.bizNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setZmScore(String zmScore)
/* 26:   */   {
/* 27:37 */     this.zmScore = zmScore;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getZmScore()
/* 31:   */   {
/* 32:40 */     return this.zmScore;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.ZhimaCreditScoreGetResponse

 * JD-Core Version:    0.7.0.1

 */