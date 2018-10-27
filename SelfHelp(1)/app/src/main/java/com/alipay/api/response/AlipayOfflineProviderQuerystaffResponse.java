/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.StaffDTO;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineProviderQuerystaffResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3354775248378133142L;
/* 13:   */   @ApiField("current_page")
/* 14:   */   private Long currentPage;
/* 15:   */   @ApiField("items_per_page")
/* 16:   */   private Long itemsPerPage;
/* 17:   */   @ApiListField("query_result")
/* 18:   */   @ApiField("staff_d_t_o")
/* 19:   */   private List<StaffDTO> queryResult;
/* 20:   */   @ApiField("total_count")
/* 21:   */   private Long totalCount;
/* 22:   */   @ApiField("total_pages")
/* 23:   */   private Long totalPages;
/* 24:   */   
/* 25:   */   public void setCurrentPage(Long currentPage)
/* 26:   */   {
/* 27:52 */     this.currentPage = currentPage;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getCurrentPage()
/* 31:   */   {
/* 32:55 */     return this.currentPage;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setItemsPerPage(Long itemsPerPage)
/* 36:   */   {
/* 37:59 */     this.itemsPerPage = itemsPerPage;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public Long getItemsPerPage()
/* 41:   */   {
/* 42:62 */     return this.itemsPerPage;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setQueryResult(List<StaffDTO> queryResult)
/* 46:   */   {
/* 47:66 */     this.queryResult = queryResult;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public List<StaffDTO> getQueryResult()
/* 51:   */   {
/* 52:69 */     return this.queryResult;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setTotalCount(Long totalCount)
/* 56:   */   {
/* 57:73 */     this.totalCount = totalCount;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public Long getTotalCount()
/* 61:   */   {
/* 62:76 */     return this.totalCount;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setTotalPages(Long totalPages)
/* 66:   */   {
/* 67:80 */     this.totalPages = totalPages;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Long getTotalPages()
/* 71:   */   {
/* 72:83 */     return this.totalPages;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineProviderQuerystaffResponse
 * JD-Core Version:    0.7.0.1
 */