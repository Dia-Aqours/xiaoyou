/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayFundTransBatchQuerybatchModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3272736164547524587L;
/* 10:   */   @ApiField("batch_no")
/* 11:   */   private String batchNo;
/* 12:   */   @ApiField("token")
/* 13:   */   private String token;
/* 14:   */   
/* 15:   */   public String getBatchNo()
/* 16:   */   {
/* 17:29 */     return this.batchNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBatchNo(String batchNo)
/* 21:   */   {
/* 22:32 */     this.batchNo = batchNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getToken()
/* 26:   */   {
/* 27:36 */     return this.token;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setToken(String token)
/* 31:   */   {
/* 32:39 */     this.token = token;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayFundTransBatchQuerybatchModel

 * JD-Core Version:    0.7.0.1

 */