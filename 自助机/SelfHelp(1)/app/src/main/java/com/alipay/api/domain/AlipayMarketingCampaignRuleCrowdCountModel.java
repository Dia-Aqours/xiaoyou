/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCampaignRuleCrowdCountModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7444631479885364429L;
/* 10:   */   @ApiField("mpid")
/* 11:   */   private String mpid;
/* 12:   */   @ApiField("ruleid")
/* 13:   */   private String ruleid;
/* 14:   */   @ApiField("scenetagjson")
/* 15:   */   private String scenetagjson;
/* 16:   */   
/* 17:   */   public String getMpid()
/* 18:   */   {
/* 19:62 */     return this.mpid;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMpid(String mpid)
/* 23:   */   {
/* 24:65 */     this.mpid = mpid;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getRuleid()
/* 28:   */   {
/* 29:69 */     return this.ruleid;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setRuleid(String ruleid)
/* 33:   */   {
/* 34:72 */     this.ruleid = ruleid;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getScenetagjson()
/* 38:   */   {
/* 39:76 */     return this.scenetagjson;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setScenetagjson(String scenetagjson)
/* 43:   */   {
/* 44:79 */     this.scenetagjson = scenetagjson;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignRuleCrowdCountModel

 * JD-Core Version:    0.7.0.1

 */