/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MaintainOrderStatusExtParams
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5198845137556471599L;
/* 10:   */   @ApiField("logistics_code")
/* 11:   */   private String logisticsCode;
/* 12:   */   @ApiField("logistics_company")
/* 13:   */   private String logisticsCompany;
/* 14:   */   @ApiField("logistics_no")
/* 15:   */   private String logisticsNo;
/* 16:   */   @ApiField("order_status_txt")
/* 17:   */   private String orderStatusTxt;
/* 18:   */   @ApiField("receiver_addr")
/* 19:   */   private String receiverAddr;
/* 20:   */   @ApiField("sender_addr")
/* 21:   */   private String senderAddr;
/* 22:   */   
/* 23:   */   public String getLogisticsCode()
/* 24:   */   {
/* 25:53 */     return this.logisticsCode;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setLogisticsCode(String logisticsCode)
/* 29:   */   {
/* 30:56 */     this.logisticsCode = logisticsCode;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getLogisticsCompany()
/* 34:   */   {
/* 35:60 */     return this.logisticsCompany;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setLogisticsCompany(String logisticsCompany)
/* 39:   */   {
/* 40:63 */     this.logisticsCompany = logisticsCompany;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getLogisticsNo()
/* 44:   */   {
/* 45:67 */     return this.logisticsNo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setLogisticsNo(String logisticsNo)
/* 49:   */   {
/* 50:70 */     this.logisticsNo = logisticsNo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getOrderStatusTxt()
/* 54:   */   {
/* 55:74 */     return this.orderStatusTxt;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setOrderStatusTxt(String orderStatusTxt)
/* 59:   */   {
/* 60:77 */     this.orderStatusTxt = orderStatusTxt;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getReceiverAddr()
/* 64:   */   {
/* 65:81 */     return this.receiverAddr;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setReceiverAddr(String receiverAddr)
/* 69:   */   {
/* 70:84 */     this.receiverAddr = receiverAddr;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getSenderAddr()
/* 74:   */   {
/* 75:88 */     return this.senderAddr;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setSenderAddr(String senderAddr)
/* 79:   */   {
/* 80:91 */     this.senderAddr = senderAddr;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MaintainOrderStatusExtParams
 * JD-Core Version:    0.7.0.1
 */