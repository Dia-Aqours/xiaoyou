/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2468356259128846955L;
/* 10:   */   @ApiField("budget_info")
/* 11:   */   private BudgetInfo budgetInfo;
/* 12:   */   @ApiField("code_inventory_id")
/* 13:   */   private String codeInventoryId;
/* 14:   */   @ApiField("ext_info")
/* 15:   */   private String extInfo;
/* 16:   */   @ApiField("get_rule")
/* 17:   */   private GetRuleInfo getRule;
/* 18:   */   @ApiField("out_biz_no")
/* 19:   */   private String outBizNo;
/* 20:   */   @ApiField("voucher_info")
/* 21:   */   private VoucherInfo voucherInfo;
/* 22:   */   
/* 23:   */   public BudgetInfo getBudgetInfo()
/* 24:   */   {
/* 25:53 */     return this.budgetInfo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBudgetInfo(BudgetInfo budgetInfo)
/* 29:   */   {
/* 30:56 */     this.budgetInfo = budgetInfo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCodeInventoryId()
/* 34:   */   {
/* 35:60 */     return this.codeInventoryId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCodeInventoryId(String codeInventoryId)
/* 39:   */   {
/* 40:63 */     this.codeInventoryId = codeInventoryId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getExtInfo()
/* 44:   */   {
/* 45:67 */     return this.extInfo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setExtInfo(String extInfo)
/* 49:   */   {
/* 50:70 */     this.extInfo = extInfo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public GetRuleInfo getGetRule()
/* 54:   */   {
/* 55:74 */     return this.getRule;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setGetRule(GetRuleInfo getRule)
/* 59:   */   {
/* 60:77 */     this.getRule = getRule;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getOutBizNo()
/* 64:   */   {
/* 65:81 */     return this.outBizNo;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setOutBizNo(String outBizNo)
/* 69:   */   {
/* 70:84 */     this.outBizNo = outBizNo;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public VoucherInfo getVoucherInfo()
/* 74:   */   {
/* 75:88 */     return this.voucherInfo;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setVoucherInfo(VoucherInfo voucherInfo)
/* 79:   */   {
/* 80:91 */     this.voucherInfo = voucherInfo;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketingVoucherCreateModel
 * JD-Core Version:    0.7.0.1
 */