/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayCreditAutofinanceLoanPlanQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2563749963119315534L;
/* 10:   */   @ApiField("extparam")
/* 11:   */   private String extparam;
/* 12:   */   @ApiField("orgcode")
/* 13:   */   private String orgcode;
/* 14:   */   @ApiField("productcode")
/* 15:   */   private String productcode;
/* 16:   */   @ApiField("seqno")
/* 17:   */   private String seqno;
/* 18:   */   @ApiField("uid")
/* 19:   */   private String uid;
/* 20:   */   
/* 21:   */   public String getExtparam()
/* 22:   */   {
/* 23:47 */     return this.extparam;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setExtparam(String extparam)
/* 27:   */   {
/* 28:50 */     this.extparam = extparam;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getOrgcode()
/* 32:   */   {
/* 33:54 */     return this.orgcode;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOrgcode(String orgcode)
/* 37:   */   {
/* 38:57 */     this.orgcode = orgcode;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getProductcode()
/* 42:   */   {
/* 43:61 */     return this.productcode;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setProductcode(String productcode)
/* 47:   */   {
/* 48:64 */     this.productcode = productcode;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getSeqno()
/* 52:   */   {
/* 53:68 */     return this.seqno;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setSeqno(String seqno)
/* 57:   */   {
/* 58:71 */     this.seqno = seqno;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getUid()
/* 62:   */   {
/* 63:75 */     return this.uid;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setUid(String uid)
/* 67:   */   {
/* 68:78 */     this.uid = uid;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayCreditAutofinanceLoanPlanQueryModel

 * JD-Core Version:    0.7.0.1

 */