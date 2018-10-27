/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.OpenBatch;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiQualityTestCloudacptBatchQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1526574929797539994L;
/* 13:   */   @ApiField("activity_id")
/* 14:   */   private String activityId;
/* 15:   */   @ApiListField("batch_list")
/* 16:   */   @ApiField("open_batch")
/* 17:   */   private List<OpenBatch> batchList;
/* 18:   */   @ApiField("batch_num")
/* 19:   */   private String batchNum;
/* 20:   */   
/* 21:   */   public void setActivityId(String activityId)
/* 22:   */   {
/* 23:40 */     this.activityId = activityId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getActivityId()
/* 27:   */   {
/* 28:43 */     return this.activityId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setBatchList(List<OpenBatch> batchList)
/* 32:   */   {
/* 33:47 */     this.batchList = batchList;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public List<OpenBatch> getBatchList()
/* 37:   */   {
/* 38:50 */     return this.batchList;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setBatchNum(String batchNum)
/* 42:   */   {
/* 43:54 */     this.batchNum = batchNum;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getBatchNum()
/* 47:   */   {
/* 48:57 */     return this.batchNum;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiQualityTestCloudacptBatchQueryResponse
 * JD-Core Version:    0.7.0.1
 */