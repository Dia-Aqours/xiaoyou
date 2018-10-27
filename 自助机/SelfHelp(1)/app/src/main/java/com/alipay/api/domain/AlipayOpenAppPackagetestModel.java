/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenAppPackagetestModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5721324291889821366L;
/* 10:   */   @ApiField("testparam")
/* 11:   */   private String testparam;
/* 12:   */   @ApiField("testtest")
/* 13:   */   private String testtest;
/* 14:   */   
/* 15:   */   public String getTestparam()
/* 16:   */   {
/* 17:29 */     return this.testparam;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setTestparam(String testparam)
/* 21:   */   {
/* 22:32 */     this.testparam = testparam;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTesttest()
/* 26:   */   {
/* 27:36 */     return this.testtest;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTesttest(String testtest)
/* 31:   */   {
/* 32:39 */     this.testtest = testtest;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenAppPackagetestModel
 * JD-Core Version:    0.7.0.1
 */