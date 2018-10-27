/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayUserDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayUserGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 6458156752874497866L;
/* 11:   */   @ApiField("alipay_user_detail")
/* 12:   */   private AlipayUserDetail alipayUserDetail;
/* 13:   */   
/* 14:   */   public void setAlipayUserDetail(AlipayUserDetail alipayUserDetail)
/* 15:   */   {
/* 16:25 */     this.alipayUserDetail = alipayUserDetail;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayUserDetail getAlipayUserDetail()
/* 20:   */   {
/* 21:28 */     return this.alipayUserDetail;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayUserGetResponse
 * JD-Core Version:    0.7.0.1
 */