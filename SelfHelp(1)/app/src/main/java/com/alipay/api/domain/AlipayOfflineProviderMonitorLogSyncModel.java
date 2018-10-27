/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOfflineProviderMonitorLogSyncModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5451371939527487177L;
/* 12:   */   @ApiListField("logs")
/* 13:   */   @ApiField("i_s_v_log_sync")
/* 14:   */   private List<ISVLogSync> logs;
/* 15:   */   
/* 16:   */   public List<ISVLogSync> getLogs()
/* 17:   */   {
/* 18:27 */     return this.logs;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setLogs(List<ISVLogSync> logs)
/* 22:   */   {
/* 23:30 */     this.logs = logs;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderMonitorLogSyncModel
 * JD-Core Version:    0.7.0.1
 */