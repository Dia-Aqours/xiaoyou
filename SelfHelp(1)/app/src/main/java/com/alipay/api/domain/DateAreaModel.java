/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class DateAreaModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8148269359416919197L;
/* 10:   */   @ApiField("begin_date")
/* 11:   */   private String beginDate;
/* 12:   */   @ApiField("end_date")
/* 13:   */   private String endDate;
/* 14:   */   
/* 15:   */   public String getBeginDate()
/* 16:   */   {
/* 17:29 */     return this.beginDate;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBeginDate(String beginDate)
/* 21:   */   {
/* 22:32 */     this.beginDate = beginDate;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getEndDate()
/* 26:   */   {
/* 27:36 */     return this.endDate;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setEndDate(String endDate)
/* 31:   */   {
/* 32:39 */     this.endDate = endDate;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DateAreaModel
 * JD-Core Version:    0.7.0.1
 */