/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorVoucherCancelModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2869985155422563777L;
/* 10:   */   @ApiField("biz_info_ext")
/* 11:   */   private String bizInfoExt;
/* 12:   */   @ApiField("city_code")
/* 13:   */   private String cityCode;
/* 14:   */   @ApiField("operate_time")
/* 15:   */   private String operateTime;
/* 16:   */   @ApiField("ticket_no")
/* 17:   */   private String ticketNo;
/* 18:   */   @ApiField("trade_no")
/* 19:   */   private String tradeNo;
/* 20:   */   
/* 21:   */   public String getBizInfoExt()
/* 22:   */   {
/* 23:47 */     return this.bizInfoExt;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setBizInfoExt(String bizInfoExt)
/* 27:   */   {
/* 28:50 */     this.bizInfoExt = bizInfoExt;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCityCode()
/* 32:   */   {
/* 33:54 */     return this.cityCode;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCityCode(String cityCode)
/* 37:   */   {
/* 38:57 */     this.cityCode = cityCode;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOperateTime()
/* 42:   */   {
/* 43:61 */     return this.operateTime;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOperateTime(String operateTime)
/* 47:   */   {
/* 48:64 */     this.operateTime = operateTime;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getTicketNo()
/* 52:   */   {
/* 53:68 */     return this.ticketNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setTicketNo(String ticketNo)
/* 57:   */   {
/* 58:71 */     this.ticketNo = ticketNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getTradeNo()
/* 62:   */   {
/* 63:75 */     return this.tradeNo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setTradeNo(String tradeNo)
/* 67:   */   {
/* 68:78 */     this.tradeNo = tradeNo;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherCancelModel
 * JD-Core Version:    0.7.0.1
 */