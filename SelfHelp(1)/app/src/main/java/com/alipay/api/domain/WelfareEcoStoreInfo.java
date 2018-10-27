/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class WelfareEcoStoreInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1444261792893896646L;
/* 10:   */   @ApiField("address")
/* 11:   */   private String address;
/* 12:   */   @ApiField("brand")
/* 13:   */   private String brand;
/* 14:   */   @ApiField("code")
/* 15:   */   private String code;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
/* 18:   */   
/* 19:   */   public String getAddress()
/* 20:   */   {
/* 21:41 */     return this.address;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAddress(String address)
/* 25:   */   {
/* 26:44 */     this.address = address;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getBrand()
/* 30:   */   {
/* 31:48 */     return this.brand;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setBrand(String brand)
/* 35:   */   {
/* 36:51 */     this.brand = brand;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getCode()
/* 40:   */   {
/* 41:55 */     return this.code;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setCode(String code)
/* 45:   */   {
/* 46:58 */     this.code = code;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getName()
/* 50:   */   {
/* 51:62 */     return this.name;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setName(String name)
/* 55:   */   {
/* 56:65 */     this.name = name;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.WelfareEcoStoreInfo

 * JD-Core Version:    0.7.0.1

 */