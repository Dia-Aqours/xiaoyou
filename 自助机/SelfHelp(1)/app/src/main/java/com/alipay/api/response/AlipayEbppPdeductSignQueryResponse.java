/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppPdeductSignQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7159654516241896879L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("bill_key")
/* 13:   */   private String billKey;
/* 14:   */   @ApiField("charge_inst")
/* 15:   */   private String chargeInst;
/* 16:   */   @ApiField("out_agreement_id")
/* 17:   */   private String outAgreementId;
/* 18:   */   @ApiField("sign_date")
/* 19:   */   private String signDate;
/* 20:   */   @ApiField("user_id")
/* 21:   */   private String userId;
/* 22:   */   
/* 23:   */   public void setAgreementId(String agreementId)
/* 24:   */   {
/* 25:54 */     this.agreementId = agreementId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getAgreementId()
/* 29:   */   {
/* 30:57 */     return this.agreementId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setBillKey(String billKey)
/* 34:   */   {
/* 35:61 */     this.billKey = billKey;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getBillKey()
/* 39:   */   {
/* 40:64 */     return this.billKey;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setChargeInst(String chargeInst)
/* 44:   */   {
/* 45:68 */     this.chargeInst = chargeInst;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getChargeInst()
/* 49:   */   {
/* 50:71 */     return this.chargeInst;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setOutAgreementId(String outAgreementId)
/* 54:   */   {
/* 55:75 */     this.outAgreementId = outAgreementId;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getOutAgreementId()
/* 59:   */   {
/* 60:78 */     return this.outAgreementId;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setSignDate(String signDate)
/* 64:   */   {
/* 65:82 */     this.signDate = signDate;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String getSignDate()
/* 69:   */   {
/* 70:85 */     return this.signDate;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void setUserId(String userId)
/* 74:   */   {
/* 75:89 */     this.userId = userId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String getUserId()
/* 79:   */   {
/* 80:92 */     return this.userId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEbppPdeductSignQueryResponse
 * JD-Core Version:    0.7.0.1
 */