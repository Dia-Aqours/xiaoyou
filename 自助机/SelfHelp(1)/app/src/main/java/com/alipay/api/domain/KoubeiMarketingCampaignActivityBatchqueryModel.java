/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiMarketingCampaignActivityBatchqueryModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2128645554452788852L;
/* 12:   */   @ApiField("operator_id")
/* 13:   */   private String operatorId;
/* 14:   */   @ApiField("operator_type")
/* 15:   */   private String operatorType;
/* 16:   */   @ApiField("page_number")
/* 17:   */   private String pageNumber;
/* 18:   */   @ApiField("page_size")
/* 19:   */   private String pageSize;
/* 20:   */   @ApiListField("query_criterias")
/* 21:   */   @ApiField("condition")
/* 22:   */   private List<Condition> queryCriterias;
/* 23:   */   
/* 24:   */   public String getOperatorId()
/* 25:   */   {
/* 26:51 */     return this.operatorId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setOperatorId(String operatorId)
/* 30:   */   {
/* 31:54 */     this.operatorId = operatorId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getOperatorType()
/* 35:   */   {
/* 36:58 */     return this.operatorType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setOperatorType(String operatorType)
/* 40:   */   {
/* 41:61 */     this.operatorType = operatorType;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getPageNumber()
/* 45:   */   {
/* 46:65 */     return this.pageNumber;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setPageNumber(String pageNumber)
/* 50:   */   {
/* 51:68 */     this.pageNumber = pageNumber;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getPageSize()
/* 55:   */   {
/* 56:72 */     return this.pageSize;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setPageSize(String pageSize)
/* 60:   */   {
/* 61:75 */     this.pageSize = pageSize;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public List<Condition> getQueryCriterias()
/* 65:   */   {
/* 66:79 */     return this.queryCriterias;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setQueryCriterias(List<Condition> queryCriterias)
/* 70:   */   {
/* 71:82 */     this.queryCriterias = queryCriterias;
/* 72:   */   }
/* 73:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignActivityBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */