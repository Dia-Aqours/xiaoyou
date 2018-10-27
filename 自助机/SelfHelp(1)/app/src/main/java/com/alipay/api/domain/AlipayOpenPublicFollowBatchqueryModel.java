/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicFollowBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2833162589256894324L;
/* 10:   */   @ApiField("next_user_id")
/* 11:   */   private String nextUserId;
/* 12:   */   
/* 13:   */   public String getNextUserId()
/* 14:   */   {
/* 15:23 */     return this.nextUserId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setNextUserId(String nextUserId)
/* 19:   */   {
/* 20:26 */     this.nextUserId = nextUserId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicFollowBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */