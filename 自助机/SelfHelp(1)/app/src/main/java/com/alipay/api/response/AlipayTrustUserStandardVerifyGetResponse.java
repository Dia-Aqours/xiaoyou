/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTrustUserStandardVerifyGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8329334832298693678L;
/* 10:   */   @ApiField("verify_info")
/* 11:   */   private String verifyInfo;
/* 12:   */   
/* 13:   */   public void setVerifyInfo(String verifyInfo)
/* 14:   */   {
/* 15:24 */     this.verifyInfo = verifyInfo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getVerifyInfo()
/* 19:   */   {
/* 20:27 */     return this.verifyInfo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserStandardVerifyGetResponse
 * JD-Core Version:    0.7.0.1
 */