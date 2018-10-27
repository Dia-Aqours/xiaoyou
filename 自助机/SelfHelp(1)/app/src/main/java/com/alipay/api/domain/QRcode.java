/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class QRcode
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1853136589211325178L;
/* 10:   */   @ApiField("card_id")
/* 11:   */   private String cardId;
/* 12:   */   @ApiField("qrcode_url")
/* 13:   */   private String qrcodeUrl;
/* 14:   */   
/* 15:   */   public String getCardId()
/* 16:   */   {
/* 17:29 */     return this.cardId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCardId(String cardId)
/* 21:   */   {
/* 22:32 */     this.cardId = cardId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getQrcodeUrl()
/* 26:   */   {
/* 27:36 */     return this.qrcodeUrl;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setQrcodeUrl(String qrcodeUrl)
/* 31:   */   {
/* 32:39 */     this.qrcodeUrl = qrcodeUrl;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.QRcode
 * JD-Core Version:    0.7.0.1
 */