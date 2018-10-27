/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketItemModifyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5522324156648793554L;
/*  10:    */   @ApiField("audit_rule")
/*  11:    */   private AlipayItemAuditRule auditRule;
/*  12:    */   @ApiField("gmt_end")
/*  13:    */   private String gmtEnd;
/*  14:    */   @ApiField("inventory")
/*  15:    */   private Long inventory;
/*  16:    */   @ApiField("item_id")
/*  17:    */   private String itemId;
/*  18:    */   @ApiField("memo")
/*  19:    */   private String memo;
/*  20:    */   @ApiField("operate_notify_url")
/*  21:    */   private String operateNotifyUrl;
/*  22:    */   @ApiField("operation_context")
/*  23:    */   private AlipayItemOperationContext operationContext;
/*  24:    */   @ApiField("request_id")
/*  25:    */   private String requestId;
/*  26:    */   @ApiField("sales_rule")
/*  27:    */   private AlipayItemSalesRule salesRule;
/*  28:    */   @ApiField("weight")
/*  29:    */   private Long weight;
/*  30:    */   
/*  31:    */   public AlipayItemAuditRule getAuditRule()
/*  32:    */   {
/*  33: 77 */     return this.auditRule;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAuditRule(AlipayItemAuditRule auditRule)
/*  37:    */   {
/*  38: 80 */     this.auditRule = auditRule;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getGmtEnd()
/*  42:    */   {
/*  43: 84 */     return this.gmtEnd;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setGmtEnd(String gmtEnd)
/*  47:    */   {
/*  48: 87 */     this.gmtEnd = gmtEnd;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public Long getInventory()
/*  52:    */   {
/*  53: 91 */     return this.inventory;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setInventory(Long inventory)
/*  57:    */   {
/*  58: 94 */     this.inventory = inventory;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getItemId()
/*  62:    */   {
/*  63: 98 */     return this.itemId;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setItemId(String itemId)
/*  67:    */   {
/*  68:101 */     this.itemId = itemId;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getMemo()
/*  72:    */   {
/*  73:105 */     return this.memo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setMemo(String memo)
/*  77:    */   {
/*  78:108 */     this.memo = memo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getOperateNotifyUrl()
/*  82:    */   {
/*  83:112 */     return this.operateNotifyUrl;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/*  87:    */   {
/*  88:115 */     this.operateNotifyUrl = operateNotifyUrl;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public AlipayItemOperationContext getOperationContext()
/*  92:    */   {
/*  93:119 */     return this.operationContext;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setOperationContext(AlipayItemOperationContext operationContext)
/*  97:    */   {
/*  98:122 */     this.operationContext = operationContext;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getRequestId()
/* 102:    */   {
/* 103:126 */     return this.requestId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setRequestId(String requestId)
/* 107:    */   {
/* 108:129 */     this.requestId = requestId;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public AlipayItemSalesRule getSalesRule()
/* 112:    */   {
/* 113:133 */     return this.salesRule;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setSalesRule(AlipayItemSalesRule salesRule)
/* 117:    */   {
/* 118:136 */     this.salesRule = salesRule;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public Long getWeight()
/* 122:    */   {
/* 123:140 */     return this.weight;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setWeight(Long weight)
/* 127:    */   {
/* 128:143 */     this.weight = weight;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketItemModifyModel
 * JD-Core Version:    0.7.0.1
 */