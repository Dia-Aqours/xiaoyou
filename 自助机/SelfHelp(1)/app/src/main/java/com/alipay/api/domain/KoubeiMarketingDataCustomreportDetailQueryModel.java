/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataCustomreportDetailQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3177976454548436759L;
/* 10:   */   @ApiField("condition_key")
/* 11:   */   private String conditionKey;
/* 12:   */   
/* 13:   */   public String getConditionKey()
/* 14:   */   {
/* 15:23 */     return this.conditionKey;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setConditionKey(String conditionKey)
/* 19:   */   {
/* 20:26 */     this.conditionKey = conditionKey;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataCustomreportDetailQueryModel
 * JD-Core Version:    0.7.0.1
 */