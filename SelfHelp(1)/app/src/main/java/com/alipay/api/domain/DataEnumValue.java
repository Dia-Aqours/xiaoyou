/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class DataEnumValue
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5465942742422636566L;
/* 12:   */   @ApiListField("filter_tags")
/* 13:   */   @ApiField("filter_tag")
/* 14:   */   private List<FilterTag> filterTags;
/* 15:   */   @ApiField("label")
/* 16:   */   private String label;
/* 17:   */   @ApiField("value")
/* 18:   */   private String value;
/* 19:   */   
/* 20:   */   public List<FilterTag> getFilterTags()
/* 21:   */   {
/* 22:39 */     return this.filterTags;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setFilterTags(List<FilterTag> filterTags)
/* 26:   */   {
/* 27:42 */     this.filterTags = filterTags;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getLabel()
/* 31:   */   {
/* 32:46 */     return this.label;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setLabel(String label)
/* 36:   */   {
/* 37:49 */     this.label = label;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getValue()
/* 41:   */   {
/* 42:53 */     return this.value;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setValue(String value)
/* 46:   */   {
/* 47:56 */     this.value = value;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DataEnumValue
 * JD-Core Version:    0.7.0.1
 */