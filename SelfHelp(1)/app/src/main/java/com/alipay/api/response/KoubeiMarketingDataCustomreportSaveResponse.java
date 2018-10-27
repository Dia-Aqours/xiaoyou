/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataCustomreportSaveResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2858439683981566331L;
/* 10:   */   @ApiField("condition_key")
/* 11:   */   private String conditionKey;
/* 12:   */   
/* 13:   */   public void setConditionKey(String conditionKey)
/* 14:   */   {
/* 15:24 */     this.conditionKey = conditionKey;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getConditionKey()
/* 19:   */   {
/* 20:27 */     return this.conditionKey;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomreportSaveResponse
 * JD-Core Version:    0.7.0.1
 */