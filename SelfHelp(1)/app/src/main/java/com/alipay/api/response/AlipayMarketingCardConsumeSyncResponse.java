/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCardConsumeSyncResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3522267895983646182L;
/* 10:   */   @ApiField("external_card_no")
/* 11:   */   private String externalCardNo;
/* 12:   */   
/* 13:   */   public void setExternalCardNo(String externalCardNo)
/* 14:   */   {
/* 15:24 */     this.externalCardNo = externalCardNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getExternalCardNo()
/* 19:   */   {
/* 20:27 */     return this.externalCardNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCardConsumeSyncResponse
 * JD-Core Version:    0.7.0.1
 */