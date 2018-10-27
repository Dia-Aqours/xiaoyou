/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AntMerchantExpandEnterpriseApplyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1586225555653928723L;
/*  10:    */   @ApiField("base_info")
/*  11:    */   private BaseInfo baseInfo;
/*  12:    */   @ApiField("business_bank_account_info")
/*  13:    */   private BusinessBankAccountInfo businessBankAccountInfo;
/*  14:    */   @ApiField("business_license_info")
/*  15:    */   private BusinessLicenceInfo businessLicenseInfo;
/*  16:    */   @ApiField("legal_representative_info")
/*  17:    */   private LegalRepresentativeInfo legalRepresentativeInfo;
/*  18:    */   @ApiField("login_id")
/*  19:    */   private String loginId;
/*  20:    */   @ApiField("out_biz_no")
/*  21:    */   private String outBizNo;
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
/*  35:    */   public BusinessBankAccountInfo getBusinessBankAccountInfo()
/*  36:    */   {
/*  37: 66 */     return this.businessBankAccountInfo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setBusinessBankAccountInfo(BusinessBankAccountInfo businessBankAccountInfo)
/*  41:    */   {
/*  42: 69 */     this.businessBankAccountInfo = businessBankAccountInfo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public BusinessLicenceInfo getBusinessLicenseInfo()
/*  46:    */   {
/*  47: 73 */     return this.businessLicenseInfo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setBusinessLicenseInfo(BusinessLicenceInfo businessLicenseInfo)
/*  51:    */   {
/*  52: 76 */     this.businessLicenseInfo = businessLicenseInfo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public LegalRepresentativeInfo getLegalRepresentativeInfo()
/*  56:    */   {
/*  57: 80 */     return this.legalRepresentativeInfo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setLegalRepresentativeInfo(LegalRepresentativeInfo legalRepresentativeInfo)
/*  61:    */   {
/*  62: 83 */     this.legalRepresentativeInfo = legalRepresentativeInfo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getLoginId()
/*  66:    */   {
/*  67: 87 */     return this.loginId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setLoginId(String loginId)
/*  71:    */   {
/*  72: 90 */     this.loginId = loginId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getOutBizNo()
/*  76:    */   {
/*  77: 94 */     return this.outBizNo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setOutBizNo(String outBizNo)
/*  81:    */   {
/*  82: 97 */     this.outBizNo = outBizNo;
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

 * Qualified Name:     com.alipay.api.domain.AntMerchantExpandEnterpriseApplyModel

 * JD-Core Version:    0.7.0.1

 */