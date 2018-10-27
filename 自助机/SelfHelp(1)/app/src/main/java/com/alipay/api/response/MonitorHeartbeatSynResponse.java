/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class MonitorHeartbeatSynResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7651297969326561157L;
/* 10:   */   @ApiField("pid")
/* 11:   */   private String pid;
/* 12:   */   
/* 13:   */   public void setPid(String pid)
/* 14:   */   {
/* 15:24 */     this.pid = pid;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getPid()
/* 19:   */   {
/* 20:27 */     return this.pid;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.MonitorHeartbeatSynResponse

 * JD-Core Version:    0.7.0.1

 */