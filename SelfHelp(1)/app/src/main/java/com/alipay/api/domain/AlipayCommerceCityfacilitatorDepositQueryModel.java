/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorDepositQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6394679187254993123L;
/* 10:   */   @ApiField("card_no")
/* 11:   */   private String cardNo;
/* 12:   */   @ApiField("card_type")
/* 13:   */   private String cardType;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   
/* 17:   */   public String getCardNo()
/* 18:   */   {
/* 19:35 */     return this.cardNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCardNo(String cardNo)
/* 23:   */   {
/* 24:38 */     this.cardNo = cardNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCardType()
/* 28:   */   {
/* 29:42 */     return this.cardType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCardType(String cardType)
/* 33:   */   {
/* 34:45 */     this.cardType = cardType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStatus()
/* 38:   */   {
/* 39:49 */     return this.status;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStatus(String status)
/* 43:   */   {
/* 44:52 */     this.status = status;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorDepositQueryModel
 * JD-Core Version:    0.7.0.1
 */