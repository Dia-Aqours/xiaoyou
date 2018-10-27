/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketLeadsClaimModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2274315394638869644L;
/* 10:   */   @ApiField("leads_id")
/* 11:   */   private String leadsId;
/* 12:   */   @ApiField("op_id")
/* 13:   */   private String opId;
/* 14:   */   @ApiField("operate_notify_url")
/* 15:   */   private String operateNotifyUrl;
/* 16:   */   @ApiField("request_id")
/* 17:   */   private String requestId;
/* 18:   */   
/* 19:   */   public String getLeadsId()
/* 20:   */   {
/* 21:41 */     return this.leadsId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setLeadsId(String leadsId)
/* 25:   */   {
/* 26:44 */     this.leadsId = leadsId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOpId()
/* 30:   */   {
/* 31:48 */     return this.opId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOpId(String opId)
/* 35:   */   {
/* 36:51 */     this.opId = opId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getOperateNotifyUrl()
/* 40:   */   {
/* 41:55 */     return this.operateNotifyUrl;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 45:   */   {
/* 46:58 */     this.operateNotifyUrl = operateNotifyUrl;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getRequestId()
/* 50:   */   {
/* 51:62 */     return this.requestId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setRequestId(String requestId)
/* 55:   */   {
/* 56:65 */     this.requestId = requestId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketLeadsClaimModel
 * JD-Core Version:    0.7.0.1
 */