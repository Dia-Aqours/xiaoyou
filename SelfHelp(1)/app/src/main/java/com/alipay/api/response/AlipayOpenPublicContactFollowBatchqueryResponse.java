/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ContactFollower;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayOpenPublicContactFollowBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1286673678281538477L;
/* 13:   */   @ApiListField("contact_follow_list")
/* 14:   */   @ApiField("contact_follower")
/* 15:   */   private List<ContactFollower> contactFollowList;
/* 16:   */   
/* 17:   */   public void setContactFollowList(List<ContactFollower> contactFollowList)
/* 18:   */   {
/* 19:28 */     this.contactFollowList = contactFollowList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ContactFollower> getContactFollowList()
/* 23:   */   {
/* 24:31 */     return this.contactFollowList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicContactFollowBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */