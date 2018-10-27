/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingCardbarcodeCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1647596179366677628L;
/* 10:   */   @ApiField("equipment_id")
/* 11:   */   private String equipmentId;
/* 12:   */   @ApiField("parking_id")
/* 13:   */   private String parkingId;
/* 14:   */   
/* 15:   */   public String getEquipmentId()
/* 16:   */   {
/* 17:29 */     return this.equipmentId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setEquipmentId(String equipmentId)
/* 21:   */   {
/* 22:32 */     this.equipmentId = equipmentId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getParkingId()
/* 26:   */   {
/* 27:36 */     return this.parkingId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setParkingId(String parkingId)
/* 31:   */   {
/* 32:39 */     this.parkingId = parkingId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingCardbarcodeCreateModel
 * JD-Core Version:    0.7.0.1
 */