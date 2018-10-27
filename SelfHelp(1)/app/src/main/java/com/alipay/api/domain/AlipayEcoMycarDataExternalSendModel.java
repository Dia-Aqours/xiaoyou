/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarDataExternalSendModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4334765239475665355L;
/* 10:   */   @ApiField("external_system_name")
/* 11:   */   private String externalSystemName;
/* 12:   */   @ApiField("is_transfer_uid")
/* 13:   */   private String isTransferUid;
/* 14:   */   @ApiField("operate_type")
/* 15:   */   private String operateType;
/* 16:   */   @ApiField("send_data")
/* 17:   */   private String sendData;
/* 18:   */   
/* 19:   */   public String getExternalSystemName()
/* 20:   */   {
/* 21:41 */     return this.externalSystemName;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setExternalSystemName(String externalSystemName)
/* 25:   */   {
/* 26:44 */     this.externalSystemName = externalSystemName;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getIsTransferUid()
/* 30:   */   {
/* 31:48 */     return this.isTransferUid;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setIsTransferUid(String isTransferUid)
/* 35:   */   {
/* 36:51 */     this.isTransferUid = isTransferUid;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getOperateType()
/* 40:   */   {
/* 41:55 */     return this.operateType;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setOperateType(String operateType)
/* 45:   */   {
/* 46:58 */     this.operateType = operateType;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getSendData()
/* 50:   */   {
/* 51:62 */     return this.sendData;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setSendData(String sendData)
/* 55:   */   {
/* 56:65 */     this.sendData = sendData;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarDataExternalSendModel
 * JD-Core Version:    0.7.0.1
 */