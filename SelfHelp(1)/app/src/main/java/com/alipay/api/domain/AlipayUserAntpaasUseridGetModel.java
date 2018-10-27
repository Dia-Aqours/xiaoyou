/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserAntpaasUseridGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1356688591763948846L;
/* 10:   */   @ApiField("logon_id")
/* 11:   */   private String logonId;
/* 12:   */   
/* 13:   */   public String getLogonId()
/* 14:   */   {
/* 15:23 */     return this.logonId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setLogonId(String logonId)
/* 19:   */   {
/* 20:26 */     this.logonId = logonId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserAntpaasUseridGetModel
 * JD-Core Version:    0.7.0.1
 */