/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeAppMergePayModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7875545762169557195L;
/* 10:   */   @ApiField("pre_order_no")
/* 11:   */   private String preOrderNo;
/* 12:   */   
/* 13:   */   public String getPreOrderNo()
/* 14:   */   {
/* 15:23 */     return this.preOrderNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setPreOrderNo(String preOrderNo)
/* 19:   */   {
/* 20:26 */     this.preOrderNo = preOrderNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeAppMergePayModel
 * JD-Core Version:    0.7.0.1
 */