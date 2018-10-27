/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class EduAgeDemand
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8448614694233882676L;
/* 10:   */   @ApiField("age_end")
/* 11:   */   private String ageEnd;
/* 12:   */   @ApiField("age_start")
/* 13:   */   private String ageStart;
/* 14:   */   
/* 15:   */   public String getAgeEnd()
/* 16:   */   {
/* 17:29 */     return this.ageEnd;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAgeEnd(String ageEnd)
/* 21:   */   {
/* 22:32 */     this.ageEnd = ageEnd;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getAgeStart()
/* 26:   */   {
/* 27:36 */     return this.ageStart;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setAgeStart(String ageStart)
/* 31:   */   {
/* 32:39 */     this.ageStart = ageStart;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.EduAgeDemand
 * JD-Core Version:    0.7.0.1
 */