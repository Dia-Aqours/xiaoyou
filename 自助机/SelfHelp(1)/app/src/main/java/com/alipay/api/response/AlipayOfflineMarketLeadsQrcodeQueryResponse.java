/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketLeadsQrcodeQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3481837991325959327L;
/* 10:   */   @ApiField("qr_code")
/* 11:   */   private String qrCode;
/* 12:   */   
/* 13:   */   public void setQrCode(String qrCode)
/* 14:   */   {
/* 15:24 */     this.qrCode = qrCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getQrCode()
/* 19:   */   {
/* 20:27 */     return this.qrCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketLeadsQrcodeQueryResponse
 * JD-Core Version:    0.7.0.1
 */