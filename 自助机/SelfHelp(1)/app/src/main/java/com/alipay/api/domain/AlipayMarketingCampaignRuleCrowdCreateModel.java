/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCampaignRuleCrowdCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7728122552267841659L;
/* 10:   */   @ApiField("mdatacrowdsource")
/* 11:   */   private String mdatacrowdsource;
/* 12:   */   @ApiField("mpid")
/* 13:   */   private String mpid;
/* 14:   */   @ApiField("ruledesc")
/* 15:   */   private String ruledesc;
/* 16:   */   
/* 17:   */   public String getMdatacrowdsource()
/* 18:   */   {
/* 19:62 */     return this.mdatacrowdsource;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMdatacrowdsource(String mdatacrowdsource)
/* 23:   */   {
/* 24:65 */     this.mdatacrowdsource = mdatacrowdsource;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getMpid()
/* 28:   */   {
/* 29:69 */     return this.mpid;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setMpid(String mpid)
/* 33:   */   {
/* 34:72 */     this.mpid = mpid;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getRuledesc()
/* 38:   */   {
/* 39:76 */     return this.ruledesc;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setRuledesc(String ruledesc)
/* 43:   */   {
/* 44:79 */     this.ruledesc = ruledesc;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignRuleCrowdCreateModel

 * JD-Core Version:    0.7.0.1

 */