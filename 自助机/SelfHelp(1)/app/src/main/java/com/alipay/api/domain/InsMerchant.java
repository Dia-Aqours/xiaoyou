/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InsMerchant
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3134552233229375387L;
/* 10:   */   @ApiField("name")
/* 11:   */   private String name;
/* 12:   */   @ApiField("service_phone")
/* 13:   */   private String servicePhone;
/* 14:   */   @ApiField("short_name")
/* 15:   */   private String shortName;
/* 16:   */   
/* 17:   */   public String getName()
/* 18:   */   {
/* 19:35 */     return this.name;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setName(String name)
/* 23:   */   {
/* 24:38 */     this.name = name;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getServicePhone()
/* 28:   */   {
/* 29:42 */     return this.servicePhone;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setServicePhone(String servicePhone)
/* 33:   */   {
/* 34:45 */     this.servicePhone = servicePhone;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getShortName()
/* 38:   */   {
/* 39:49 */     return this.shortName;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setShortName(String shortName)
/* 43:   */   {
/* 44:52 */     this.shortName = shortName;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMerchant
 * JD-Core Version:    0.7.0.1
 */