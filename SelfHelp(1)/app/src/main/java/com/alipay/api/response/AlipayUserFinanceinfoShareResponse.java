/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayUserCreditCard;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayUserFinanceinfoShareResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3279875672249564835L;
/* 13:   */   @ApiListField("credit_card_list")
/* 14:   */   @ApiField("alipay_user_credit_card")
/* 15:   */   private List<AlipayUserCreditCard> creditCardList;
/* 16:   */   
/* 17:   */   public void setCreditCardList(List<AlipayUserCreditCard> creditCardList)
/* 18:   */   {
/* 19:28 */     this.creditCardList = creditCardList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<AlipayUserCreditCard> getCreditCardList()
/* 23:   */   {
/* 24:31 */     return this.creditCardList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayUserFinanceinfoShareResponse
 * JD-Core Version:    0.7.0.1
 */