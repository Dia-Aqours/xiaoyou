/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoEduJzApplyresultSyncModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7458537313434967387L;
/* 10:   */   @ApiField("apply_third_id")
/* 11:   */   private String applyThirdId;
/* 12:   */   @ApiField("audit_remark")
/* 13:   */   private String auditRemark;
/* 14:   */   @ApiField("listing_status")
/* 15:   */   private String listingStatus;
/* 16:   */   
/* 17:   */   public String getApplyThirdId()
/* 18:   */   {
/* 19:35 */     return this.applyThirdId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setApplyThirdId(String applyThirdId)
/* 23:   */   {
/* 24:38 */     this.applyThirdId = applyThirdId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getAuditRemark()
/* 28:   */   {
/* 29:42 */     return this.auditRemark;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setAuditRemark(String auditRemark)
/* 33:   */   {
/* 34:45 */     this.auditRemark = auditRemark;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getListingStatus()
/* 38:   */   {
/* 39:49 */     return this.listingStatus;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setListingStatus(String listingStatus)
/* 43:   */   {
/* 44:52 */     this.listingStatus = listingStatus;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoEduJzApplyresultSyncModel
 * JD-Core Version:    0.7.0.1
 */