/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiMarketingDataCustomreportQueryModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6175697722847772273L;
/* 12:   */   @ApiField("condition_key")
/* 13:   */   private String conditionKey;
/* 14:   */   @ApiListField("filter_tags")
/* 15:   */   @ApiField("filter_tag")
/* 16:   */   private List<FilterTag> filterTags;
/* 17:   */   @ApiField("max_count")
/* 18:   */   private String maxCount;
/* 19:   */   
/* 20:   */   public String getConditionKey()
/* 21:   */   {
/* 22:39 */     return this.conditionKey;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setConditionKey(String conditionKey)
/* 26:   */   {
/* 27:42 */     this.conditionKey = conditionKey;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<FilterTag> getFilterTags()
/* 31:   */   {
/* 32:46 */     return this.filterTags;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setFilterTags(List<FilterTag> filterTags)
/* 36:   */   {
/* 37:49 */     this.filterTags = filterTags;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getMaxCount()
/* 41:   */   {
/* 42:53 */     return this.maxCount;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setMaxCount(String maxCount)
/* 46:   */   {
/* 47:56 */     this.maxCount = maxCount;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataCustomreportQueryModel
 * JD-Core Version:    0.7.0.1
 */