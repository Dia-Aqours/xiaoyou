/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayHighValueCustomerResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayDataDataserviceUserlevelZrankGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 4275241198475982339L;
/* 11:   */   @ApiField("result")
/* 12:   */   private AlipayHighValueCustomerResult result;
/* 13:   */   
/* 14:   */   public void setResult(AlipayHighValueCustomerResult result)
/* 15:   */   {
/* 16:25 */     this.result = result;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayHighValueCustomerResult getResult()
/* 20:   */   {
/* 21:28 */     return this.result;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayDataDataserviceUserlevelZrankGetResponse
 * JD-Core Version:    0.7.0.1
 */