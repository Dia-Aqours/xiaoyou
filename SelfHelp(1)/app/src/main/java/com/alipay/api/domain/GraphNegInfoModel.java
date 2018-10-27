/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class GraphNegInfoModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7597556479545391249L;
/* 10:   */   @ApiField("case_code")
/* 11:   */   private String caseCode;
/* 12:   */   @ApiField("duty")
/* 13:   */   private String duty;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("performance")
/* 17:   */   private String performance;
/* 18:   */   @ApiField("reg_date")
/* 19:   */   private String regDate;
/* 20:   */   
/* 21:   */   public String getCaseCode()
/* 22:   */   {
/* 23:47 */     return this.caseCode;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCaseCode(String caseCode)
/* 27:   */   {
/* 28:50 */     this.caseCode = caseCode;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getDuty()
/* 32:   */   {
/* 33:54 */     return this.duty;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setDuty(String duty)
/* 37:   */   {
/* 38:57 */     this.duty = duty;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getName()
/* 42:   */   {
/* 43:61 */     return this.name;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setName(String name)
/* 47:   */   {
/* 48:64 */     this.name = name;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getPerformance()
/* 52:   */   {
/* 53:68 */     return this.performance;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setPerformance(String performance)
/* 57:   */   {
/* 58:71 */     this.performance = performance;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getRegDate()
/* 62:   */   {
/* 63:75 */     return this.regDate;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setRegDate(String regDate)
/* 67:   */   {
/* 68:78 */     this.regDate = regDate;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GraphNegInfoModel
 * JD-Core Version:    0.7.0.1
 */