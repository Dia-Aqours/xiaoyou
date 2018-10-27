/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantCard;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMarketingCardOpenResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 4278232797888591329L;
/* 11:   */   @ApiField("card_info")
/* 12:   */   private MerchantCard cardInfo;
/* 13:   */   
/* 14:   */   public void setCardInfo(MerchantCard cardInfo)
/* 15:   */   {
/* 16:25 */     this.cardInfo = cardInfo;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public MerchantCard getCardInfo()
/* 20:   */   {
/* 21:28 */     return this.cardInfo;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCardOpenResponse
 * JD-Core Version:    0.7.0.1
 */