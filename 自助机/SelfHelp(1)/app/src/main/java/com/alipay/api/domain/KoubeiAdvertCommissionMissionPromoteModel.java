/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiAdvertCommissionMissionPromoteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5154552444653141216L;
/* 10:   */   @ApiField("identify")
/* 11:   */   private String identify;
/* 12:   */   @ApiField("identify_type")
/* 13:   */   private String identifyType;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   
/* 17:   */   public String getIdentify()
/* 18:   */   {
/* 19:39 */     return this.identify;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setIdentify(String identify)
/* 23:   */   {
/* 24:42 */     this.identify = identify;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getIdentifyType()
/* 28:   */   {
/* 29:46 */     return this.identifyType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setIdentifyType(String identifyType)
/* 33:   */   {
/* 34:49 */     this.identifyType = identifyType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getName()
/* 38:   */   {
/* 39:53 */     return this.name;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setName(String name)
/* 43:   */   {
/* 44:56 */     this.name = name;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiAdvertCommissionMissionPromoteModel
 * JD-Core Version:    0.7.0.1
 */