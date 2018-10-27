/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityRiskMobileactivityQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2218526497924879435L;
/* 10:   */   @ApiField("mobile")
/* 11:   */   private String mobile;
/* 12:   */   @ApiField("scene_id")
/* 13:   */   private String sceneId;
/* 14:   */   @ApiField("user_id")
/* 15:   */   private String userId;
/* 16:   */   
/* 17:   */   public String getMobile()
/* 18:   */   {
/* 19:35 */     return this.mobile;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMobile(String mobile)
/* 23:   */   {
/* 24:38 */     this.mobile = mobile;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getSceneId()
/* 28:   */   {
/* 29:42 */     return this.sceneId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setSceneId(String sceneId)
/* 33:   */   {
/* 34:45 */     this.sceneId = sceneId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUserId()
/* 38:   */   {
/* 39:49 */     return this.userId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUserId(String userId)
/* 43:   */   {
/* 44:52 */     this.userId = userId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskMobileactivityQueryModel
 * JD-Core Version:    0.7.0.1
 */