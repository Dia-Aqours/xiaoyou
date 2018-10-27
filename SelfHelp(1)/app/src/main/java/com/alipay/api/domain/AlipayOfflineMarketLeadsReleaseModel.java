/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketLeadsReleaseModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4625944884618432152L;
/* 10:   */   @ApiField("leads_id")
/* 11:   */   private String leadsId;
/* 12:   */   @ApiField("op_id")
/* 13:   */   private String opId;
/* 14:   */   @ApiField("operate_notify_url")
/* 15:   */   private String operateNotifyUrl;
/* 16:   */   @ApiField("release_reason")
/* 17:   */   private String releaseReason;
/* 18:   */   @ApiField("request_id")
/* 19:   */   private String requestId;
/* 20:   */   
/* 21:   */   public String getLeadsId()
/* 22:   */   {
/* 23:47 */     return this.leadsId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setLeadsId(String leadsId)
/* 27:   */   {
/* 28:50 */     this.leadsId = leadsId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getOpId()
/* 32:   */   {
/* 33:54 */     return this.opId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOpId(String opId)
/* 37:   */   {
/* 38:57 */     this.opId = opId;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOperateNotifyUrl()
/* 42:   */   {
/* 43:61 */     return this.operateNotifyUrl;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 47:   */   {
/* 48:64 */     this.operateNotifyUrl = operateNotifyUrl;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getReleaseReason()
/* 52:   */   {
/* 53:68 */     return this.releaseReason;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setReleaseReason(String releaseReason)
/* 57:   */   {
/* 58:71 */     this.releaseReason = releaseReason;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getRequestId()
/* 62:   */   {
/* 63:75 */     return this.requestId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setRequestId(String requestId)
/* 67:   */   {
/* 68:78 */     this.requestId = requestId;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketLeadsReleaseModel
 * JD-Core Version:    0.7.0.1
 */