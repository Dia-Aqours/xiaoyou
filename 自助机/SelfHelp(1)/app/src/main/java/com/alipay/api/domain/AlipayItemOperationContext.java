/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayItemOperationContext
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5858341821229185674L;
/* 10:   */   @ApiField("creator")
/* 11:   */   private String creator;
/* 12:   */   @ApiField("op_role")
/* 13:   */   private String opRole;
/* 14:   */   @ApiField("partner_id")
/* 15:   */   private String partnerId;
/* 16:   */   
/* 17:   */   public String getCreator()
/* 18:   */   {
/* 19:35 */     return this.creator;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCreator(String creator)
/* 23:   */   {
/* 24:38 */     this.creator = creator;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOpRole()
/* 28:   */   {
/* 29:42 */     return this.opRole;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOpRole(String opRole)
/* 33:   */   {
/* 34:45 */     this.opRole = opRole;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPartnerId()
/* 38:   */   {
/* 39:49 */     return this.partnerId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPartnerId(String partnerId)
/* 43:   */   {
/* 44:52 */     this.partnerId = partnerId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayItemOperationContext
 * JD-Core Version:    0.7.0.1
 */