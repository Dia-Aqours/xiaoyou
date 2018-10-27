/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MedicalHospitalDoctorInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8381988884158894995L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("sex")
/* 15:   */   private String sex;
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
/* 27:   */   public String getName()
/* 28:   */   {
/* 29:45 */     return this.name;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setName(String name)
/* 33:   */   {
/* 34:48 */     this.name = name;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getSex()
/* 38:   */   {
/* 39:52 */     return this.sex;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSex(String sex)
/* 43:   */   {
/* 44:55 */     this.sex = sex;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalHospitalDoctorInfo
 * JD-Core Version:    0.7.0.1
 */