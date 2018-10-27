/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCustomerCertificationInitializeResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1163326358616525131L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   
/* 13:   */   public void setBizNo(String bizNo)
/* 14:   */   {
/* 15:24 */     this.bizNo = bizNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getBizNo()
/* 19:   */   {
/* 20:27 */     return this.bizNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaCustomerCertificationInitializeResponse
 * JD-Core Version:    0.7.0.1
 */