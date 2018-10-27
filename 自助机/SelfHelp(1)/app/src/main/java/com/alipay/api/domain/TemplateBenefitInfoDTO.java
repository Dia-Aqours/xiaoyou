/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.Date;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class TemplateBenefitInfoDTO
/* 10:   */   extends AlipayObject
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 7368457321753121945L;
/* 13:   */   @ApiListField("benefit_desc")
/* 14:   */   @ApiField("string")
/* 15:   */   private List<String> benefitDesc;
/* 16:   */   @ApiField("end_date")
/* 17:   */   private Date endDate;
/* 18:   */   @ApiField("start_date")
/* 19:   */   private Date startDate;
/* 20:   */   @ApiField("title")
/* 21:   */   private String title;
/* 22:   */   
/* 23:   */   public List<String> getBenefitDesc()
/* 24:   */   {
/* 25:46 */     return this.benefitDesc;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBenefitDesc(List<String> benefitDesc)
/* 29:   */   {
/* 30:49 */     this.benefitDesc = benefitDesc;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Date getEndDate()
/* 34:   */   {
/* 35:53 */     return this.endDate;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setEndDate(Date endDate)
/* 39:   */   {
/* 40:56 */     this.endDate = endDate;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public Date getStartDate()
/* 44:   */   {
/* 45:60 */     return this.startDate;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setStartDate(Date startDate)
/* 49:   */   {
/* 50:63 */     this.startDate = startDate;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getTitle()
/* 54:   */   {
/* 55:67 */     return this.title;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setTitle(String title)
/* 59:   */   {
/* 60:70 */     this.title = title;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TemplateBenefitInfoDTO
 * JD-Core Version:    0.7.0.1
 */