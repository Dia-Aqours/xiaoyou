/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignActivityOfflineResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5145698876987349448L;
/* 10:   */   @ApiField("audit_status")
/* 11:   */   private String auditStatus;
/* 12:   */   @ApiField("camp_status")
/* 13:   */   private String campStatus;
/* 14:   */   
/* 15:   */   public void setAuditStatus(String auditStatus)
/* 16:   */   {
/* 17:30 */     this.auditStatus = auditStatus;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getAuditStatus()
/* 21:   */   {
/* 22:33 */     return this.auditStatus;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setCampStatus(String campStatus)
/* 26:   */   {
/* 27:37 */     this.campStatus = campStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCampStatus()
/* 31:   */   {
/* 32:40 */     return this.campStatus;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignActivityOfflineResponse
 * JD-Core Version:    0.7.0.1
 */