/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class TemplateFieldRuleDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4267997121114676823L;
/* 10:   */   @ApiField("field_name")
/* 11:   */   private String fieldName;
/* 12:   */   @ApiField("rule_name")
/* 13:   */   private String ruleName;
/* 14:   */   @ApiField("rule_value")
/* 15:   */   private String ruleValue;
/* 16:   */   
/* 17:   */   public String getFieldName()
/* 18:   */   {
/* 19:46 */     return this.fieldName;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setFieldName(String fieldName)
/* 23:   */   {
/* 24:49 */     this.fieldName = fieldName;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getRuleName()
/* 28:   */   {
/* 29:53 */     return this.ruleName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setRuleName(String ruleName)
/* 33:   */   {
/* 34:56 */     this.ruleName = ruleName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getRuleValue()
/* 38:   */   {
/* 39:60 */     return this.ruleValue;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setRuleValue(String ruleValue)
/* 43:   */   {
/* 44:63 */     this.ruleValue = ruleValue;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TemplateFieldRuleDTO
 * JD-Core Version:    0.7.0.1
 */