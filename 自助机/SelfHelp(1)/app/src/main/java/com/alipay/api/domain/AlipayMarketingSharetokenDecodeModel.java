/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingSharetokenDecodeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5659782717735118676L;
/* 10:   */   @ApiField("code_type")
/* 11:   */   private String codeType;
/* 12:   */   @ApiField("ext_data")
/* 13:   */   private String extData;
/* 14:   */   @ApiField("token")
/* 15:   */   private String token;
/* 16:   */   
/* 17:   */   public String getCodeType()
/* 18:   */   {
/* 19:35 */     return this.codeType;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCodeType(String codeType)
/* 23:   */   {
/* 24:38 */     this.codeType = codeType;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getExtData()
/* 28:   */   {
/* 29:42 */     return this.extData;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setExtData(String extData)
/* 33:   */   {
/* 34:45 */     this.extData = extData;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getToken()
/* 38:   */   {
/* 39:49 */     return this.token;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setToken(String token)
/* 43:   */   {
/* 44:52 */     this.token = token;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingSharetokenDecodeModel
 * JD-Core Version:    0.7.0.1
 */