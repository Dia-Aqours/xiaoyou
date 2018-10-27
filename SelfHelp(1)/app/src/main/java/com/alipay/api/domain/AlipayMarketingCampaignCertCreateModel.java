/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignCertCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5552226216147858126L;
/* 10:   */   @ApiField("cert_name")
/* 11:   */   private String certName;
/* 12:   */   @ApiField("extend_info")
/* 13:   */   private String extendInfo;
/* 14:   */   @ApiField("memo")
/* 15:   */   private String memo;
/* 16:   */   @ApiField("valid_count")
/* 17:   */   private String validCount;
/* 18:   */   
/* 19:   */   public String getCertName()
/* 20:   */   {
/* 21:41 */     return this.certName;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCertName(String certName)
/* 25:   */   {
/* 26:44 */     this.certName = certName;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getExtendInfo()
/* 30:   */   {
/* 31:48 */     return this.extendInfo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setExtendInfo(String extendInfo)
/* 35:   */   {
/* 36:51 */     this.extendInfo = extendInfo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getMemo()
/* 40:   */   {
/* 41:55 */     return this.memo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setMemo(String memo)
/* 45:   */   {
/* 46:58 */     this.memo = memo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getValidCount()
/* 50:   */   {
/* 51:62 */     return this.validCount;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setValidCount(String validCount)
/* 55:   */   {
/* 56:65 */     this.validCount = validCount;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignCertCreateModel
 * JD-Core Version:    0.7.0.1
 */