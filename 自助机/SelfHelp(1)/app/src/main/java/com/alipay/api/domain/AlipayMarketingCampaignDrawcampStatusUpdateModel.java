/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDrawcampStatusUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4213483975539328621L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("camp_status")
/* 13:   */   private String campStatus;
/* 14:   */   
/* 15:   */   public String getCampId()
/* 16:   */   {
/* 17:29 */     return this.campId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCampId(String campId)
/* 21:   */   {
/* 22:32 */     this.campId = campId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCampStatus()
/* 26:   */   {
/* 27:36 */     return this.campStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCampStatus(String campStatus)
/* 31:   */   {
/* 32:39 */     this.campStatus = campStatus;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDrawcampStatusUpdateModel
 * JD-Core Version:    0.7.0.1
 */