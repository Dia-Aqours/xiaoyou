/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDrawcampQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4695759547171124528L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   
/* 13:   */   public String getCampId()
/* 14:   */   {
/* 15:23 */     return this.campId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCampId(String campId)
/* 19:   */   {
/* 20:26 */     this.campId = campId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDrawcampQueryModel
 * JD-Core Version:    0.7.0.1
 */