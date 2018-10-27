/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class DataTag
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1784622682489521776L;
/* 10:   */   @ApiField("aggregate")
/* 11:   */   private String aggregate;
/* 12:   */   @ApiField("alias")
/* 13:   */   private String alias;
/* 14:   */   @ApiField("code")
/* 15:   */   private String code;
/* 16:   */   
/* 17:   */   public String getAggregate()
/* 18:   */   {
/* 19:35 */     return this.aggregate;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAggregate(String aggregate)
/* 23:   */   {
/* 24:38 */     this.aggregate = aggregate;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getAlias()
/* 28:   */   {
/* 29:42 */     return this.alias;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setAlias(String alias)
/* 33:   */   {
/* 34:45 */     this.alias = alias;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getCode()
/* 38:   */   {
/* 39:49 */     return this.code;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setCode(String code)
/* 43:   */   {
/* 44:52 */     this.code = code;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.DataTag
 * JD-Core Version:    0.7.0.1
 */