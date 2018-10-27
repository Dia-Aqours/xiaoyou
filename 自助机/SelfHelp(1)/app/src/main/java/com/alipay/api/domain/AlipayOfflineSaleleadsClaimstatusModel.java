/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineSaleleadsClaimstatusModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6424774142126153995L;
/* 10:   */   @ApiField("leads_id")
/* 11:   */   private String leadsId;
/* 12:   */   @ApiField("ope_pid")
/* 13:   */   private String opePid;
/* 14:   */   @ApiField("ope_pid_orig")
/* 15:   */   private String opePidOrig;
/* 16:   */   @ApiField("oper_type")
/* 17:   */   private String operType;
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
/* 31:   */   public String getOpePid()
/* 32:   */   {
/* 33:54 */     return this.opePid;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOpePid(String opePid)
/* 37:   */   {
/* 38:57 */     this.opePid = opePid;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOpePidOrig()
/* 42:   */   {
/* 43:61 */     return this.opePidOrig;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOpePidOrig(String opePidOrig)
/* 47:   */   {
/* 48:64 */     this.opePidOrig = opePidOrig;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOperType()
/* 52:   */   {
/* 53:68 */     return this.operType;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOperType(String operType)
/* 57:   */   {
/* 58:71 */     this.operType = operType;
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
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsClaimstatusModel
 * JD-Core Version:    0.7.0.1
 */