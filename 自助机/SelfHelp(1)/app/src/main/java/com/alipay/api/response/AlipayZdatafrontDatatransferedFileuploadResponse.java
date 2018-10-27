/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayZdatafrontDatatransferedFileuploadResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5329966973786113414L;
/* 10:   */   @ApiField("success")
/* 11:   */   private String success;
/* 12:   */   
/* 13:   */   public void setSuccess(String success)
/* 14:   */   {
/* 15:24 */     this.success = success;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getSuccess()
/* 19:   */   {
/* 20:27 */     return this.success;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayZdatafrontDatatransferedFileuploadResponse
 * JD-Core Version:    0.7.0.1
 */