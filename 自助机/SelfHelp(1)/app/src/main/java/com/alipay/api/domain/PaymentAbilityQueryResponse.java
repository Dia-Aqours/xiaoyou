/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PaymentAbilityQueryResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5134754468185496336L;
/* 10:   */   @ApiField("extra_infos")
/* 11:   */   private String extraInfos;
/* 12:   */   @ApiField("level")
/* 13:   */   private String level;
/* 14:   */   @ApiField("order_id")
/* 15:   */   private String orderId;
/* 16:   */   
/* 17:   */   public String getExtraInfos()
/* 18:   */   {
/* 19:35 */     return this.extraInfos;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setExtraInfos(String extraInfos)
/* 23:   */   {
/* 24:38 */     this.extraInfos = extraInfos;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getLevel()
/* 28:   */   {
/* 29:42 */     return this.level;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setLevel(String level)
/* 33:   */   {
/* 34:45 */     this.level = level;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getOrderId()
/* 38:   */   {
/* 39:49 */     return this.orderId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setOrderId(String orderId)
/* 43:   */   {
/* 44:52 */     this.orderId = orderId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PaymentAbilityQueryResponse
 * JD-Core Version:    0.7.0.1
 */