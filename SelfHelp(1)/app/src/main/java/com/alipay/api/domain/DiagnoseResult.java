/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class DiagnoseResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3678496487754445842L;
/* 10:   */   @ApiField("biz_data")
/* 11:   */   private String bizData;
/* 12:   */   @ApiField("diagnose_code")
/* 13:   */   private String diagnoseCode;
/* 14:   */   
/* 15:   */   public String getBizData()
/* 16:   */   {
/* 17:36 */     return this.bizData;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBizData(String bizData)
/* 21:   */   {
/* 22:39 */     this.bizData = bizData;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getDiagnoseCode()
/* 26:   */   {
/* 27:43 */     return this.diagnoseCode;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setDiagnoseCode(String diagnoseCode)
/* 31:   */   {
/* 32:46 */     this.diagnoseCode = diagnoseCode;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DiagnoseResult
 * JD-Core Version:    0.7.0.1
 */