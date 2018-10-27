/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayBossProdArrangementOfflineQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8138172218433567131L;
/* 10:   */   @ApiField("sign_status")
/* 11:   */   private String signStatus;
/* 12:   */   
/* 13:   */   public void setSignStatus(String signStatus)
/* 14:   */   {
/* 15:24 */     this.signStatus = signStatus;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getSignStatus()
/* 19:   */   {
/* 20:27 */     return this.signStatus;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayBossProdArrangementOfflineQueryResponse
 * JD-Core Version:    0.7.0.1
 */