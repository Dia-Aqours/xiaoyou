/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayTradeAppPayModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5712972914248334811L;
/*  10:    */   @ApiField("body")
/*  11:    */   private String body;
/*  12:    */   @ApiField("disable_pay_channels")
/*  13:    */   private String disablePayChannels;
/*  14:    */   @ApiField("enable_pay_channels")
/*  15:    */   private String enablePayChannels;
/*  16:    */   @ApiField("extend_params")
/*  17:    */   private ExtendParams extendParams;
/*  18:    */   @ApiField("goods_type")
/*  19:    */   private String goodsType;
/*  20:    */   @ApiField("out_trade_no")
/*  21:    */   private String outTradeNo;
/*  22:    */   @ApiField("passback_params")
/*  23:    */   private String passbackParams;
/*  24:    */   @ApiField("product_code")
/*  25:    */   private String productCode;
/*  26:    */   @ApiField("promo_params")
/*  27:    */   private String promoParams;
/*  28:    */   @ApiField("seller_id")
/*  29:    */   private String sellerId;
/*  30:    */   @ApiField("subject")
/*  31:    */   private String subject;
/*  32:    */   @ApiField("timeout_express")
/*  33:    */   private String timeoutExpress;
/*  34:    */   @ApiField("total_amount")
/*  35:    */   private String totalAmount;
/*  36:    */   
/*  37:    */   public String getBody()
/*  38:    */   {
/*  39:100 */     return this.body;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBody(String body)
/*  43:    */   {
/*  44:103 */     this.body = body;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getDisablePayChannels()
/*  48:    */   {
/*  49:107 */     return this.disablePayChannels;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setDisablePayChannels(String disablePayChannels)
/*  53:    */   {
/*  54:110 */     this.disablePayChannels = disablePayChannels;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getEnablePayChannels()
/*  58:    */   {
/*  59:114 */     return this.enablePayChannels;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setEnablePayChannels(String enablePayChannels)
/*  63:    */   {
/*  64:117 */     this.enablePayChannels = enablePayChannels;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public ExtendParams getExtendParams()
/*  68:    */   {
/*  69:121 */     return this.extendParams;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setExtendParams(ExtendParams extendParams)
/*  73:    */   {
/*  74:124 */     this.extendParams = extendParams;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getGoodsType()
/*  78:    */   {
/*  79:128 */     return this.goodsType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setGoodsType(String goodsType)
/*  83:    */   {
/*  84:131 */     this.goodsType = goodsType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getOutTradeNo()
/*  88:    */   {
/*  89:135 */     return this.outTradeNo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setOutTradeNo(String outTradeNo)
/*  93:    */   {
/*  94:138 */     this.outTradeNo = outTradeNo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getPassbackParams()
/*  98:    */   {
/*  99:142 */     return this.passbackParams;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setPassbackParams(String passbackParams)
/* 103:    */   {
/* 104:145 */     this.passbackParams = passbackParams;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProductCode()
/* 108:    */   {
/* 109:149 */     return this.productCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setProductCode(String productCode)
/* 113:    */   {
/* 114:152 */     this.productCode = productCode;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getPromoParams()
/* 118:    */   {
/* 119:156 */     return this.promoParams;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setPromoParams(String promoParams)
/* 123:    */   {
/* 124:159 */     this.promoParams = promoParams;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getSellerId()
/* 128:    */   {
/* 129:163 */     return this.sellerId;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setSellerId(String sellerId)
/* 133:    */   {
/* 134:166 */     this.sellerId = sellerId;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getSubject()
/* 138:    */   {
/* 139:170 */     return this.subject;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setSubject(String subject)
/* 143:    */   {
/* 144:173 */     this.subject = subject;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getTimeoutExpress()
/* 148:    */   {
/* 149:177 */     return this.timeoutExpress;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTimeoutExpress(String timeoutExpress)
/* 153:    */   {
/* 154:180 */     this.timeoutExpress = timeoutExpress;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getTotalAmount()
/* 158:    */   {
/* 159:184 */     return this.totalAmount;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setTotalAmount(String totalAmount)
/* 163:    */   {
/* 164:187 */     this.totalAmount = totalAmount;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeAppPayModel
 * JD-Core Version:    0.7.0.1
 */