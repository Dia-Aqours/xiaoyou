/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipaySecurityRiskContentResultGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3741487651662162648L;
/* 10:   */   @ApiField("app_scene")
/* 11:   */   private String appScene;
/* 12:   */   @ApiField("app_scene_data_id")
/* 13:   */   private String appSceneDataId;
/* 14:   */   
/* 15:   */   public String getAppScene()
/* 16:   */   {
/* 17:29 */     return this.appScene;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAppScene(String appScene)
/* 21:   */   {
/* 22:32 */     this.appScene = appScene;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getAppSceneDataId()
/* 26:   */   {
/* 27:36 */     return this.appSceneDataId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setAppSceneDataId(String appSceneDataId)
/* 31:   */   {
/* 32:39 */     this.appSceneDataId = appSceneDataId;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskContentResultGetModel

 * JD-Core Version:    0.7.0.1

 */