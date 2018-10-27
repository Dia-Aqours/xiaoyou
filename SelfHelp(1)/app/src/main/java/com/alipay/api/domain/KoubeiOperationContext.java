/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiOperationContext
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8667544487315742253L;
/* 10:   */   @ApiField("op_role")
/* 11:   */   private String opRole;
/* 12:   */   
/* 13:   */   public String getOpRole()
/* 14:   */   {
/* 15:23 */     return this.opRole;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setOpRole(String opRole)
/* 19:   */   {
/* 20:26 */     this.opRole = opRole;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiOperationContext
 * JD-Core Version:    0.7.0.1
 */