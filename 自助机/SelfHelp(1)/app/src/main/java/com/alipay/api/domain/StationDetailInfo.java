/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class StationDetailInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1153647459153359189L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("ext_code")
/* 13:   */   private String extCode;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   
/* 17:   */   public String getCode()
/* 18:   */   {
/* 19:35 */     return this.code;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCode(String code)
/* 23:   */   {
/* 24:38 */     this.code = code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getExtCode()
/* 28:   */   {
/* 29:42 */     return this.extCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setExtCode(String extCode)
/* 33:   */   {
/* 34:45 */     this.extCode = extCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getName()
/* 38:   */   {
/* 39:49 */     return this.name;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setName(String name)
/* 43:   */   {
/* 44:52 */     this.name = name;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.StationDetailInfo

 * JD-Core Version:    0.7.0.1

 */