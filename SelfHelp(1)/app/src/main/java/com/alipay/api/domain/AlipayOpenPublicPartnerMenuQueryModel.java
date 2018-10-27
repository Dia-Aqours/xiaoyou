/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicPartnerMenuQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5528945362852496386L;
/* 10:   */   @ApiField("public_id")
/* 11:   */   private String publicId;
/* 12:   */   @ApiField("user_id")
/* 13:   */   private String userId;
/* 14:   */   
/* 15:   */   public String getPublicId()
/* 16:   */   {
/* 17:29 */     return this.publicId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setPublicId(String publicId)
/* 21:   */   {
/* 22:32 */     this.publicId = publicId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUserId()
/* 26:   */   {
/* 27:36 */     return this.userId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUserId(String userId)
/* 31:   */   {
/* 32:39 */     this.userId = userId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicPartnerMenuQueryModel
 * JD-Core Version:    0.7.0.1
 */