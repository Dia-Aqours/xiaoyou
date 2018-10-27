/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayCommerceTransportOfflinepayTradeSettleModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7596541294488543272L;
/* 12:   */   @ApiListField("trade_list")
/* 13:   */   @ApiField("alipay_offline_trade")
/* 14:   */   private List<AlipayOfflineTrade> tradeList;
/* 15:   */   
/* 16:   */   public List<AlipayOfflineTrade> getTradeList()
/* 17:   */   {
/* 18:27 */     return this.tradeList;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setTradeList(List<AlipayOfflineTrade> tradeList)
/* 22:   */   {
/* 23:30 */     this.tradeList = tradeList;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceTransportOfflinepayTradeSettleModel
 * JD-Core Version:    0.7.0.1
 */