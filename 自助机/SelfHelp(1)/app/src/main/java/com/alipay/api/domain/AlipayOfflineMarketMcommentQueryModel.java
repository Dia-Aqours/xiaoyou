/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketMcommentQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2618649476266544537L;
/* 10:   */   @ApiField("op_role")
/* 11:   */   private String opRole;
/* 12:   */   @ApiField("partner_id")
/* 13:   */   private String partnerId;
/* 14:   */   @ApiField("trade_no")
/* 15:   */   private String tradeNo;
/* 16:   */   
/* 17:   */   public String getOpRole()
/* 18:   */   {
/* 19:38 */     return this.opRole;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOpRole(String opRole)
/* 23:   */   {
/* 24:41 */     this.opRole = opRole;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPartnerId()
/* 28:   */   {
/* 29:45 */     return this.partnerId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPartnerId(String partnerId)
/* 33:   */   {
/* 34:48 */     this.partnerId = partnerId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTradeNo()
/* 38:   */   {
/* 39:52 */     return this.tradeNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTradeNo(String tradeNo)
/* 43:   */   {
/* 44:55 */     this.tradeNo = tradeNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketMcommentQueryModel
 * JD-Core Version:    0.7.0.1
 */