/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CplifeRoomDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayEcoCplifeRooominfoQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5532899316225985948L;
/* 13:   */   @ApiListField("room_info")
/* 14:   */   @ApiField("cplife_room_detail")
/* 15:   */   private List<CplifeRoomDetail> roomInfo;
/* 16:   */   
/* 17:   */   public void setRoomInfo(List<CplifeRoomDetail> roomInfo)
/* 18:   */   {
/* 19:28 */     this.roomInfo = roomInfo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<CplifeRoomDetail> getRoomInfo()
/* 23:   */   {
/* 24:31 */     return this.roomInfo;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoCplifeRooominfoQueryResponse
 * JD-Core Version:    0.7.0.1
 */