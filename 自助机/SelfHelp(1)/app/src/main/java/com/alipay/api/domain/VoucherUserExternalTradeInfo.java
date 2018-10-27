/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class VoucherUserExternalTradeInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8119454499869899524L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("consume_date")
/* 13:   */   private String consumeDate;
/* 14:   */   @ApiField("consume_shop_id")
/* 15:   */   private String consumeShopId;
/* 16:   */   @ApiField("external_trade_no")
/* 17:   */   private String externalTradeNo;
/* 18:   */   
/* 19:   */   public String getAmount()
/* 20:   */   {
/* 21:41 */     return this.amount;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAmount(String amount)
/* 25:   */   {
/* 26:44 */     this.amount = amount;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getConsumeDate()
/* 30:   */   {
/* 31:48 */     return this.consumeDate;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setConsumeDate(String consumeDate)
/* 35:   */   {
/* 36:51 */     this.consumeDate = consumeDate;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getConsumeShopId()
/* 40:   */   {
/* 41:55 */     return this.consumeShopId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setConsumeShopId(String consumeShopId)
/* 45:   */   {
/* 46:58 */     this.consumeShopId = consumeShopId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getExternalTradeNo()
/* 50:   */   {
/* 51:62 */     return this.externalTradeNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setExternalTradeNo(String externalTradeNo)
/* 55:   */   {
/* 56:65 */     this.externalTradeNo = externalTradeNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.VoucherUserExternalTradeInfo
 * JD-Core Version:    0.7.0.1
 */