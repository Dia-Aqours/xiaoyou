/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayItemVoucherTemplete
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2127725166629591575L;
/*  12:    */   @ApiField("delay_minute")
/*  13:    */   private Long delayMinute;
/*  14:    */   @ApiListField("desc_details")
/*  15:    */   @ApiField("alipay_item_description")
/*  16:    */   private List<AlipayItemDescription> descDetails;
/*  17:    */   @ApiField("discount_rate")
/*  18:    */   private Long discountRate;
/*  19:    */   @ApiField("external_goods_list")
/*  20:    */   private AlipayItemGoodsList externalGoodsList;
/*  21:    */   @ApiListField("limit_period_info_list")
/*  22:    */   @ApiField("alipay_item_limit_period_info")
/*  23:    */   private List<AlipayItemLimitPeriodInfo> limitPeriodInfoList;
/*  24:    */   @ApiField("original_amount")
/*  25:    */   private Long originalAmount;
/*  26:    */   @ApiField("original_rate")
/*  27:    */   private Long originalRate;
/*  28:    */   @ApiField("reduce_to_amount")
/*  29:    */   private Long reduceToAmount;
/*  30:    */   @ApiField("rounding_rule")
/*  31:    */   private String roundingRule;
/*  32:    */   @ApiField("threshold_amount")
/*  33:    */   private Long thresholdAmount;
/*  34:    */   @ApiField("threshold_quantity")
/*  35:    */   private Long thresholdQuantity;
/*  36:    */   @ApiField("valid_period")
/*  37:    */   private Long validPeriod;
/*  38:    */   @ApiField("value_amount")
/*  39:    */   private Long valueAmount;
/*  40:    */   @ApiField("voucher_desc")
/*  41:    */   private String voucherDesc;
/*  42:    */   @ApiField("voucher_type")
/*  43:    */   private String voucherType;
/*  44:    */   
/*  45:    */   public Long getDelayMinute()
/*  46:    */   {
/*  47:123 */     return this.delayMinute;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setDelayMinute(Long delayMinute)
/*  51:    */   {
/*  52:126 */     this.delayMinute = delayMinute;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public List<AlipayItemDescription> getDescDetails()
/*  56:    */   {
/*  57:130 */     return this.descDetails;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setDescDetails(List<AlipayItemDescription> descDetails)
/*  61:    */   {
/*  62:133 */     this.descDetails = descDetails;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public Long getDiscountRate()
/*  66:    */   {
/*  67:137 */     return this.discountRate;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setDiscountRate(Long discountRate)
/*  71:    */   {
/*  72:140 */     this.discountRate = discountRate;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public AlipayItemGoodsList getExternalGoodsList()
/*  76:    */   {
/*  77:144 */     return this.externalGoodsList;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setExternalGoodsList(AlipayItemGoodsList externalGoodsList)
/*  81:    */   {
/*  82:147 */     this.externalGoodsList = externalGoodsList;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public List<AlipayItemLimitPeriodInfo> getLimitPeriodInfoList()
/*  86:    */   {
/*  87:151 */     return this.limitPeriodInfoList;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setLimitPeriodInfoList(List<AlipayItemLimitPeriodInfo> limitPeriodInfoList)
/*  91:    */   {
/*  92:154 */     this.limitPeriodInfoList = limitPeriodInfoList;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Long getOriginalAmount()
/*  96:    */   {
/*  97:158 */     return this.originalAmount;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setOriginalAmount(Long originalAmount)
/* 101:    */   {
/* 102:161 */     this.originalAmount = originalAmount;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public Long getOriginalRate()
/* 106:    */   {
/* 107:165 */     return this.originalRate;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setOriginalRate(Long originalRate)
/* 111:    */   {
/* 112:168 */     this.originalRate = originalRate;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Long getReduceToAmount()
/* 116:    */   {
/* 117:172 */     return this.reduceToAmount;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setReduceToAmount(Long reduceToAmount)
/* 121:    */   {
/* 122:175 */     this.reduceToAmount = reduceToAmount;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getRoundingRule()
/* 126:    */   {
/* 127:179 */     return this.roundingRule;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setRoundingRule(String roundingRule)
/* 131:    */   {
/* 132:182 */     this.roundingRule = roundingRule;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public Long getThresholdAmount()
/* 136:    */   {
/* 137:186 */     return this.thresholdAmount;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setThresholdAmount(Long thresholdAmount)
/* 141:    */   {
/* 142:189 */     this.thresholdAmount = thresholdAmount;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public Long getThresholdQuantity()
/* 146:    */   {
/* 147:193 */     return this.thresholdQuantity;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setThresholdQuantity(Long thresholdQuantity)
/* 151:    */   {
/* 152:196 */     this.thresholdQuantity = thresholdQuantity;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public Long getValidPeriod()
/* 156:    */   {
/* 157:200 */     return this.validPeriod;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setValidPeriod(Long validPeriod)
/* 161:    */   {
/* 162:203 */     this.validPeriod = validPeriod;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Long getValueAmount()
/* 166:    */   {
/* 167:207 */     return this.valueAmount;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setValueAmount(Long valueAmount)
/* 171:    */   {
/* 172:210 */     this.valueAmount = valueAmount;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getVoucherDesc()
/* 176:    */   {
/* 177:214 */     return this.voucherDesc;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setVoucherDesc(String voucherDesc)
/* 181:    */   {
/* 182:217 */     this.voucherDesc = voucherDesc;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getVoucherType()
/* 186:    */   {
/* 187:221 */     return this.voucherType;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setVoucherType(String voucherType)
/* 191:    */   {
/* 192:224 */     this.voucherType = voucherType;
/* 193:    */   }
/* 194:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayItemVoucherTemplete
 * JD-Core Version:    0.7.0.1
 */