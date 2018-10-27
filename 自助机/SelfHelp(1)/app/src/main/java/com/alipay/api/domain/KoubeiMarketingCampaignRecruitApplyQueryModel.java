/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignRecruitApplyQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3274291389881563914L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("page_num")
/* 13:   */   private String pageNum;
/* 14:   */   @ApiField("page_size")
/* 15:   */   private String pageSize;
/* 16:   */   
/* 17:   */   public String getCampId()
/* 18:   */   {
/* 19:35 */     return this.campId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCampId(String campId)
/* 23:   */   {
/* 24:38 */     this.campId = campId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPageNum()
/* 28:   */   {
/* 29:42 */     return this.pageNum;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageNum(String pageNum)
/* 33:   */   {
/* 34:45 */     this.pageNum = pageNum;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPageSize()
/* 38:   */   {
/* 39:49 */     return this.pageSize;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPageSize(String pageSize)
/* 43:   */   {
/* 44:52 */     this.pageSize = pageSize;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignRecruitApplyQueryModel
 * JD-Core Version:    0.7.0.1
 */