/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMarketingDataMallIndicatorQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1356792185259181192L;
/* 10:   */   @ApiField("begin_date")
/* 11:   */   private String beginDate;
/* 12:   */   @ApiField("biz_type")
/* 13:   */   private String bizType;
/* 14:   */   @ApiField("end_date")
/* 15:   */   private String endDate;
/* 16:   */   @ApiField("ext_info")
/* 17:   */   private String extInfo;
/* 18:   */   @ApiField("page_num")
/* 19:   */   private Long pageNum;
/* 20:   */   @ApiField("page_size")
/* 21:   */   private Long pageSize;
/* 22:   */   
/* 23:   */   public String getBeginDate()
/* 24:   */   {
/* 25:61 */     return this.beginDate;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBeginDate(String beginDate)
/* 29:   */   {
/* 30:64 */     this.beginDate = beginDate;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getBizType()
/* 34:   */   {
/* 35:68 */     return this.bizType;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setBizType(String bizType)
/* 39:   */   {
/* 40:71 */     this.bizType = bizType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getEndDate()
/* 44:   */   {
/* 45:75 */     return this.endDate;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setEndDate(String endDate)
/* 49:   */   {
/* 50:78 */     this.endDate = endDate;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getExtInfo()
/* 54:   */   {
/* 55:82 */     return this.extInfo;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setExtInfo(String extInfo)
/* 59:   */   {
/* 60:85 */     this.extInfo = extInfo;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public Long getPageNum()
/* 64:   */   {
/* 65:89 */     return this.pageNum;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setPageNum(Long pageNum)
/* 69:   */   {
/* 70:92 */     this.pageNum = pageNum;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public Long getPageSize()
/* 74:   */   {
/* 75:96 */     return this.pageSize;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setPageSize(Long pageSize)
/* 79:   */   {
/* 80:99 */     this.pageSize = pageSize;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataMallIndicatorQueryModel

 * JD-Core Version:    0.7.0.1

 */