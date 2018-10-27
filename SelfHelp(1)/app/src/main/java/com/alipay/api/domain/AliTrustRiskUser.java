/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AliTrustRiskUser
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6542148564192827127L;
/* 10:   */   @ApiField("date")
/* 11:   */   private String date;
/* 12:   */   @ApiField("reason")
/* 13:   */   private String reason;
/* 14:   */   @ApiField("risk")
/* 15:   */   private Boolean risk;
/* 16:   */   @ApiField("source")
/* 17:   */   private String source;
/* 18:   */   
/* 19:   */   public String getDate()
/* 20:   */   {
/* 21:41 */     return this.date;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setDate(String date)
/* 25:   */   {
/* 26:44 */     this.date = date;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getReason()
/* 30:   */   {
/* 31:48 */     return this.reason;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setReason(String reason)
/* 35:   */   {
/* 36:51 */     this.reason = reason;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public Boolean getRisk()
/* 40:   */   {
/* 41:55 */     return this.risk;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setRisk(Boolean risk)
/* 45:   */   {
/* 46:58 */     this.risk = risk;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getSource()
/* 50:   */   {
/* 51:62 */     return this.source;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setSource(String source)
/* 55:   */   {
/* 56:65 */     this.source = source;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AliTrustRiskUser
 * JD-Core Version:    0.7.0.1
 */