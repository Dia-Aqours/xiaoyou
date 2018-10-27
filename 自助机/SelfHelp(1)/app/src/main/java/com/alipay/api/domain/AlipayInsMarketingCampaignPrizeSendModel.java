/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayInsMarketingCampaignPrizeSendModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8223858143379152644L;
/* 12:   */   @ApiField("account_id")
/* 13:   */   private String accountId;
/* 14:   */   @ApiField("account_type")
/* 15:   */   private Long accountType;
/* 16:   */   @ApiField("campaign_id")
/* 17:   */   private String campaignId;
/* 18:   */   @ApiListField("factors")
/* 19:   */   @ApiField("ins_mkt_factor_d_t_o")
/* 20:   */   private List<InsMktFactorDTO> factors;
/* 21:   */   @ApiField("out_biz_no")
/* 22:   */   private String outBizNo;
/* 23:   */   @ApiField("request_id")
/* 24:   */   private String requestId;
/* 25:   */   
/* 26:   */   public String getAccountId()
/* 27:   */   {
/* 28:57 */     return this.accountId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setAccountId(String accountId)
/* 32:   */   {
/* 33:60 */     this.accountId = accountId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public Long getAccountType()
/* 37:   */   {
/* 38:64 */     return this.accountType;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setAccountType(Long accountType)
/* 42:   */   {
/* 43:67 */     this.accountType = accountType;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getCampaignId()
/* 47:   */   {
/* 48:71 */     return this.campaignId;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setCampaignId(String campaignId)
/* 52:   */   {
/* 53:74 */     this.campaignId = campaignId;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public List<InsMktFactorDTO> getFactors()
/* 57:   */   {
/* 58:78 */     return this.factors;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setFactors(List<InsMktFactorDTO> factors)
/* 62:   */   {
/* 63:81 */     this.factors = factors;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getOutBizNo()
/* 67:   */   {
/* 68:85 */     return this.outBizNo;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void setOutBizNo(String outBizNo)
/* 72:   */   {
/* 73:88 */     this.outBizNo = outBizNo;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public String getRequestId()
/* 77:   */   {
/* 78:92 */     return this.requestId;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void setRequestId(String requestId)
/* 82:   */   {
/* 83:95 */     this.requestId = requestId;
/* 84:   */   }
/* 85:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingCampaignPrizeSendModel
 * JD-Core Version:    0.7.0.1
 */