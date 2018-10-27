/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiItemStateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7318879882498383749L;
/* 10:   */   @ApiField("auth_code")
/* 11:   */   private String authCode;
/* 12:   */   @ApiField("item_id")
/* 13:   */   private String itemId;
/* 14:   */   @ApiField("memo")
/* 15:   */   private String memo;
/* 16:   */   @ApiField("operation_context")
/* 17:   */   private KoubeiOperationContext operationContext;
/* 18:   */   @ApiField("request_id")
/* 19:   */   private String requestId;
/* 20:   */   @ApiField("state_type")
/* 21:   */   private String stateType;
/* 22:   */   
/* 23:   */   public String getAuthCode()
/* 24:   */   {
/* 25:53 */     return this.authCode;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAuthCode(String authCode)
/* 29:   */   {
/* 30:56 */     this.authCode = authCode;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getItemId()
/* 34:   */   {
/* 35:60 */     return this.itemId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setItemId(String itemId)
/* 39:   */   {
/* 40:63 */     this.itemId = itemId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getMemo()
/* 44:   */   {
/* 45:67 */     return this.memo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setMemo(String memo)
/* 49:   */   {
/* 50:70 */     this.memo = memo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public KoubeiOperationContext getOperationContext()
/* 54:   */   {
/* 55:74 */     return this.operationContext;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOperationContext(KoubeiOperationContext operationContext)
/* 59:   */   {
/* 60:77 */     this.operationContext = operationContext;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getRequestId()
/* 64:   */   {
/* 65:81 */     return this.requestId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setRequestId(String requestId)
/* 69:   */   {
/* 70:84 */     this.requestId = requestId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getStateType()
/* 74:   */   {
/* 75:88 */     return this.stateType;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setStateType(String stateType)
/* 79:   */   {
/* 80:91 */     this.stateType = stateType;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemStateModel
 * JD-Core Version:    0.7.0.1
 */