/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCampaignActivityOfflineCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1636336787712824766L;
/* 10:   */   @ApiField("budget")
/* 11:   */   private OpenPromoBudget budget;
/* 12:   */   @ApiField("camp")
/* 13:   */   private OpenPromoCamp camp;
/* 14:   */   @ApiField("out_biz_no")
/* 15:   */   private String outBizNo;
/* 16:   */   @ApiField("prize")
/* 17:   */   private OpenPromoPrize prize;
/* 18:   */   
/* 19:   */   public OpenPromoBudget getBudget()
/* 20:   */   {
/* 21:41 */     return this.budget;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBudget(OpenPromoBudget budget)
/* 25:   */   {
/* 26:44 */     this.budget = budget;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public OpenPromoCamp getCamp()
/* 30:   */   {
/* 31:48 */     return this.camp;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCamp(OpenPromoCamp camp)
/* 35:   */   {
/* 36:51 */     this.camp = camp;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getOutBizNo()
/* 40:   */   {
/* 41:55 */     return this.outBizNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setOutBizNo(String outBizNo)
/* 45:   */   {
/* 46:58 */     this.outBizNo = outBizNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public OpenPromoPrize getPrize()
/* 50:   */   {
/* 51:62 */     return this.prize;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setPrize(OpenPromoPrize prize)
/* 55:   */   {
/* 56:65 */     this.prize = prize;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignActivityOfflineCreateModel

 * JD-Core Version:    0.7.0.1

 */