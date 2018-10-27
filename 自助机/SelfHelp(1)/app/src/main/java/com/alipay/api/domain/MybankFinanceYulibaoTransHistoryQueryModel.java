/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankFinanceYulibaoTransHistoryQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4228187583687975553L;
/* 10:   */   @ApiField("end_date")
/* 11:   */   private String endDate;
/* 12:   */   @ApiField("fund_code")
/* 13:   */   private String fundCode;
/* 14:   */   @ApiField("page")
/* 15:   */   private Long page;
/* 16:   */   @ApiField("page_size")
/* 17:   */   private Long pageSize;
/* 18:   */   @ApiField("start_date")
/* 19:   */   private String startDate;
/* 20:   */   
/* 21:   */   public String getEndDate()
/* 22:   */   {
/* 23:47 */     return this.endDate;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setEndDate(String endDate)
/* 27:   */   {
/* 28:50 */     this.endDate = endDate;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getFundCode()
/* 32:   */   {
/* 33:54 */     return this.fundCode;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setFundCode(String fundCode)
/* 37:   */   {
/* 38:57 */     this.fundCode = fundCode;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public Long getPage()
/* 42:   */   {
/* 43:61 */     return this.page;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setPage(Long page)
/* 47:   */   {
/* 48:64 */     this.page = page;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Long getPageSize()
/* 52:   */   {
/* 53:68 */     return this.pageSize;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setPageSize(Long pageSize)
/* 57:   */   {
/* 58:71 */     this.pageSize = pageSize;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getStartDate()
/* 62:   */   {
/* 63:75 */     return this.startDate;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setStartDate(String startDate)
/* 67:   */   {
/* 68:78 */     this.startDate = startDate;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MybankFinanceYulibaoTransHistoryQueryModel
 * JD-Core Version:    0.7.0.1
 */