/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InvestigCategoryData
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4741474652141543442L;
/* 10:   */   @ApiField("category")
/* 11:   */   private String category;
/* 12:   */   @ApiField("entity_code")
/* 13:   */   private String entityCode;
/* 14:   */   @ApiField("entity_name")
/* 15:   */   private String entityName;
/* 16:   */   @ApiField("entity_type")
/* 17:   */   private String entityType;
/* 18:   */   @ApiField("model_result_object")
/* 19:   */   private String modelResultObject;
/* 20:   */   @ApiField("state")
/* 21:   */   private String state;
/* 22:   */   
/* 23:   */   public String getCategory()
/* 24:   */   {
/* 25:53 */     return this.category;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCategory(String category)
/* 29:   */   {
/* 30:56 */     this.category = category;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getEntityCode()
/* 34:   */   {
/* 35:60 */     return this.entityCode;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setEntityCode(String entityCode)
/* 39:   */   {
/* 40:63 */     this.entityCode = entityCode;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getEntityName()
/* 44:   */   {
/* 45:67 */     return this.entityName;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setEntityName(String entityName)
/* 49:   */   {
/* 50:70 */     this.entityName = entityName;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getEntityType()
/* 54:   */   {
/* 55:74 */     return this.entityType;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setEntityType(String entityType)
/* 59:   */   {
/* 60:77 */     this.entityType = entityType;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getModelResultObject()
/* 64:   */   {
/* 65:81 */     return this.modelResultObject;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setModelResultObject(String modelResultObject)
/* 69:   */   {
/* 70:84 */     this.modelResultObject = modelResultObject;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getState()
/* 74:   */   {
/* 75:88 */     return this.state;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setState(String state)
/* 79:   */   {
/* 80:91 */     this.state = state;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InvestigCategoryData
 * JD-Core Version:    0.7.0.1
 */