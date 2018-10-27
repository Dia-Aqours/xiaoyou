/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.LeadsQueryResponse;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineMarketLeadsBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1853154143722567878L;
/* 13:   */   @ApiField("current_page_no")
/* 14:   */   private Long currentPageNo;
/* 15:   */   @ApiListField("leads_query_responses")
/* 16:   */   @ApiField("leads_query_response")
/* 17:   */   private List<LeadsQueryResponse> leadsQueryResponses;
/* 18:   */   @ApiField("page_size")
/* 19:   */   private Long pageSize;
/* 20:   */   @ApiField("total_items")
/* 21:   */   private Long totalItems;
/* 22:   */   @ApiField("total_page_no")
/* 23:   */   private Long totalPageNo;
/* 24:   */   
/* 25:   */   public void setCurrentPageNo(Long currentPageNo)
/* 26:   */   {
/* 27:52 */     this.currentPageNo = currentPageNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getCurrentPageNo()
/* 31:   */   {
/* 32:55 */     return this.currentPageNo;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setLeadsQueryResponses(List<LeadsQueryResponse> leadsQueryResponses)
/* 36:   */   {
/* 37:59 */     this.leadsQueryResponses = leadsQueryResponses;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<LeadsQueryResponse> getLeadsQueryResponses()
/* 41:   */   {
/* 42:62 */     return this.leadsQueryResponses;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setPageSize(Long pageSize)
/* 46:   */   {
/* 47:66 */     this.pageSize = pageSize;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Long getPageSize()
/* 51:   */   {
/* 52:69 */     return this.pageSize;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setTotalItems(Long totalItems)
/* 56:   */   {
/* 57:73 */     this.totalItems = totalItems;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public Long getTotalItems()
/* 61:   */   {
/* 62:76 */     return this.totalItems;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setTotalPageNo(Long totalPageNo)
/* 66:   */   {
/* 67:80 */     this.totalPageNo = totalPageNo;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Long getTotalPageNo()
/* 71:   */   {
/* 72:83 */     return this.totalPageNo;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketLeadsBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */