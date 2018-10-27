/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignRuleTagQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5273164745218625297L;
/* 10:   */   @ApiField("mpid")
/* 11:   */   private String mpid;
/* 12:   */   
/* 13:   */   public String getMpid()
/* 14:   */   {
/* 15:23 */     return this.mpid;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMpid(String mpid)
/* 19:   */   {
/* 20:26 */     this.mpid = mpid;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignRuleTagQueryModel
 * JD-Core Version:    0.7.0.1
 */