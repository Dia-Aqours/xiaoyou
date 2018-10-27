/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class InputFieldModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 8247866294635761648L;
/*  12:    */   @ApiField("default_value")
/*  13:    */   private String defaultValue;
/*  14:    */   @ApiField("field_name")
/*  15:    */   private String fieldName;
/*  16:    */   @ApiField("field_tips")
/*  17:    */   private String fieldTips;
/*  18:    */   @ApiField("field_title")
/*  19:    */   private String fieldTitle;
/*  20:    */   @ApiField("field_type")
/*  21:    */   private String fieldType;
/*  22:    */   @ApiField("priority")
/*  23:    */   private String priority;
/*  24:    */   @ApiListField("regexp_rule_list")
/*  25:    */   @ApiField("validation_rule")
/*  26:    */   private List<ValidationRule> regexpRuleList;
/*  27:    */   
/*  28:    */   public String getDefaultValue()
/*  29:    */   {
/*  30: 63 */     return this.defaultValue;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setDefaultValue(String defaultValue)
/*  34:    */   {
/*  35: 66 */     this.defaultValue = defaultValue;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getFieldName()
/*  39:    */   {
/*  40: 70 */     return this.fieldName;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setFieldName(String fieldName)
/*  44:    */   {
/*  45: 73 */     this.fieldName = fieldName;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getFieldTips()
/*  49:    */   {
/*  50: 77 */     return this.fieldTips;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setFieldTips(String fieldTips)
/*  54:    */   {
/*  55: 80 */     this.fieldTips = fieldTips;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getFieldTitle()
/*  59:    */   {
/*  60: 84 */     return this.fieldTitle;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setFieldTitle(String fieldTitle)
/*  64:    */   {
/*  65: 87 */     this.fieldTitle = fieldTitle;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getFieldType()
/*  69:    */   {
/*  70: 91 */     return this.fieldType;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setFieldType(String fieldType)
/*  74:    */   {
/*  75: 94 */     this.fieldType = fieldType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getPriority()
/*  79:    */   {
/*  80: 98 */     return this.priority;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setPriority(String priority)
/*  84:    */   {
/*  85:101 */     this.priority = priority;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public List<ValidationRule> getRegexpRuleList()
/*  89:    */   {
/*  90:105 */     return this.regexpRuleList;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setRegexpRuleList(List<ValidationRule> regexpRuleList)
/*  94:    */   {
/*  95:108 */     this.regexpRuleList = regexpRuleList;
/*  96:    */   }
/*  97:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InputFieldModel
 * JD-Core Version:    0.7.0.1
 */