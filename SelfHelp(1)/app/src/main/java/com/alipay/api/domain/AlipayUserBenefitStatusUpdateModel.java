/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserBenefitStatusUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5514829151283774214L;
/* 10:   */   @ApiField("benefit_id")
/* 11:   */   private String benefitId;
/* 12:   */   @ApiField("benefit_status")
/* 13:   */   private String benefitStatus;
/* 14:   */   
/* 15:   */   public String getBenefitId()
/* 16:   */   {
/* 17:32 */     return this.benefitId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBenefitId(String benefitId)
/* 21:   */   {
/* 22:35 */     this.benefitId = benefitId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getBenefitStatus()
/* 26:   */   {
/* 27:39 */     return this.benefitStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setBenefitStatus(String benefitStatus)
/* 31:   */   {
/* 32:42 */     this.benefitStatus = benefitStatus;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserBenefitStatusUpdateModel
 * JD-Core Version:    0.7.0.1
 */