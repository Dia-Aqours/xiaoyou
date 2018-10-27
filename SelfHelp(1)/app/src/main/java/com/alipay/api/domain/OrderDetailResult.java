/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class OrderDetailResult
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7662332727141514614L;
/*  10:    */   @ApiField("app_id")
/*  11:    */   private String appId;
/*  12:    */   @ApiField("out_trade_no")
/*  13:    */   private String outTradeNo;
/*  14:    */   @ApiField("passback_params")
/*  15:    */   private String passbackParams;
/*  16:    */   @ApiField("seller_id")
/*  17:    */   private String sellerId;
/*  18:    */   @ApiField("subject")
/*  19:    */   private String subject;
/*  20:    */   @ApiField("total_amount")
/*  21:    */   private String totalAmount;
/*  22:    */   @ApiField("trade_no")
/*  23:    */   private String tradeNo;
/*  24:    */   @ApiField("trade_status")
/*  25:    */   private String tradeStatus;
/*  26:    */   
/*  27:    */   public String getAppId()
/*  28:    */   {
/*  29: 69 */     return this.appId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setAppId(String appId)
/*  33:    */   {
/*  34: 72 */     this.appId = appId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOutTradeNo()
/*  38:    */   {
/*  39: 76 */     return this.outTradeNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setOutTradeNo(String outTradeNo)
/*  43:    */   {
/*  44: 79 */     this.outTradeNo = outTradeNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getPassbackParams()
/*  48:    */   {
/*  49: 83 */     return this.passbackParams;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setPassbackParams(String passbackParams)
/*  53:    */   {
/*  54: 86 */     this.passbackParams = passbackParams;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getSellerId()
/*  58:    */   {
/*  59: 90 */     return this.sellerId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setSellerId(String sellerId)
/*  63:    */   {
/*  64: 93 */     this.sellerId = sellerId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getSubject()
/*  68:    */   {
/*  69: 97 */     return this.subject;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setSubject(String subject)
/*  73:    */   {
/*  74:100 */     this.subject = subject;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getTotalAmount()
/*  78:    */   {
/*  79:104 */     return this.totalAmount;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTotalAmount(String totalAmount)
/*  83:    */   {
/*  84:107 */     this.totalAmount = totalAmount;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTradeNo()
/*  88:    */   {
/*  89:111 */     return this.tradeNo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTradeNo(String tradeNo)
/*  93:    */   {
/*  94:114 */     this.tradeNo = tradeNo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTradeStatus()
/*  98:    */   {
/*  99:118 */     return this.tradeStatus;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setTradeStatus(String tradeStatus)
/* 103:    */   {
/* 104:121 */     this.tradeStatus = tradeStatus;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OrderDetailResult
 * JD-Core Version:    0.7.0.1
 */