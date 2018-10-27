/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayDataDataserviceChinaremodelQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4438831623362869689L;
/* 10:   */   @ApiField("id")
/* 11:   */   private String id;
/* 12:   */   @ApiField("rule_id")
/* 13:   */   private String ruleId;
/* 14:   */   @ApiField("trans_id")
/* 15:   */   private String transId;
/* 16:   */   
/* 17:   */   public String getId()
/* 18:   */   {
/* 19:35 */     return this.id;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setId(String id)
/* 23:   */   {
/* 24:38 */     this.id = id;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getRuleId()
/* 28:   */   {
/* 29:42 */     return this.ruleId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setRuleId(String ruleId)
/* 33:   */   {
/* 34:45 */     this.ruleId = ruleId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTransId()
/* 38:   */   {
/* 39:49 */     return this.transId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTransId(String transId)
/* 43:   */   {
/* 44:52 */     this.transId = transId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataDataserviceChinaremodelQueryModel
 * JD-Core Version:    0.7.0.1
 */