/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorDepositCancelModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1453894719647636455L;
/* 10:   */   @ApiField("biz_info_ext")
/* 11:   */   private String bizInfoExt;
/* 12:   */   @ApiField("card_no")
/* 13:   */   private String cardNo;
/* 14:   */   @ApiField("card_type")
/* 15:   */   private String cardType;
/* 16:   */   @ApiField("operate_time")
/* 17:   */   private String operateTime;
/* 18:   */   @ApiField("out_biz_no")
/* 19:   */   private String outBizNo;
/* 20:   */   @ApiField("trade_no")
/* 21:   */   private String tradeNo;
/* 22:   */   
/* 23:   */   public String getBizInfoExt()
/* 24:   */   {
/* 25:53 */     return this.bizInfoExt;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBizInfoExt(String bizInfoExt)
/* 29:   */   {
/* 30:56 */     this.bizInfoExt = bizInfoExt;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCardNo()
/* 34:   */   {
/* 35:60 */     return this.cardNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setCardNo(String cardNo)
/* 39:   */   {
/* 40:63 */     this.cardNo = cardNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getCardType()
/* 44:   */   {
/* 45:67 */     return this.cardType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setCardType(String cardType)
/* 49:   */   {
/* 50:70 */     this.cardType = cardType;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOperateTime()
/* 54:   */   {
/* 55:74 */     return this.operateTime;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOperateTime(String operateTime)
/* 59:   */   {
/* 60:77 */     this.operateTime = operateTime;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getOutBizNo()
/* 64:   */   {
/* 65:81 */     return this.outBizNo;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setOutBizNo(String outBizNo)
/* 69:   */   {
/* 70:84 */     this.outBizNo = outBizNo;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getTradeNo()
/* 74:   */   {
/* 75:88 */     return this.tradeNo;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setTradeNo(String tradeNo)
/* 79:   */   {
/* 80:91 */     this.tradeNo = tradeNo;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorDepositCancelModel
 * JD-Core Version:    0.7.0.1
 */