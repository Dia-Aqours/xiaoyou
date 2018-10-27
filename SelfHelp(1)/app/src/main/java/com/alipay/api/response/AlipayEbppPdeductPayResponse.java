/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppPdeductPayResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6177885158184875213L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("bill_no")
/* 13:   */   private String billNo;
/* 14:   */   @ApiField("extend_field")
/* 15:   */   private String extendField;
/* 16:   */   @ApiField("out_order_no")
/* 17:   */   private String outOrderNo;
/* 18:   */   @ApiField("result_status")
/* 19:   */   private String resultStatus;
/* 20:   */   
/* 21:   */   public void setAgreementId(String agreementId)
/* 22:   */   {
/* 23:51 */     this.agreementId = agreementId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getAgreementId()
/* 27:   */   {
/* 28:54 */     return this.agreementId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setBillNo(String billNo)
/* 32:   */   {
/* 33:58 */     this.billNo = billNo;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getBillNo()
/* 37:   */   {
/* 38:61 */     return this.billNo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setExtendField(String extendField)
/* 42:   */   {
/* 43:65 */     this.extendField = extendField;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getExtendField()
/* 47:   */   {
/* 48:68 */     return this.extendField;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setOutOrderNo(String outOrderNo)
/* 52:   */   {
/* 53:72 */     this.outOrderNo = outOrderNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getOutOrderNo()
/* 57:   */   {
/* 58:75 */     return this.outOrderNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setResultStatus(String resultStatus)
/* 62:   */   {
/* 63:79 */     this.resultStatus = resultStatus;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getResultStatus()
/* 67:   */   {
/* 68:82 */     return this.resultStatus;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEbppPdeductPayResponse
 * JD-Core Version:    0.7.0.1
 */