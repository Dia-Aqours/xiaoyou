/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOpenPublicTemplateMessageIndustryModifyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8362579518658359774L;
/*  10:    */   @ApiField("primary_industry_code")
/*  11:    */   private String primaryIndustryCode;
/*  12:    */   @ApiField("primary_industry_name")
/*  13:    */   private String primaryIndustryName;
/*  14:    */   @ApiField("secondary_industry_code")
/*  15:    */   private String secondaryIndustryCode;
/*  16:    */   @ApiField("secondary_industry_name")
/*  17:    */   private String secondaryIndustryName;
/*  18:    */   
/*  19:    */   public String getPrimaryIndustryCode()
/*  20:    */   {
/*  21: 83 */     return this.primaryIndustryCode;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void setPrimaryIndustryCode(String primaryIndustryCode)
/*  25:    */   {
/*  26: 86 */     this.primaryIndustryCode = primaryIndustryCode;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getPrimaryIndustryName()
/*  30:    */   {
/*  31: 90 */     return this.primaryIndustryName;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setPrimaryIndustryName(String primaryIndustryName)
/*  35:    */   {
/*  36: 93 */     this.primaryIndustryName = primaryIndustryName;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getSecondaryIndustryCode()
/*  40:    */   {
/*  41: 97 */     return this.secondaryIndustryCode;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setSecondaryIndustryCode(String secondaryIndustryCode)
/*  45:    */   {
/*  46:100 */     this.secondaryIndustryCode = secondaryIndustryCode;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getSecondaryIndustryName()
/*  50:    */   {
/*  51:104 */     return this.secondaryIndustryName;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setSecondaryIndustryName(String secondaryIndustryName)
/*  55:    */   {
/*  56:107 */     this.secondaryIndustryName = secondaryIndustryName;
/*  57:    */   }
/*  58:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicTemplateMessageIndustryModifyModel
 * JD-Core Version:    0.7.0.1
 */