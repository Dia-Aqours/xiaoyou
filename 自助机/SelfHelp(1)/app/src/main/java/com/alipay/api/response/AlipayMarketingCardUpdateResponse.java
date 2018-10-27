/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCardUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8659714164127947483L;
/* 10:   */   @ApiField("result_code")
/* 11:   */   private String resultCode;
/* 12:   */   
/* 13:   */   public void setResultCode(String resultCode)
/* 14:   */   {
/* 15:25 */     this.resultCode = resultCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getResultCode()
/* 19:   */   {
/* 20:28 */     return this.resultCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCardUpdateResponse
 * JD-Core Version:    0.7.0.1
 */