/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityProdFacerepoAddModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5595191271737315616L;
/* 10:   */   @ApiField("biz_id")
/* 11:   */   private String bizId;
/* 12:   */   @ApiField("face_str")
/* 13:   */   private String faceStr;
/* 14:   */   @ApiField("group_id")
/* 15:   */   private String groupId;
/* 16:   */   
/* 17:   */   public String getBizId()
/* 18:   */   {
/* 19:35 */     return this.bizId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBizId(String bizId)
/* 23:   */   {
/* 24:38 */     this.bizId = bizId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getFaceStr()
/* 28:   */   {
/* 29:42 */     return this.faceStr;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFaceStr(String faceStr)
/* 33:   */   {
/* 34:45 */     this.faceStr = faceStr;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getGroupId()
/* 38:   */   {
/* 39:49 */     return this.groupId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setGroupId(String groupId)
/* 43:   */   {
/* 44:52 */     this.groupId = groupId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityProdFacerepoAddModel
 * JD-Core Version:    0.7.0.1
 */