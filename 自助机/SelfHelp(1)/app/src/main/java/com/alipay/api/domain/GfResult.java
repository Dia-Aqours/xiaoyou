/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class GfResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3427366296172326126L;
/* 10:   */   @ApiField("cert_no")
/* 11:   */   private String certNo;
/* 12:   */   @ApiField("count")
/* 13:   */   private Long count;
/* 14:   */   @ApiField("exist")
/* 15:   */   private String exist;
/* 16:   */   @ApiField("max_score")
/* 17:   */   private Long maxScore;
/* 18:   */   @ApiField("min_score")
/* 19:   */   private Long minScore;
/* 20:   */   
/* 21:   */   public String getCertNo()
/* 22:   */   {
/* 23:47 */     return this.certNo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCertNo(String certNo)
/* 27:   */   {
/* 28:50 */     this.certNo = certNo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Long getCount()
/* 32:   */   {
/* 33:54 */     return this.count;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCount(Long count)
/* 37:   */   {
/* 38:57 */     this.count = count;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getExist()
/* 42:   */   {
/* 43:61 */     return this.exist;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setExist(String exist)
/* 47:   */   {
/* 48:64 */     this.exist = exist;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Long getMaxScore()
/* 52:   */   {
/* 53:68 */     return this.maxScore;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setMaxScore(Long maxScore)
/* 57:   */   {
/* 58:71 */     this.maxScore = maxScore;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public Long getMinScore()
/* 62:   */   {
/* 63:75 */     return this.minScore;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setMinScore(Long minScore)
/* 67:   */   {
/* 68:78 */     this.minScore = minScore;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GfResult
 * JD-Core Version:    0.7.0.1
 */