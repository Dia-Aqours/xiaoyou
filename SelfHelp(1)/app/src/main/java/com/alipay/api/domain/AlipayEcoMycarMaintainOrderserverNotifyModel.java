/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMaintainOrderserverNotifyModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3378935336194619619L;
/* 10:   */   @ApiField("change_cost")
/* 11:   */   private String changeCost;
/* 12:   */   @ApiField("change_desc")
/* 13:   */   private String changeDesc;
/* 14:   */   @ApiField("order_no")
/* 15:   */   private String orderNo;
/* 16:   */   
/* 17:   */   public String getChangeCost()
/* 18:   */   {
/* 19:35 */     return this.changeCost;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setChangeCost(String changeCost)
/* 23:   */   {
/* 24:38 */     this.changeCost = changeCost;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getChangeDesc()
/* 28:   */   {
/* 29:42 */     return this.changeDesc;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setChangeDesc(String changeDesc)
/* 33:   */   {
/* 34:45 */     this.changeDesc = changeDesc;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getOrderNo()
/* 38:   */   {
/* 39:49 */     return this.orderNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setOrderNo(String orderNo)
/* 43:   */   {
/* 44:52 */     this.orderNo = orderNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainOrderserverNotifyModel
 * JD-Core Version:    0.7.0.1
 */