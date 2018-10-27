/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceMedicalCardQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3189624756547928751L;
/* 10:   */   @ApiField("buyer_id")
/* 11:   */   private String buyerId;
/* 12:   */   @ApiField("card_org_no")
/* 13:   */   private String cardOrgNo;
/* 14:   */   @ApiField("extend_params")
/* 15:   */   private String extendParams;
/* 16:   */   @ApiField("return_url")
/* 17:   */   private String returnUrl;
/* 18:   */   
/* 19:   */   public String getBuyerId()
/* 20:   */   {
/* 21:42 */     return this.buyerId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBuyerId(String buyerId)
/* 25:   */   {
/* 26:45 */     this.buyerId = buyerId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCardOrgNo()
/* 30:   */   {
/* 31:49 */     return this.cardOrgNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCardOrgNo(String cardOrgNo)
/* 35:   */   {
/* 36:52 */     this.cardOrgNo = cardOrgNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getExtendParams()
/* 40:   */   {
/* 41:56 */     return this.extendParams;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setExtendParams(String extendParams)
/* 45:   */   {
/* 46:59 */     this.extendParams = extendParams;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getReturnUrl()
/* 50:   */   {
/* 51:63 */     return this.returnUrl;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setReturnUrl(String returnUrl)
/* 55:   */   {
/* 56:66 */     this.returnUrl = returnUrl;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceMedicalCardQueryModel
 * JD-Core Version:    0.7.0.1
 */