/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundTransThirdpartyRewardQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5868671175558312686L;
/* 10:   */   @ApiField("scene")
/* 11:   */   private String scene;
/* 12:   */   @ApiField("sender_user_id")
/* 13:   */   private String senderUserId;
/* 14:   */   @ApiField("transfer_no")
/* 15:   */   private String transferNo;
/* 16:   */   
/* 17:   */   public String getScene()
/* 18:   */   {
/* 19:35 */     return this.scene;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setScene(String scene)
/* 23:   */   {
/* 24:38 */     this.scene = scene;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getSenderUserId()
/* 28:   */   {
/* 29:42 */     return this.senderUserId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setSenderUserId(String senderUserId)
/* 33:   */   {
/* 34:45 */     this.senderUserId = senderUserId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTransferNo()
/* 38:   */   {
/* 39:49 */     return this.transferNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTransferNo(String transferNo)
/* 43:   */   {
/* 44:52 */     this.transferNo = transferNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransThirdpartyRewardQueryModel
 * JD-Core Version:    0.7.0.1
 */