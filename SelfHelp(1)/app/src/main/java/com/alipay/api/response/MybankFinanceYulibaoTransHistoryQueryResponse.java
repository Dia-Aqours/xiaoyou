/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.YLBTransDetailInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class MybankFinanceYulibaoTransHistoryQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 2358581151481256426L;
/* 13:   */   @ApiField("current_page")
/* 14:   */   private Long currentPage;
/* 15:   */   @ApiField("has_next_page")
/* 16:   */   private Boolean hasNextPage;
/* 17:   */   @ApiListField("history_trans_detail_infos")
/* 18:   */   @ApiField("y_l_b_trans_detail_info")
/* 19:   */   private List<YLBTransDetailInfo> historyTransDetailInfos;
/* 20:   */   @ApiField("total_item_count")
/* 21:   */   private String totalItemCount;
/* 22:   */   
/* 23:   */   public void setCurrentPage(Long currentPage)
/* 24:   */   {
/* 25:46 */     this.currentPage = currentPage;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public Long getCurrentPage()
/* 29:   */   {
/* 30:49 */     return this.currentPage;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setHasNextPage(Boolean hasNextPage)
/* 34:   */   {
/* 35:53 */     this.hasNextPage = hasNextPage;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public Boolean getHasNextPage()
/* 39:   */   {
/* 40:56 */     return this.hasNextPage;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setHistoryTransDetailInfos(List<YLBTransDetailInfo> historyTransDetailInfos)
/* 44:   */   {
/* 45:60 */     this.historyTransDetailInfos = historyTransDetailInfos;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public List<YLBTransDetailInfo> getHistoryTransDetailInfos()
/* 49:   */   {
/* 50:63 */     return this.historyTransDetailInfos;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setTotalItemCount(String totalItemCount)
/* 54:   */   {
/* 55:67 */     this.totalItemCount = totalItemCount;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getTotalItemCount()
/* 59:   */   {
/* 60:70 */     return this.totalItemCount;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.MybankFinanceYulibaoTransHistoryQueryResponse
 * JD-Core Version:    0.7.0.1
 */