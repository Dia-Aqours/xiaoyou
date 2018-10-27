/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.IsvShopDishModel;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOfflineProviderDishQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1541785135879283295L;
/* 13:   */   @ApiField("items")
/* 14:   */   private Long items;
/* 15:   */   @ApiListField("list")
/* 16:   */   @ApiField("isv_shop_dish_model")
/* 17:   */   private List<IsvShopDishModel> list;
/* 18:   */   @ApiField("page")
/* 19:   */   private Long page;
/* 20:   */   @ApiField("page_size")
/* 21:   */   private Long pageSize;
/* 22:   */   @ApiField("pages")
/* 23:   */   private Long pages;
/* 24:   */   
/* 25:   */   public void setItems(Long items)
/* 26:   */   {
/* 27:52 */     this.items = items;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getItems()
/* 31:   */   {
/* 32:55 */     return this.items;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setList(List<IsvShopDishModel> list)
/* 36:   */   {
/* 37:59 */     this.list = list;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<IsvShopDishModel> getList()
/* 41:   */   {
/* 42:62 */     return this.list;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setPage(Long page)
/* 46:   */   {
/* 47:66 */     this.page = page;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Long getPage()
/* 51:   */   {
/* 52:69 */     return this.page;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setPageSize(Long pageSize)
/* 56:   */   {
/* 57:73 */     this.pageSize = pageSize;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public Long getPageSize()
/* 61:   */   {
/* 62:76 */     return this.pageSize;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setPages(Long pages)
/* 66:   */   {
/* 67:80 */     this.pages = pages;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Long getPages()
/* 71:   */   {
/* 72:83 */     return this.pages;
/* 73:   */   }
/* 74:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineProviderDishQueryResponse
 * JD-Core Version:    0.7.0.1
 */