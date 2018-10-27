/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketingVoucherUseModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2575678462279439467L;
/* 10:   */   @ApiField("extend_params")
/* 11:   */   private String extendParams;
/* 12:   */   @ApiField("external_id")
/* 13:   */   private String externalId;
/* 14:   */   @ApiField("external_trade_info")
/* 15:   */   private VoucherUserExternalTradeInfo externalTradeInfo;
/* 16:   */   @ApiField("external_voucher_code")
/* 17:   */   private String externalVoucherCode;
/* 18:   */   
/* 19:   */   public String getExtendParams()
/* 20:   */   {
/* 21:41 */     return this.extendParams;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setExtendParams(String extendParams)
/* 25:   */   {
/* 26:44 */     this.extendParams = extendParams;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getExternalId()
/* 30:   */   {
/* 31:48 */     return this.externalId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setExternalId(String externalId)
/* 35:   */   {
/* 36:51 */     this.externalId = externalId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public VoucherUserExternalTradeInfo getExternalTradeInfo()
/* 40:   */   {
/* 41:55 */     return this.externalTradeInfo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setExternalTradeInfo(VoucherUserExternalTradeInfo externalTradeInfo)
/* 45:   */   {
/* 46:58 */     this.externalTradeInfo = externalTradeInfo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getExternalVoucherCode()
/* 50:   */   {
/* 51:62 */     return this.externalVoucherCode;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setExternalVoucherCode(String externalVoucherCode)
/* 55:   */   {
/* 56:65 */     this.externalVoucherCode = externalVoucherCode;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketingVoucherUseModel
 * JD-Core Version:    0.7.0.1
 */