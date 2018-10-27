/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayEcoCplifeResidentinfoDeleteModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8761142391837234913L;
/* 12:   */   @ApiField("community_id")
/* 13:   */   private String communityId;
/* 14:   */   @ApiListField("out_resident_id_set")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> outResidentIdSet;
/* 17:   */   
/* 18:   */   public String getCommunityId()
/* 19:   */   {
/* 20:33 */     return this.communityId;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setCommunityId(String communityId)
/* 24:   */   {
/* 25:36 */     this.communityId = communityId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<String> getOutResidentIdSet()
/* 29:   */   {
/* 30:40 */     return this.outResidentIdSet;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setOutResidentIdSet(List<String> outResidentIdSet)
/* 34:   */   {
/* 35:43 */     this.outResidentIdSet = outResidentIdSet;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeResidentinfoDeleteModel
 * JD-Core Version:    0.7.0.1
 */