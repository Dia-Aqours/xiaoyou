/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorVoucherUploadModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6621172373591263358L;
/* 10:   */   @ApiField("biz_info_ext")
/* 11:   */   private String bizInfoExt;
/* 12:   */   @ApiField("city_code")
/* 13:   */   private String cityCode;
/* 14:   */   @ApiField("exchange_ids")
/* 15:   */   private String exchangeIds;
/* 16:   */   @ApiField("operate_time")
/* 17:   */   private String operateTime;
/* 18:   */   @ApiField("ticket_no")
/* 19:   */   private String ticketNo;
/* 20:   */   @ApiField("trade_no")
/* 21:   */   private String tradeNo;
/* 22:   */   
/* 23:   */   public String getBizInfoExt()
/* 24:   */   {
/* 25:53 */     return this.bizInfoExt;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBizInfoExt(String bizInfoExt)
/* 29:   */   {
/* 30:56 */     this.bizInfoExt = bizInfoExt;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCityCode()
/* 34:   */   {
/* 35:60 */     return this.cityCode;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCityCode(String cityCode)
/* 39:   */   {
/* 40:63 */     this.cityCode = cityCode;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getExchangeIds()
/* 44:   */   {
/* 45:67 */     return this.exchangeIds;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setExchangeIds(String exchangeIds)
/* 49:   */   {
/* 50:70 */     this.exchangeIds = exchangeIds;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOperateTime()
/* 54:   */   {
/* 55:74 */     return this.operateTime;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOperateTime(String operateTime)
/* 59:   */   {
/* 60:77 */     this.operateTime = operateTime;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getTicketNo()
/* 64:   */   {
/* 65:81 */     return this.ticketNo;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setTicketNo(String ticketNo)
/* 69:   */   {
/* 70:84 */     this.ticketNo = ticketNo;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getTradeNo()
/* 74:   */   {
/* 75:88 */     return this.tradeNo;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setTradeNo(String tradeNo)
/* 79:   */   {
/* 80:91 */     this.tradeNo = tradeNo;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherUploadModel
 * JD-Core Version:    0.7.0.1
 */