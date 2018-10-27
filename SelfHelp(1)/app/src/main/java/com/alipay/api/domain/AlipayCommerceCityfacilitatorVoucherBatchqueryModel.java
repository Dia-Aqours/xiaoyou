/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;

/*  7:   */
/*  8:   */ public class AlipayCommerceCityfacilitatorVoucherBatchqueryModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4866651877863473721L;
/* 12:   */   @ApiField("city_code")
/* 13:   */   private String cityCode;
/* 14:   */   @ApiListField("trade_nos")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> tradeNos;
/* 17:   */   
/* 18:   */   public String getCityCode()
/* 19:   */   {
/* 20:34 */     return this.cityCode;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setCityCode(String cityCode)
/* 24:   */   {
/* 25:37 */     this.cityCode = cityCode;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<String> getTradeNos()
/* 29:   */   {
/* 30:41 */     return this.tradeNos;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setTradeNos(List<String> tradeNos)
/* 34:   */   {
/* 35:44 */     this.tradeNos = tradeNos;
/* 36:   */   }
/* 37:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherBatchqueryModel

 * JD-Core Version:    0.7.0.1

 */