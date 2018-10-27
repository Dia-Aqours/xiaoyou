/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundAuthOperationCancelResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1519859955472443641L;
/* 10:   */   @ApiField("action")
/* 11:   */   private String action;
/* 12:   */   @ApiField("auth_no")
/* 13:   */   private String authNo;
/* 14:   */   @ApiField("operation_id")
/* 15:   */   private String operationId;
/* 16:   */   @ApiField("out_order_no")
/* 17:   */   private String outOrderNo;
/* 18:   */   @ApiField("out_request_no")
/* 19:   */   private String outRequestNo;
/* 20:   */   
/* 21:   */   public void setAction(String action)
/* 22:   */   {
/* 23:50 */     this.action = action;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getAction()
/* 27:   */   {
/* 28:53 */     return this.action;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setAuthNo(String authNo)
/* 32:   */   {
/* 33:57 */     this.authNo = authNo;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getAuthNo()
/* 37:   */   {
/* 38:60 */     return this.authNo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setOperationId(String operationId)
/* 42:   */   {
/* 43:64 */     this.operationId = operationId;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getOperationId()
/* 47:   */   {
/* 48:67 */     return this.operationId;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setOutOrderNo(String outOrderNo)
/* 52:   */   {
/* 53:71 */     this.outOrderNo = outOrderNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getOutOrderNo()
/* 57:   */   {
/* 58:74 */     return this.outOrderNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setOutRequestNo(String outRequestNo)
/* 62:   */   {
/* 63:78 */     this.outRequestNo = outRequestNo;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getOutRequestNo()
/* 67:   */   {
/* 68:81 */     return this.outRequestNo;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayFundAuthOperationCancelResponse
 * JD-Core Version:    0.7.0.1
 */