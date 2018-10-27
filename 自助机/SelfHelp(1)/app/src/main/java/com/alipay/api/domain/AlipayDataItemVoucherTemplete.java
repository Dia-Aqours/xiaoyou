/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayDataItemVoucherTemplete
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2682554191128787119L;
/*  12:    */   @ApiField("delay_minute")
/*  13:    */   private Long delayMinute;
/*  14:    */   @ApiListField("desc_details")
/*  15:    */   @ApiField("alipay_data_item_description")
/*  16:    */   private List<AlipayDataItemDescription> descDetails;
/*  17:    */   @ApiField("discount_rate")
/*  18:    */   private String discountRate;
/*  19:    */   @ApiField("external_goods_list")
/*  20:    */   private AlipayDataItemGoodsList externalGoodsList;
/*  21:    */   @ApiField("limit_period_info_list")
/*  22:    */   private AlipayDataItemLimitPeriodInfo limitPeriodInfoList;
/*  23:    */   @ApiField("original_amount")
/*  24:    */   private String originalAmount;
/*  25:    */   @ApiField("original_rate")
/*  26:    */   private String originalRate;
/*  27:    */   @ApiField("reduce_to_amount")
/*  28:    */   private String reduceToAmount;
/*  29:    */   @ApiField("rounding_rule")
/*  30:    */   private String roundingRule;
/*  31:    */   @ApiField("threshold_amount")
/*  32:    */   private String thresholdAmount;
/*  33:    */   @ApiField("threshold_quantity")
/*  34:    */   private String thresholdQuantity;
/*  35:    */   @ApiField("valid_period")
/*  36:    */   private Long validPeriod;
/*  37:    */   @ApiField("value_amount")
/*  38:    */   private String valueAmount;
/*  39:    */   @ApiField("voucher_desc")
/*  40:    */   private String voucherDesc;
/*  41:    */   @ApiField("voucher_type")
/*  42:    */   private String voucherType;
/*  43:    */   
/*  44:    */   public Long getDelayMinute()
/*  45:    */   {
/*  46:113 */     return this.delayMinute;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setDelayMinute(Long delayMinute)
/*  50:    */   {
/*  51:116 */     this.delayMinute = delayMinute;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public List<AlipayDataItemDescription> getDescDetails()
/*  55:    */   {
/*  56:120 */     return this.descDetails;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setDescDetails(List<AlipayDataItemDescription> descDetails)
/*  60:    */   {
/*  61:123 */     this.descDetails = descDetails;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getDiscountRate()
/*  65:    */   {
/*  66:127 */     return this.discountRate;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setDiscountRate(String discountRate)
/*  70:    */   {
/*  71:130 */     this.discountRate = discountRate;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public AlipayDataItemGoodsList getExternalGoodsList()
/*  75:    */   {
/*  76:134 */     return this.externalGoodsList;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setExternalGoodsList(AlipayDataItemGoodsList externalGoodsList)
/*  80:    */   {
/*  81:137 */     this.externalGoodsList = externalGoodsList;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public AlipayDataItemLimitPeriodInfo getLimitPeriodInfoList()
/*  85:    */   {
/*  86:141 */     return this.limitPeriodInfoList;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setLimitPeriodInfoList(AlipayDataItemLimitPeriodInfo limitPeriodInfoList)
/*  90:    */   {
/*  91:144 */     this.limitPeriodInfoList = limitPeriodInfoList;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getOriginalAmount()
/*  95:    */   {
/*  96:148 */     return this.originalAmount;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setOriginalAmount(String originalAmount)
/* 100:    */   {
/* 101:151 */     this.originalAmount = originalAmount;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getOriginalRate()
/* 105:    */   {
/* 106:155 */     return this.originalRate;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setOriginalRate(String originalRate)
/* 110:    */   {
/* 111:158 */     this.originalRate = originalRate;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getReduceToAmount()
/* 115:    */   {
/* 116:162 */     return this.reduceToAmount;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setReduceToAmount(String reduceToAmount)
/* 120:    */   {
/* 121:165 */     this.reduceToAmount = reduceToAmount;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getRoundingRule()
/* 125:    */   {
/* 126:169 */     return this.roundingRule;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setRoundingRule(String roundingRule)
/* 130:    */   {
/* 131:172 */     this.roundingRule = roundingRule;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getThresholdAmount()
/* 135:    */   {
/* 136:176 */     return this.thresholdAmount;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setThresholdAmount(String thresholdAmount)
/* 140:    */   {
/* 141:179 */     this.thresholdAmount = thresholdAmount;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getThresholdQuantity()
/* 145:    */   {
/* 146:183 */     return this.thresholdQuantity;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setThresholdQuantity(String thresholdQuantity)
/* 150:    */   {
/* 151:186 */     this.thresholdQuantity = thresholdQuantity;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Long getValidPeriod()
/* 155:    */   {
/* 156:190 */     return this.validPeriod;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setValidPeriod(Long validPeriod)
/* 160:    */   {
/* 161:193 */     this.validPeriod = validPeriod;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getValueAmount()
/* 165:    */   {
/* 166:197 */     return this.valueAmount;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setValueAmount(String valueAmount)
/* 170:    */   {
/* 171:200 */     this.valueAmount = valueAmount;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getVoucherDesc()
/* 175:    */   {
/* 176:204 */     return this.voucherDesc;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setVoucherDesc(String voucherDesc)
/* 180:    */   {
/* 181:207 */     this.voucherDesc = voucherDesc;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getVoucherType()
/* 185:    */   {
/* 186:211 */     return this.voucherType;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setVoucherType(String voucherType)
/* 190:    */   {
/* 191:214 */     this.voucherType = voucherType;
/* 192:    */   }
/* 193:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataItemVoucherTemplete
 * JD-Core Version:    0.7.0.1
 */