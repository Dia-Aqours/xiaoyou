/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityRiskDirectionalRainscoreQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8159732864114862121L;
/* 10:   */   @ApiField("account")
/* 11:   */   private String account;
/* 12:   */   @ApiField("account_type")
/* 13:   */   private String accountType;
/* 14:   */   @ApiField("version")
/* 15:   */   private String version;
/* 16:   */   
/* 17:   */   public String getAccount()
/* 18:   */   {
/* 19:35 */     return this.account;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAccount(String account)
/* 23:   */   {
/* 24:38 */     this.account = account;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getAccountType()
/* 28:   */   {
/* 29:42 */     return this.accountType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setAccountType(String accountType)
/* 33:   */   {
/* 34:45 */     this.accountType = accountType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getVersion()
/* 38:   */   {
/* 39:49 */     return this.version;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setVersion(String version)
/* 43:   */   {
/* 44:52 */     this.version = version;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskDirectionalRainscoreQueryModel
 * JD-Core Version:    0.7.0.1
 */