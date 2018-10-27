/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipaySecurityProdAmlriskQueryModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1375148636783591533L;
/*  12:    */   @ApiField("business_address")
/*  13:    */   private String businessAddress;
/*  14:    */   @ApiField("event_id")
/*  15:    */   private String eventId;
/*  16:    */   @ApiListField("individual_list")
/*  17:    */   @ApiField("individual_info")
/*  18:    */   private List<IndividualInfo> individualList;
/*  19:    */   @ApiField("legal_name")
/*  20:    */   private String legalName;
/*  21:    */   @ApiField("merchant_id")
/*  22:    */   private String merchantId;
/*  23:    */   @ApiField("order_id")
/*  24:    */   private String orderId;
/*  25:    */   @ApiField("registered_address")
/*  26:    */   private String registeredAddress;
/*  27:    */   @ApiField("registration_number")
/*  28:    */   private String registrationNumber;
/*  29:    */   
/*  30:    */   public String getBusinessAddress()
/*  31:    */   {
/*  32: 69 */     return this.businessAddress;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setBusinessAddress(String businessAddress)
/*  36:    */   {
/*  37: 72 */     this.businessAddress = businessAddress;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getEventId()
/*  41:    */   {
/*  42: 76 */     return this.eventId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setEventId(String eventId)
/*  46:    */   {
/*  47: 79 */     this.eventId = eventId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public List<IndividualInfo> getIndividualList()
/*  51:    */   {
/*  52: 83 */     return this.individualList;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setIndividualList(List<IndividualInfo> individualList)
/*  56:    */   {
/*  57: 86 */     this.individualList = individualList;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getLegalName()
/*  61:    */   {
/*  62: 90 */     return this.legalName;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setLegalName(String legalName)
/*  66:    */   {
/*  67: 93 */     this.legalName = legalName;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getMerchantId()
/*  71:    */   {
/*  72: 97 */     return this.merchantId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setMerchantId(String merchantId)
/*  76:    */   {
/*  77:100 */     this.merchantId = merchantId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getOrderId()
/*  81:    */   {
/*  82:104 */     return this.orderId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setOrderId(String orderId)
/*  86:    */   {
/*  87:107 */     this.orderId = orderId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getRegisteredAddress()
/*  91:    */   {
/*  92:111 */     return this.registeredAddress;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setRegisteredAddress(String registeredAddress)
/*  96:    */   {
/*  97:114 */     this.registeredAddress = registeredAddress;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getRegistrationNumber()
/* 101:    */   {
/* 102:118 */     return this.registrationNumber;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setRegistrationNumber(String registrationNumber)
/* 106:    */   {
/* 107:121 */     this.registrationNumber = registrationNumber;
/* 108:    */   }
/* 109:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityProdAmlriskQueryModel
 * JD-Core Version:    0.7.0.1
 */