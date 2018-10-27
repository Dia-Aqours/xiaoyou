/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiQualityTestCloudacptCheckresultSubmitResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7594631442965474548L;
/* 10:   */   @ApiField("activity_id")
/* 11:   */   private String activityId;
/* 12:   */   @ApiField("batch_id")
/* 13:   */   private String batchId;
/* 14:   */   
/* 15:   */   public void setActivityId(String activityId)
/* 16:   */   {
/* 17:30 */     this.activityId = activityId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getActivityId()
/* 21:   */   {
/* 22:33 */     return this.activityId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBatchId(String batchId)
/* 26:   */   {
/* 27:37 */     this.batchId = batchId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getBatchId()
/* 31:   */   {
/* 32:40 */     return this.batchId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiQualityTestCloudacptCheckresultSubmitResponse
 * JD-Core Version:    0.7.0.1
 */