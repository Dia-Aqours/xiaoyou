/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AntProdpaasArrangementRebateRateQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2771247384131714961L;
/* 10:   */   @ApiField("data_item_name")
/* 11:   */   private String dataItemName;
/* 12:   */   @ApiField("first_category_id")
/* 13:   */   private String firstCategoryId;
/* 14:   */   @ApiField("gmt_query")
/* 15:   */   private String gmtQuery;
/* 16:   */   
/* 17:   */   public String getDataItemName()
/* 18:   */   {
/* 19:35 */     return this.dataItemName;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setDataItemName(String dataItemName)
/* 23:   */   {
/* 24:38 */     this.dataItemName = dataItemName;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getFirstCategoryId()
/* 28:   */   {
/* 29:42 */     return this.firstCategoryId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFirstCategoryId(String firstCategoryId)
/* 33:   */   {
/* 34:45 */     this.firstCategoryId = firstCategoryId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getGmtQuery()
/* 38:   */   {
/* 39:49 */     return this.gmtQuery;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setGmtQuery(String gmtQuery)
/* 43:   */   {
/* 44:52 */     this.gmtQuery = gmtQuery;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AntProdpaasArrangementRebateRateQueryModel
 * JD-Core Version:    0.7.0.1
 */