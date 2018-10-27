/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class CplifeRoomDetail
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2233868689252312819L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("building")
/*  13:    */   private String building;
/*  14:    */   @ApiField("group")
/*  15:    */   private String group;
/*  16:    */   @ApiField("out_room_id")
/*  17:    */   private String outRoomId;
/*  18:    */   @ApiField("room")
/*  19:    */   private String room;
/*  20:    */   @ApiField("room_id")
/*  21:    */   private String roomId;
/*  22:    */   @ApiField("unit")
/*  23:    */   private String unit;
/*  24:    */   
/*  25:    */   public String getAddress()
/*  26:    */   {
/*  27: 59 */     return this.address;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAddress(String address)
/*  31:    */   {
/*  32: 62 */     this.address = address;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getBuilding()
/*  36:    */   {
/*  37: 66 */     return this.building;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setBuilding(String building)
/*  41:    */   {
/*  42: 69 */     this.building = building;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getGroup()
/*  46:    */   {
/*  47: 73 */     return this.group;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setGroup(String group)
/*  51:    */   {
/*  52: 76 */     this.group = group;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOutRoomId()
/*  56:    */   {
/*  57: 80 */     return this.outRoomId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOutRoomId(String outRoomId)
/*  61:    */   {
/*  62: 83 */     this.outRoomId = outRoomId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getRoom()
/*  66:    */   {
/*  67: 87 */     return this.room;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setRoom(String room)
/*  71:    */   {
/*  72: 90 */     this.room = room;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getRoomId()
/*  76:    */   {
/*  77: 94 */     return this.roomId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setRoomId(String roomId)
/*  81:    */   {
/*  82: 97 */     this.roomId = roomId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getUnit()
/*  86:    */   {
/*  87:101 */     return this.unit;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setUnit(String unit)
/*  91:    */   {
/*  92:104 */     this.unit = unit;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CplifeRoomDetail
 * JD-Core Version:    0.7.0.1
 */