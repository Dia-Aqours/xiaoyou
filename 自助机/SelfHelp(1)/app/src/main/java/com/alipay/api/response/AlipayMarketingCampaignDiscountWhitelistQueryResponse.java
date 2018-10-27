/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCampaignDiscountWhitelistQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6444319258516313723L;
/* 10:   */   @ApiField("camp_id")
/* 11:   */   private String campId;
/* 12:   */   @ApiField("user_white_list")
/* 13:   */   private String userWhiteList;
/* 14:   */   
/* 15:   */   public void setCampId(String campId)
/* 16:   */   {
/* 17:30 */     this.campId = campId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCampId()
/* 21:   */   {
/* 22:33 */     return this.campId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setUserWhiteList(String userWhiteList)
/* 26:   */   {
/* 27:37 */     this.userWhiteList = userWhiteList;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getUserWhiteList()
/* 31:   */   {
/* 32:40 */     return this.userWhiteList;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDiscountWhitelistQueryResponse

 * JD-Core Version:    0.7.0.1

 */