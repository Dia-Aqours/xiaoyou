/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayEcoCplifeBillBatchUploadModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2378695724173825519L;
/* 12:   */   @ApiField("batch_id")
/* 13:   */   private String batchId;
/* 14:   */   @ApiListField("bill_set")
/* 15:   */   @ApiField("c_p_bill_set")
/* 16:   */   private List<CPBillSet> billSet;
/* 17:   */   @ApiField("community_id")
/* 18:   */   private String communityId;
/* 19:   */   
/* 20:   */   public String getBatchId()
/* 21:   */   {
/* 22:40 */     return this.batchId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBatchId(String batchId)
/* 26:   */   {
/* 27:43 */     this.batchId = batchId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public List<CPBillSet> getBillSet()
/* 31:   */   {
/* 32:47 */     return this.billSet;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setBillSet(List<CPBillSet> billSet)
/* 36:   */   {
/* 37:50 */     this.billSet = billSet;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getCommunityId()
/* 41:   */   {
/* 42:54 */     return this.communityId;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setCommunityId(String communityId)
/* 46:   */   {
/* 47:57 */     this.communityId = communityId;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeBillBatchUploadModel
 * JD-Core Version:    0.7.0.1
 */