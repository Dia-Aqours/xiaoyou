/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CplifeRoomInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2565268756664441184L;
/* 10:   */   @ApiField("address")
/* 11:   */   private String address;
/* 12:   */   @ApiField("building")
/* 13:   */   private String building;
/* 14:   */   @ApiField("group")
/* 15:   */   private String group;
/* 16:   */   @ApiField("out_room_id")
/* 17:   */   private String outRoomId;
/* 18:   */   @ApiField("room")
/* 19:   */   private String room;
/* 20:   */   @ApiField("unit")
/* 21:   */   private String unit;
/* 22:   */   
/* 23:   */   public String getAddress()
/* 24:   */   {
/* 25:53 */     return this.address;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAddress(String address)
/* 29:   */   {
/* 30:56 */     this.address = address;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getBuilding()
/* 34:   */   {
/* 35:60 */     return this.building;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setBuilding(String building)
/* 39:   */   {
/* 40:63 */     this.building = building;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getGroup()
/* 44:   */   {
/* 45:67 */     return this.group;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setGroup(String group)
/* 49:   */   {
/* 50:70 */     this.group = group;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOutRoomId()
/* 54:   */   {
/* 55:74 */     return this.outRoomId;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOutRoomId(String outRoomId)
/* 59:   */   {
/* 60:77 */     this.outRoomId = outRoomId;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getRoom()
/* 64:   */   {
/* 65:81 */     return this.room;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setRoom(String room)
/* 69:   */   {
/* 70:84 */     this.room = room;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUnit()
/* 74:   */   {
/* 75:88 */     return this.unit;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUnit(String unit)
/* 79:   */   {
/* 80:91 */     this.unit = unit;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CplifeRoomInfo
 * JD-Core Version:    0.7.0.1
 */