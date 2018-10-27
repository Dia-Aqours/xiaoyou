/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayZdataserviceUnidataQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8837213145937524455L;
/* 10:   */   @ApiField("query_result")
/* 11:   */   private String queryResult;
/* 12:   */   @ApiField("result_code")
/* 13:   */   private String resultCode;
/* 14:   */   @ApiField("success")
/* 15:   */   private String success;
/* 16:   */   
/* 17:   */   public void setQueryResult(String queryResult)
/* 18:   */   {
/* 19:36 */     this.queryResult = queryResult;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getQueryResult()
/* 23:   */   {
/* 24:39 */     return this.queryResult;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setResultCode(String resultCode)
/* 28:   */   {
/* 29:43 */     this.resultCode = resultCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getResultCode()
/* 33:   */   {
/* 34:46 */     return this.resultCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setSuccess(String success)
/* 38:   */   {
/* 39:50 */     this.success = success;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getSuccess()
/* 43:   */   {
/* 44:53 */     return this.success;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayZdataserviceUnidataQueryResponse
 * JD-Core Version:    0.7.0.1
 */