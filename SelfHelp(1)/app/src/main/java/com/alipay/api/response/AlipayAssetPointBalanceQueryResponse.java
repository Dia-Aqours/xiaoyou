/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAssetPointBalanceQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5453551736379634365L;
/* 10:   */   @ApiField("point_amount")
/* 11:   */   private Long pointAmount;
/* 12:   */   
/* 13:   */   public void setPointAmount(Long pointAmount)
/* 14:   */   {
/* 15:24 */     this.pointAmount = pointAmount;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Long getPointAmount()
/* 19:   */   {
/* 20:27 */     return this.pointAmount;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayAssetPointBalanceQueryResponse
 * JD-Core Version:    0.7.0.1
 */