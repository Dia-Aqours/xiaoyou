/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignCashStatusModifyModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4249653679713237914L;
/* 10:   */   @ApiField("camp_status")
/* 11:   */   private String campStatus;
/* 12:   */   @ApiField("crowd_no")
/* 13:   */   private String crowdNo;
/* 14:   */   
/* 15:   */   public String getCampStatus()
/* 16:   */   {
/* 17:29 */     return this.campStatus;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCampStatus(String campStatus)
/* 21:   */   {
/* 22:32 */     this.campStatus = campStatus;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCrowdNo()
/* 26:   */   {
/* 27:36 */     return this.crowdNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCrowdNo(String crowdNo)
/* 31:   */   {
/* 32:39 */     this.crowdNo = crowdNo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignCashStatusModifyModel
 * JD-Core Version:    0.7.0.1
 */