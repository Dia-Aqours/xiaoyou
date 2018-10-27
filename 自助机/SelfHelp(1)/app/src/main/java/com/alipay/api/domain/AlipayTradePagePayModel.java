/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayTradePagePayModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5837244981937539354L;
/*  12:    */   @ApiField("body")
/*  13:    */   private String body;
/*  14:    */   @ApiField("disable_pay_channels")
/*  15:    */   private String disablePayChannels;
/*  16:    */   @ApiField("enable_pay_channels")
/*  17:    */   private String enablePayChannels;
/*  18:    */   @ApiField("extend_params")
/*  19:    */   private ExtendParams extendParams;
/*  20:    */   @ApiListField("goods_detail")
/*  21:    */   @ApiField("goods_detail")
/*  22:    */   private List<GoodsDetail> goodsDetail;
/*  23:    */   @ApiField("goods_type")
/*  24:    */   private String goodsType;
/*  25:    */   @ApiField("out_trade_no")
/*  26:    */   private String outTradeNo;
/*  27:    */   @ApiField("passback_params")
/*  28:    */   private String passbackParams;
/*  29:    */   @ApiField("product_code")
/*  30:    */   private String productCode;
/*  31:    */   @ApiField("promo_params")
/*  32:    */   private String promoParams;
/*  33:    */   @ApiField("subject")
/*  34:    */   private String subject;
/*  35:    */   @ApiField("timeout_express")
/*  36:    */   private String timeoutExpress;
/*  37:    */   @ApiField("total_amount")
/*  38:    */   private String totalAmount;
/*  39:    */   
/*  40:    */   public String getBody()
/*  41:    */   {
/*  42:104 */     return this.body;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setBody(String body)
/*  46:    */   {
/*  47:107 */     this.body = body;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getDisablePayChannels()
/*  51:    */   {
/*  52:111 */     return this.disablePayChannels;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setDisablePayChannels(String disablePayChannels)
/*  56:    */   {
/*  57:114 */     this.disablePayChannels = disablePayChannels;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getEnablePayChannels()
/*  61:    */   {
/*  62:118 */     return this.enablePayChannels;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setEnablePayChannels(String enablePayChannels)
/*  66:    */   {
/*  67:121 */     this.enablePayChannels = enablePayChannels;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public ExtendParams getExtendParams()
/*  71:    */   {
/*  72:125 */     return this.extendParams;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setExtendParams(ExtendParams extendParams)
/*  76:    */   {
/*  77:128 */     this.extendParams = extendParams;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public List<GoodsDetail> getGoodsDetail()
/*  81:    */   {
/*  82:132 */     return this.goodsDetail;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setGoodsDetail(List<GoodsDetail> goodsDetail)
/*  86:    */   {
/*  87:135 */     this.goodsDetail = goodsDetail;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getGoodsType()
/*  91:    */   {
/*  92:139 */     return this.goodsType;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setGoodsType(String goodsType)
/*  96:    */   {
/*  97:142 */     this.goodsType = goodsType;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getOutTradeNo()
/* 101:    */   {
/* 102:146 */     return this.outTradeNo;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setOutTradeNo(String outTradeNo)
/* 106:    */   {
/* 107:149 */     this.outTradeNo = outTradeNo;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getPassbackParams()
/* 111:    */   {
/* 112:153 */     return this.passbackParams;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setPassbackParams(String passbackParams)
/* 116:    */   {
/* 117:156 */     this.passbackParams = passbackParams;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getProductCode()
/* 121:    */   {
/* 122:160 */     return this.productCode;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setProductCode(String productCode)
/* 126:    */   {
/* 127:163 */     this.productCode = productCode;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getPromoParams()
/* 131:    */   {
/* 132:167 */     return this.promoParams;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setPromoParams(String promoParams)
/* 136:    */   {
/* 137:170 */     this.promoParams = promoParams;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getSubject()
/* 141:    */   {
/* 142:174 */     return this.subject;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setSubject(String subject)
/* 146:    */   {
/* 147:177 */     this.subject = subject;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getTimeoutExpress()
/* 151:    */   {
/* 152:181 */     return this.timeoutExpress;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setTimeoutExpress(String timeoutExpress)
/* 156:    */   {
/* 157:184 */     this.timeoutExpress = timeoutExpress;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getTotalAmount()
/* 161:    */   {
/* 162:188 */     return this.totalAmount;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setTotalAmount(String totalAmount)
/* 166:    */   {
/* 167:191 */     this.totalAmount = totalAmount;
/* 168:    */   }
/* 169:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradePagePayModel
 * JD-Core Version:    0.7.0.1
 */