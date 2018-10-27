/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CustomerEntity;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayZdataassetsMetadataResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4842916196447721751L;
/* 13:   */   @ApiListField("result")
/* 14:   */   @ApiField("customer_entity")
/* 15:   */   private List<CustomerEntity> result;
/* 16:   */   
/* 17:   */   public void setResult(List<CustomerEntity> result)
/* 18:   */   {
/* 19:28 */     this.result = result;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<CustomerEntity> getResult()
/* 23:   */   {
/* 24:31 */     return this.result;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayZdataassetsMetadataResponse
 * JD-Core Version:    0.7.0.1
 */