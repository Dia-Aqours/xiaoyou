/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMsaasMediarecogVoiceMediaaudioUploadResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7767798419127649275L;
/* 10:   */   @ApiField("extinfo_a")
/* 11:   */   private String extinfoA;
/* 12:   */   @ApiField("extinfo_b")
/* 13:   */   private String extinfoB;
/* 14:   */   @ApiField("result_memo")
/* 15:   */   private String resultMemo;
/* 16:   */   @ApiField("result_status")
/* 17:   */   private String resultStatus;
/* 18:   */   
/* 19:   */   public void setExtinfoA(String extinfoA)
/* 20:   */   {
/* 21:42 */     this.extinfoA = extinfoA;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getExtinfoA()
/* 25:   */   {
/* 26:45 */     return this.extinfoA;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setExtinfoB(String extinfoB)
/* 30:   */   {
/* 31:49 */     this.extinfoB = extinfoB;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getExtinfoB()
/* 35:   */   {
/* 36:52 */     return this.extinfoB;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setResultMemo(String resultMemo)
/* 40:   */   {
/* 41:56 */     this.resultMemo = resultMemo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getResultMemo()
/* 45:   */   {
/* 46:59 */     return this.resultMemo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setResultStatus(String resultStatus)
/* 50:   */   {
/* 51:63 */     this.resultStatus = resultStatus;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getResultStatus()
/* 55:   */   {
/* 56:66 */     return this.resultStatus;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMsaasMediarecogVoiceMediaaudioUploadResponse
 * JD-Core Version:    0.7.0.1
 */