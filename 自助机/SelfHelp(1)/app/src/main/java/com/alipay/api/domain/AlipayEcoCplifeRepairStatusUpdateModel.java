/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoCplifeRepairStatusUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4129951287918351741L;
/* 10:   */   @ApiField("biz_details")
/* 11:   */   private String bizDetails;
/* 12:   */   @ApiField("biz_state")
/* 13:   */   private String bizState;
/* 14:   */   @ApiField("req_id")
/* 15:   */   private String reqId;
/* 16:   */   
/* 17:   */   public String getBizDetails()
/* 18:   */   {
/* 19:35 */     return this.bizDetails;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBizDetails(String bizDetails)
/* 23:   */   {
/* 24:38 */     this.bizDetails = bizDetails;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getBizState()
/* 28:   */   {
/* 29:42 */     return this.bizState;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setBizState(String bizState)
/* 33:   */   {
/* 34:45 */     this.bizState = bizState;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getReqId()
/* 38:   */   {
/* 39:49 */     return this.reqId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setReqId(String reqId)
/* 43:   */   {
/* 44:52 */     this.reqId = reqId;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoCplifeRepairStatusUpdateModel

 * JD-Core Version:    0.7.0.1

 */