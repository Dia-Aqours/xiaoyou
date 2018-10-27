/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCdpAdvertiseOperateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8353475664943739742L;
/* 10:   */   @ApiField("ad_id")
/* 11:   */   private String adId;
/* 12:   */   @ApiField("operate_type")
/* 13:   */   private String operateType;
/* 14:   */   
/* 15:   */   public String getAdId()
/* 16:   */   {
/* 17:29 */     return this.adId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAdId(String adId)
/* 21:   */   {
/* 22:32 */     this.adId = adId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getOperateType()
/* 26:   */   {
/* 27:36 */     return this.operateType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setOperateType(String operateType)
/* 31:   */   {
/* 32:39 */     this.operateType = operateType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCdpAdvertiseOperateModel
 * JD-Core Version:    0.7.0.1
 */