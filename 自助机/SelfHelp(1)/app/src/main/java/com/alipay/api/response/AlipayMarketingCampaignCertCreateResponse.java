/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignCertCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2264837579557462421L;
/* 10:   */   @ApiField("lot_number")
/* 11:   */   private String lotNumber;
/* 12:   */   
/* 13:   */   public void setLotNumber(String lotNumber)
/* 14:   */   {
/* 15:24 */     this.lotNumber = lotNumber;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getLotNumber()
/* 19:   */   {
/* 20:27 */     return this.lotNumber;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignCertCreateResponse
 * JD-Core Version:    0.7.0.1
 */