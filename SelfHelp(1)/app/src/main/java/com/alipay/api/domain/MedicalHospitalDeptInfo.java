/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MedicalHospitalDeptInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7193956986857143547L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("location")
/* 13:   */   private String location;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("parent_name")
/* 17:   */   private String parentName;
/* 18:   */   @ApiField("partner_code")
/* 19:   */   private String partnerCode;
/* 20:   */   
/* 21:   */   public String getCode()
/* 22:   */   {
/* 23:49 */     return this.code;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCode(String code)
/* 27:   */   {
/* 28:52 */     this.code = code;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getLocation()
/* 32:   */   {
/* 33:56 */     return this.location;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setLocation(String location)
/* 37:   */   {
/* 38:59 */     this.location = location;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getName()
/* 42:   */   {
/* 43:63 */     return this.name;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setName(String name)
/* 47:   */   {
/* 48:66 */     this.name = name;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getParentName()
/* 52:   */   {
/* 53:70 */     return this.parentName;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setParentName(String parentName)
/* 57:   */   {
/* 58:73 */     this.parentName = parentName;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getPartnerCode()
/* 62:   */   {
/* 63:77 */     return this.partnerCode;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setPartnerCode(String partnerCode)
/* 67:   */   {
/* 68:80 */     this.partnerCode = partnerCode;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalHospitalDeptInfo
 * JD-Core Version:    0.7.0.1
 */