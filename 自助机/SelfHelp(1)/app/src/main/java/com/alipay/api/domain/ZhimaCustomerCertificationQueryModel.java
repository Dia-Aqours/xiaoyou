/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCustomerCertificationQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6558453552762567598L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   
/* 13:   */   public String getBizNo()
/* 14:   */   {
/* 15:23 */     return this.bizNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setBizNo(String bizNo)
/* 19:   */   {
/* 20:26 */     this.bizNo = bizNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaCustomerCertificationQueryModel
 * JD-Core Version:    0.7.0.1
 */