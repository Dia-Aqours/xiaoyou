/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertIdentifyResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2247473637478152528L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("identify")
/* 13:   */   private String identify;
/* 14:   */   @ApiField("identify_type")
/* 15:   */   private String identifyType;
/* 16:   */   
/* 17:   */   public String getCode()
/* 18:   */   {
/* 19:38 */     return this.code;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCode(String code)
/* 23:   */   {
/* 24:41 */     this.code = code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getIdentify()
/* 28:   */   {
/* 29:45 */     return this.identify;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setIdentify(String identify)
/* 33:   */   {
/* 34:48 */     this.identify = identify;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getIdentifyType()
/* 38:   */   {
/* 39:52 */     return this.identifyType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setIdentifyType(String identifyType)
/* 43:   */   {
/* 44:55 */     this.identifyType = identifyType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertIdentifyResponse
 * JD-Core Version:    0.7.0.1
 */