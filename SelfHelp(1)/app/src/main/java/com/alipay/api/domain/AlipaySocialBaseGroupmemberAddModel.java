/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipaySocialBaseGroupmemberAddModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4535335894936364595L;
/* 12:   */   @ApiField("friend_validate")
/* 13:   */   private Boolean friendValidate;
/* 14:   */   @ApiField("group_id")
/* 15:   */   private String groupId;
/* 16:   */   @ApiListField("user_ids")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> userIds;
/* 19:   */   
/* 20:   */   public Boolean getFriendValidate()
/* 21:   */   {
/* 22:39 */     return this.friendValidate;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setFriendValidate(Boolean friendValidate)
/* 26:   */   {
/* 27:42 */     this.friendValidate = friendValidate;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getGroupId()
/* 31:   */   {
/* 32:46 */     return this.groupId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setGroupId(String groupId)
/* 36:   */   {
/* 37:49 */     this.groupId = groupId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<String> getUserIds()
/* 41:   */   {
/* 42:53 */     return this.userIds;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setUserIds(List<String> userIds)
/* 46:   */   {
/* 47:56 */     this.userIds = userIds;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySocialBaseGroupmemberAddModel
 * JD-Core Version:    0.7.0.1
 */