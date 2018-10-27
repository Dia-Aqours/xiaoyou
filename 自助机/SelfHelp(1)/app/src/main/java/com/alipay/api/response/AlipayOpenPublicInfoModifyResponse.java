/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicInfoModifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8598299597217331365L;
/* 10:   */   @ApiField("audit_desc")
/* 11:   */   private String auditDesc;
/* 12:   */   @ApiField("audit_status")
/* 13:   */   private String auditStatus;
/* 14:   */   
/* 15:   */   public void setAuditDesc(String auditDesc)
/* 16:   */   {
/* 17:30 */     this.auditDesc = auditDesc;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getAuditDesc()
/* 21:   */   {
/* 22:33 */     return this.auditDesc;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setAuditStatus(String auditStatus)
/* 26:   */   {
/* 27:37 */     this.auditStatus = auditStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getAuditStatus()
/* 31:   */   {
/* 32:40 */     return this.auditStatus;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicInfoModifyResponse
 * JD-Core Version:    0.7.0.1
 */