/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CodeNOList
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1851593673738927489L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("code_no")
/* 13:   */   private String codeNo;
/* 14:   */   @ApiField("sub_type")
/* 15:   */   private String subType;
/* 16:   */   @ApiField("ticket_type")
/* 17:   */   private String ticketType;
/* 18:   */   @ApiField("valid_date")
/* 19:   */   private String validDate;
/* 20:   */   
/* 21:   */   public String getAmount()
/* 22:   */   {
/* 23:47 */     return this.amount;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAmount(String amount)
/* 27:   */   {
/* 28:50 */     this.amount = amount;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCodeNo()
/* 32:   */   {
/* 33:54 */     return this.codeNo;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCodeNo(String codeNo)
/* 37:   */   {
/* 38:57 */     this.codeNo = codeNo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getSubType()
/* 42:   */   {
/* 43:61 */     return this.subType;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setSubType(String subType)
/* 47:   */   {
/* 48:64 */     this.subType = subType;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getTicketType()
/* 52:   */   {
/* 53:68 */     return this.ticketType;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setTicketType(String ticketType)
/* 57:   */   {
/* 58:71 */     this.ticketType = ticketType;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getValidDate()
/* 62:   */   {
/* 63:75 */     return this.validDate;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setValidDate(String validDate)
/* 67:   */   {
/* 68:78 */     this.validDate = validDate;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CodeNOList
 * JD-Core Version:    0.7.0.1
 */