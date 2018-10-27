/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOfflineMarketingVoucherModifyModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6694599397694582325L;
/* 10:   */   @ApiField("budget_info")
/* 11:   */   private BudgetInfo budgetInfo;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("get_count_limit")
/* 15:   */   private PeriodInfo getCountLimit;
/* 16:   */   @ApiField("out_biz_no")
/* 17:   */   private String outBizNo;
/* 18:   */   @ApiField("voucher_info")
/* 19:   */   private VoucherModifyInfo voucherInfo;
/* 20:   */   
/* 21:   */   public BudgetInfo getBudgetInfo()
/* 22:   */   {
/* 23:47 */     return this.budgetInfo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setBudgetInfo(BudgetInfo budgetInfo)
/* 27:   */   {
/* 28:50 */     this.budgetInfo = budgetInfo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getExtInfo()
/* 32:   */   {
/* 33:54 */     return this.extInfo;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setExtInfo(String extInfo)
/* 37:   */   {
/* 38:57 */     this.extInfo = extInfo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public PeriodInfo getGetCountLimit()
/* 42:   */   {
/* 43:61 */     return this.getCountLimit;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setGetCountLimit(PeriodInfo getCountLimit)
/* 47:   */   {
/* 48:64 */     this.getCountLimit = getCountLimit;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOutBizNo()
/* 52:   */   {
/* 53:68 */     return this.outBizNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOutBizNo(String outBizNo)
/* 57:   */   {
/* 58:71 */     this.outBizNo = outBizNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public VoucherModifyInfo getVoucherInfo()
/* 62:   */   {
/* 63:75 */     return this.voucherInfo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setVoucherInfo(VoucherModifyInfo voucherInfo)
/* 67:   */   {
/* 68:78 */     this.voucherInfo = voucherInfo;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketingVoucherModifyModel

 * JD-Core Version:    0.7.0.1

 */