/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingToolPrizesendAuthModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4685394621484356112L;
/* 10:   */   @ApiField("prize_id")
/* 11:   */   private String prizeId;
/* 12:   */   @ApiField("req_id")
/* 13:   */   private String reqId;
/* 14:   */   @ApiField("user_id")
/* 15:   */   private String userId;
/* 16:   */   
/* 17:   */   public String getPrizeId()
/* 18:   */   {
/* 19:35 */     return this.prizeId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setPrizeId(String prizeId)
/* 23:   */   {
/* 24:38 */     this.prizeId = prizeId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getReqId()
/* 28:   */   {
/* 29:42 */     return this.reqId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setReqId(String reqId)
/* 33:   */   {
/* 34:45 */     this.reqId = reqId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUserId()
/* 38:   */   {
/* 39:49 */     return this.userId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUserId(String userId)
/* 43:   */   {
/* 44:52 */     this.userId = userId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingToolPrizesendAuthModel
 * JD-Core Version:    0.7.0.1
 */