/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class RefundDetail
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 4313377557824714615L;
/* 12:   */   @ApiField("refund_amount")
/* 13:   */   private String refundAmount;
/* 14:   */   @ApiField("refund_memo")
/* 15:   */   private String refundMemo;
/* 16:   */   @ApiListField("refund_royaltys")
/* 17:   */   @ApiField("refund_royalty_info")
/* 18:   */   private List<RefundRoyaltyInfo> refundRoyaltys;
/* 19:   */   @ApiField("refund_suppl_amount")
/* 20:   */   private String refundSupplAmount;
/* 21:   */   @ApiField("refund_suppl_memo")
/* 22:   */   private String refundSupplMemo;
/* 23:   */   @ApiField("trade_no")
/* 24:   */   private String tradeNo;
/* 25:   */   
/* 26:   */   public String getRefundAmount()
/* 27:   */   {
/* 28:57 */     return this.refundAmount;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setRefundAmount(String refundAmount)
/* 32:   */   {
/* 33:60 */     this.refundAmount = refundAmount;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getRefundMemo()
/* 37:   */   {
/* 38:64 */     return this.refundMemo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setRefundMemo(String refundMemo)
/* 42:   */   {
/* 43:67 */     this.refundMemo = refundMemo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<RefundRoyaltyInfo> getRefundRoyaltys()
/* 47:   */   {
/* 48:71 */     return this.refundRoyaltys;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setRefundRoyaltys(List<RefundRoyaltyInfo> refundRoyaltys)
/* 52:   */   {
/* 53:74 */     this.refundRoyaltys = refundRoyaltys;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getRefundSupplAmount()
/* 57:   */   {
/* 58:78 */     return this.refundSupplAmount;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setRefundSupplAmount(String refundSupplAmount)
/* 62:   */   {
/* 63:81 */     this.refundSupplAmount = refundSupplAmount;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getRefundSupplMemo()
/* 67:   */   {
/* 68:85 */     return this.refundSupplMemo;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void setRefundSupplMemo(String refundSupplMemo)
/* 72:   */   {
/* 73:88 */     this.refundSupplMemo = refundSupplMemo;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public String getTradeNo()
/* 77:   */   {
/* 78:92 */     return this.tradeNo;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void setTradeNo(String tradeNo)
/* 82:   */   {
/* 83:95 */     this.tradeNo = tradeNo;
/* 84:   */   }
/* 85:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RefundDetail
 * JD-Core Version:    0.7.0.1
 */