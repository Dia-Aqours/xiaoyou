/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MedicalHospitalInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3129748649224996551L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("phone")
/* 15:   */   private String phone;
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
/* 27:   */   public String getName()
/* 28:   */   {
/* 29:42 */     return this.name;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setName(String name)
/* 33:   */   {
/* 34:45 */     this.name = name;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPhone()
/* 38:   */   {
/* 39:49 */     return this.phone;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPhone(String phone)
/* 43:   */   {
/* 44:52 */     this.phone = phone;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalHospitalInfo
 * JD-Core Version:    0.7.0.1
 */