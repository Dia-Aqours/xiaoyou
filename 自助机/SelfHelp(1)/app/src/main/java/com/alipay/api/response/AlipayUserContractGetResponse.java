/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayContract;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayUserContractGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5245486247173264128L;
/* 11:   */   @ApiField("alipay_contract")
/* 12:   */   private AlipayContract alipayContract;
/* 13:   */   
/* 14:   */   public void setAlipayContract(AlipayContract alipayContract)
/* 15:   */   {
/* 16:25 */     this.alipayContract = alipayContract;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayContract getAlipayContract()
/* 20:   */   {
/* 21:28 */     return this.alipayContract;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayUserContractGetResponse
 * JD-Core Version:    0.7.0.1
 */