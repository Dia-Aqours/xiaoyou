/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayCommerceMedicalCardQueryResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1738944747658566233L;
/*  10:    */   @ApiField("agreement_no")
/*  11:    */   private String agreementNo;
/*  12:    */   @ApiField("buyer_logon_id")
/*  13:    */   private String buyerLogonId;
/*  14:    */   @ApiField("buyer_user_id")
/*  15:    */   private String buyerUserId;
/*  16:    */   @ApiField("card_org_name")
/*  17:    */   private String cardOrgName;
/*  18:    */   @ApiField("card_org_no")
/*  19:    */   private String cardOrgNo;
/*  20:    */   @ApiField("city")
/*  21:    */   private String city;
/*  22:    */   @ApiField("extend_params")
/*  23:    */   private String extendParams;
/*  24:    */   @ApiField("gmt_sign")
/*  25:    */   private String gmtSign;
/*  26:    */   @ApiField("medical_card_id")
/*  27:    */   private String medicalCardId;
/*  28:    */   @ApiField("medical_card_no")
/*  29:    */   private String medicalCardNo;
/*  30:    */   @ApiField("medical_card_type")
/*  31:    */   private String medicalCardType;
/*  32:    */   @ApiField("sign_status")
/*  33:    */   private String signStatus;
/*  34:    */   
/*  35:    */   public void setAgreementNo(String agreementNo)
/*  36:    */   {
/*  37: 95 */     this.agreementNo = agreementNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getAgreementNo()
/*  41:    */   {
/*  42: 98 */     return this.agreementNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setBuyerLogonId(String buyerLogonId)
/*  46:    */   {
/*  47:102 */     this.buyerLogonId = buyerLogonId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getBuyerLogonId()
/*  51:    */   {
/*  52:105 */     return this.buyerLogonId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setBuyerUserId(String buyerUserId)
/*  56:    */   {
/*  57:109 */     this.buyerUserId = buyerUserId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getBuyerUserId()
/*  61:    */   {
/*  62:112 */     return this.buyerUserId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setCardOrgName(String cardOrgName)
/*  66:    */   {
/*  67:116 */     this.cardOrgName = cardOrgName;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getCardOrgName()
/*  71:    */   {
/*  72:119 */     return this.cardOrgName;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setCardOrgNo(String cardOrgNo)
/*  76:    */   {
/*  77:123 */     this.cardOrgNo = cardOrgNo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getCardOrgNo()
/*  81:    */   {
/*  82:126 */     return this.cardOrgNo;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setCity(String city)
/*  86:    */   {
/*  87:130 */     this.city = city;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getCity()
/*  91:    */   {
/*  92:133 */     return this.city;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setExtendParams(String extendParams)
/*  96:    */   {
/*  97:137 */     this.extendParams = extendParams;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getExtendParams()
/* 101:    */   {
/* 102:140 */     return this.extendParams;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setGmtSign(String gmtSign)
/* 106:    */   {
/* 107:144 */     this.gmtSign = gmtSign;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getGmtSign()
/* 111:    */   {
/* 112:147 */     return this.gmtSign;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setMedicalCardId(String medicalCardId)
/* 116:    */   {
/* 117:151 */     this.medicalCardId = medicalCardId;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getMedicalCardId()
/* 121:    */   {
/* 122:154 */     return this.medicalCardId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setMedicalCardNo(String medicalCardNo)
/* 126:    */   {
/* 127:158 */     this.medicalCardNo = medicalCardNo;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getMedicalCardNo()
/* 131:    */   {
/* 132:161 */     return this.medicalCardNo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setMedicalCardType(String medicalCardType)
/* 136:    */   {
/* 137:165 */     this.medicalCardType = medicalCardType;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getMedicalCardType()
/* 141:    */   {
/* 142:168 */     return this.medicalCardType;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setSignStatus(String signStatus)
/* 146:    */   {
/* 147:172 */     this.signStatus = signStatus;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getSignStatus()
/* 151:    */   {
/* 152:175 */     return this.signStatus;
/* 153:    */   }
/* 154:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayCommerceMedicalCardQueryResponse

 * JD-Core Version:    0.7.0.1

 */