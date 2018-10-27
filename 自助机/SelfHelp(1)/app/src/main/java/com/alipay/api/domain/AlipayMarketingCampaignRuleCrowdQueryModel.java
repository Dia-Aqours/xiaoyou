/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignRuleCrowdQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1473379275311872651L;
/* 10:   */   @ApiField("mpid")
/* 11:   */   private String mpid;
/* 12:   */   @ApiField("ruleid")
/* 13:   */   private String ruleid;
/* 14:   */   
/* 15:   */   public String getMpid()
/* 16:   */   {
/* 17:29 */     return this.mpid;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setMpid(String mpid)
/* 21:   */   {
/* 22:32 */     this.mpid = mpid;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRuleid()
/* 26:   */   {
/* 27:36 */     return this.ruleid;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRuleid(String ruleid)
/* 31:   */   {
/* 32:39 */     this.ruleid = ruleid;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignRuleCrowdQueryModel
 * JD-Core Version:    0.7.0.1
 */