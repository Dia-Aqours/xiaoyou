/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CardTypeVO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1446643139438769431L;
/* 10:   */   @ApiField("card_type")
/* 11:   */   private String cardType;
/* 12:   */   @ApiField("description")
/* 13:   */   private String description;
/* 14:   */   
/* 15:   */   public String getCardType()
/* 16:   */   {
/* 17:37 */     return this.cardType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCardType(String cardType)
/* 21:   */   {
/* 22:40 */     this.cardType = cardType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getDescription()
/* 26:   */   {
/* 27:44 */     return this.description;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setDescription(String description)
/* 31:   */   {
/* 32:47 */     this.description = description;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CardTypeVO
 * JD-Core Version:    0.7.0.1
 */