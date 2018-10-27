/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCreditAutofinanceLoanCloseModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8656498876784468385L;
/* 10:   */   @ApiField("applyno")
/* 11:   */   private String applyno;
/* 12:   */   @ApiField("orgcode")
/* 13:   */   private String orgcode;
/* 14:   */   @ApiField("outorderno")
/* 15:   */   private String outorderno;
/* 16:   */   @ApiField("reson")
/* 17:   */   private String reson;
/* 18:   */   @ApiField("type")
/* 19:   */   private String type;
/* 20:   */   
/* 21:   */   public String getApplyno()
/* 22:   */   {
/* 23:50 */     return this.applyno;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setApplyno(String applyno)
/* 27:   */   {
/* 28:53 */     this.applyno = applyno;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getOrgcode()
/* 32:   */   {
/* 33:57 */     return this.orgcode;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOrgcode(String orgcode)
/* 37:   */   {
/* 38:60 */     this.orgcode = orgcode;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOutorderno()
/* 42:   */   {
/* 43:64 */     return this.outorderno;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOutorderno(String outorderno)
/* 47:   */   {
/* 48:67 */     this.outorderno = outorderno;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getReson()
/* 52:   */   {
/* 53:71 */     return this.reson;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setReson(String reson)
/* 57:   */   {
/* 58:74 */     this.reson = reson;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getType()
/* 62:   */   {
/* 63:78 */     return this.type;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setType(String type)
/* 67:   */   {
/* 68:81 */     this.type = type;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCreditAutofinanceLoanCloseModel
 * JD-Core Version:    0.7.0.1
 */