/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketShopModifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5462199621212837933L;
/* 10:   */   @ApiField("apply_id")
/* 11:   */   private String applyId;
/* 12:   */   @ApiField("audit_desc")
/* 13:   */   private String auditDesc;
/* 14:   */   @ApiField("audit_status")
/* 15:   */   private String auditStatus;
/* 16:   */   @ApiField("is_online")
/* 17:   */   private String isOnline;
/* 18:   */   @ApiField("is_show")
/* 19:   */   private String isShow;
/* 20:   */   
/* 21:   */   public void setApplyId(String applyId)
/* 22:   */   {
/* 23:49 */     this.applyId = applyId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getApplyId()
/* 27:   */   {
/* 28:52 */     return this.applyId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setAuditDesc(String auditDesc)
/* 32:   */   {
/* 33:56 */     this.auditDesc = auditDesc;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getAuditDesc()
/* 37:   */   {
/* 38:59 */     return this.auditDesc;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setAuditStatus(String auditStatus)
/* 42:   */   {
/* 43:63 */     this.auditStatus = auditStatus;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getAuditStatus()
/* 47:   */   {
/* 48:66 */     return this.auditStatus;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setIsOnline(String isOnline)
/* 52:   */   {
/* 53:70 */     this.isOnline = isOnline;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getIsOnline()
/* 57:   */   {
/* 58:73 */     return this.isOnline;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setIsShow(String isShow)
/* 62:   */   {
/* 63:77 */     this.isShow = isShow;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getIsShow()
/* 67:   */   {
/* 68:80 */     return this.isShow;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopModifyResponse
 * JD-Core Version:    0.7.0.1
 */