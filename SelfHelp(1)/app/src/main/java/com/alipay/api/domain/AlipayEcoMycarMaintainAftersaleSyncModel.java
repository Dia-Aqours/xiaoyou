/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMaintainAftersaleSyncModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7414383974157426584L;
/* 10:   */   @ApiField("aftersale_no")
/* 11:   */   private String aftersaleNo;
/* 12:   */   @ApiField("refuse_reason")
/* 13:   */   private String refuseReason;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   
/* 17:   */   public String getAftersaleNo()
/* 18:   */   {
/* 19:35 */     return this.aftersaleNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAftersaleNo(String aftersaleNo)
/* 23:   */   {
/* 24:38 */     this.aftersaleNo = aftersaleNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getRefuseReason()
/* 28:   */   {
/* 29:42 */     return this.refuseReason;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setRefuseReason(String refuseReason)
/* 33:   */   {
/* 34:45 */     this.refuseReason = refuseReason;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStatus()
/* 38:   */   {
/* 39:49 */     return this.status;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStatus(String status)
/* 43:   */   {
/* 44:52 */     this.status = status;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainAftersaleSyncModel
 * JD-Core Version:    0.7.0.1
 */