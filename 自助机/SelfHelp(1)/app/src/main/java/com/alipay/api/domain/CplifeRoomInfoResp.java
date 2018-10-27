/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CplifeRoomInfoResp
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6632595488664287819L;
/* 10:   */   @ApiField("out_room_id")
/* 11:   */   private String outRoomId;
/* 12:   */   @ApiField("room_id")
/* 13:   */   private String roomId;
/* 14:   */   
/* 15:   */   public String getOutRoomId()
/* 16:   */   {
/* 17:29 */     return this.outRoomId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOutRoomId(String outRoomId)
/* 21:   */   {
/* 22:32 */     this.outRoomId = outRoomId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRoomId()
/* 26:   */   {
/* 27:36 */     return this.roomId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRoomId(String roomId)
/* 31:   */   {
/* 32:39 */     this.roomId = roomId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CplifeRoomInfoResp
 * JD-Core Version:    0.7.0.1
 */