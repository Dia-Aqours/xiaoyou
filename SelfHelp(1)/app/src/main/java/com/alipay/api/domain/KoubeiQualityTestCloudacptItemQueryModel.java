/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiQualityTestCloudacptItemQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2413656653364546279L;
/* 10:   */   @ApiField("activity_id")
/* 11:   */   private String activityId;
/* 12:   */   @ApiField("batch_id")
/* 13:   */   private String batchId;
/* 14:   */   @ApiField("pid")
/* 15:   */   private String pid;
/* 16:   */   @ApiField("uid")
/* 17:   */   private String uid;
/* 18:   */   
/* 19:   */   public String getActivityId()
/* 20:   */   {
/* 21:41 */     return this.activityId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setActivityId(String activityId)
/* 25:   */   {
/* 26:44 */     this.activityId = activityId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getBatchId()
/* 30:   */   {
/* 31:48 */     return this.batchId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setBatchId(String batchId)
/* 35:   */   {
/* 36:51 */     this.batchId = batchId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getPid()
/* 40:   */   {
/* 41:55 */     return this.pid;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setPid(String pid)
/* 45:   */   {
/* 46:58 */     this.pid = pid;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getUid()
/* 50:   */   {
/* 51:62 */     return this.uid;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setUid(String uid)
/* 55:   */   {
/* 56:65 */     this.uid = uid;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiQualityTestCloudacptItemQueryModel
 * JD-Core Version:    0.7.0.1
 */