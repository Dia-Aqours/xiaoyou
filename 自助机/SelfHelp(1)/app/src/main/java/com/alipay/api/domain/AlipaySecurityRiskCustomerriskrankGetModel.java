/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityRiskCustomerriskrankGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2126827543943163949L;
/* 10:   */   @ApiField("card_no")
/* 11:   */   private String cardNo;
/* 12:   */   @ApiField("card_type")
/* 13:   */   private String cardType;
/* 14:   */   @ApiField("mobile")
/* 15:   */   private String mobile;
/* 16:   */   @ApiField("scene_id")
/* 17:   */   private String sceneId;
/* 18:   */   @ApiField("user_id")
/* 19:   */   private String userId;
/* 20:   */   
/* 21:   */   public String getCardNo()
/* 22:   */   {
/* 23:47 */     return this.cardNo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setCardNo(String cardNo)
/* 27:   */   {
/* 28:50 */     this.cardNo = cardNo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCardType()
/* 32:   */   {
/* 33:54 */     return this.cardType;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCardType(String cardType)
/* 37:   */   {
/* 38:57 */     this.cardType = cardType;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getMobile()
/* 42:   */   {
/* 43:61 */     return this.mobile;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setMobile(String mobile)
/* 47:   */   {
/* 48:64 */     this.mobile = mobile;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getSceneId()
/* 52:   */   {
/* 53:68 */     return this.sceneId;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setSceneId(String sceneId)
/* 57:   */   {
/* 58:71 */     this.sceneId = sceneId;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getUserId()
/* 62:   */   {
/* 63:75 */     return this.userId;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setUserId(String userId)
/* 67:   */   {
/* 68:78 */     this.userId = userId;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySecurityRiskCustomerriskrankGetModel
 * JD-Core Version:    0.7.0.1
 */