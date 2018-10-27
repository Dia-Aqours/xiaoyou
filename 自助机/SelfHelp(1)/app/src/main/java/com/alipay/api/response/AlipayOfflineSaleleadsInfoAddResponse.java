/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineSaleleadsInfoAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6624743737497788312L;
/* 10:   */   @ApiField("leads_id")
/* 11:   */   private String leadsId;
/* 12:   */   @ApiField("message")
/* 13:   */   private String message;
/* 14:   */   
/* 15:   */   public void setLeadsId(String leadsId)
/* 16:   */   {
/* 17:30 */     this.leadsId = leadsId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getLeadsId()
/* 21:   */   {
/* 22:33 */     return this.leadsId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setMessage(String message)
/* 26:   */   {
/* 27:37 */     this.message = message;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getMessage()
/* 31:   */   {
/* 32:40 */     return this.message;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineSaleleadsInfoAddResponse
 * JD-Core Version:    0.7.0.1
 */