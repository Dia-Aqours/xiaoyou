/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ExtItem;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class KoubeiItemExtitemBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4413587775742938586L;
/* 13:   */   @ApiListField("model_list")
/* 14:   */   @ApiField("ext_item")
/* 15:   */   private List<ExtItem> modelList;
/* 16:   */   @ApiField("page_num")
/* 17:   */   private String pageNum;
/* 18:   */   @ApiField("page_size")
/* 19:   */   private String pageSize;
/* 20:   */   @ApiField("total_size")
/* 21:   */   private String totalSize;
/* 22:   */   
/* 23:   */   public void setModelList(List<ExtItem> modelList)
/* 24:   */   {
/* 25:46 */     this.modelList = modelList;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<ExtItem> getModelList()
/* 29:   */   {
/* 30:49 */     return this.modelList;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setPageNum(String pageNum)
/* 34:   */   {
/* 35:53 */     this.pageNum = pageNum;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getPageNum()
/* 39:   */   {
/* 40:56 */     return this.pageNum;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setPageSize(String pageSize)
/* 44:   */   {
/* 45:60 */     this.pageSize = pageSize;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getPageSize()
/* 49:   */   {
/* 50:63 */     return this.pageSize;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setTotalSize(String totalSize)
/* 54:   */   {
/* 55:67 */     this.totalSize = totalSize;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getTotalSize()
/* 59:   */   {
/* 60:70 */     return this.totalSize;
/* 61:   */   }
/* 62:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.KoubeiItemExtitemBatchqueryResponse

 * JD-Core Version:    0.7.0.1

 */