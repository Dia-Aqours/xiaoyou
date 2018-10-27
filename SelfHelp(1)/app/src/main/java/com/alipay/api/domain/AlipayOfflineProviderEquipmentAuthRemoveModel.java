/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineProviderEquipmentAuthRemoveModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4352556485135815812L;
/* 10:   */   @ApiField("device_id")
/* 11:   */   private String deviceId;
/* 12:   */   @ApiField("device_type")
/* 13:   */   private String deviceType;
/* 14:   */   @ApiField("ext_info")
/* 15:   */   private String extInfo;
/* 16:   */   @ApiField("merchant_pid")
/* 17:   */   private String merchantPid;
/* 18:   */   @ApiField("operator")
/* 19:   */   private String operator;
/* 20:   */   @ApiField("operator_id")
/* 21:   */   private String operatorId;
/* 22:   */   
/* 23:   */   public String getDeviceId()
/* 24:   */   {
/* 25:53 */     return this.deviceId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setDeviceId(String deviceId)
/* 29:   */   {
/* 30:56 */     this.deviceId = deviceId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getDeviceType()
/* 34:   */   {
/* 35:60 */     return this.deviceType;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setDeviceType(String deviceType)
/* 39:   */   {
/* 40:63 */     this.deviceType = deviceType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getExtInfo()
/* 44:   */   {
/* 45:67 */     return this.extInfo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setExtInfo(String extInfo)
/* 49:   */   {
/* 50:70 */     this.extInfo = extInfo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getMerchantPid()
/* 54:   */   {
/* 55:74 */     return this.merchantPid;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setMerchantPid(String merchantPid)
/* 59:   */   {
/* 60:77 */     this.merchantPid = merchantPid;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getOperator()
/* 64:   */   {
/* 65:81 */     return this.operator;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setOperator(String operator)
/* 69:   */   {
/* 70:84 */     this.operator = operator;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getOperatorId()
/* 74:   */   {
/* 75:88 */     return this.operatorId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setOperatorId(String operatorId)
/* 79:   */   {
/* 80:91 */     this.operatorId = operatorId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderEquipmentAuthRemoveModel
 * JD-Core Version:    0.7.0.1
 */