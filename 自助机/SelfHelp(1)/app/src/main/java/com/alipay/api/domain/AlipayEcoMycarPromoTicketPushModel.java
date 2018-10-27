/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarPromoTicketPushModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2233197774673444768L;
/* 10:   */   @ApiField("apply_no")
/* 11:   */   private String applyNo;
/* 12:   */   @ApiField("apply_status")
/* 13:   */   private String applyStatus;
/* 14:   */   @ApiField("code_no")
/* 15:   */   private String codeNo;
/* 16:   */   @ApiField("ticket_id")
/* 17:   */   private String ticketId;
/* 18:   */   
/* 19:   */   public String getApplyNo()
/* 20:   */   {
/* 21:41 */     return this.applyNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setApplyNo(String applyNo)
/* 25:   */   {
/* 26:44 */     this.applyNo = applyNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getApplyStatus()
/* 30:   */   {
/* 31:48 */     return this.applyStatus;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setApplyStatus(String applyStatus)
/* 35:   */   {
/* 36:51 */     this.applyStatus = applyStatus;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getCodeNo()
/* 40:   */   {
/* 41:55 */     return this.codeNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setCodeNo(String codeNo)
/* 45:   */   {
/* 46:58 */     this.codeNo = codeNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTicketId()
/* 50:   */   {
/* 51:62 */     return this.ticketId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTicketId(String ticketId)
/* 55:   */   {
/* 56:65 */     this.ticketId = ticketId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarPromoTicketPushModel
 * JD-Core Version:    0.7.0.1
 */