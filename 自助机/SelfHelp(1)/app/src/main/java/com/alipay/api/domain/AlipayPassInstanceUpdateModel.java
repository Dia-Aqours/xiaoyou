/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPassInstanceUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3394821558458686165L;
/* 10:   */   @ApiField("channel_id")
/* 11:   */   private String channelId;
/* 12:   */   @ApiField("serial_number")
/* 13:   */   private String serialNumber;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   @ApiField("tpl_params")
/* 17:   */   private String tplParams;
/* 18:   */   @ApiField("verify_code")
/* 19:   */   private String verifyCode;
/* 20:   */   @ApiField("verify_type")
/* 21:   */   private String verifyType;
/* 22:   */   
/* 23:   */   public String getChannelId()
/* 24:   */   {
/* 25:53 */     return this.channelId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setChannelId(String channelId)
/* 29:   */   {
/* 30:56 */     this.channelId = channelId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getSerialNumber()
/* 34:   */   {
/* 35:60 */     return this.serialNumber;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setSerialNumber(String serialNumber)
/* 39:   */   {
/* 40:63 */     this.serialNumber = serialNumber;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getStatus()
/* 44:   */   {
/* 45:67 */     return this.status;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setStatus(String status)
/* 49:   */   {
/* 50:70 */     this.status = status;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getTplParams()
/* 54:   */   {
/* 55:74 */     return this.tplParams;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setTplParams(String tplParams)
/* 59:   */   {
/* 60:77 */     this.tplParams = tplParams;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getVerifyCode()
/* 64:   */   {
/* 65:81 */     return this.verifyCode;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setVerifyCode(String verifyCode)
/* 69:   */   {
/* 70:84 */     this.verifyCode = verifyCode;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getVerifyType()
/* 74:   */   {
/* 75:88 */     return this.verifyType;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setVerifyType(String verifyType)
/* 79:   */   {
/* 80:91 */     this.verifyType = verifyType;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayPassInstanceUpdateModel
 * JD-Core Version:    0.7.0.1
 */