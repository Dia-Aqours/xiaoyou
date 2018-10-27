/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;

/*   7:    */
/*   8:    */ public class CustomReportCondition
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 6343954152885746698L;
/*  12:    */   @ApiField("condition_key")
/*  13:    */   private String conditionKey;
/*  14:    */   @ApiListField("data_tags")
/*  15:    */   @ApiField("data_tag")
/*  16:    */   private List<DataTag> dataTags;
/*  17:    */   @ApiListField("filter_tags")
/*  18:    */   @ApiField("filter_tag")
/*  19:    */   private List<FilterTag> filterTags;
/*  20:    */   @ApiField("group_tags")
/*  21:    */   private String groupTags;
/*  22:    */   @ApiField("memo")
/*  23:    */   private String memo;
/*  24:    */   @ApiField("name")
/*  25:    */   private String name;
/*  26:    */   @ApiField("sort_tags")
/*  27:    */   private String sortTags;
/*  28:    */   
/*  29:    */   public String getConditionKey()
/*  30:    */   {
/*  31: 66 */     return this.conditionKey;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setConditionKey(String conditionKey)
/*  35:    */   {
/*  36: 69 */     this.conditionKey = conditionKey;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public List<DataTag> getDataTags()
/*  40:    */   {
/*  41: 73 */     return this.dataTags;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setDataTags(List<DataTag> dataTags)
/*  45:    */   {
/*  46: 76 */     this.dataTags = dataTags;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public List<FilterTag> getFilterTags()
/*  50:    */   {
/*  51: 80 */     return this.filterTags;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setFilterTags(List<FilterTag> filterTags)
/*  55:    */   {
/*  56: 83 */     this.filterTags = filterTags;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getGroupTags()
/*  60:    */   {
/*  61: 87 */     return this.groupTags;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setGroupTags(String groupTags)
/*  65:    */   {
/*  66: 90 */     this.groupTags = groupTags;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getMemo()
/*  70:    */   {
/*  71: 94 */     return this.memo;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setMemo(String memo)
/*  75:    */   {
/*  76: 97 */     this.memo = memo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getName()
/*  80:    */   {
/*  81:101 */     return this.name;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setName(String name)
/*  85:    */   {
/*  86:104 */     this.name = name;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getSortTags()
/*  90:    */   {
/*  91:108 */     return this.sortTags;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setSortTags(String sortTags)
/*  95:    */   {
/*  96:111 */     this.sortTags = sortTags;
/*  97:    */   }
/*  98:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CustomReportCondition

 * JD-Core Version:    0.7.0.1

 */