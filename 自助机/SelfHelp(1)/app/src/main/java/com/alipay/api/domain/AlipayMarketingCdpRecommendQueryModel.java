/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCdpRecommendQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7214392725465743733L;
/* 10:   */   @ApiField("ad_code")
/* 11:   */   private String adCode;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("logon_id")
/* 15:   */   private String logonId;
/* 16:   */   
/* 17:   */   public String getAdCode()
/* 18:   */   {
/* 19:35 */     return this.adCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAdCode(String adCode)
/* 23:   */   {
/* 24:38 */     this.adCode = adCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getExtInfo()
/* 28:   */   {
/* 29:42 */     return this.extInfo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setExtInfo(String extInfo)
/* 33:   */   {
/* 34:45 */     this.extInfo = extInfo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getLogonId()
/* 38:   */   {
/* 39:49 */     return this.logonId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setLogonId(String logonId)
/* 43:   */   {
/* 44:52 */     this.logonId = logonId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCdpRecommendQueryModel
 * JD-Core Version:    0.7.0.1
 */