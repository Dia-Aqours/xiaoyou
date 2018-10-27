/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayPromorulecenterRuleAnalyzeResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5479478749161626338L;
/* 10:   */   @ApiField("fail_condition_msg")
/* 11:   */   private String failConditionMsg;
/* 12:   */   @ApiField("fail_condition_name")
/* 13:   */   private String failConditionName;
/* 14:   */   @ApiField("result_code")
/* 15:   */   private String resultCode;
/* 16:   */   @ApiField("success")
/* 17:   */   private String success;
/* 18:   */   @ApiField("triggered")
/* 19:   */   private String triggered;
/* 20:   */   
/* 21:   */   public void setFailConditionMsg(String failConditionMsg)
/* 22:   */   {
/* 23:48 */     this.failConditionMsg = failConditionMsg;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getFailConditionMsg()
/* 27:   */   {
/* 28:51 */     return this.failConditionMsg;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setFailConditionName(String failConditionName)
/* 32:   */   {
/* 33:55 */     this.failConditionName = failConditionName;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getFailConditionName()
/* 37:   */   {
/* 38:58 */     return this.failConditionName;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setResultCode(String resultCode)
/* 42:   */   {
/* 43:62 */     this.resultCode = resultCode;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getResultCode()
/* 47:   */   {
/* 48:65 */     return this.resultCode;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setSuccess(String success)
/* 52:   */   {
/* 53:69 */     this.success = success;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getSuccess()
/* 57:   */   {
/* 58:72 */     return this.success;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setTriggered(String triggered)
/* 62:   */   {
/* 63:76 */     this.triggered = triggered;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getTriggered()
/* 67:   */   {
/* 68:79 */     return this.triggered;
/* 69:   */   }
/* 70:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayPromorulecenterRuleAnalyzeResponse

 * JD-Core Version:    0.7.0.1

 */