/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMarketingCampaignRecruitShopQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4354693384471889793L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("invitee")
/* 13:   */   private String invitee;
/* 14:   */   @ApiField("operator_id")
/* 15:   */   private String operatorId;
/* 16:   */   @ApiField("operator_type")
/* 17:   */   private String operatorType;
/* 18:   */   @ApiField("page_num")
/* 19:   */   private String pageNum;
/* 20:   */   @ApiField("page_size")
/* 21:   */   private String pageSize;
/* 22:   */   
/* 23:   */   public String getCampId()
/* 24:   */   {
/* 25:53 */     return this.campId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCampId(String campId)
/* 29:   */   {
/* 30:56 */     this.campId = campId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getInvitee()
/* 34:   */   {
/* 35:60 */     return this.invitee;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setInvitee(String invitee)
/* 39:   */   {
/* 40:63 */     this.invitee = invitee;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getOperatorId()
/* 44:   */   {
/* 45:67 */     return this.operatorId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setOperatorId(String operatorId)
/* 49:   */   {
/* 50:70 */     this.operatorId = operatorId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOperatorType()
/* 54:   */   {
/* 55:74 */     return this.operatorType;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOperatorType(String operatorType)
/* 59:   */   {
/* 60:77 */     this.operatorType = operatorType;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getPageNum()
/* 64:   */   {
/* 65:81 */     return this.pageNum;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setPageNum(String pageNum)
/* 69:   */   {
/* 70:84 */     this.pageNum = pageNum;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getPageSize()
/* 74:   */   {
/* 75:88 */     return this.pageSize;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setPageSize(String pageSize)
/* 79:   */   {
/* 80:91 */     this.pageSize = pageSize;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignRecruitShopQueryModel

 * JD-Core Version:    0.7.0.1

 */