/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayAccount;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayUserAccountGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5163341267954722911L;
/* 11:   */   @ApiField("alipay_account")
/* 12:   */   private AlipayAccount alipayAccount;
/* 13:   */   
/* 14:   */   public void setAlipayAccount(AlipayAccount alipayAccount)
/* 15:   */   {
/* 16:25 */     this.alipayAccount = alipayAccount;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayAccount getAlipayAccount()
/* 20:   */   {
/* 21:28 */     return this.alipayAccount;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayUserAccountGetResponse
 * JD-Core Version:    0.7.0.1
 */