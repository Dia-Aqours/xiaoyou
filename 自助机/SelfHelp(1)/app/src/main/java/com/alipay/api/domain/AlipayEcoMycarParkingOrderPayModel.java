/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEcoMycarParkingOrderPayModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2858895627896451339L;
/*  10:    */   @ApiField("car_number")
/*  11:    */   private String carNumber;
/*  12:    */   @ApiField("out_parking_id")
/*  13:    */   private String outParkingId;
/*  14:    */   @ApiField("out_trade_no")
/*  15:    */   private String outTradeNo;
/*  16:    */   @ApiField("parking_id")
/*  17:    */   private String parkingId;
/*  18:    */   @ApiField("seller_id")
/*  19:    */   private String sellerId;
/*  20:    */   @ApiField("seller_logon_id")
/*  21:    */   private String sellerLogonId;
/*  22:    */   @ApiField("subject")
/*  23:    */   private String subject;
/*  24:    */   @ApiField("total_fee")
/*  25:    */   private String totalFee;
/*  26:    */   
/*  27:    */   public String getCarNumber()
/*  28:    */   {
/*  29: 68 */     return this.carNumber;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setCarNumber(String carNumber)
/*  33:    */   {
/*  34: 71 */     this.carNumber = carNumber;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOutParkingId()
/*  38:    */   {
/*  39: 75 */     return this.outParkingId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setOutParkingId(String outParkingId)
/*  43:    */   {
/*  44: 78 */     this.outParkingId = outParkingId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getOutTradeNo()
/*  48:    */   {
/*  49: 82 */     return this.outTradeNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setOutTradeNo(String outTradeNo)
/*  53:    */   {
/*  54: 85 */     this.outTradeNo = outTradeNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getParkingId()
/*  58:    */   {
/*  59: 89 */     return this.parkingId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setParkingId(String parkingId)
/*  63:    */   {
/*  64: 92 */     this.parkingId = parkingId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getSellerId()
/*  68:    */   {
/*  69: 96 */     return this.sellerId;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setSellerId(String sellerId)
/*  73:    */   {
/*  74: 99 */     this.sellerId = sellerId;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getSellerLogonId()
/*  78:    */   {
/*  79:103 */     return this.sellerLogonId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setSellerLogonId(String sellerLogonId)
/*  83:    */   {
/*  84:106 */     this.sellerLogonId = sellerLogonId;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getSubject()
/*  88:    */   {
/*  89:110 */     return this.subject;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setSubject(String subject)
/*  93:    */   {
/*  94:113 */     this.subject = subject;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTotalFee()
/*  98:    */   {
/*  99:117 */     return this.totalFee;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setTotalFee(String totalFee)
/* 103:    */   {
/* 104:120 */     this.totalFee = totalFee;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingOrderPayModel
 * JD-Core Version:    0.7.0.1
 */