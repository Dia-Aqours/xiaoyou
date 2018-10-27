/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoCplifeRooominfoQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1399774425616666169L;
/* 10:   */   @ApiField("community_id")
/* 11:   */   private String communityId;
/* 12:   */   @ApiField("page_num")
/* 13:   */   private Long pageNum;
/* 14:   */   @ApiField("page_size")
/* 15:   */   private Long pageSize;
/* 16:   */   
/* 17:   */   public String getCommunityId()
/* 18:   */   {
/* 19:35 */     return this.communityId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCommunityId(String communityId)
/* 23:   */   {
/* 24:38 */     this.communityId = communityId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Long getPageNum()
/* 28:   */   {
/* 29:42 */     return this.pageNum;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageNum(Long pageNum)
/* 33:   */   {
/* 34:45 */     this.pageNum = pageNum;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Long getPageSize()
/* 38:   */   {
/* 39:49 */     return this.pageSize;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPageSize(Long pageSize)
/* 43:   */   {
/* 44:52 */     this.pageSize = pageSize;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeRooominfoQueryModel
 * JD-Core Version:    0.7.0.1
 */