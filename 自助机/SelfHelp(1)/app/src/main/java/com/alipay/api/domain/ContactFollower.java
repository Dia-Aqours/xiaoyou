/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ContactFollower
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8474247425846144326L;
/* 10:   */   @ApiField("avatar")
/* 11:   */   private String avatar;
/* 12:   */   @ApiField("default_avatar")
/* 13:   */   private String defaultAvatar;
/* 14:   */   @ApiField("each_record_flag")
/* 15:   */   private String eachRecordFlag;
/* 16:   */   @ApiField("user_id")
/* 17:   */   private String userId;
/* 18:   */   
/* 19:   */   public String getAvatar()
/* 20:   */   {
/* 21:41 */     return this.avatar;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAvatar(String avatar)
/* 25:   */   {
/* 26:44 */     this.avatar = avatar;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getDefaultAvatar()
/* 30:   */   {
/* 31:48 */     return this.defaultAvatar;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setDefaultAvatar(String defaultAvatar)
/* 35:   */   {
/* 36:51 */     this.defaultAvatar = defaultAvatar;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getEachRecordFlag()
/* 40:   */   {
/* 41:55 */     return this.eachRecordFlag;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setEachRecordFlag(String eachRecordFlag)
/* 45:   */   {
/* 46:58 */     this.eachRecordFlag = eachRecordFlag;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getUserId()
/* 50:   */   {
/* 51:62 */     return this.userId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setUserId(String userId)
/* 55:   */   {
/* 56:65 */     this.userId = userId;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ContactFollower

 * JD-Core Version:    0.7.0.1

 */