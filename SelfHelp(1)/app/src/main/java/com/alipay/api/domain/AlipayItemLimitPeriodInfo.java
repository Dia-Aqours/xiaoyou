/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayItemLimitPeriodInfo
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5521418498468795675L;
/* 12:   */   @ApiField("rule")
/* 13:   */   private String rule;
/* 14:   */   @ApiField("unit")
/* 15:   */   private String unit;
/* 16:   */   @ApiListField("value")
/* 17:   */   @ApiField("number")
/* 18:   */   private List<Long> value;
/* 19:   */   
/* 20:   */   public String getRule()
/* 21:   */   {
/* 22:48 */     return this.rule;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setRule(String rule)
/* 26:   */   {
/* 27:51 */     this.rule = rule;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getUnit()
/* 31:   */   {
/* 32:55 */     return this.unit;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setUnit(String unit)
/* 36:   */   {
/* 37:58 */     this.unit = unit;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<Long> getValue()
/* 41:   */   {
/* 42:62 */     return this.value;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setValue(List<Long> value)
/* 46:   */   {
/* 47:65 */     this.value = value;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayItemLimitPeriodInfo
 * JD-Core Version:    0.7.0.1
 */