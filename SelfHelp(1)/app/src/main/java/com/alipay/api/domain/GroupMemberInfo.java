/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class GroupMemberInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2694853223559349412L;
/* 10:   */   @ApiField("group_nickname")
/* 11:   */   private String groupNickname;
/* 12:   */   @ApiField("nickname")
/* 13:   */   private String nickname;
/* 14:   */   @ApiField("user_id")
/* 15:   */   private String userId;
/* 16:   */   
/* 17:   */   public String getGroupNickname()
/* 18:   */   {
/* 19:35 */     return this.groupNickname;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setGroupNickname(String groupNickname)
/* 23:   */   {
/* 24:38 */     this.groupNickname = groupNickname;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getNickname()
/* 28:   */   {
/* 29:42 */     return this.nickname;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setNickname(String nickname)
/* 33:   */   {
/* 34:45 */     this.nickname = nickname;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUserId()
/* 38:   */   {
/* 39:49 */     return this.userId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUserId(String userId)
/* 43:   */   {
/* 44:52 */     this.userId = userId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GroupMemberInfo
 * JD-Core Version:    0.7.0.1
 */