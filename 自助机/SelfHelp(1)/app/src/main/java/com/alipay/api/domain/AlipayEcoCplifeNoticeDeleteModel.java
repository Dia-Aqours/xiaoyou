/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class AlipayEcoCplifeNoticeDeleteModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6663867168941188682L;
/* 12:   */   @ApiListField("community_id_set")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> communityIdSet;
/* 15:   */   @ApiField("notice_id")
/* 16:   */   private String noticeId;
/* 17:   */   
/* 18:   */   public List<String> getCommunityIdSet()
/* 19:   */   {
/* 20:33 */     return this.communityIdSet;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setCommunityIdSet(List<String> communityIdSet)
/* 24:   */   {
/* 25:36 */     this.communityIdSet = communityIdSet;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getNoticeId()
/* 29:   */   {
/* 30:40 */     return this.noticeId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setNoticeId(String noticeId)
/* 34:   */   {
/* 35:43 */     this.noticeId = noticeId;
/* 36:   */   }
/* 37:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeNoticeDeleteModel

 * JD-Core Version:    0.7.0.1

 */