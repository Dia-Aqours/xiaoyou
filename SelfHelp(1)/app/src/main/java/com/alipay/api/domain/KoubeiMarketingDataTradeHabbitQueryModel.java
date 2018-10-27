/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMarketingDataTradeHabbitQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6248428959472229775L;
/* 10:   */   @ApiField("biz_date")
/* 11:   */   private String bizDate;
/* 12:   */   @ApiField("store_ids")
/* 13:   */   private String storeIds;
/* 14:   */   
/* 15:   */   public String getBizDate()
/* 16:   */   {
/* 17:30 */     return this.bizDate;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBizDate(String bizDate)
/* 21:   */   {
/* 22:33 */     this.bizDate = bizDate;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getStoreIds()
/* 26:   */   {
/* 27:37 */     return this.storeIds;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setStoreIds(String storeIds)
/* 31:   */   {
/* 32:40 */     this.storeIds = storeIds;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataTradeHabbitQueryModel

 * JD-Core Version:    0.7.0.1

 */