/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayItemAuditRule
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8312984773111735466L;
/* 10:   */   @ApiField("audit_type")
/* 11:   */   private String auditType;
/* 12:   */   @ApiField("need_audit")
/* 13:   */   private Boolean needAudit;
/* 14:   */   
/* 15:   */   public String getAuditType()
/* 16:   */   {
/* 17:29 */     return this.auditType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAuditType(String auditType)
/* 21:   */   {
/* 22:32 */     this.auditType = auditType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Boolean getNeedAudit()
/* 26:   */   {
/* 27:36 */     return this.needAudit;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setNeedAudit(Boolean needAudit)
/* 31:   */   {
/* 32:39 */     this.needAudit = needAudit;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayItemAuditRule

 * JD-Core Version:    0.7.0.1

 */