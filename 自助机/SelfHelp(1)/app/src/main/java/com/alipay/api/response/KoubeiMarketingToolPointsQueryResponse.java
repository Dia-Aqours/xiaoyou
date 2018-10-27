/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingToolPointsQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5866671435489978447L;
/* 10:   */   @ApiField("available_points")
/* 11:   */   private String availablePoints;
/* 12:   */   @ApiField("freezed_points")
/* 13:   */   private String freezedPoints;
/* 14:   */   @ApiField("total_points")
/* 15:   */   private String totalPoints;
/* 16:   */   
/* 17:   */   public void setAvailablePoints(String availablePoints)
/* 18:   */   {
/* 19:36 */     this.availablePoints = availablePoints;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getAvailablePoints()
/* 23:   */   {
/* 24:39 */     return this.availablePoints;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setFreezedPoints(String freezedPoints)
/* 28:   */   {
/* 29:43 */     this.freezedPoints = freezedPoints;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getFreezedPoints()
/* 33:   */   {
/* 34:46 */     return this.freezedPoints;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setTotalPoints(String totalPoints)
/* 38:   */   {
/* 39:50 */     this.totalPoints = totalPoints;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getTotalPoints()
/* 43:   */   {
/* 44:53 */     return this.totalPoints;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingToolPointsQueryResponse
 * JD-Core Version:    0.7.0.1
 */