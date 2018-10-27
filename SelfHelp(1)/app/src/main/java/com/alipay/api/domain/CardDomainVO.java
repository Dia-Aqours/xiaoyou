/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class CardDomainVO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8689887724563478795L;
/* 10:   */   @ApiField("description")
/* 11:   */   private String description;
/* 12:   */   @ApiField("domain_name")
/* 13:   */   private String domainName;
/* 14:   */   
/* 15:   */   public String getDescription()
/* 16:   */   {
/* 17:29 */     return this.description;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setDescription(String description)
/* 21:   */   {
/* 22:32 */     this.description = description;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getDomainName()
/* 26:   */   {
/* 27:36 */     return this.domainName;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setDomainName(String domainName)
/* 31:   */   {
/* 32:39 */     this.domainName = domainName;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CardDomainVO

 * JD-Core Version:    0.7.0.1

 */