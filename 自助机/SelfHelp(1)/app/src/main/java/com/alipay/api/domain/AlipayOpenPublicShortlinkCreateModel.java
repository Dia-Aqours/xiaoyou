/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicShortlinkCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1193957767576353558L;
/* 10:   */   @ApiField("remark")
/* 11:   */   private String remark;
/* 12:   */   @ApiField("scene_id")
/* 13:   */   private String sceneId;
/* 14:   */   
/* 15:   */   public String getRemark()
/* 16:   */   {
/* 17:29 */     return this.remark;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setRemark(String remark)
/* 21:   */   {
/* 22:32 */     this.remark = remark;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getSceneId()
/* 26:   */   {
/* 27:36 */     return this.sceneId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setSceneId(String sceneId)
/* 31:   */   {
/* 32:39 */     this.sceneId = sceneId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicShortlinkCreateModel
 * JD-Core Version:    0.7.0.1
 */