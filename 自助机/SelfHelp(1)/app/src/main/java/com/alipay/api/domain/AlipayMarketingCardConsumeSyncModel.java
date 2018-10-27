/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayMarketingCardConsumeSyncModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 8245158598735568375L;
/*  13:    */   @ApiField("act_pay_amount")
/*  14:    */   private String actPayAmount;
/*  15:    */   @ApiField("card_info")
/*  16:    */   private MerchantCard cardInfo;
/*  17:    */   @ApiListField("gain_benefit_list")
/*  18:    */   @ApiField("benefit_info_detail")
/*  19:    */   private List<BenefitInfoDetail> gainBenefitList;
/*  20:    */   @ApiField("memo")
/*  21:    */   private String memo;
/*  22:    */   @ApiField("shop_code")
/*  23:    */   private String shopCode;
/*  24:    */   @ApiField("swipe_cert_type")
/*  25:    */   private String swipeCertType;
/*  26:    */   @ApiField("target_card_no")
/*  27:    */   private String targetCardNo;
/*  28:    */   @ApiField("target_card_no_type")
/*  29:    */   private String targetCardNoType;
/*  30:    */   @ApiField("trade_amount")
/*  31:    */   private String tradeAmount;
/*  32:    */   @ApiField("trade_name")
/*  33:    */   private String tradeName;
/*  34:    */   @ApiField("trade_no")
/*  35:    */   private String tradeNo;
/*  36:    */   @ApiField("trade_time")
/*  37:    */   private Date tradeTime;
/*  38:    */   @ApiField("trade_type")
/*  39:    */   private String tradeType;
/*  40:    */   @ApiListField("use_benefit_list")
/*  41:    */   @ApiField("benefit_info_detail")
/*  42:    */   private List<BenefitInfoDetail> useBenefitList;
/*  43:    */   
/*  44:    */   public String getActPayAmount()
/*  45:    */   {
/*  46:119 */     return this.actPayAmount;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setActPayAmount(String actPayAmount)
/*  50:    */   {
/*  51:122 */     this.actPayAmount = actPayAmount;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public MerchantCard getCardInfo()
/*  55:    */   {
/*  56:126 */     return this.cardInfo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setCardInfo(MerchantCard cardInfo)
/*  60:    */   {
/*  61:129 */     this.cardInfo = cardInfo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public List<BenefitInfoDetail> getGainBenefitList()
/*  65:    */   {
/*  66:133 */     return this.gainBenefitList;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setGainBenefitList(List<BenefitInfoDetail> gainBenefitList)
/*  70:    */   {
/*  71:136 */     this.gainBenefitList = gainBenefitList;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getMemo()
/*  75:    */   {
/*  76:140 */     return this.memo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setMemo(String memo)
/*  80:    */   {
/*  81:143 */     this.memo = memo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getShopCode()
/*  85:    */   {
/*  86:147 */     return this.shopCode;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setShopCode(String shopCode)
/*  90:    */   {
/*  91:150 */     this.shopCode = shopCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getSwipeCertType()
/*  95:    */   {
/*  96:154 */     return this.swipeCertType;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setSwipeCertType(String swipeCertType)
/* 100:    */   {
/* 101:157 */     this.swipeCertType = swipeCertType;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getTargetCardNo()
/* 105:    */   {
/* 106:161 */     return this.targetCardNo;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setTargetCardNo(String targetCardNo)
/* 110:    */   {
/* 111:164 */     this.targetCardNo = targetCardNo;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getTargetCardNoType()
/* 115:    */   {
/* 116:168 */     return this.targetCardNoType;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTargetCardNoType(String targetCardNoType)
/* 120:    */   {
/* 121:171 */     this.targetCardNoType = targetCardNoType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTradeAmount()
/* 125:    */   {
/* 126:175 */     return this.tradeAmount;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTradeAmount(String tradeAmount)
/* 130:    */   {
/* 131:178 */     this.tradeAmount = tradeAmount;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTradeName()
/* 135:    */   {
/* 136:182 */     return this.tradeName;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setTradeName(String tradeName)
/* 140:    */   {
/* 141:185 */     this.tradeName = tradeName;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getTradeNo()
/* 145:    */   {
/* 146:189 */     return this.tradeNo;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setTradeNo(String tradeNo)
/* 150:    */   {
/* 151:192 */     this.tradeNo = tradeNo;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Date getTradeTime()
/* 155:    */   {
/* 156:196 */     return this.tradeTime;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setTradeTime(Date tradeTime)
/* 160:    */   {
/* 161:199 */     this.tradeTime = tradeTime;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getTradeType()
/* 165:    */   {
/* 166:203 */     return this.tradeType;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setTradeType(String tradeType)
/* 170:    */   {
/* 171:206 */     this.tradeType = tradeType;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public List<BenefitInfoDetail> getUseBenefitList()
/* 175:    */   {
/* 176:210 */     return this.useBenefitList;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setUseBenefitList(List<BenefitInfoDetail> useBenefitList)
/* 180:    */   {
/* 181:213 */     this.useBenefitList = useBenefitList;
/* 182:    */   }
/* 183:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardConsumeSyncModel
 * JD-Core Version:    0.7.0.1
 */