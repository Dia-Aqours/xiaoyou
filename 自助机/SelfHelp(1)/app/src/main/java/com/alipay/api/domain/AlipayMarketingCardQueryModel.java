/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCardQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8391483371197569355L;
/* 10:   */   @ApiField("card_user_info")
/* 11:   */   private CardUserInfo cardUserInfo;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("target_card_no")
/* 15:   */   private String targetCardNo;
/* 16:   */   @ApiField("target_card_no_type")
/* 17:   */   private String targetCardNoType;
/* 18:   */   
/* 19:   */   public CardUserInfo getCardUserInfo()
/* 20:   */   {
/* 21:46 */     return this.cardUserInfo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCardUserInfo(CardUserInfo cardUserInfo)
/* 25:   */   {
/* 26:49 */     this.cardUserInfo = cardUserInfo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getExtInfo()
/* 30:   */   {
/* 31:53 */     return this.extInfo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setExtInfo(String extInfo)
/* 35:   */   {
/* 36:56 */     this.extInfo = extInfo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getTargetCardNo()
/* 40:   */   {
/* 41:60 */     return this.targetCardNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setTargetCardNo(String targetCardNo)
/* 45:   */   {
/* 46:63 */     this.targetCardNo = targetCardNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTargetCardNoType()
/* 50:   */   {
/* 51:67 */     return this.targetCardNoType;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTargetCardNoType(String targetCardNoType)
/* 55:   */   {
/* 56:70 */     this.targetCardNoType = targetCardNoType;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardQueryModel
 * JD-Core Version:    0.7.0.1
 */