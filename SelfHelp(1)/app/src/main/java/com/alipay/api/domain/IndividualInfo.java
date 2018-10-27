/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class IndividualInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7422974287881863329L;
/* 10:   */   @ApiField("date_of_birth")
/* 11:   */   private String dateOfBirth;
/* 12:   */   @ApiField("id_number")
/* 13:   */   private String idNumber;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("nationality")
/* 17:   */   private String nationality;
/* 18:   */   @ApiField("residential_address")
/* 19:   */   private String residentialAddress;
/* 20:   */   @ApiField("type")
/* 21:   */   private String type;
/* 22:   */   
/* 23:   */   public String getDateOfBirth()
/* 24:   */   {
/* 25:53 */     return this.dateOfBirth;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setDateOfBirth(String dateOfBirth)
/* 29:   */   {
/* 30:56 */     this.dateOfBirth = dateOfBirth;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getIdNumber()
/* 34:   */   {
/* 35:60 */     return this.idNumber;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setIdNumber(String idNumber)
/* 39:   */   {
/* 40:63 */     this.idNumber = idNumber;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getName()
/* 44:   */   {
/* 45:67 */     return this.name;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setName(String name)
/* 49:   */   {
/* 50:70 */     this.name = name;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getNationality()
/* 54:   */   {
/* 55:74 */     return this.nationality;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setNationality(String nationality)
/* 59:   */   {
/* 60:77 */     this.nationality = nationality;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getResidentialAddress()
/* 64:   */   {
/* 65:81 */     return this.residentialAddress;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setResidentialAddress(String residentialAddress)
/* 69:   */   {
/* 70:84 */     this.residentialAddress = residentialAddress;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getType()
/* 74:   */   {
/* 75:88 */     return this.type;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setType(String type)
/* 79:   */   {
/* 80:91 */     this.type = type;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.IndividualInfo
 * JD-Core Version:    0.7.0.1
 */