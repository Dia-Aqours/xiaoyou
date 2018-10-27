/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.TicketDetailInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayCommerceCityfacilitatorVoucherBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 7565135827566645951L;
/* 13:   */   @ApiListField("tickets")
/* 14:   */   @ApiField("ticket_detail_info")
/* 15:   */   private List<TicketDetailInfo> tickets;
/* 16:   */   
/* 17:   */   public void setTickets(List<TicketDetailInfo> tickets)
/* 18:   */   {
/* 19:28 */     this.tickets = tickets;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<TicketDetailInfo> getTickets()
/* 23:   */   {
/* 24:31 */     return this.tickets;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorVoucherBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */