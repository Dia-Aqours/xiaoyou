/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class FriendListVO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8537345592683955173L;
/* 10:   */   @ApiField("head_img")
/* 11:   */   private String headImg;
/* 12:   */   @ApiField("real_friend")
/* 13:   */   private Boolean realFriend;
/* 14:   */   @ApiField("user_id")
/* 15:   */   private String userId;
/* 16:   */   @ApiField("view_name")
/* 17:   */   private String viewName;
/* 18:   */   
/* 19:   */   public String getHeadImg()
/* 20:   */   {
/* 21:41 */     return this.headImg;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setHeadImg(String headImg)
/* 25:   */   {
/* 26:44 */     this.headImg = headImg;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public Boolean getRealFriend()
/* 30:   */   {
/* 31:48 */     return this.realFriend;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setRealFriend(Boolean realFriend)
/* 35:   */   {
/* 36:51 */     this.realFriend = realFriend;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getUserId()
/* 40:   */   {
/* 41:55 */     return this.userId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setUserId(String userId)
/* 45:   */   {
/* 46:58 */     this.userId = userId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getViewName()
/* 50:   */   {
/* 51:62 */     return this.viewName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setViewName(String viewName)
/* 55:   */   {
/* 56:65 */     this.viewName = viewName;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.FriendListVO

 * JD-Core Version:    0.7.0.1

 */