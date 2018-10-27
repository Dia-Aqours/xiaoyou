/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAccountExrateAllclientrateQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2166958276768894379L;
/* 10:   */   @ApiField("client_id")
/* 11:   */   private String clientId;
/* 12:   */   @ApiField("profile_id")
/* 13:   */   private String profileId;
/* 14:   */   
/* 15:   */   public String getClientId()
/* 16:   */   {
/* 17:29 */     return this.clientId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setClientId(String clientId)
/* 21:   */   {
/* 22:32 */     this.clientId = clientId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getProfileId()
/* 26:   */   {
/* 27:36 */     return this.profileId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setProfileId(String profileId)
/* 31:   */   {
/* 32:39 */     this.profileId = profileId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayAccountExrateAllclientrateQueryModel
 * JD-Core Version:    0.7.0.1
 */