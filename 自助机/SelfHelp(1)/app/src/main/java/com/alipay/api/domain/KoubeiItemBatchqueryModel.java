/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiItemBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5672981464832468721L;
/* 10:   */   @ApiField("auth_code")
/* 11:   */   private String authCode;
/* 12:   */   @ApiField("item_ids")
/* 13:   */   private String itemIds;
/* 14:   */   @ApiField("operation_context")
/* 15:   */   private KoubeiOperationContext operationContext;
/* 16:   */   @ApiField("page_no")
/* 17:   */   private String pageNo;
/* 18:   */   @ApiField("page_size")
/* 19:   */   private Long pageSize;
/* 20:   */   
/* 21:   */   public String getAuthCode()
/* 22:   */   {
/* 23:47 */     return this.authCode;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAuthCode(String authCode)
/* 27:   */   {
/* 28:50 */     this.authCode = authCode;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getItemIds()
/* 32:   */   {
/* 33:54 */     return this.itemIds;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setItemIds(String itemIds)
/* 37:   */   {
/* 38:57 */     this.itemIds = itemIds;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public KoubeiOperationContext getOperationContext()
/* 42:   */   {
/* 43:61 */     return this.operationContext;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setOperationContext(KoubeiOperationContext operationContext)
/* 47:   */   {
/* 48:64 */     this.operationContext = operationContext;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getPageNo()
/* 52:   */   {
/* 53:68 */     return this.pageNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setPageNo(String pageNo)
/* 57:   */   {
/* 58:71 */     this.pageNo = pageNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public Long getPageSize()
/* 62:   */   {
/* 63:75 */     return this.pageSize;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setPageSize(Long pageSize)
/* 67:   */   {
/* 68:78 */     this.pageSize = pageSize;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */