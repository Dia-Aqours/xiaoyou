/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketLeadsQrcodeQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1762351286759828347L;
/* 10:   */   @ApiField("leads_id")
/* 11:   */   private String leadsId;
/* 12:   */   @ApiField("op_id")
/* 13:   */   private String opId;
/* 14:   */   
/* 15:   */   public String getLeadsId()
/* 16:   */   {
/* 17:29 */     return this.leadsId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setLeadsId(String leadsId)
/* 21:   */   {
/* 22:32 */     this.leadsId = leadsId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getOpId()
/* 26:   */   {
/* 27:36 */     return this.opId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setOpId(String opId)
/* 31:   */   {
/* 32:39 */     this.opId = opId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketLeadsQrcodeQueryModel
 * JD-Core Version:    0.7.0.1
 */