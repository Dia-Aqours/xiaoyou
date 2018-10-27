/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceTransportOfflinepayRecordVerifyModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1778976767661818788L;
/* 10:   */   @ApiField("record")
/* 11:   */   private String record;
/* 12:   */   
/* 13:   */   public String getRecord()
/* 14:   */   {
/* 15:23 */     return this.record;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setRecord(String record)
/* 19:   */   {
/* 20:26 */     this.record = record;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceTransportOfflinepayRecordVerifyModel
 * JD-Core Version:    0.7.0.1
 */