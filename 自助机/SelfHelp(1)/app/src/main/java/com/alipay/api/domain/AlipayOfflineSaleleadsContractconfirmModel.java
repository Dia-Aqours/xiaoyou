/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineSaleleadsContractconfirmModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5315774254693925266L;
/* 10:   */   @ApiField("alipay_card_name")
/* 11:   */   private String alipayCardName;
/* 12:   */   @ApiField("alipay_card_no")
/* 13:   */   private String alipayCardNo;
/* 14:   */   @ApiField("leads_id")
/* 15:   */   private String leadsId;
/* 16:   */   @ApiField("ope_pid")
/* 17:   */   private String opePid;
/* 18:   */   @ApiField("request_id")
/* 19:   */   private String requestId;
/* 20:   */   @ApiField("sign_status")
/* 21:   */   private String signStatus;
/* 22:   */   
/* 23:   */   public String getAlipayCardName()
/* 24:   */   {
/* 25:53 */     return this.alipayCardName;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAlipayCardName(String alipayCardName)
/* 29:   */   {
/* 30:56 */     this.alipayCardName = alipayCardName;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getAlipayCardNo()
/* 34:   */   {
/* 35:60 */     return this.alipayCardNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setAlipayCardNo(String alipayCardNo)
/* 39:   */   {
/* 40:63 */     this.alipayCardNo = alipayCardNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getLeadsId()
/* 44:   */   {
/* 45:67 */     return this.leadsId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setLeadsId(String leadsId)
/* 49:   */   {
/* 50:70 */     this.leadsId = leadsId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOpePid()
/* 54:   */   {
/* 55:74 */     return this.opePid;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOpePid(String opePid)
/* 59:   */   {
/* 60:77 */     this.opePid = opePid;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getRequestId()
/* 64:   */   {
/* 65:81 */     return this.requestId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setRequestId(String requestId)
/* 69:   */   {
/* 70:84 */     this.requestId = requestId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getSignStatus()
/* 74:   */   {
/* 75:88 */     return this.signStatus;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setSignStatus(String signStatus)
/* 79:   */   {
/* 80:91 */     this.signStatus = signStatus;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsContractconfirmModel
 * JD-Core Version:    0.7.0.1
 */