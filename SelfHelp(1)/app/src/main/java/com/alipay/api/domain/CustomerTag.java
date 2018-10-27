/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CustomerTag
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3725863522722492724L;
/* 10:   */   @ApiField("col_name")
/* 11:   */   private String colName;
/* 12:   */   @ApiField("column_type")
/* 13:   */   private String columnType;
/* 14:   */   @ApiField("id")
/* 15:   */   private String id;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
/* 18:   */   
/* 19:   */   public String getColName()
/* 20:   */   {
/* 21:41 */     return this.colName;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setColName(String colName)
/* 25:   */   {
/* 26:44 */     this.colName = colName;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getColumnType()
/* 30:   */   {
/* 31:48 */     return this.columnType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setColumnType(String columnType)
/* 35:   */   {
/* 36:51 */     this.columnType = columnType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getId()
/* 40:   */   {
/* 41:55 */     return this.id;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setId(String id)
/* 45:   */   {
/* 46:58 */     this.id = id;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getName()
/* 50:   */   {
/* 51:62 */     return this.name;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setName(String name)
/* 55:   */   {
/* 56:65 */     this.name = name;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CustomerTag
 * JD-Core Version:    0.7.0.1
 */