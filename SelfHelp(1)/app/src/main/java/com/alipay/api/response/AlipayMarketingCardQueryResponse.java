/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantCard;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMarketingCardQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1838747451785522814L;
/* 11:   */   @ApiField("card_info")
/* 12:   */   private MerchantCard cardInfo;
/* 13:   */   @ApiField("schema_url")
/* 14:   */   private String schemaUrl;
/* 15:   */   
/* 16:   */   public void setCardInfo(MerchantCard cardInfo)
/* 17:   */   {
/* 18:31 */     this.cardInfo = cardInfo;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public MerchantCard getCardInfo()
/* 22:   */   {
/* 23:34 */     return this.cardInfo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setSchemaUrl(String schemaUrl)
/* 27:   */   {
/* 28:38 */     this.schemaUrl = schemaUrl;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getSchemaUrl()
/* 32:   */   {
/* 33:41 */     return this.schemaUrl;
/* 34:   */   }
/* 35:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCardQueryResponse
 * JD-Core Version:    0.7.0.1
 */