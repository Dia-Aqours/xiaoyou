/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class LabelFilter
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4155312839572224469L;
/* 12:   */   @ApiField("column_name")
/* 13:   */   private String columnName;
/* 14:   */   @ApiField("op")
/* 15:   */   private String op;
/* 16:   */   @ApiListField("values")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> values;
/* 19:   */   
/* 20:   */   public String getColumnName()
/* 21:   */   {
/* 22:39 */     return this.columnName;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setColumnName(String columnName)
/* 26:   */   {
/* 27:42 */     this.columnName = columnName;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getOp()
/* 31:   */   {
/* 32:46 */     return this.op;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setOp(String op)
/* 36:   */   {
/* 37:49 */     this.op = op;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<String> getValues()
/* 41:   */   {
/* 42:53 */     return this.values;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setValues(List<String> values)
/* 46:   */   {
/* 47:56 */     this.values = values;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.LabelFilter
 * JD-Core Version:    0.7.0.1
 */