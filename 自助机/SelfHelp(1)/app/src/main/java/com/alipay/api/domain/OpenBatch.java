/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class OpenBatch
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6683958669246777782L;
/* 10:   */   @ApiField("batch_id")
/* 11:   */   private String batchId;
/* 12:   */   @ApiField("batch_status")
/* 13:   */   private String batchStatus;
/* 14:   */   @ApiField("item_num")
/* 15:   */   private String itemNum;
/* 16:   */   
/* 17:   */   public String getBatchId()
/* 18:   */   {
/* 19:39 */     return this.batchId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBatchId(String batchId)
/* 23:   */   {
/* 24:42 */     this.batchId = batchId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getBatchStatus()
/* 28:   */   {
/* 29:46 */     return this.batchStatus;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setBatchStatus(String batchStatus)
/* 33:   */   {
/* 34:49 */     this.batchStatus = batchStatus;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getItemNum()
/* 38:   */   {
/* 39:53 */     return this.itemNum;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setItemNum(String itemNum)
/* 43:   */   {
/* 44:56 */     this.itemNum = itemNum;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenBatch
 * JD-Core Version:    0.7.0.1
 */