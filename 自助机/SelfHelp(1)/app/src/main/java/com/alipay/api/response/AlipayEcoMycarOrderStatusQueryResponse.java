/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEcoMycarOrderStatusQueryResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3333337759191843251L;
/*  10:    */   @ApiField("alipay_order_id")
/*  11:    */   private String alipayOrderId;
/*  12:    */   @ApiField("car_order_id")
/*  13:    */   private String carOrderId;
/*  14:    */   @ApiField("equipment_order_id")
/*  15:    */   private String equipmentOrderId;
/*  16:    */   @ApiField("pay_money")
/*  17:    */   private String payMoney;
/*  18:    */   @ApiField("pay_status")
/*  19:    */   private String payStatus;
/*  20:    */   @ApiField("pay_time")
/*  21:    */   private String payTime;
/*  22:    */   @ApiField("pay_type")
/*  23:    */   private String payType;
/*  24:    */   @ApiField("status")
/*  25:    */   private String status;
/*  26:    */   
/*  27:    */   public void setAlipayOrderId(String alipayOrderId)
/*  28:    */   {
/*  29: 68 */     this.alipayOrderId = alipayOrderId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getAlipayOrderId()
/*  33:    */   {
/*  34: 71 */     return this.alipayOrderId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setCarOrderId(String carOrderId)
/*  38:    */   {
/*  39: 75 */     this.carOrderId = carOrderId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getCarOrderId()
/*  43:    */   {
/*  44: 78 */     return this.carOrderId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setEquipmentOrderId(String equipmentOrderId)
/*  48:    */   {
/*  49: 82 */     this.equipmentOrderId = equipmentOrderId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getEquipmentOrderId()
/*  53:    */   {
/*  54: 85 */     return this.equipmentOrderId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setPayMoney(String payMoney)
/*  58:    */   {
/*  59: 89 */     this.payMoney = payMoney;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getPayMoney()
/*  63:    */   {
/*  64: 92 */     return this.payMoney;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setPayStatus(String payStatus)
/*  68:    */   {
/*  69: 96 */     this.payStatus = payStatus;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getPayStatus()
/*  73:    */   {
/*  74: 99 */     return this.payStatus;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setPayTime(String payTime)
/*  78:    */   {
/*  79:103 */     this.payTime = payTime;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getPayTime()
/*  83:    */   {
/*  84:106 */     return this.payTime;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setPayType(String payType)
/*  88:    */   {
/*  89:110 */     this.payType = payType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getPayType()
/*  93:    */   {
/*  94:113 */     return this.payType;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setStatus(String status)
/*  98:    */   {
/*  99:117 */     this.status = status;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getStatus()
/* 103:    */   {
/* 104:120 */     return this.status;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarOrderStatusQueryResponse
 * JD-Core Version:    0.7.0.1
 */