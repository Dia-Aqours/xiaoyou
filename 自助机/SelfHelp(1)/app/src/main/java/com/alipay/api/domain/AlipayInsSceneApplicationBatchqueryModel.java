/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayInsSceneApplicationBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6488121448926172715L;
/* 10:   */   @ApiField("applicant")
/* 11:   */   private InsPerson applicant;
/* 12:   */   @ApiField("out_biz_no")
/* 13:   */   private String outBizNo;
/* 14:   */   @ApiField("source")
/* 15:   */   private String source;
/* 16:   */   
/* 17:   */   public InsPerson getApplicant()
/* 18:   */   {
/* 19:35 */     return this.applicant;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setApplicant(InsPerson applicant)
/* 23:   */   {
/* 24:38 */     this.applicant = applicant;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOutBizNo()
/* 28:   */   {
/* 29:42 */     return this.outBizNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOutBizNo(String outBizNo)
/* 33:   */   {
/* 34:45 */     this.outBizNo = outBizNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getSource()
/* 38:   */   {
/* 39:49 */     return this.source;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSource(String source)
/* 43:   */   {
/* 44:52 */     this.source = source;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsSceneApplicationBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */