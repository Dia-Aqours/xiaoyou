/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.SinglePayDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMicropayOrderDirectPayResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5151331595939476633L;
/* 11:   */   @ApiField("single_pay_detail")
/* 12:   */   private SinglePayDetail singlePayDetail;
/* 13:   */   
/* 14:   */   public void setSinglePayDetail(SinglePayDetail singlePayDetail)
/* 15:   */   {
/* 16:25 */     this.singlePayDetail = singlePayDetail;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public SinglePayDetail getSinglePayDetail()
/* 20:   */   {
/* 21:28 */     return this.singlePayDetail;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMicropayOrderDirectPayResponse
 * JD-Core Version:    0.7.0.1
 */