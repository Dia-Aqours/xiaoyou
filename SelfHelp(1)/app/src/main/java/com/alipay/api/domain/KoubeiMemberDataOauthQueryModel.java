/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMemberDataOauthQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5793388263591681651L;
/* 10:   */   @ApiField("auth_type")
/* 11:   */   private String authType;
/* 12:   */   @ApiField("code")
/* 13:   */   private String code;
/* 14:   */   @ApiField("ext_info")
/* 15:   */   private String extInfo;
/* 16:   */   
/* 17:   */   public String getAuthType()
/* 18:   */   {
/* 19:35 */     return this.authType;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAuthType(String authType)
/* 23:   */   {
/* 24:38 */     this.authType = authType;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCode()
/* 28:   */   {
/* 29:42 */     return this.code;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCode(String code)
/* 33:   */   {
/* 34:45 */     this.code = code;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getExtInfo()
/* 38:   */   {
/* 39:49 */     return this.extInfo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setExtInfo(String extInfo)
/* 43:   */   {
/* 44:52 */     this.extInfo = extInfo;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMemberDataOauthQueryModel

 * JD-Core Version:    0.7.0.1

 */