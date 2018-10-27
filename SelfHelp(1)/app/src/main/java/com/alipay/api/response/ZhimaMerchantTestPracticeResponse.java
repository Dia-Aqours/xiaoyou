/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.XXXXsdasdasd;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;

/*  6:   */
/*  7:   */ public class ZhimaMerchantTestPracticeResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 8893952953447291376L;
/* 11:   */   @ApiField("dddd")
/* 12:   */   private XXXXsdasdasd dddd;
/* 13:   */   @ApiField("sss")
/* 14:   */   private String sss;
/* 15:   */   
/* 16:   */   public void setDddd(XXXXsdasdasd dddd)
/* 17:   */   {
/* 18:31 */     this.dddd = dddd;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public XXXXsdasdasd getDddd()
/* 22:   */   {
/* 23:34 */     return this.dddd;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setSss(String sss)
/* 27:   */   {
/* 28:38 */     this.sss = sss;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getSss()
/* 32:   */   {
/* 33:41 */     return this.sss;
/* 34:   */   }
/* 35:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.ZhimaMerchantTestPracticeResponse

 * JD-Core Version:    0.7.0.1

 */