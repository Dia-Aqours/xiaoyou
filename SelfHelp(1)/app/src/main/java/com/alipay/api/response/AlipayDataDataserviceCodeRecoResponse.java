/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayCodeRecoResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayDataDataserviceCodeRecoResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7724667998367834444L;
/* 11:   */   @ApiField("result")
/* 12:   */   private AlipayCodeRecoResult result;
/* 13:   */   
/* 14:   */   public void setResult(AlipayCodeRecoResult result)
/* 15:   */   {
/* 16:25 */     this.result = result;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayCodeRecoResult getResult()
/* 20:   */   {
/* 21:28 */     return this.result;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayDataDataserviceCodeRecoResponse
 * JD-Core Version:    0.7.0.1
 */