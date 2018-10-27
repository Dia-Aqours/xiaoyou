/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CardUserInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6167792625183183713L;
/* 10:   */   @ApiField("user_uni_id")
/* 11:   */   private String userUniId;
/* 12:   */   @ApiField("user_uni_id_type")
/* 13:   */   private String userUniIdType;
/* 14:   */   
/* 15:   */   public String getUserUniId()
/* 16:   */   {
/* 17:31 */     return this.userUniId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setUserUniId(String userUniId)
/* 21:   */   {
/* 22:34 */     this.userUniId = userUniId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUserUniIdType()
/* 26:   */   {
/* 27:38 */     return this.userUniIdType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUserUniIdType(String userUniIdType)
/* 31:   */   {
/* 32:41 */     this.userUniIdType = userUniIdType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CardUserInfo
 * JD-Core Version:    0.7.0.1
 */