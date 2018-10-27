/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayInsMarketingCertificateBatchcreateModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5654699118412313896L;
/* 12:   */   @ApiListField("ins_create_certificate_requests")
/* 13:   */   @ApiField("ins_create_certificate_request")
/* 14:   */   private List<InsCreateCertificateRequest> insCreateCertificateRequests;
/* 15:   */   
/* 16:   */   public List<InsCreateCertificateRequest> getInsCreateCertificateRequests()
/* 17:   */   {
/* 18:27 */     return this.insCreateCertificateRequests;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setInsCreateCertificateRequests(List<InsCreateCertificateRequest> insCreateCertificateRequests)
/* 22:   */   {
/* 23:30 */     this.insCreateCertificateRequests = insCreateCertificateRequests;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingCertificateBatchcreateModel
 * JD-Core Version:    0.7.0.1
 */