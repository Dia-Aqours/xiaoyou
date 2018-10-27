/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineProviderEquipmentAuthRemoveResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2523123219614196581L;
/* 10:   */   @ApiField("device_id")
/* 11:   */   private String deviceId;
/* 12:   */   @ApiField("merchant_pid")
/* 13:   */   private String merchantPid;
/* 14:   */   
/* 15:   */   public void setDeviceId(String deviceId)
/* 16:   */   {
/* 17:30 */     this.deviceId = deviceId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getDeviceId()
/* 21:   */   {
/* 22:33 */     return this.deviceId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setMerchantPid(String merchantPid)
/* 26:   */   {
/* 27:37 */     this.merchantPid = merchantPid;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getMerchantPid()
/* 31:   */   {
/* 32:40 */     return this.merchantPid;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineProviderEquipmentAuthRemoveResponse
 * JD-Core Version:    0.7.0.1
 */