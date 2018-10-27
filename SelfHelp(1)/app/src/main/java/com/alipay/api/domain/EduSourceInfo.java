/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class EduSourceInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1145774644752247257L;
/* 10:   */   @ApiField("logo")
/* 11:   */   private String logo;
/* 12:   */   @ApiField("mobile")
/* 13:   */   private String mobile;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   
/* 17:   */   public String getLogo()
/* 18:   */   {
/* 19:35 */     return this.logo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setLogo(String logo)
/* 23:   */   {
/* 24:38 */     this.logo = logo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getMobile()
/* 28:   */   {
/* 29:42 */     return this.mobile;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setMobile(String mobile)
/* 33:   */   {
/* 34:45 */     this.mobile = mobile;
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

 * Qualified Name:     com.alipay.api.domain.EduSourceInfo

 * JD-Core Version:    0.7.0.1

 */