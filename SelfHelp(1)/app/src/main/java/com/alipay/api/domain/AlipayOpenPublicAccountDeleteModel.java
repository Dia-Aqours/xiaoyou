/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicAccountDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1488681754967867489L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("bind_account_no")
/* 13:   */   private String bindAccountNo;
/* 14:   */   
/* 15:   */   public String getAgreementId()
/* 16:   */   {
/* 17:29 */     return this.agreementId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAgreementId(String agreementId)
/* 21:   */   {
/* 22:32 */     this.agreementId = agreementId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getBindAccountNo()
/* 26:   */   {
/* 27:36 */     return this.bindAccountNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setBindAccountNo(String bindAccountNo)
/* 31:   */   {
/* 32:39 */     this.bindAccountNo = bindAccountNo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicAccountDeleteModel
 * JD-Core Version:    0.7.0.1
 */