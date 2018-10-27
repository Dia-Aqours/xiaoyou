/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineSaleleadsQuerybyidsModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6787854448347735165L;
/* 10:   */   @ApiField("leads_id")
/* 11:   */   private String leadsId;
/* 12:   */   @ApiField("ope_pid")
/* 13:   */   private String opePid;
/* 14:   */   @ApiField("request_id")
/* 15:   */   private String requestId;
/* 16:   */   
/* 17:   */   public String getLeadsId()
/* 18:   */   {
/* 19:35 */     return this.leadsId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setLeadsId(String leadsId)
/* 23:   */   {
/* 24:38 */     this.leadsId = leadsId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOpePid()
/* 28:   */   {
/* 29:42 */     return this.opePid;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOpePid(String opePid)
/* 33:   */   {
/* 34:45 */     this.opePid = opePid;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getRequestId()
/* 38:   */   {
/* 39:49 */     return this.requestId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setRequestId(String requestId)
/* 43:   */   {
/* 44:52 */     this.requestId = requestId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsQuerybyidsModel
 * JD-Core Version:    0.7.0.1
 */