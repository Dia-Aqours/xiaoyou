/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppInvoiceTitleDynamicGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1385889439435763882L;
/* 10:   */   @ApiField("bar_code")
/* 11:   */   private String barCode;
/* 12:   */   
/* 13:   */   public String getBarCode()
/* 14:   */   {
/* 15:23 */     return this.barCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setBarCode(String barCode)
/* 19:   */   {
/* 20:26 */     this.barCode = barCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEbppInvoiceTitleDynamicGetModel
 * JD-Core Version:    0.7.0.1
 */