/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayChinareModelResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5173873597574145197L;
/* 10:   */   @ApiField("id")
/* 11:   */   private String id;
/* 12:   */   @ApiField("rule_id")
/* 13:   */   private String ruleId;
/* 14:   */   @ApiField("rule_result")
/* 15:   */   private String ruleResult;
/* 16:   */   @ApiField("trans_id")
/* 17:   */   private String transId;
/* 18:   */   
/* 19:   */   public String getId()
/* 20:   */   {
/* 21:41 */     return this.id;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setId(String id)
/* 25:   */   {
/* 26:44 */     this.id = id;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getRuleId()
/* 30:   */   {
/* 31:48 */     return this.ruleId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setRuleId(String ruleId)
/* 35:   */   {
/* 36:51 */     this.ruleId = ruleId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getRuleResult()
/* 40:   */   {
/* 41:55 */     return this.ruleResult;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setRuleResult(String ruleResult)
/* 45:   */   {
/* 46:58 */     this.ruleResult = ruleResult;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTransId()
/* 50:   */   {
/* 51:62 */     return this.transId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTransId(String transId)
/* 55:   */   {
/* 56:65 */     this.transId = transId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayChinareModelResult
 * JD-Core Version:    0.7.0.1
 */