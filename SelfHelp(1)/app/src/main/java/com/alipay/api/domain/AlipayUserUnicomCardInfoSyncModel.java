/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserUnicomCardInfoSyncModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8465463676698527244L;
/* 10:   */   @ApiField("gmt_status_change")
/* 11:   */   private String gmtStatusChange;
/* 12:   */   @ApiField("phone_no")
/* 13:   */   private String phoneNo;
/* 14:   */   @ApiField("phone_no_status")
/* 15:   */   private String phoneNoStatus;
/* 16:   */   @ApiField("user_id")
/* 17:   */   private String userId;
/* 18:   */   
/* 19:   */   public String getGmtStatusChange()
/* 20:   */   {
/* 21:41 */     return this.gmtStatusChange;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setGmtStatusChange(String gmtStatusChange)
/* 25:   */   {
/* 26:44 */     this.gmtStatusChange = gmtStatusChange;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getPhoneNo()
/* 30:   */   {
/* 31:48 */     return this.phoneNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setPhoneNo(String phoneNo)
/* 35:   */   {
/* 36:51 */     this.phoneNo = phoneNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getPhoneNoStatus()
/* 40:   */   {
/* 41:55 */     return this.phoneNoStatus;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setPhoneNoStatus(String phoneNoStatus)
/* 45:   */   {
/* 46:58 */     this.phoneNoStatus = phoneNoStatus;
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
 * Qualified Name:     com.alipay.api.domain.AlipayUserUnicomCardInfoSyncModel
 * JD-Core Version:    0.7.0.1
 */