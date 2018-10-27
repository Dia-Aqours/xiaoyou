/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class Retailer
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3417795572463225942L;
/* 10:   */   @ApiField("name")
/* 11:   */   private String name;
/* 12:   */   @ApiField("partner_id")
/* 13:   */   private String partnerId;
/* 14:   */   
/* 15:   */   public String getName()
/* 16:   */   {
/* 17:29 */     return this.name;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setName(String name)
/* 21:   */   {
/* 22:32 */     this.name = name;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getPartnerId()
/* 26:   */   {
/* 27:36 */     return this.partnerId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPartnerId(String partnerId)
/* 31:   */   {
/* 32:39 */     this.partnerId = partnerId;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.Retailer

 * JD-Core Version:    0.7.0.1

 */