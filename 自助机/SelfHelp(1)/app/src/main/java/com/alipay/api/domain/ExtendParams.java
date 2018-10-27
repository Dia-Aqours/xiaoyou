/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ExtendParams
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3114681664211455897L;
/* 10:   */   @ApiField("hb_fq_num")
/* 11:   */   private String hbFqNum;
/* 12:   */   @ApiField("hb_fq_seller_percent")
/* 13:   */   private String hbFqSellerPercent;
/* 14:   */   @ApiField("sys_service_provider_id")
/* 15:   */   private String sysServiceProviderId;
/* 16:   */   
/* 17:   */   public String getHbFqNum()
/* 18:   */   {
/* 19:36 */     return this.hbFqNum;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setHbFqNum(String hbFqNum)
/* 23:   */   {
/* 24:39 */     this.hbFqNum = hbFqNum;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getHbFqSellerPercent()
/* 28:   */   {
/* 29:43 */     return this.hbFqSellerPercent;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setHbFqSellerPercent(String hbFqSellerPercent)
/* 33:   */   {
/* 34:46 */     this.hbFqSellerPercent = hbFqSellerPercent;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getSysServiceProviderId()
/* 38:   */   {
/* 39:50 */     return this.sysServiceProviderId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSysServiceProviderId(String sysServiceProviderId)
/* 43:   */   {
/* 44:53 */     this.sysServiceProviderId = sysServiceProviderId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ExtendParams
 * JD-Core Version:    0.7.0.1
 */