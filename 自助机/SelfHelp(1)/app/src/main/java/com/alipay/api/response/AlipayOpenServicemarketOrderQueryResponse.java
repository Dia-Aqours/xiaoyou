/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.OrderItem;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOpenServicemarketOrderQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4443174275338523362L;
/* 13:   */   @ApiField("commodity_id")
/* 14:   */   private String commodityId;
/* 15:   */   @ApiField("current_page")
/* 16:   */   private Long currentPage;
/* 17:   */   @ApiListField("order_items")
/* 18:   */   @ApiField("order_item")
/* 19:   */   private List<OrderItem> orderItems;
/* 20:   */   @ApiField("status")
/* 21:   */   private String status;
/* 22:   */   @ApiField("total_size")
/* 23:   */   private Long totalSize;
/* 24:   */   
/* 25:   */   public void setCommodityId(String commodityId)
/* 26:   */   {
/* 27:52 */     this.commodityId = commodityId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCommodityId()
/* 31:   */   {
/* 32:55 */     return this.commodityId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setCurrentPage(Long currentPage)
/* 36:   */   {
/* 37:59 */     this.currentPage = currentPage;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public Long getCurrentPage()
/* 41:   */   {
/* 42:62 */     return this.currentPage;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setOrderItems(List<OrderItem> orderItems)
/* 46:   */   {
/* 47:66 */     this.orderItems = orderItems;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public List<OrderItem> getOrderItems()
/* 51:   */   {
/* 52:69 */     return this.orderItems;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setStatus(String status)
/* 56:   */   {
/* 57:73 */     this.status = status;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String getStatus()
/* 61:   */   {
/* 62:76 */     return this.status;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setTotalSize(Long totalSize)
/* 66:   */   {
/* 67:80 */     this.totalSize = totalSize;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Long getTotalSize()
/* 71:   */   {
/* 72:83 */     return this.totalSize;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenServicemarketOrderQueryResponse
 * JD-Core Version:    0.7.0.1
 */