/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarDataExternalQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4821341794321217614L;
/* 10:   */   @ApiField("external_system_name")
/* 11:   */   private String externalSystemName;
/* 12:   */   @ApiField("query_result")
/* 13:   */   private String queryResult;
/* 14:   */   
/* 15:   */   public void setExternalSystemName(String externalSystemName)
/* 16:   */   {
/* 17:30 */     this.externalSystemName = externalSystemName;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getExternalSystemName()
/* 21:   */   {
/* 22:33 */     return this.externalSystemName;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setQueryResult(String queryResult)
/* 26:   */   {
/* 27:37 */     this.queryResult = queryResult;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getQueryResult()
/* 31:   */   {
/* 32:40 */     return this.queryResult;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarDataExternalQueryResponse
 * JD-Core Version:    0.7.0.1
 */