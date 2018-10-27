/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayEcoCplifeRoominfoDeleteModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6748994232799845198L;
/* 12:   */   @ApiField("batch_id")
/* 13:   */   private String batchId;
/* 14:   */   @ApiField("community_id")
/* 15:   */   private String communityId;
/* 16:   */   @ApiListField("out_room_id_set")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> outRoomIdSet;
/* 19:   */   
/* 20:   */   public String getBatchId()
/* 21:   */   {
/* 22:39 */     return this.batchId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBatchId(String batchId)
/* 26:   */   {
/* 27:42 */     this.batchId = batchId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCommunityId()
/* 31:   */   {
/* 32:46 */     return this.communityId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setCommunityId(String communityId)
/* 36:   */   {
/* 37:49 */     this.communityId = communityId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<String> getOutRoomIdSet()
/* 41:   */   {
/* 42:53 */     return this.outRoomIdSet;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setOutRoomIdSet(List<String> outRoomIdSet)
/* 46:   */   {
/* 47:56 */     this.outRoomIdSet = outRoomIdSet;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeRoominfoDeleteModel
 * JD-Core Version:    0.7.0.1
 */