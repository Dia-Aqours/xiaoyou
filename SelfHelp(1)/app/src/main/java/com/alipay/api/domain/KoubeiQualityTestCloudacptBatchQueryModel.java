/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiQualityTestCloudacptBatchQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8457443376398425256L;
/* 10:   */   @ApiField("activity_id")
/* 11:   */   private String activityId;
/* 12:   */   @ApiField("pid")
/* 13:   */   private String pid;
/* 14:   */   @ApiField("uid")
/* 15:   */   private String uid;
/* 16:   */   
/* 17:   */   public String getActivityId()
/* 18:   */   {
/* 19:35 */     return this.activityId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setActivityId(String activityId)
/* 23:   */   {
/* 24:38 */     this.activityId = activityId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPid()
/* 28:   */   {
/* 29:42 */     return this.pid;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPid(String pid)
/* 33:   */   {
/* 34:45 */     this.pid = pid;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUid()
/* 38:   */   {
/* 39:49 */     return this.uid;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUid(String uid)
/* 43:   */   {
/* 44:52 */     this.uid = uid;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiQualityTestCloudacptBatchQueryModel
 * JD-Core Version:    0.7.0.1
 */