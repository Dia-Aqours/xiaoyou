/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayCommerceCityfacilitatorVoucherGenerateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6524329388522363324L;
/*  10:    */   @ApiField("city_code")
/*  11:    */   private String cityCode;
/*  12:    */   @ApiField("site_begin")
/*  13:    */   private String siteBegin;
/*  14:    */   @ApiField("site_end")
/*  15:    */   private String siteEnd;
/*  16:    */   @ApiField("ticket_num")
/*  17:    */   private String ticketNum;
/*  18:    */   @ApiField("ticket_price")
/*  19:    */   private String ticketPrice;
/*  20:    */   @ApiField("ticket_type")
/*  21:    */   private String ticketType;
/*  22:    */   @ApiField("total_fee")
/*  23:    */   private String totalFee;
/*  24:    */   @ApiField("trade_no")
/*  25:    */   private String tradeNo;
/*  26:    */   
/*  27:    */   public String getCityCode()
/*  28:    */   {
/*  29: 66 */     return this.cityCode;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setCityCode(String cityCode)
/*  33:    */   {
/*  34: 69 */     this.cityCode = cityCode;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getSiteBegin()
/*  38:    */   {
/*  39: 73 */     return this.siteBegin;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setSiteBegin(String siteBegin)
/*  43:    */   {
/*  44: 76 */     this.siteBegin = siteBegin;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getSiteEnd()
/*  48:    */   {
/*  49: 80 */     return this.siteEnd;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setSiteEnd(String siteEnd)
/*  53:    */   {
/*  54: 83 */     this.siteEnd = siteEnd;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getTicketNum()
/*  58:    */   {
/*  59: 87 */     return this.ticketNum;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setTicketNum(String ticketNum)
/*  63:    */   {
/*  64: 90 */     this.ticketNum = ticketNum;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getTicketPrice()
/*  68:    */   {
/*  69: 94 */     return this.ticketPrice;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setTicketPrice(String ticketPrice)
/*  73:    */   {
/*  74: 97 */     this.ticketPrice = ticketPrice;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getTicketType()
/*  78:    */   {
/*  79:101 */     return this.ticketType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTicketType(String ticketType)
/*  83:    */   {
/*  84:104 */     this.ticketType = ticketType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTotalFee()
/*  88:    */   {
/*  89:108 */     return this.totalFee;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTotalFee(String totalFee)
/*  93:    */   {
/*  94:111 */     this.totalFee = totalFee;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTradeNo()
/*  98:    */   {
/*  99:115 */     return this.tradeNo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setTradeNo(String tradeNo)
/* 103:    */   {
/* 104:118 */     this.tradeNo = tradeNo;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorVoucherGenerateModel
 * JD-Core Version:    0.7.0.1
 */