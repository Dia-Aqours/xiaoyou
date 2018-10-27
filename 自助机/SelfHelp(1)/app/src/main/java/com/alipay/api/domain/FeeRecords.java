/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class FeeRecords
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5536621691676719748L;
/* 11:   */   @ApiField("balance")
/* 12:   */   private String balance;
/* 13:   */   @ApiField("date")
/* 14:   */   private Date date;
/* 15:   */   @ApiField("remark")
/* 16:   */   private String remark;
/* 17:   */   @ApiField("total_amount")
/* 18:   */   private String totalAmount;
/* 19:   */   
/* 20:   */   public String getBalance()
/* 21:   */   {
/* 22:43 */     return this.balance;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBalance(String balance)
/* 26:   */   {
/* 27:46 */     this.balance = balance;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Date getDate()
/* 31:   */   {
/* 32:50 */     return this.date;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setDate(Date date)
/* 36:   */   {
/* 37:53 */     this.date = date;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getRemark()
/* 41:   */   {
/* 42:57 */     return this.remark;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setRemark(String remark)
/* 46:   */   {
/* 47:60 */     this.remark = remark;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String getTotalAmount()
/* 51:   */   {
/* 52:64 */     return this.totalAmount;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setTotalAmount(String totalAmount)
/* 56:   */   {
/* 57:67 */     this.totalAmount = totalAmount;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.FeeRecords
 * JD-Core Version:    0.7.0.1
 */