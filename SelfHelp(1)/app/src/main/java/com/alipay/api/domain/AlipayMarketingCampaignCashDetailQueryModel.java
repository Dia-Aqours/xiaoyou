/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCampaignCashDetailQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5438469656776913867L;
/* 10:   */   @ApiField("crowd_no")
/* 11:   */   private String crowdNo;
/* 12:   */   
/* 13:   */   public String getCrowdNo()
/* 14:   */   {
/* 15:23 */     return this.crowdNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCrowdNo(String crowdNo)
/* 19:   */   {
/* 20:26 */     this.crowdNo = crowdNo;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignCashDetailQueryModel

 * JD-Core Version:    0.7.0.1

 */