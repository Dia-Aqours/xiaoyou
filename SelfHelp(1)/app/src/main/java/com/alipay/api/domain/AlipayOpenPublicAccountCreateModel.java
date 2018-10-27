/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicAccountCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5371467282251975323L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("bind_account_no")
/* 13:   */   private String bindAccountNo;
/* 14:   */   @ApiField("display_name")
/* 15:   */   private String displayName;
/* 16:   */   @ApiField("from_user_id")
/* 17:   */   private String fromUserId;
/* 18:   */   @ApiField("real_name")
/* 19:   */   private String realName;
/* 20:   */   @ApiField("remark")
/* 21:   */   private String remark;
/* 22:   */   
/* 23:   */   public String getAgreementId()
/* 24:   */   {
/* 25:53 */     return this.agreementId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAgreementId(String agreementId)
/* 29:   */   {
/* 30:56 */     this.agreementId = agreementId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getBindAccountNo()
/* 34:   */   {
/* 35:60 */     return this.bindAccountNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setBindAccountNo(String bindAccountNo)
/* 39:   */   {
/* 40:63 */     this.bindAccountNo = bindAccountNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getDisplayName()
/* 44:   */   {
/* 45:67 */     return this.displayName;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setDisplayName(String displayName)
/* 49:   */   {
/* 50:70 */     this.displayName = displayName;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getFromUserId()
/* 54:   */   {
/* 55:74 */     return this.fromUserId;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setFromUserId(String fromUserId)
/* 59:   */   {
/* 60:77 */     this.fromUserId = fromUserId;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getRealName()
/* 64:   */   {
/* 65:81 */     return this.realName;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setRealName(String realName)
/* 69:   */   {
/* 70:84 */     this.realName = realName;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getRemark()
/* 74:   */   {
/* 75:88 */     return this.remark;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setRemark(String remark)
/* 79:   */   {
/* 80:91 */     this.remark = remark;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicAccountCreateModel
 * JD-Core Version:    0.7.0.1
 */