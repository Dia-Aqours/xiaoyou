/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class Condition
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6685623596244517137L;
/* 10:   */   @ApiField("field_name")
/* 11:   */   private String fieldName;
/* 12:   */   @ApiField("field_value")
/* 13:   */   private String fieldValue;
/* 14:   */   @ApiField("operator")
/* 15:   */   private String operator;
/* 16:   */   
/* 17:   */   public String getFieldName()
/* 18:   */   {
/* 19:39 */     return this.fieldName;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setFieldName(String fieldName)
/* 23:   */   {
/* 24:42 */     this.fieldName = fieldName;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getFieldValue()
/* 28:   */   {
/* 29:46 */     return this.fieldValue;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFieldValue(String fieldValue)
/* 33:   */   {
/* 34:49 */     this.fieldValue = fieldValue;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getOperator()
/* 38:   */   {
/* 39:53 */     return this.operator;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setOperator(String operator)
/* 43:   */   {
/* 44:56 */     this.operator = operator;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Condition
 * JD-Core Version:    0.7.0.1
 */