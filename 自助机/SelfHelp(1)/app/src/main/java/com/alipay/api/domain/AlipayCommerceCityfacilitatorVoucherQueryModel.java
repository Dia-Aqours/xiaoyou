/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorVoucherQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5432694464566381311L;
/* 10:   */   @ApiField("city_code")
/* 11:   */   private String cityCode;
/* 12:   */   @ApiField("ticket_no")
/* 13:   */   private String ticketNo;
/* 14:   */   @ApiField("trade_no")
/* 15:   */   private String tradeNo;
/* 16:   */   
/* 17:   */   public String getCityCode()
/* 18:   */   {
/* 19:35 */     return this.cityCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCityCode(String cityCode)
/* 23:   */   {
/* 24:38 */     this.cityCode = cityCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getTicketNo()
/* 28:   */   {
/* 29:42 */     return this.ticketNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setTicketNo(String ticketNo)
/* 33:   */   {
/* 34:45 */     this.ticketNo = ticketNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTradeNo()
/* 38:   */   {
/* 39:49 */     return this.tradeNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTradeNo(String tradeNo)
/* 43:   */   {
/* 44:52 */     this.tradeNo = tradeNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherQueryModel
 * JD-Core Version:    0.7.0.1
 */