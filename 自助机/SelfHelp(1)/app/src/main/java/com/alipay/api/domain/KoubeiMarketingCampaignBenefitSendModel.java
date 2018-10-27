/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignBenefitSendModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7478877622312679833L;
/* 10:   */   @ApiField("channel")
/* 11:   */   private String channel;
/* 12:   */   @ApiField("discount_type")
/* 13:   */   private String discountType;
/* 14:   */   @ApiField("item_id")
/* 15:   */   private String itemId;
/* 16:   */   @ApiField("out_biz_no")
/* 17:   */   private String outBizNo;
/* 18:   */   @ApiField("shop_id")
/* 19:   */   private String shopId;
/* 20:   */   @ApiField("user_id")
/* 21:   */   private String userId;
/* 22:   */   
/* 23:   */   public String getChannel()
/* 24:   */   {
/* 25:53 */     return this.channel;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setChannel(String channel)
/* 29:   */   {
/* 30:56 */     this.channel = channel;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getDiscountType()
/* 34:   */   {
/* 35:60 */     return this.discountType;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setDiscountType(String discountType)
/* 39:   */   {
/* 40:63 */     this.discountType = discountType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getItemId()
/* 44:   */   {
/* 45:67 */     return this.itemId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setItemId(String itemId)
/* 49:   */   {
/* 50:70 */     this.itemId = itemId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOutBizNo()
/* 54:   */   {
/* 55:74 */     return this.outBizNo;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOutBizNo(String outBizNo)
/* 59:   */   {
/* 60:77 */     this.outBizNo = outBizNo;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getShopId()
/* 64:   */   {
/* 65:81 */     return this.shopId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setShopId(String shopId)
/* 69:   */   {
/* 70:84 */     this.shopId = shopId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUserId()
/* 74:   */   {
/* 75:88 */     return this.userId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUserId(String userId)
/* 79:   */   {
/* 80:91 */     this.userId = userId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignBenefitSendModel
 * JD-Core Version:    0.7.0.1
 */