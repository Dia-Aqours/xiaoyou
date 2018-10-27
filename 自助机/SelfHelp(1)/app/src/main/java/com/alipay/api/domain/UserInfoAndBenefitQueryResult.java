/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class UserInfoAndBenefitQueryResult
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3723775385686938864L;
/* 12:   */   @ApiField("balance")
/* 13:   */   private Long balance;
/* 14:   */   @ApiListField("benefit_info_list")
/* 15:   */   @ApiField("benefit_grade_point")
/* 16:   */   private List<BenefitGradePoint> benefitInfoList;
/* 17:   */   @ApiField("grade")
/* 18:   */   private String grade;
/* 19:   */   
/* 20:   */   public Long getBalance()
/* 21:   */   {
/* 22:39 */     return this.balance;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBalance(Long balance)
/* 26:   */   {
/* 27:42 */     this.balance = balance;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<BenefitGradePoint> getBenefitInfoList()
/* 31:   */   {
/* 32:46 */     return this.benefitInfoList;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setBenefitInfoList(List<BenefitGradePoint> benefitInfoList)
/* 36:   */   {
/* 37:49 */     this.benefitInfoList = benefitInfoList;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getGrade()
/* 41:   */   {
/* 42:53 */     return this.grade;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setGrade(String grade)
/* 46:   */   {
/* 47:56 */     this.grade = grade;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.UserInfoAndBenefitQueryResult
 * JD-Core Version:    0.7.0.1
 */