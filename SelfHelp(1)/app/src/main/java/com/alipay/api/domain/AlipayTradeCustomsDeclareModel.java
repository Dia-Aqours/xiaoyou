/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayTradeCustomsDeclareModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4462488635748551348L;
/*  10:    */   @ApiField("amount")
/*  11:    */   private String amount;
/*  12:    */   @ApiField("buyer_info")
/*  13:    */   private CustomsDeclareBuyerInfo buyerInfo;
/*  14:    */   @ApiField("customs_place")
/*  15:    */   private String customsPlace;
/*  16:    */   @ApiField("is_split")
/*  17:    */   private String isSplit;
/*  18:    */   @ApiField("merchant_customs_code")
/*  19:    */   private String merchantCustomsCode;
/*  20:    */   @ApiField("merchant_customs_name")
/*  21:    */   private String merchantCustomsName;
/*  22:    */   @ApiField("out_request_no")
/*  23:    */   private String outRequestNo;
/*  24:    */   @ApiField("sub_out_biz_no")
/*  25:    */   private String subOutBizNo;
/*  26:    */   @ApiField("trade_no")
/*  27:    */   private String tradeNo;
/*  28:    */   
/*  29:    */   public String getAmount()
/*  30:    */   {
/*  31: 73 */     return this.amount;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setAmount(String amount)
/*  35:    */   {
/*  36: 76 */     this.amount = amount;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public CustomsDeclareBuyerInfo getBuyerInfo()
/*  40:    */   {
/*  41: 80 */     return this.buyerInfo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setBuyerInfo(CustomsDeclareBuyerInfo buyerInfo)
/*  45:    */   {
/*  46: 83 */     this.buyerInfo = buyerInfo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getCustomsPlace()
/*  50:    */   {
/*  51: 87 */     return this.customsPlace;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setCustomsPlace(String customsPlace)
/*  55:    */   {
/*  56: 90 */     this.customsPlace = customsPlace;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getIsSplit()
/*  60:    */   {
/*  61: 94 */     return this.isSplit;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setIsSplit(String isSplit)
/*  65:    */   {
/*  66: 97 */     this.isSplit = isSplit;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getMerchantCustomsCode()
/*  70:    */   {
/*  71:101 */     return this.merchantCustomsCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setMerchantCustomsCode(String merchantCustomsCode)
/*  75:    */   {
/*  76:104 */     this.merchantCustomsCode = merchantCustomsCode;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getMerchantCustomsName()
/*  80:    */   {
/*  81:108 */     return this.merchantCustomsName;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setMerchantCustomsName(String merchantCustomsName)
/*  85:    */   {
/*  86:111 */     this.merchantCustomsName = merchantCustomsName;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getOutRequestNo()
/*  90:    */   {
/*  91:115 */     return this.outRequestNo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setOutRequestNo(String outRequestNo)
/*  95:    */   {
/*  96:118 */     this.outRequestNo = outRequestNo;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getSubOutBizNo()
/* 100:    */   {
/* 101:122 */     return this.subOutBizNo;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setSubOutBizNo(String subOutBizNo)
/* 105:    */   {
/* 106:125 */     this.subOutBizNo = subOutBizNo;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTradeNo()
/* 110:    */   {
/* 111:129 */     return this.tradeNo;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTradeNo(String tradeNo)
/* 115:    */   {
/* 116:132 */     this.tradeNo = tradeNo;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeCustomsDeclareModel
 * JD-Core Version:    0.7.0.1
 */