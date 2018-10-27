/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicPartnerMenuOperateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7284125212278635967L;
/* 10:   */   @ApiField("action_param")
/* 11:   */   private String actionParam;
/* 12:   */   @ApiField("action_type")
/* 13:   */   private String actionType;
/* 14:   */   @ApiField("agreement_id")
/* 15:   */   private String agreementId;
/* 16:   */   @ApiField("public_id")
/* 17:   */   private String publicId;
/* 18:   */   @ApiField("third_account_id")
/* 19:   */   private String thirdAccountId;
/* 20:   */   @ApiField("user_id")
/* 21:   */   private String userId;
/* 22:   */   
/* 23:   */   public String getActionParam()
/* 24:   */   {
/* 25:53 */     return this.actionParam;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setActionParam(String actionParam)
/* 29:   */   {
/* 30:56 */     this.actionParam = actionParam;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getActionType()
/* 34:   */   {
/* 35:60 */     return this.actionType;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setActionType(String actionType)
/* 39:   */   {
/* 40:63 */     this.actionType = actionType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getAgreementId()
/* 44:   */   {
/* 45:67 */     return this.agreementId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setAgreementId(String agreementId)
/* 49:   */   {
/* 50:70 */     this.agreementId = agreementId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getPublicId()
/* 54:   */   {
/* 55:74 */     return this.publicId;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setPublicId(String publicId)
/* 59:   */   {
/* 60:77 */     this.publicId = publicId;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getThirdAccountId()
/* 64:   */   {
/* 65:81 */     return this.thirdAccountId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setThirdAccountId(String thirdAccountId)
/* 69:   */   {
/* 70:84 */     this.thirdAccountId = thirdAccountId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUserId()
/* 74:   */   {
/* 75:88 */     return this.userId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUserId(String userId)
/* 79:   */   {
/* 80:91 */     this.userId = userId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicPartnerMenuOperateModel
 * JD-Core Version:    0.7.0.1
 */