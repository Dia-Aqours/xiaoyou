/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class InsApplicationQuery
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3716288411314899891L;
/*  10:    */   @ApiField("application_no")
/*  11:    */   private String applicationNo;
/*  12:    */   @ApiField("application_status")
/*  13:    */   private String applicationStatus;
/*  14:    */   @ApiField("merchant")
/*  15:    */   private InsMerchant merchant;
/*  16:    */   @ApiField("operation_id")
/*  17:    */   private String operationId;
/*  18:    */   @ApiField("out_biz_no")
/*  19:    */   private String outBizNo;
/*  20:    */   @ApiField("prod_code")
/*  21:    */   private String prodCode;
/*  22:    */   @ApiField("trade_no")
/*  23:    */   private String tradeNo;
/*  24:    */   
/*  25:    */   public String getApplicationNo()
/*  26:    */   {
/*  27: 59 */     return this.applicationNo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setApplicationNo(String applicationNo)
/*  31:    */   {
/*  32: 62 */     this.applicationNo = applicationNo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getApplicationStatus()
/*  36:    */   {
/*  37: 66 */     return this.applicationStatus;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setApplicationStatus(String applicationStatus)
/*  41:    */   {
/*  42: 69 */     this.applicationStatus = applicationStatus;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public InsMerchant getMerchant()
/*  46:    */   {
/*  47: 73 */     return this.merchant;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setMerchant(InsMerchant merchant)
/*  51:    */   {
/*  52: 76 */     this.merchant = merchant;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOperationId()
/*  56:    */   {
/*  57: 80 */     return this.operationId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOperationId(String operationId)
/*  61:    */   {
/*  62: 83 */     this.operationId = operationId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOutBizNo()
/*  66:    */   {
/*  67: 87 */     return this.outBizNo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutBizNo(String outBizNo)
/*  71:    */   {
/*  72: 90 */     this.outBizNo = outBizNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getProdCode()
/*  76:    */   {
/*  77: 94 */     return this.prodCode;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setProdCode(String prodCode)
/*  81:    */   {
/*  82: 97 */     this.prodCode = prodCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getTradeNo()
/*  86:    */   {
/*  87:101 */     return this.tradeNo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setTradeNo(String tradeNo)
/*  91:    */   {
/*  92:104 */     this.tradeNo = tradeNo;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsApplicationQuery
 * JD-Core Version:    0.7.0.1
 */