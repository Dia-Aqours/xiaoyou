/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiItemExtitemBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5466381818778845698L;
/* 10:   */   @ApiField("brand_code")
/* 11:   */   private String brandCode;
/* 12:   */   @ApiField("category_code")
/* 13:   */   private String categoryCode;
/* 14:   */   @ApiField("page_num")
/* 15:   */   private String pageNum;
/* 16:   */   @ApiField("page_size")
/* 17:   */   private String pageSize;
/* 18:   */   @ApiField("title")
/* 19:   */   private String title;
/* 20:   */   
/* 21:   */   public String getBrandCode()
/* 22:   */   {
/* 23:47 */     return this.brandCode;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setBrandCode(String brandCode)
/* 27:   */   {
/* 28:50 */     this.brandCode = brandCode;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCategoryCode()
/* 32:   */   {
/* 33:54 */     return this.categoryCode;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCategoryCode(String categoryCode)
/* 37:   */   {
/* 38:57 */     this.categoryCode = categoryCode;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getPageNum()
/* 42:   */   {
/* 43:61 */     return this.pageNum;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setPageNum(String pageNum)
/* 47:   */   {
/* 48:64 */     this.pageNum = pageNum;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getPageSize()
/* 52:   */   {
/* 53:68 */     return this.pageSize;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setPageSize(String pageSize)
/* 57:   */   {
/* 58:71 */     this.pageSize = pageSize;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getTitle()
/* 62:   */   {
/* 63:75 */     return this.title;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setTitle(String title)
/* 67:   */   {
/* 68:78 */     this.title = title;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemExtitemBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */