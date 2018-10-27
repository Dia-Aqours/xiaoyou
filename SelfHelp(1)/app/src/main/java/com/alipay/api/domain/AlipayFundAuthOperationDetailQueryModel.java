/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundAuthOperationDetailQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5276339914489915188L;
/* 10:   */   @ApiField("auth_no")
/* 11:   */   private String authNo;
/* 12:   */   @ApiField("operation_id")
/* 13:   */   private String operationId;
/* 14:   */   @ApiField("out_order_no")
/* 15:   */   private String outOrderNo;
/* 16:   */   @ApiField("out_request_no")
/* 17:   */   private String outRequestNo;
/* 18:   */   
/* 19:   */   public String getAuthNo()
/* 20:   */   {
/* 21:41 */     return this.authNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAuthNo(String authNo)
/* 25:   */   {
/* 26:44 */     this.authNo = authNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOperationId()
/* 30:   */   {
/* 31:48 */     return this.operationId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOperationId(String operationId)
/* 35:   */   {
/* 36:51 */     this.operationId = operationId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getOutOrderNo()
/* 40:   */   {
/* 41:55 */     return this.outOrderNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setOutOrderNo(String outOrderNo)
/* 45:   */   {
/* 46:58 */     this.outOrderNo = outOrderNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getOutRequestNo()
/* 50:   */   {
/* 51:62 */     return this.outRequestNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setOutRequestNo(String outRequestNo)
/* 55:   */   {
/* 56:65 */     this.outRequestNo = outRequestNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundAuthOperationDetailQueryModel
 * JD-Core Version:    0.7.0.1
 */