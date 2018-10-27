/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Data;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMobilePublicFollowListResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5674955325892974478L;
/* 11:   */   @ApiField("code")
/* 12:   */   private String code;
/* 13:   */   @ApiField("count")
/* 14:   */   private String count;
/* 15:   */   @ApiField("data")
/* 16:   */   private Data data;
/* 17:   */   @ApiField("next_alipay_user_id")
/* 18:   */   private String nextAlipayUserId;
/* 19:   */   @ApiField("next_user_id")
/* 20:   */   private String nextUserId;
/* 21:   */   
/* 22:   */   public void setCode(String code)
/* 23:   */   {
/* 24:49 */     this.code = code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCode()
/* 28:   */   {
/* 29:52 */     return this.code;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCount(String count)
/* 33:   */   {
/* 34:56 */     this.count = count;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getCount()
/* 38:   */   {
/* 39:59 */     return this.count;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setData(Data data)
/* 43:   */   {
/* 44:63 */     this.data = data;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public Data getData()
/* 48:   */   {
/* 49:66 */     return this.data;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void setNextAlipayUserId(String nextAlipayUserId)
/* 53:   */   {
/* 54:70 */     this.nextAlipayUserId = nextAlipayUserId;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String getNextAlipayUserId()
/* 58:   */   {
/* 59:73 */     return this.nextAlipayUserId;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void setNextUserId(String nextUserId)
/* 63:   */   {
/* 64:77 */     this.nextUserId = nextUserId;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public String getNextUserId()
/* 68:   */   {
/* 69:80 */     return this.nextUserId;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicFollowListResponse
 * JD-Core Version:    0.7.0.1
 */