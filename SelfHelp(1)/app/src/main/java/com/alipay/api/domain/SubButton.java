/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class SubButton
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4891743565849343235L;
/* 10:   */   @ApiField("action_param")
/* 11:   */   private String actionParam;
/* 12:   */   @ApiField("action_type")
/* 13:   */   private String actionType;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   
/* 17:   */   public String getActionParam()
/* 18:   */   {
/* 19:35 */     return this.actionParam;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setActionParam(String actionParam)
/* 23:   */   {
/* 24:38 */     this.actionParam = actionParam;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getActionType()
/* 28:   */   {
/* 29:42 */     return this.actionType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setActionType(String actionType)
/* 33:   */   {
/* 34:45 */     this.actionType = actionType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getName()
/* 38:   */   {
/* 39:49 */     return this.name;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setName(String name)
/* 43:   */   {
/* 44:52 */     this.name = name;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.SubButton
 * JD-Core Version:    0.7.0.1
 */