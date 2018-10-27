/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketItemStateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6871649124198816115L;
/*  10:    */   @ApiField("audit_rule")
/*  11:    */   private AlipayItemAuditRule auditRule;
/*  12:    */   @ApiField("item_id")
/*  13:    */   private String itemId;
/*  14:    */   @ApiField("memo")
/*  15:    */   private String memo;
/*  16:    */   @ApiField("operate_notify_url")
/*  17:    */   private String operateNotifyUrl;
/*  18:    */   @ApiField("operation_context")
/*  19:    */   private AlipayItemOperationContext operationContext;
/*  20:    */   @ApiField("request_id")
/*  21:    */   private String requestId;
/*  22:    */   @ApiField("state_type")
/*  23:    */   private String stateType;
/*  24:    */   
/*  25:    */   public AlipayItemAuditRule getAuditRule()
/*  26:    */   {
/*  27: 59 */     return this.auditRule;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAuditRule(AlipayItemAuditRule auditRule)
/*  31:    */   {
/*  32: 62 */     this.auditRule = auditRule;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getItemId()
/*  36:    */   {
/*  37: 66 */     return this.itemId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setItemId(String itemId)
/*  41:    */   {
/*  42: 69 */     this.itemId = itemId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getMemo()
/*  46:    */   {
/*  47: 73 */     return this.memo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setMemo(String memo)
/*  51:    */   {
/*  52: 76 */     this.memo = memo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOperateNotifyUrl()
/*  56:    */   {
/*  57: 80 */     return this.operateNotifyUrl;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/*  61:    */   {
/*  62: 83 */     this.operateNotifyUrl = operateNotifyUrl;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public AlipayItemOperationContext getOperationContext()
/*  66:    */   {
/*  67: 87 */     return this.operationContext;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOperationContext(AlipayItemOperationContext operationContext)
/*  71:    */   {
/*  72: 90 */     this.operationContext = operationContext;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getRequestId()
/*  76:    */   {
/*  77: 94 */     return this.requestId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setRequestId(String requestId)
/*  81:    */   {
/*  82: 97 */     this.requestId = requestId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getStateType()
/*  86:    */   {
/*  87:101 */     return this.stateType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setStateType(String stateType)
/*  91:    */   {
/*  92:104 */     this.stateType = stateType;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketItemStateModel
 * JD-Core Version:    0.7.0.1
 */