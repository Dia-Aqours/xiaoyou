/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class KoubeiAdvertCommissionMissionSearchModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2196911744388678217L;
/*  10:    */   @ApiField("commission_clause_type")
/*  11:    */   private String commissionClauseType;
/*  12:    */   @ApiField("page_index")
/*  13:    */   private String pageIndex;
/*  14:    */   @ApiField("page_size")
/*  15:    */   private String pageSize;
/*  16:    */   @ApiField("percentage_clause")
/*  17:    */   private KbAdvertCommissionClausePercentage percentageClause;
/*  18:    */   @ApiField("quota_clause")
/*  19:    */   private KbAdvertCommissionClauseQuota quotaClause;
/*  20:    */   @ApiField("type")
/*  21:    */   private String type;
/*  22:    */   @ApiField("voucher")
/*  23:    */   private KbAdvertSubjectVoucher voucher;
/*  24:    */   
/*  25:    */   public String getCommissionClauseType()
/*  26:    */   {
/*  27: 65 */     return this.commissionClauseType;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setCommissionClauseType(String commissionClauseType)
/*  31:    */   {
/*  32: 68 */     this.commissionClauseType = commissionClauseType;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getPageIndex()
/*  36:    */   {
/*  37: 72 */     return this.pageIndex;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setPageIndex(String pageIndex)
/*  41:    */   {
/*  42: 75 */     this.pageIndex = pageIndex;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getPageSize()
/*  46:    */   {
/*  47: 79 */     return this.pageSize;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setPageSize(String pageSize)
/*  51:    */   {
/*  52: 82 */     this.pageSize = pageSize;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public KbAdvertCommissionClausePercentage getPercentageClause()
/*  56:    */   {
/*  57: 86 */     return this.percentageClause;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setPercentageClause(KbAdvertCommissionClausePercentage percentageClause)
/*  61:    */   {
/*  62: 89 */     this.percentageClause = percentageClause;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public KbAdvertCommissionClauseQuota getQuotaClause()
/*  66:    */   {
/*  67: 93 */     return this.quotaClause;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setQuotaClause(KbAdvertCommissionClauseQuota quotaClause)
/*  71:    */   {
/*  72: 96 */     this.quotaClause = quotaClause;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getType()
/*  76:    */   {
/*  77:100 */     return this.type;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setType(String type)
/*  81:    */   {
/*  82:103 */     this.type = type;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public KbAdvertSubjectVoucher getVoucher()
/*  86:    */   {
/*  87:107 */     return this.voucher;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setVoucher(KbAdvertSubjectVoucher voucher)
/*  91:    */   {
/*  92:110 */     this.voucher = voucher;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiAdvertCommissionMissionSearchModel
 * JD-Core Version:    0.7.0.1
 */