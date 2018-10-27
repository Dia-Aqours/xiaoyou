/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMarketingDataMallDiscountQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6141329261629771769L;
/* 10:   */   @ApiField("mall_id")
/* 11:   */   private String mallId;
/* 12:   */   
/* 13:   */   public String getMallId()
/* 14:   */   {
/* 15:23 */     return this.mallId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMallId(String mallId)
/* 19:   */   {
/* 20:26 */     this.mallId = mallId;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataMallDiscountQueryModel

 * JD-Core Version:    0.7.0.1

 */