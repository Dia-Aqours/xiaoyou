/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayFundAuthOrderUnfreezeResponse
/*   8:    */   extends AlipayResponse
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 7337226878318636683L;
/*  11:    */   @ApiField("amount")
/*  12:    */   private String amount;
/*  13:    */   @ApiField("auth_no")
/*  14:    */   private String authNo;
/*  15:    */   @ApiField("gmt_trans")
/*  16:    */   private Date gmtTrans;
/*  17:    */   @ApiField("operation_id")
/*  18:    */   private String operationId;
/*  19:    */   @ApiField("out_order_no")
/*  20:    */   private String outOrderNo;
/*  21:    */   @ApiField("out_request_no")
/*  22:    */   private String outRequestNo;
/*  23:    */   @ApiField("status")
/*  24:    */   private String status;
/*  25:    */   
/*  26:    */   public void setAmount(String amount)
/*  27:    */   {
/*  28: 64 */     this.amount = amount;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getAmount()
/*  32:    */   {
/*  33: 67 */     return this.amount;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAuthNo(String authNo)
/*  37:    */   {
/*  38: 71 */     this.authNo = authNo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAuthNo()
/*  42:    */   {
/*  43: 74 */     return this.authNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setGmtTrans(Date gmtTrans)
/*  47:    */   {
/*  48: 78 */     this.gmtTrans = gmtTrans;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public Date getGmtTrans()
/*  52:    */   {
/*  53: 81 */     return this.gmtTrans;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setOperationId(String operationId)
/*  57:    */   {
/*  58: 85 */     this.operationId = operationId;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getOperationId()
/*  62:    */   {
/*  63: 88 */     return this.operationId;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setOutOrderNo(String outOrderNo)
/*  67:    */   {
/*  68: 92 */     this.outOrderNo = outOrderNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getOutOrderNo()
/*  72:    */   {
/*  73: 95 */     return this.outOrderNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setOutRequestNo(String outRequestNo)
/*  77:    */   {
/*  78: 99 */     this.outRequestNo = outRequestNo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getOutRequestNo()
/*  82:    */   {
/*  83:102 */     return this.outRequestNo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setStatus(String status)
/*  87:    */   {
/*  88:106 */     this.status = status;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getStatus()
/*  92:    */   {
/*  93:109 */     return this.status;
/*  94:    */   }
/*  95:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayFundAuthOrderUnfreezeResponse
 * JD-Core Version:    0.7.0.1
 */