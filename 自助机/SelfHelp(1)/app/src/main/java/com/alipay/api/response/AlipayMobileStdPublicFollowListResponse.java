/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Data;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMobileStdPublicFollowListResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7127539539439849542L;
/* 11:   */   @ApiField("count")
/* 12:   */   private String count;
/* 13:   */   @ApiField("data")
/* 14:   */   private Data data;
/* 15:   */   @ApiField("next_alipay_user_id")
/* 16:   */   private String nextAlipayUserId;
/* 17:   */   @ApiField("next_user_id")
/* 18:   */   private String nextUserId;
/* 19:   */   
/* 20:   */   public void setCount(String count)
/* 21:   */   {
/* 22:43 */     this.count = count;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCount()
/* 26:   */   {
/* 27:46 */     return this.count;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setData(Data data)
/* 31:   */   {
/* 32:50 */     this.data = data;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public Data getData()
/* 36:   */   {
/* 37:53 */     return this.data;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setNextAlipayUserId(String nextAlipayUserId)
/* 41:   */   {
/* 42:57 */     this.nextAlipayUserId = nextAlipayUserId;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getNextAlipayUserId()
/* 46:   */   {
/* 47:60 */     return this.nextAlipayUserId;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setNextUserId(String nextUserId)
/* 51:   */   {
/* 52:64 */     this.nextUserId = nextUserId;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getNextUserId()
/* 56:   */   {
/* 57:67 */     return this.nextUserId;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobileStdPublicFollowListResponse
 * JD-Core Version:    0.7.0.1
 */