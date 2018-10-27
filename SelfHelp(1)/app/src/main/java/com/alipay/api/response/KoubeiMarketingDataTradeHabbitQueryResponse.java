/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataTradeHabbitQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6571935885891967413L;
/* 10:   */   @ApiField("trade_habit_info")
/* 11:   */   private String tradeHabitInfo;
/* 12:   */   
/* 13:   */   public void setTradeHabitInfo(String tradeHabitInfo)
/* 14:   */   {
/* 15:35 */     this.tradeHabitInfo = tradeHabitInfo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getTradeHabitInfo()
/* 19:   */   {
/* 20:38 */     return this.tradeHabitInfo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataTradeHabbitQueryResponse
 * JD-Core Version:    0.7.0.1
 */