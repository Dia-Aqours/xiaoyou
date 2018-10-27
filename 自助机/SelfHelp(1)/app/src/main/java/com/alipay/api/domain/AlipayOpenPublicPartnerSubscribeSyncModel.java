/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicPartnerSubscribeSyncModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3289521782581156916L;
/* 10:   */   @ApiField("accept_msg")
/* 11:   */   private String acceptMsg;
/* 12:   */   @ApiField("follow_object_id")
/* 13:   */   private String followObjectId;
/* 14:   */   @ApiField("operate_type")
/* 15:   */   private String operateType;
/* 16:   */   @ApiField("push_switch")
/* 17:   */   private String pushSwitch;
/* 18:   */   @ApiField("source_id")
/* 19:   */   private String sourceId;
/* 20:   */   @ApiField("user_id")
/* 21:   */   private String userId;
/* 22:   */   
/* 23:   */   public String getAcceptMsg()
/* 24:   */   {
/* 25:53 */     return this.acceptMsg;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAcceptMsg(String acceptMsg)
/* 29:   */   {
/* 30:56 */     this.acceptMsg = acceptMsg;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getFollowObjectId()
/* 34:   */   {
/* 35:60 */     return this.followObjectId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setFollowObjectId(String followObjectId)
/* 39:   */   {
/* 40:63 */     this.followObjectId = followObjectId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getOperateType()
/* 44:   */   {
/* 45:67 */     return this.operateType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setOperateType(String operateType)
/* 49:   */   {
/* 50:70 */     this.operateType = operateType;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getPushSwitch()
/* 54:   */   {
/* 55:74 */     return this.pushSwitch;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setPushSwitch(String pushSwitch)
/* 59:   */   {
/* 60:77 */     this.pushSwitch = pushSwitch;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getSourceId()
/* 64:   */   {
/* 65:81 */     return this.sourceId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setSourceId(String sourceId)
/* 69:   */   {
/* 70:84 */     this.sourceId = sourceId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUserId()
/* 74:   */   {
/* 75:88 */     return this.userId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUserId(String userId)
/* 79:   */   {
/* 80:91 */     this.userId = userId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicPartnerSubscribeSyncModel
 * JD-Core Version:    0.7.0.1
 */