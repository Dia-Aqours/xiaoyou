/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.DiagnoseResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMarketingDataSmartmanagementDiagnoseResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 7161252483312565775L;
/* 13:   */   @ApiListField("diagnose_result")
/* 14:   */   @ApiField("diagnose_result")
/* 15:   */   private List<DiagnoseResult> diagnoseResult;
/* 16:   */   
/* 17:   */   public void setDiagnoseResult(List<DiagnoseResult> diagnoseResult)
/* 18:   */   {
/* 19:37 */     this.diagnoseResult = diagnoseResult;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<DiagnoseResult> getDiagnoseResult()
/* 23:   */   {
/* 24:40 */     return this.diagnoseResult;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataSmartmanagementDiagnoseResponse
 * JD-Core Version:    0.7.0.1
 */