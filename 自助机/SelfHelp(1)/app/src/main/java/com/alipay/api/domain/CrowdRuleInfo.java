/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class CrowdRuleInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5562575352247946172L;
/* 10:   */   @ApiField("ruledesc")
/* 11:   */   private String ruledesc;
/* 12:   */   @ApiField("ruleid")
/* 13:   */   private String ruleid;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   
/* 17:   */   public String getRuledesc()
/* 18:   */   {
/* 19:35 */     return this.ruledesc;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setRuledesc(String ruledesc)
/* 23:   */   {
/* 24:38 */     this.ruledesc = ruledesc;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getRuleid()
/* 28:   */   {
/* 29:42 */     return this.ruleid;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setRuleid(String ruleid)
/* 33:   */   {
/* 34:45 */     this.ruleid = ruleid;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStatus()
/* 38:   */   {
/* 39:49 */     return this.status;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStatus(String status)
/* 43:   */   {
/* 44:52 */     this.status = status;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CrowdRuleInfo

 * JD-Core Version:    0.7.0.1

 */