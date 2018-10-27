/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InstallmentMetaInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8182685715435928971L;
/* 10:   */   @ApiField("end_term")
/* 11:   */   private Long endTerm;
/* 12:   */   @ApiField("start_term")
/* 13:   */   private Long startTerm;
/* 14:   */   @ApiField("value")
/* 15:   */   private String value;
/* 16:   */   
/* 17:   */   public Long getEndTerm()
/* 18:   */   {
/* 19:35 */     return this.endTerm;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setEndTerm(Long endTerm)
/* 23:   */   {
/* 24:38 */     this.endTerm = endTerm;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Long getStartTerm()
/* 28:   */   {
/* 29:42 */     return this.startTerm;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setStartTerm(Long startTerm)
/* 33:   */   {
/* 34:45 */     this.startTerm = startTerm;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getValue()
/* 38:   */   {
/* 39:49 */     return this.value;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setValue(String value)
/* 43:   */   {
/* 44:52 */     this.value = value;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InstallmentMetaInfo
 * JD-Core Version:    0.7.0.1
 */