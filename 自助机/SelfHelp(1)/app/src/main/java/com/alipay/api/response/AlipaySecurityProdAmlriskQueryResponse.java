/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantScreenHit;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipaySecurityProdAmlriskQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3422968452243733655L;
/* 13:   */   @ApiField("event_id")
/* 14:   */   private String eventId;
/* 15:   */   @ApiField("has_risk")
/* 16:   */   private String hasRisk;
/* 17:   */   @ApiField("merchant_id")
/* 18:   */   private String merchantId;
/* 19:   */   @ApiListField("risks")
/* 20:   */   @ApiField("merchant_screen_hit")
/* 21:   */   private List<MerchantScreenHit> risks;
/* 22:   */   
/* 23:   */   public void setEventId(String eventId)
/* 24:   */   {
/* 25:46 */     this.eventId = eventId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getEventId()
/* 29:   */   {
/* 30:49 */     return this.eventId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setHasRisk(String hasRisk)
/* 34:   */   {
/* 35:53 */     this.hasRisk = hasRisk;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getHasRisk()
/* 39:   */   {
/* 40:56 */     return this.hasRisk;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setMerchantId(String merchantId)
/* 44:   */   {
/* 45:60 */     this.merchantId = merchantId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getMerchantId()
/* 49:   */   {
/* 50:63 */     return this.merchantId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setRisks(List<MerchantScreenHit> risks)
/* 54:   */   {
/* 55:67 */     this.risks = risks;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public List<MerchantScreenHit> getRisks()
/* 59:   */   {
/* 60:70 */     return this.risks;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipaySecurityProdAmlriskQueryResponse
 * JD-Core Version:    0.7.0.1
 */