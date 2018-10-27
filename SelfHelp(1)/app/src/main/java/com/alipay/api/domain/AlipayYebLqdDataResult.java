/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayYebLqdDataResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2513332187881136573L;
/* 10:   */   @ApiField("predict_purchase_amt")
/* 11:   */   private String predictPurchaseAmt;
/* 12:   */   @ApiField("predict_redeem_amt")
/* 13:   */   private String predictRedeemAmt;
/* 14:   */   @ApiField("target_date")
/* 15:   */   private String targetDate;
/* 16:   */   
/* 17:   */   public String getPredictPurchaseAmt()
/* 18:   */   {
/* 19:35 */     return this.predictPurchaseAmt;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setPredictPurchaseAmt(String predictPurchaseAmt)
/* 23:   */   {
/* 24:38 */     this.predictPurchaseAmt = predictPurchaseAmt;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPredictRedeemAmt()
/* 28:   */   {
/* 29:42 */     return this.predictRedeemAmt;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPredictRedeemAmt(String predictRedeemAmt)
/* 33:   */   {
/* 34:45 */     this.predictRedeemAmt = predictRedeemAmt;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTargetDate()
/* 38:   */   {
/* 39:49 */     return this.targetDate;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTargetDate(String targetDate)
/* 43:   */   {
/* 44:52 */     this.targetDate = targetDate;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayYebLqdDataResult
 * JD-Core Version:    0.7.0.1
 */