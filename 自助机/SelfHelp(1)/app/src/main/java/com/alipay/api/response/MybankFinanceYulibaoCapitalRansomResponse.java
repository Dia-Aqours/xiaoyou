/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankFinanceYulibaoCapitalRansomResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7164263952798246787L;
/* 10:   */   @ApiField("inner_biz_no")
/* 11:   */   private String innerBizNo;
/* 12:   */   @ApiField("remark")
/* 13:   */   private String remark;
/* 14:   */   @ApiField("trans_result")
/* 15:   */   private String transResult;
/* 16:   */   
/* 17:   */   public void setInnerBizNo(String innerBizNo)
/* 18:   */   {
/* 19:36 */     this.innerBizNo = innerBizNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getInnerBizNo()
/* 23:   */   {
/* 24:39 */     return this.innerBizNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setRemark(String remark)
/* 28:   */   {
/* 29:43 */     this.remark = remark;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getRemark()
/* 33:   */   {
/* 34:46 */     return this.remark;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setTransResult(String transResult)
/* 38:   */   {
/* 39:50 */     this.transResult = transResult;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getTransResult()
/* 43:   */   {
/* 44:53 */     return this.transResult;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.MybankFinanceYulibaoCapitalRansomResponse
 * JD-Core Version:    0.7.0.1
 */