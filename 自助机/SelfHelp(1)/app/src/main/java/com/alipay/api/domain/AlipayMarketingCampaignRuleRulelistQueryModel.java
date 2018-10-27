/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignRuleRulelistQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5719486196776745114L;
/* 10:   */   @ApiField("mpid")
/* 11:   */   private String mpid;
/* 12:   */   @ApiField("pageno")
/* 13:   */   private String pageno;
/* 14:   */   @ApiField("pagesize")
/* 15:   */   private String pagesize;
/* 16:   */   
/* 17:   */   public String getMpid()
/* 18:   */   {
/* 19:35 */     return this.mpid;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMpid(String mpid)
/* 23:   */   {
/* 24:38 */     this.mpid = mpid;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPageno()
/* 28:   */   {
/* 29:42 */     return this.pageno;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageno(String pageno)
/* 33:   */   {
/* 34:45 */     this.pageno = pageno;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPagesize()
/* 38:   */   {
/* 39:49 */     return this.pagesize;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPagesize(String pagesize)
/* 43:   */   {
/* 44:52 */     this.pagesize = pagesize;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignRuleRulelistQueryModel
 * JD-Core Version:    0.7.0.1
 */