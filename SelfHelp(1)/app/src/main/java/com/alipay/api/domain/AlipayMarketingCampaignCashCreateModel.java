/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMarketingCampaignCashCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7795159515365853729L;
/*  10:    */   @ApiField("coupon_name")
/*  11:    */   private String couponName;
/*  12:    */   @ApiField("end_time")
/*  13:    */   private String endTime;
/*  14:    */   @ApiField("merchant_link")
/*  15:    */   private String merchantLink;
/*  16:    */   @ApiField("prize_msg")
/*  17:    */   private String prizeMsg;
/*  18:    */   @ApiField("prize_type")
/*  19:    */   private String prizeType;
/*  20:    */   @ApiField("start_time")
/*  21:    */   private String startTime;
/*  22:    */   @ApiField("total_money")
/*  23:    */   private String totalMoney;
/*  24:    */   @ApiField("total_num")
/*  25:    */   private String totalNum;
/*  26:    */   
/*  27:    */   public String getCouponName()
/*  28:    */   {
/*  29: 69 */     return this.couponName;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setCouponName(String couponName)
/*  33:    */   {
/*  34: 72 */     this.couponName = couponName;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getEndTime()
/*  38:    */   {
/*  39: 76 */     return this.endTime;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setEndTime(String endTime)
/*  43:    */   {
/*  44: 79 */     this.endTime = endTime;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getMerchantLink()
/*  48:    */   {
/*  49: 83 */     return this.merchantLink;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setMerchantLink(String merchantLink)
/*  53:    */   {
/*  54: 86 */     this.merchantLink = merchantLink;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getPrizeMsg()
/*  58:    */   {
/*  59: 90 */     return this.prizeMsg;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setPrizeMsg(String prizeMsg)
/*  63:    */   {
/*  64: 93 */     this.prizeMsg = prizeMsg;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getPrizeType()
/*  68:    */   {
/*  69: 97 */     return this.prizeType;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setPrizeType(String prizeType)
/*  73:    */   {
/*  74:100 */     this.prizeType = prizeType;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getStartTime()
/*  78:    */   {
/*  79:104 */     return this.startTime;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setStartTime(String startTime)
/*  83:    */   {
/*  84:107 */     this.startTime = startTime;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTotalMoney()
/*  88:    */   {
/*  89:111 */     return this.totalMoney;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTotalMoney(String totalMoney)
/*  93:    */   {
/*  94:114 */     this.totalMoney = totalMoney;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTotalNum()
/*  98:    */   {
/*  99:118 */     return this.totalNum;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setTotalNum(String totalNum)
/* 103:    */   {
/* 104:121 */     this.totalNum = totalNum;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignCashCreateModel
 * JD-Core Version:    0.7.0.1
 */