/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ItemQueryResponse;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiItemBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4741239389456194442L;
/* 13:   */   @ApiField("current_page_no")
/* 14:   */   private String currentPageNo;
/* 15:   */   @ApiListField("item_infos")
/* 16:   */   @ApiField("item_query_response")
/* 17:   */   private List<ItemQueryResponse> itemInfos;
/* 18:   */   @ApiField("page_size")
/* 19:   */   private String pageSize;
/* 20:   */   @ApiField("total_items")
/* 21:   */   private String totalItems;
/* 22:   */   @ApiField("total_page_no")
/* 23:   */   private String totalPageNo;
/* 24:   */   
/* 25:   */   public void setCurrentPageNo(String currentPageNo)
/* 26:   */   {
/* 27:52 */     this.currentPageNo = currentPageNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCurrentPageNo()
/* 31:   */   {
/* 32:55 */     return this.currentPageNo;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setItemInfos(List<ItemQueryResponse> itemInfos)
/* 36:   */   {
/* 37:59 */     this.itemInfos = itemInfos;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<ItemQueryResponse> getItemInfos()
/* 41:   */   {
/* 42:62 */     return this.itemInfos;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setPageSize(String pageSize)
/* 46:   */   {
/* 47:66 */     this.pageSize = pageSize;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String getPageSize()
/* 51:   */   {
/* 52:69 */     return this.pageSize;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setTotalItems(String totalItems)
/* 56:   */   {
/* 57:73 */     this.totalItems = totalItems;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String getTotalItems()
/* 61:   */   {
/* 62:76 */     return this.totalItems;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setTotalPageNo(String totalPageNo)
/* 66:   */   {
/* 67:80 */     this.totalPageNo = totalPageNo;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public String getTotalPageNo()
/* 71:   */   {
/* 72:83 */     return this.totalPageNo;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiItemBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */