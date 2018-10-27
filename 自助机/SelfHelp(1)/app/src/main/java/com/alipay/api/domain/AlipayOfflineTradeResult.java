/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineTradeResult
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3563872372422896891L;
/*  10:    */   @ApiField("error_code")
/*  11:    */   private String errorCode;
/*  12:    */   @ApiField("error_message")
/*  13:    */   private String errorMessage;
/*  14:    */   @ApiField("message")
/*  15:    */   private String message;
/*  16:    */   @ApiField("need_retry")
/*  17:    */   private Boolean needRetry;
/*  18:    */   @ApiField("next_try_time")
/*  19:    */   private String nextTryTime;
/*  20:    */   @ApiField("out_trade_no")
/*  21:    */   private String outTradeNo;
/*  22:    */   @ApiField("result")
/*  23:    */   private String result;
/*  24:    */   @ApiField("trade_no")
/*  25:    */   private String tradeNo;
/*  26:    */   
/*  27:    */   public String getErrorCode()
/*  28:    */   {
/*  29: 65 */     return this.errorCode;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setErrorCode(String errorCode)
/*  33:    */   {
/*  34: 68 */     this.errorCode = errorCode;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getErrorMessage()
/*  38:    */   {
/*  39: 72 */     return this.errorMessage;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setErrorMessage(String errorMessage)
/*  43:    */   {
/*  44: 75 */     this.errorMessage = errorMessage;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getMessage()
/*  48:    */   {
/*  49: 79 */     return this.message;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setMessage(String message)
/*  53:    */   {
/*  54: 82 */     this.message = message;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public Boolean getNeedRetry()
/*  58:    */   {
/*  59: 86 */     return this.needRetry;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setNeedRetry(Boolean needRetry)
/*  63:    */   {
/*  64: 89 */     this.needRetry = needRetry;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getNextTryTime()
/*  68:    */   {
/*  69: 93 */     return this.nextTryTime;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setNextTryTime(String nextTryTime)
/*  73:    */   {
/*  74: 96 */     this.nextTryTime = nextTryTime;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getOutTradeNo()
/*  78:    */   {
/*  79:100 */     return this.outTradeNo;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setOutTradeNo(String outTradeNo)
/*  83:    */   {
/*  84:103 */     this.outTradeNo = outTradeNo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getResult()
/*  88:    */   {
/*  89:107 */     return this.result;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setResult(String result)
/*  93:    */   {
/*  94:110 */     this.result = result;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTradeNo()
/*  98:    */   {
/*  99:114 */     return this.tradeNo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setTradeNo(String tradeNo)
/* 103:    */   {
/* 104:117 */     this.tradeNo = tradeNo;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineTradeResult
 * JD-Core Version:    0.7.0.1
 */