/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayInsMarketingDiscountDecisionModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 4846841566281927927L;
/*  12:    */   @ApiField("account_id")
/*  13:    */   private String accountId;
/*  14:    */   @ApiField("account_type")
/*  15:    */   private Long accountType;
/*  16:    */   @ApiField("business_type")
/*  17:    */   private Long businessType;
/*  18:    */   @ApiListField("factors")
/*  19:    */   @ApiField("ins_mkt_factor_d_t_o")
/*  20:    */   private List<InsMktFactorDTO> factors;
/*  21:    */   @ApiListField("market_types")
/*  22:    */   @ApiField("number")
/*  23:    */   private List<Long> marketTypes;
/*  24:    */   @ApiListField("mkt_objects")
/*  25:    */   @ApiField("ins_mkt_object_d_t_o")
/*  26:    */   private List<InsMktObjectDTO> mktObjects;
/*  27:    */   @ApiField("request_id")
/*  28:    */   private String requestId;
/*  29:    */   
/*  30:    */   public String getAccountId()
/*  31:    */   {
/*  32: 65 */     return this.accountId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setAccountId(String accountId)
/*  36:    */   {
/*  37: 68 */     this.accountId = accountId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Long getAccountType()
/*  41:    */   {
/*  42: 72 */     return this.accountType;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setAccountType(Long accountType)
/*  46:    */   {
/*  47: 75 */     this.accountType = accountType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public Long getBusinessType()
/*  51:    */   {
/*  52: 79 */     return this.businessType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setBusinessType(Long businessType)
/*  56:    */   {
/*  57: 82 */     this.businessType = businessType;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public List<InsMktFactorDTO> getFactors()
/*  61:    */   {
/*  62: 86 */     return this.factors;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setFactors(List<InsMktFactorDTO> factors)
/*  66:    */   {
/*  67: 89 */     this.factors = factors;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public List<Long> getMarketTypes()
/*  71:    */   {
/*  72: 93 */     return this.marketTypes;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setMarketTypes(List<Long> marketTypes)
/*  76:    */   {
/*  77: 96 */     this.marketTypes = marketTypes;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public List<InsMktObjectDTO> getMktObjects()
/*  81:    */   {
/*  82:100 */     return this.mktObjects;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setMktObjects(List<InsMktObjectDTO> mktObjects)
/*  86:    */   {
/*  87:103 */     this.mktObjects = mktObjects;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getRequestId()
/*  91:    */   {
/*  92:107 */     return this.requestId;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setRequestId(String requestId)
/*  96:    */   {
/*  97:110 */     this.requestId = requestId;
/*  98:    */   }
/*  99:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingDiscountDecisionModel
 * JD-Core Version:    0.7.0.1
 */