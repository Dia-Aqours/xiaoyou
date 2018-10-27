/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class DstCampRuleModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4713716927219689355L;
/*  10:    */   @ApiField("alipay_cashier")
/*  11:    */   private String alipayCashier;
/*  12:    */   @ApiField("discount_type")
/*  13:    */   private String discountType;
/*  14:    */   @ApiField("id")
/*  15:    */   private String id;
/*  16:    */   @ApiField("prize_count_per_account")
/*  17:    */   private String prizeCountPerAccount;
/*  18:    */   @ApiField("product_type")
/*  19:    */   private String productType;
/*  20:    */   @ApiField("rule_uuid")
/*  21:    */   private String ruleUuid;
/*  22:    */   @ApiField("voucher_id")
/*  23:    */   private String voucherId;
/*  24:    */   
/*  25:    */   public String getAlipayCashier()
/*  26:    */   {
/*  27: 59 */     return this.alipayCashier;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAlipayCashier(String alipayCashier)
/*  31:    */   {
/*  32: 62 */     this.alipayCashier = alipayCashier;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getDiscountType()
/*  36:    */   {
/*  37: 66 */     return this.discountType;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setDiscountType(String discountType)
/*  41:    */   {
/*  42: 69 */     this.discountType = discountType;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getId()
/*  46:    */   {
/*  47: 73 */     return this.id;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setId(String id)
/*  51:    */   {
/*  52: 76 */     this.id = id;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getPrizeCountPerAccount()
/*  56:    */   {
/*  57: 80 */     return this.prizeCountPerAccount;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setPrizeCountPerAccount(String prizeCountPerAccount)
/*  61:    */   {
/*  62: 83 */     this.prizeCountPerAccount = prizeCountPerAccount;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getProductType()
/*  66:    */   {
/*  67: 87 */     return this.productType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setProductType(String productType)
/*  71:    */   {
/*  72: 90 */     this.productType = productType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getRuleUuid()
/*  76:    */   {
/*  77: 94 */     return this.ruleUuid;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setRuleUuid(String ruleUuid)
/*  81:    */   {
/*  82: 97 */     this.ruleUuid = ruleUuid;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getVoucherId()
/*  86:    */   {
/*  87:101 */     return this.voucherId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setVoucherId(String voucherId)
/*  91:    */   {
/*  92:104 */     this.voucherId = voucherId;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DstCampRuleModel
 * JD-Core Version:    0.7.0.1
 */