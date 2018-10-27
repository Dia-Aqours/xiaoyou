/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PromoTool
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7451137461138292555L;
/* 10:   */   @ApiField("point_card")
/* 11:   */   private PointCard pointCard;
/* 12:   */   @ApiField("send_rule")
/* 13:   */   private SendRule sendRule;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   @ApiField("voucher")
/* 17:   */   private Voucher voucher;
/* 18:   */   @ApiField("voucher_no")
/* 19:   */   private String voucherNo;
/* 20:   */   
/* 21:   */   public PointCard getPointCard()
/* 22:   */   {
/* 23:47 */     return this.pointCard;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setPointCard(PointCard pointCard)
/* 27:   */   {
/* 28:50 */     this.pointCard = pointCard;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public SendRule getSendRule()
/* 32:   */   {
/* 33:54 */     return this.sendRule;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setSendRule(SendRule sendRule)
/* 37:   */   {
/* 38:57 */     this.sendRule = sendRule;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getStatus()
/* 42:   */   {
/* 43:61 */     return this.status;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setStatus(String status)
/* 47:   */   {
/* 48:64 */     this.status = status;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Voucher getVoucher()
/* 52:   */   {
/* 53:68 */     return this.voucher;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setVoucher(Voucher voucher)
/* 57:   */   {
/* 58:71 */     this.voucher = voucher;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getVoucherNo()
/* 62:   */   {
/* 63:75 */     return this.voucherNo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setVoucherNo(String voucherNo)
/* 67:   */   {
/* 68:78 */     this.voucherNo = voucherNo;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PromoTool
 * JD-Core Version:    0.7.0.1
 */