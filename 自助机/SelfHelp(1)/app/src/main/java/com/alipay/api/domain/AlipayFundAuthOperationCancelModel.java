/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundAuthOperationCancelModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7394813385784423419L;
/* 10:   */   @ApiField("auth_no")
/* 11:   */   private String authNo;
/* 12:   */   @ApiField("operation_id")
/* 13:   */   private String operationId;
/* 14:   */   @ApiField("out_order_no")
/* 15:   */   private String outOrderNo;
/* 16:   */   @ApiField("out_request_no")
/* 17:   */   private String outRequestNo;
/* 18:   */   @ApiField("remark")
/* 19:   */   private String remark;
/* 20:   */   
/* 21:   */   public String getAuthNo()
/* 22:   */   {
/* 23:47 */     return this.authNo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAuthNo(String authNo)
/* 27:   */   {
/* 28:50 */     this.authNo = authNo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getOperationId()
/* 32:   */   {
/* 33:54 */     return this.operationId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOperationId(String operationId)
/* 37:   */   {
/* 38:57 */     this.operationId = operationId;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getOutOrderNo()
/* 42:   */   {
/* 43:61 */     return this.outOrderNo;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOutOrderNo(String outOrderNo)
/* 47:   */   {
/* 48:64 */     this.outOrderNo = outOrderNo;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOutRequestNo()
/* 52:   */   {
/* 53:68 */     return this.outRequestNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOutRequestNo(String outRequestNo)
/* 57:   */   {
/* 58:71 */     this.outRequestNo = outRequestNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getRemark()
/* 62:   */   {
/* 63:75 */     return this.remark;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setRemark(String remark)
/* 67:   */   {
/* 68:78 */     this.remark = remark;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundAuthOperationCancelModel
 * JD-Core Version:    0.7.0.1
 */