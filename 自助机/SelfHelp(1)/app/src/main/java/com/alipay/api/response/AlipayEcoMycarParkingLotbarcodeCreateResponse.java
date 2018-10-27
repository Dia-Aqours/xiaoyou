/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingLotbarcodeCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4731461732777658519L;
/* 10:   */   @ApiField("qrcode_url")
/* 11:   */   private String qrcodeUrl;
/* 12:   */   @ApiField("status")
/* 13:   */   private String status;
/* 14:   */   
/* 15:   */   public void setQrcodeUrl(String qrcodeUrl)
/* 16:   */   {
/* 17:30 */     this.qrcodeUrl = qrcodeUrl;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getQrcodeUrl()
/* 21:   */   {
/* 22:33 */     return this.qrcodeUrl;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setStatus(String status)
/* 26:   */   {
/* 27:37 */     this.status = status;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getStatus()
/* 31:   */   {
/* 32:40 */     return this.status;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarParkingLotbarcodeCreateResponse
 * JD-Core Version:    0.7.0.1
 */