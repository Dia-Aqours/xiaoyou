/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserCreditCard
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2312575942833512417L;
/* 10:   */   @ApiField("card_no")
/* 11:   */   private String cardNo;
/* 12:   */   @ApiField("inst_id")
/* 13:   */   private String instId;
/* 14:   */   
/* 15:   */   public String getCardNo()
/* 16:   */   {
/* 17:31 */     return this.cardNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCardNo(String cardNo)
/* 21:   */   {
/* 22:34 */     this.cardNo = cardNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getInstId()
/* 26:   */   {
/* 27:38 */     return this.instId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setInstId(String instId)
/* 31:   */   {
/* 32:41 */     this.instId = instId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserCreditCard
 * JD-Core Version:    0.7.0.1
 */