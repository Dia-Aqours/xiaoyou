/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ISVLogSync
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2647934443135113353L;
/*  10:    */   @ApiField("application")
/*  11:    */   private String application;
/*  12:    */   @ApiField("error_code")
/*  13:    */   private String errorCode;
/*  14:    */   @ApiField("error_msg")
/*  15:    */   private String errorMsg;
/*  16:    */   @ApiField("exception_stack_trace")
/*  17:    */   private String exceptionStackTrace;
/*  18:    */   @ApiField("execution_millis")
/*  19:    */   private String executionMillis;
/*  20:    */   @ApiField("interface_name")
/*  21:    */   private String interfaceName;
/*  22:    */   @ApiField("success")
/*  23:    */   private String success;
/*  24:    */   @ApiField("sync_type")
/*  25:    */   private String syncType;
/*  26:    */   @ApiField("timestamp")
/*  27:    */   private String timestamp;
/*  28:    */   
/*  29:    */   public String getApplication()
/*  30:    */   {
/*  31: 72 */     return this.application;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setApplication(String application)
/*  35:    */   {
/*  36: 75 */     this.application = application;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getErrorCode()
/*  40:    */   {
/*  41: 79 */     return this.errorCode;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setErrorCode(String errorCode)
/*  45:    */   {
/*  46: 82 */     this.errorCode = errorCode;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getErrorMsg()
/*  50:    */   {
/*  51: 86 */     return this.errorMsg;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setErrorMsg(String errorMsg)
/*  55:    */   {
/*  56: 89 */     this.errorMsg = errorMsg;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getExceptionStackTrace()
/*  60:    */   {
/*  61: 93 */     return this.exceptionStackTrace;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setExceptionStackTrace(String exceptionStackTrace)
/*  65:    */   {
/*  66: 96 */     this.exceptionStackTrace = exceptionStackTrace;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getExecutionMillis()
/*  70:    */   {
/*  71:100 */     return this.executionMillis;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setExecutionMillis(String executionMillis)
/*  75:    */   {
/*  76:103 */     this.executionMillis = executionMillis;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getInterfaceName()
/*  80:    */   {
/*  81:107 */     return this.interfaceName;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setInterfaceName(String interfaceName)
/*  85:    */   {
/*  86:110 */     this.interfaceName = interfaceName;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getSuccess()
/*  90:    */   {
/*  91:114 */     return this.success;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setSuccess(String success)
/*  95:    */   {
/*  96:117 */     this.success = success;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getSyncType()
/* 100:    */   {
/* 101:121 */     return this.syncType;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setSyncType(String syncType)
/* 105:    */   {
/* 106:124 */     this.syncType = syncType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTimestamp()
/* 110:    */   {
/* 111:128 */     return this.timestamp;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTimestamp(String timestamp)
/* 115:    */   {
/* 116:131 */     this.timestamp = timestamp;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ISVLogSync
 * JD-Core Version:    0.7.0.1
 */