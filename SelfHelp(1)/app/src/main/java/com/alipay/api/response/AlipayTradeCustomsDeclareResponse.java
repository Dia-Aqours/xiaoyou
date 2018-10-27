/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeCustomsDeclareResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2679414324441498583L;
/* 10:   */   @ApiField("alipay_declare_no")
/* 11:   */   private String alipayDeclareNo;
/* 12:   */   @ApiField("identity_check")
/* 13:   */   private String identityCheck;
/* 14:   */   @ApiField("trade_no")
/* 15:   */   private String tradeNo;
/* 16:   */   
/* 17:   */   public void setAlipayDeclareNo(String alipayDeclareNo)
/* 18:   */   {
/* 19:36 */     this.alipayDeclareNo = alipayDeclareNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getAlipayDeclareNo()
/* 23:   */   {
/* 24:39 */     return this.alipayDeclareNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setIdentityCheck(String identityCheck)
/* 28:   */   {
/* 29:43 */     this.identityCheck = identityCheck;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getIdentityCheck()
/* 33:   */   {
/* 34:46 */     return this.identityCheck;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setTradeNo(String tradeNo)
/* 38:   */   {
/* 39:50 */     this.tradeNo = tradeNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getTradeNo()
/* 43:   */   {
/* 44:53 */     return this.tradeNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTradeCustomsDeclareResponse
 * JD-Core Version:    0.7.0.1
 */