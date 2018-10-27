/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityRiskHideDeviceidQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5288432644595759367L;
/* 10:   */   @ApiField("app_key_client")
/* 11:   */   private String appKeyClient;
/* 12:   */   @ApiField("app_key_server")
/* 13:   */   private String appKeyServer;
/* 14:   */   @ApiField("app_name")
/* 15:   */   private String appName;
/* 16:   */   @ApiField("deviceid_token")
/* 17:   */   private String deviceidToken;
/* 18:   */   
/* 19:   */   public String getAppKeyClient()
/* 20:   */   {
/* 21:41 */     return this.appKeyClient;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAppKeyClient(String appKeyClient)
/* 25:   */   {
/* 26:44 */     this.appKeyClient = appKeyClient;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getAppKeyServer()
/* 30:   */   {
/* 31:48 */     return this.appKeyServer;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setAppKeyServer(String appKeyServer)
/* 35:   */   {
/* 36:51 */     this.appKeyServer = appKeyServer;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getAppName()
/* 40:   */   {
/* 41:55 */     return this.appName;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setAppName(String appName)
/* 45:   */   {
/* 46:58 */     this.appName = appName;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getDeviceidToken()
/* 50:   */   {
/* 51:62 */     return this.deviceidToken;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setDeviceidToken(String deviceidToken)
/* 55:   */   {
/* 56:65 */     this.deviceidToken = deviceidToken;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskHideDeviceidQueryModel
 * JD-Core Version:    0.7.0.1
 */