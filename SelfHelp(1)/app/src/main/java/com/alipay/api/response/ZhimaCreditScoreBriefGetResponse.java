/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCreditScoreBriefGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6581325564725539669L;
/* 10:   */   @ApiField("biz_no")
/* 11:   */   private String bizNo;
/* 12:   */   @ApiField("is_admittance")
/* 13:   */   private String isAdmittance;
/* 14:   */   
/* 15:   */   public void setBizNo(String bizNo)
/* 16:   */   {
/* 17:30 */     this.bizNo = bizNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getBizNo()
/* 21:   */   {
/* 22:33 */     return this.bizNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setIsAdmittance(String isAdmittance)
/* 26:   */   {
/* 27:37 */     this.isAdmittance = isAdmittance;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getIsAdmittance()
/* 31:   */   {
/* 32:40 */     return this.isAdmittance;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaCreditScoreBriefGetResponse
 * JD-Core Version:    0.7.0.1
 */