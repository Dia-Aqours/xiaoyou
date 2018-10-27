/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicQrcodeCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6281827642416756181L;
/* 10:   */   @ApiField("code_info")
/* 11:   */   private CodeInfo codeInfo;
/* 12:   */   @ApiField("code_type")
/* 13:   */   private String codeType;
/* 14:   */   @ApiField("expire_second")
/* 15:   */   private String expireSecond;
/* 16:   */   @ApiField("show_logo")
/* 17:   */   private String showLogo;
/* 18:   */   
/* 19:   */   public CodeInfo getCodeInfo()
/* 20:   */   {
/* 21:44 */     return this.codeInfo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCodeInfo(CodeInfo codeInfo)
/* 25:   */   {
/* 26:47 */     this.codeInfo = codeInfo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCodeType()
/* 30:   */   {
/* 31:51 */     return this.codeType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCodeType(String codeType)
/* 35:   */   {
/* 36:54 */     this.codeType = codeType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getExpireSecond()
/* 40:   */   {
/* 41:58 */     return this.expireSecond;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setExpireSecond(String expireSecond)
/* 45:   */   {
/* 46:61 */     this.expireSecond = expireSecond;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getShowLogo()
/* 50:   */   {
/* 51:65 */     return this.showLogo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setShowLogo(String showLogo)
/* 55:   */   {
/* 56:68 */     this.showLogo = showLogo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicQrcodeCreateModel
 * JD-Core Version:    0.7.0.1
 */