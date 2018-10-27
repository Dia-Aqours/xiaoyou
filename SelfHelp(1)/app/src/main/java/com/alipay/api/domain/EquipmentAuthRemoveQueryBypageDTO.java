/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class EquipmentAuthRemoveQueryBypageDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7192785549323388184L;
/* 10:   */   @ApiField("device_id")
/* 11:   */   private String deviceId;
/* 12:   */   @ApiField("unbind_time")
/* 13:   */   private String unbindTime;
/* 14:   */   
/* 15:   */   public String getDeviceId()
/* 16:   */   {
/* 17:29 */     return this.deviceId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setDeviceId(String deviceId)
/* 21:   */   {
/* 22:32 */     this.deviceId = deviceId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUnbindTime()
/* 26:   */   {
/* 27:36 */     return this.unbindTime;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUnbindTime(String unbindTime)
/* 31:   */   {
/* 32:39 */     this.unbindTime = unbindTime;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.EquipmentAuthRemoveQueryBypageDTO
 * JD-Core Version:    0.7.0.1
 */