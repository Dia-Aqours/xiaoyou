/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeCustomsQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5758442725164399899L;
/* 10:   */   @ApiField("out_request_nos")
/* 11:   */   private String outRequestNos;
/* 12:   */   
/* 13:   */   public String getOutRequestNos()
/* 14:   */   {
/* 15:24 */     return this.outRequestNos;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setOutRequestNos(String outRequestNos)
/* 19:   */   {
/* 20:27 */     this.outRequestNos = outRequestNos;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeCustomsQueryModel
 * JD-Core Version:    0.7.0.1
 */