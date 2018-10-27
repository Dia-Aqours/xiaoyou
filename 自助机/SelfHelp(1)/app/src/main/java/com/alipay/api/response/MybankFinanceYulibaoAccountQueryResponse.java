/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.YLBProfitDetailInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class MybankFinanceYulibaoAccountQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7222219993577132735L;
/* 11:   */   @ApiField("available_amount")
/* 12:   */   private String availableAmount;
/* 13:   */   @ApiField("freeze_amount")
/* 14:   */   private String freezeAmount;
/* 15:   */   @ApiField("sys_freeze_amount")
/* 16:   */   private String sysFreezeAmount;
/* 17:   */   @ApiField("total_amount")
/* 18:   */   private String totalAmount;
/* 19:   */   @ApiField("ylb_profit_detail_info")
/* 20:   */   private YLBProfitDetailInfo ylbProfitDetailInfo;
/* 21:   */   
/* 22:   */   public void setAvailableAmount(String availableAmount)
/* 23:   */   {
/* 24:49 */     this.availableAmount = availableAmount;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getAvailableAmount()
/* 28:   */   {
/* 29:52 */     return this.availableAmount;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFreezeAmount(String freezeAmount)
/* 33:   */   {
/* 34:56 */     this.freezeAmount = freezeAmount;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getFreezeAmount()
/* 38:   */   {
/* 39:59 */     return this.freezeAmount;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setSysFreezeAmount(String sysFreezeAmount)
/* 43:   */   {
/* 44:63 */     this.sysFreezeAmount = sysFreezeAmount;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public String getSysFreezeAmount()
/* 48:   */   {
/* 49:66 */     return this.sysFreezeAmount;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void setTotalAmount(String totalAmount)
/* 53:   */   {
/* 54:70 */     this.totalAmount = totalAmount;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String getTotalAmount()
/* 58:   */   {
/* 59:73 */     return this.totalAmount;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void setYlbProfitDetailInfo(YLBProfitDetailInfo ylbProfitDetailInfo)
/* 63:   */   {
/* 64:77 */     this.ylbProfitDetailInfo = ylbProfitDetailInfo;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public YLBProfitDetailInfo getYlbProfitDetailInfo()
/* 68:   */   {
/* 69:80 */     return this.ylbProfitDetailInfo;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.MybankFinanceYulibaoAccountQueryResponse
 * JD-Core Version:    0.7.0.1
 */