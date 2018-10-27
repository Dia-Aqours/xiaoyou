/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignActivityCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2716559555894595873L;
/* 10:   */   @ApiField("audit_status")
/* 11:   */   private String auditStatus;
/* 12:   */   @ApiField("camp_id")
/* 13:   */   private String campId;
/* 14:   */   @ApiField("camp_status")
/* 15:   */   private String campStatus;
/* 16:   */   
/* 17:   */   public void setAuditStatus(String auditStatus)
/* 18:   */   {
/* 19:40 */     this.auditStatus = auditStatus;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getAuditStatus()
/* 23:   */   {
/* 24:43 */     return this.auditStatus;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setCampId(String campId)
/* 28:   */   {
/* 29:47 */     this.campId = campId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getCampId()
/* 33:   */   {
/* 34:50 */     return this.campId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setCampStatus(String campStatus)
/* 38:   */   {
/* 39:54 */     this.campStatus = campStatus;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getCampStatus()
/* 43:   */   {
/* 44:57 */     return this.campStatus;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignActivityCreateResponse
 * JD-Core Version:    0.7.0.1
 */