/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AntMerchantExpandPersonalApplyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5538589551117173428L;
/*  10:    */   @ApiField("base_info")
/*  11:    */   private BaseInfo baseInfo;
/*  12:    */   @ApiField("business_license_info")
/*  13:    */   private BusinessLicenceInfo businessLicenseInfo;
/*  14:    */   @ApiField("login_id")
/*  15:    */   private String loginId;
/*  16:    */   @ApiField("operator_info")
/*  17:    */   private OperatorInfo operatorInfo;
/*  18:    */   @ApiField("out_biz_no")
/*  19:    */   private String outBizNo;
/*  20:    */   @ApiField("personal_bank_account_info")
/*  21:    */   private PersonnalBankAccountInfo personalBankAccountInfo;
/*  22:    */   @ApiField("shop_info")
/*  23:    */   private ShopInfo shopInfo;
/*  24:    */   
/*  25:    */   public BaseInfo getBaseInfo()
/*  26:    */   {
/*  27: 59 */     return this.baseInfo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setBaseInfo(BaseInfo baseInfo)
/*  31:    */   {
/*  32: 62 */     this.baseInfo = baseInfo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public BusinessLicenceInfo getBusinessLicenseInfo()
/*  36:    */   {
/*  37: 66 */     return this.businessLicenseInfo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setBusinessLicenseInfo(BusinessLicenceInfo businessLicenseInfo)
/*  41:    */   {
/*  42: 69 */     this.businessLicenseInfo = businessLicenseInfo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getLoginId()
/*  46:    */   {
/*  47: 73 */     return this.loginId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setLoginId(String loginId)
/*  51:    */   {
/*  52: 76 */     this.loginId = loginId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public OperatorInfo getOperatorInfo()
/*  56:    */   {
/*  57: 80 */     return this.operatorInfo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOperatorInfo(OperatorInfo operatorInfo)
/*  61:    */   {
/*  62: 83 */     this.operatorInfo = operatorInfo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOutBizNo()
/*  66:    */   {
/*  67: 87 */     return this.outBizNo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutBizNo(String outBizNo)
/*  71:    */   {
/*  72: 90 */     this.outBizNo = outBizNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public PersonnalBankAccountInfo getPersonalBankAccountInfo()
/*  76:    */   {
/*  77: 94 */     return this.personalBankAccountInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setPersonalBankAccountInfo(PersonnalBankAccountInfo personalBankAccountInfo)
/*  81:    */   {
/*  82: 97 */     this.personalBankAccountInfo = personalBankAccountInfo;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public ShopInfo getShopInfo()
/*  86:    */   {
/*  87:101 */     return this.shopInfo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setShopInfo(ShopInfo shopInfo)
/*  91:    */   {
/*  92:104 */     this.shopInfo = shopInfo;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AntMerchantExpandPersonalApplyModel
 * JD-Core Version:    0.7.0.1
 */