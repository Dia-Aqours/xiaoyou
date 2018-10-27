/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorVoucherGenerateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3756119314115538935L;
/* 10:   */   @ApiField("expired_date")
/* 11:   */   private String expiredDate;
/* 12:   */   @ApiField("qr_code_no")
/* 13:   */   private String qrCodeNo;
/* 14:   */   @ApiField("ticket_no")
/* 15:   */   private String ticketNo;
/* 16:   */   
/* 17:   */   public void setExpiredDate(String expiredDate)
/* 18:   */   {
/* 19:36 */     this.expiredDate = expiredDate;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getExpiredDate()
/* 23:   */   {
/* 24:39 */     return this.expiredDate;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setQrCodeNo(String qrCodeNo)
/* 28:   */   {
/* 29:43 */     this.qrCodeNo = qrCodeNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getQrCodeNo()
/* 33:   */   {
/* 34:46 */     return this.qrCodeNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setTicketNo(String ticketNo)
/* 38:   */   {
/* 39:50 */     this.ticketNo = ticketNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getTicketNo()
/* 43:   */   {
/* 44:53 */     return this.ticketNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorVoucherGenerateResponse
 * JD-Core Version:    0.7.0.1
 */