/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class GradeDiscountPoint
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2774688781377772129L;
/* 10:   */   @ApiField("benefit_id")
/* 11:   */   private Long benefitId;
/* 12:   */   @ApiField("discount_point")
/* 13:   */   private String discountPoint;
/* 14:   */   @ApiField("grade")
/* 15:   */   private String grade;
/* 16:   */   
/* 17:   */   public Long getBenefitId()
/* 18:   */   {
/* 19:35 */     return this.benefitId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBenefitId(Long benefitId)
/* 23:   */   {
/* 24:38 */     this.benefitId = benefitId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getDiscountPoint()
/* 28:   */   {
/* 29:42 */     return this.discountPoint;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setDiscountPoint(String discountPoint)
/* 33:   */   {
/* 34:45 */     this.discountPoint = discountPoint;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getGrade()
/* 38:   */   {
/* 39:49 */     return this.grade;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setGrade(String grade)
/* 43:   */   {
/* 44:52 */     this.grade = grade;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GradeDiscountPoint
 * JD-Core Version:    0.7.0.1
 */