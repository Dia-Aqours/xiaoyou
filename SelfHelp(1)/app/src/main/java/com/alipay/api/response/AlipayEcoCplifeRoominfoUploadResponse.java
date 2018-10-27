/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CplifeRoomInfoResp;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayEcoCplifeRoominfoUploadResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3789973183146826161L;
/* 13:   */   @ApiField("community_id")
/* 14:   */   private String communityId;
/* 15:   */   @ApiListField("room_info_set")
/* 16:   */   @ApiField("cplife_room_info_resp")
/* 17:   */   private List<CplifeRoomInfoResp> roomInfoSet;
/* 18:   */   
/* 19:   */   public void setCommunityId(String communityId)
/* 20:   */   {
/* 21:34 */     this.communityId = communityId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getCommunityId()
/* 25:   */   {
/* 26:37 */     return this.communityId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setRoomInfoSet(List<CplifeRoomInfoResp> roomInfoSet)
/* 30:   */   {
/* 31:41 */     this.roomInfoSet = roomInfoSet;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public List<CplifeRoomInfoResp> getRoomInfoSet()
/* 35:   */   {
/* 36:44 */     return this.roomInfoSet;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoCplifeRoominfoUploadResponse
 * JD-Core Version:    0.7.0.1
 */