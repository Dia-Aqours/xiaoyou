/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorVoucherRefundModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2585698225433835693L;
/* 10:   */   @ApiField("city_code")
/* 11:   */   private String cityCode;
/* 12:   */   @ApiField("trade_no")
/* 13:   */   private String tradeNo;
/* 14:   */   
/* 15:   */   public String getCityCode()
/* 16:   */   {
/* 17:30 */     return this.cityCode;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCityCode(String cityCode)
/* 21:   */   {
/* 22:33 */     this.cityCode = cityCode;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTradeNo()
/* 26:   */   {
/* 27:37 */     return this.tradeNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTradeNo(String tradeNo)
/* 31:   */   {
/* 32:40 */     this.tradeNo = tradeNo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherRefundModel
 * JD-Core Version:    0.7.0.1
 */