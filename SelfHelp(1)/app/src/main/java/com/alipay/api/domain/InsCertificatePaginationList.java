/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class InsCertificatePaginationList
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7443462626466221349L;
/* 12:   */   @ApiField("current_page")
/* 13:   */   private Long currentPage;
/* 14:   */   @ApiListField("list")
/* 15:   */   @ApiField("ins_certificate_api_d_t_o")
/* 16:   */   private List<InsCertificateApiDTO> list;
/* 17:   */   @ApiField("page_size")
/* 18:   */   private Long pageSize;
/* 19:   */   @ApiField("total_count")
/* 20:   */   private Long totalCount;
/* 21:   */   @ApiField("total_page_num")
/* 22:   */   private Long totalPageNum;
/* 23:   */   
/* 24:   */   public Long getCurrentPage()
/* 25:   */   {
/* 26:51 */     return this.currentPage;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setCurrentPage(Long currentPage)
/* 30:   */   {
/* 31:54 */     this.currentPage = currentPage;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public List<InsCertificateApiDTO> getList()
/* 35:   */   {
/* 36:58 */     return this.list;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setList(List<InsCertificateApiDTO> list)
/* 40:   */   {
/* 41:61 */     this.list = list;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public Long getPageSize()
/* 45:   */   {
/* 46:65 */     return this.pageSize;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setPageSize(Long pageSize)
/* 50:   */   {
/* 51:68 */     this.pageSize = pageSize;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Long getTotalCount()
/* 55:   */   {
/* 56:72 */     return this.totalCount;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setTotalCount(Long totalCount)
/* 60:   */   {
/* 61:75 */     this.totalCount = totalCount;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Long getTotalPageNum()
/* 65:   */   {
/* 66:79 */     return this.totalPageNum;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setTotalPageNum(Long totalPageNum)
/* 70:   */   {
/* 71:82 */     this.totalPageNum = totalPageNum;
/* 72:   */   }
/* 73:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsCertificatePaginationList
 * JD-Core Version:    0.7.0.1
 */