/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class BenefitGradePoint
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2827863742572321183L;
/* 12:   */   @ApiField("benefit_id")
/* 13:   */   private String benefitId;
/* 14:   */   @ApiListField("grade_points")
/* 15:   */   @ApiField("grade_discount_point")
/* 16:   */   private List<GradeDiscountPoint> gradePoints;
/* 17:   */   @ApiField("original_point")
/* 18:   */   private String originalPoint;
/* 19:   */   @ApiField("own_grades")
/* 20:   */   private String ownGrades;
/* 21:   */   
/* 22:   */   public String getBenefitId()
/* 23:   */   {
/* 24:45 */     return this.benefitId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setBenefitId(String benefitId)
/* 28:   */   {
/* 29:48 */     this.benefitId = benefitId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public List<GradeDiscountPoint> getGradePoints()
/* 33:   */   {
/* 34:52 */     return this.gradePoints;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setGradePoints(List<GradeDiscountPoint> gradePoints)
/* 38:   */   {
/* 39:55 */     this.gradePoints = gradePoints;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getOriginalPoint()
/* 43:   */   {
/* 44:59 */     return this.originalPoint;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setOriginalPoint(String originalPoint)
/* 48:   */   {
/* 49:62 */     this.originalPoint = originalPoint;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getOwnGrades()
/* 53:   */   {
/* 54:66 */     return this.ownGrades;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setOwnGrades(String ownGrades)
/* 58:   */   {
/* 59:69 */     this.ownGrades = ownGrades;
/* 60:   */   }
/* 61:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BenefitGradePoint
 * JD-Core Version:    0.7.0.1
 */