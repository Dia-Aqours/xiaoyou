/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KbAdvertMissionResponse
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7781822791157964782L;
/* 12:   */   @ApiField("gmt_claimed")
/* 13:   */   private String gmtClaimed;
/* 14:   */   @ApiField("gmt_end")
/* 15:   */   private String gmtEnd;
/* 16:   */   @ApiField("gmt_start")
/* 17:   */   private String gmtStart;
/* 18:   */   @ApiField("mission_id")
/* 19:   */   private String missionId;
/* 20:   */   @ApiField("promote_status")
/* 21:   */   private String promoteStatus;
/* 22:   */   @ApiListField("subjects")
/* 23:   */   @ApiField("kb_advert_subject_response")
/* 24:   */   private List<KbAdvertSubjectResponse> subjects;
/* 25:   */   
/* 26:   */   public String getGmtClaimed()
/* 27:   */   {
/* 28:59 */     return this.gmtClaimed;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setGmtClaimed(String gmtClaimed)
/* 32:   */   {
/* 33:62 */     this.gmtClaimed = gmtClaimed;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getGmtEnd()
/* 37:   */   {
/* 38:66 */     return this.gmtEnd;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setGmtEnd(String gmtEnd)
/* 42:   */   {
/* 43:69 */     this.gmtEnd = gmtEnd;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getGmtStart()
/* 47:   */   {
/* 48:73 */     return this.gmtStart;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setGmtStart(String gmtStart)
/* 52:   */   {
/* 53:76 */     this.gmtStart = gmtStart;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getMissionId()
/* 57:   */   {
/* 58:80 */     return this.missionId;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setMissionId(String missionId)
/* 62:   */   {
/* 63:83 */     this.missionId = missionId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getPromoteStatus()
/* 67:   */   {
/* 68:87 */     return this.promoteStatus;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void setPromoteStatus(String promoteStatus)
/* 72:   */   {
/* 73:90 */     this.promoteStatus = promoteStatus;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public List<KbAdvertSubjectResponse> getSubjects()
/* 77:   */   {
/* 78:94 */     return this.subjects;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void setSubjects(List<KbAdvertSubjectResponse> subjects)
/* 82:   */   {
/* 83:97 */     this.subjects = subjects;
/* 84:   */   }
/* 85:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertMissionResponse
 * JD-Core Version:    0.7.0.1
 */