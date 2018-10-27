/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class OpenPromoPrize
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2892733951671437565L;
/*  12:    */   @ApiField("prize_base_rule_amount")
/*  13:    */   private String prizeBaseRuleAmount;
/*  14:    */   @ApiListField("prize_custom_menu")
/*  15:    */   @ApiField("prize_custom_menu")
/*  16:    */   private List<PrizeCustomMenu> prizeCustomMenu;
/*  17:    */   @ApiField("prize_desc")
/*  18:    */   private String prizeDesc;
/*  19:    */   @ApiField("prize_detail_img")
/*  20:    */   private String prizeDetailImg;
/*  21:    */   @ApiListField("prize_dimension_time")
/*  22:    */   @ApiField("open_promo_prize_dimension")
/*  23:    */   private List<OpenPromoPrizeDimension> prizeDimensionTime;
/*  24:    */   @ApiField("prize_end_time")
/*  25:    */   private String prizeEndTime;
/*  26:    */   @ApiField("prize_logo")
/*  27:    */   private String prizeLogo;
/*  28:    */   @ApiField("prize_name")
/*  29:    */   private String prizeName;
/*  30:    */   @ApiField("prize_relative_time")
/*  31:    */   private OpenPromoPrizeRelativeTime prizeRelativeTime;
/*  32:    */   @ApiField("prize_start_time")
/*  33:    */   private String prizeStartTime;
/*  34:    */   @ApiField("prize_subtitle")
/*  35:    */   private String prizeSubtitle;
/*  36:    */   @ApiListField("prize_suitable_shops")
/*  37:    */   @ApiField("string")
/*  38:    */   private List<String> prizeSuitableShops;
/*  39:    */   @ApiField("prize_template_end_time")
/*  40:    */   private String prizeTemplateEndTime;
/*  41:    */   @ApiField("prize_template_start_time")
/*  42:    */   private String prizeTemplateStartTime;
/*  43:    */   @ApiListField("prize_terms")
/*  44:    */   @ApiField("string")
/*  45:    */   private List<String> prizeTerms;
/*  46:    */   @ApiField("prize_type")
/*  47:    */   private String prizeType;
/*  48:    */   @ApiField("prize_worth_amount")
/*  49:    */   private String prizeWorthAmount;
/*  50:    */   
/*  51:    */   public String getPrizeBaseRuleAmount()
/*  52:    */   {
/*  53:126 */     return this.prizeBaseRuleAmount;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setPrizeBaseRuleAmount(String prizeBaseRuleAmount)
/*  57:    */   {
/*  58:129 */     this.prizeBaseRuleAmount = prizeBaseRuleAmount;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public List<PrizeCustomMenu> getPrizeCustomMenu()
/*  62:    */   {
/*  63:133 */     return this.prizeCustomMenu;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setPrizeCustomMenu(List<PrizeCustomMenu> prizeCustomMenu)
/*  67:    */   {
/*  68:136 */     this.prizeCustomMenu = prizeCustomMenu;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getPrizeDesc()
/*  72:    */   {
/*  73:140 */     return this.prizeDesc;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setPrizeDesc(String prizeDesc)
/*  77:    */   {
/*  78:143 */     this.prizeDesc = prizeDesc;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getPrizeDetailImg()
/*  82:    */   {
/*  83:147 */     return this.prizeDetailImg;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setPrizeDetailImg(String prizeDetailImg)
/*  87:    */   {
/*  88:150 */     this.prizeDetailImg = prizeDetailImg;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public List<OpenPromoPrizeDimension> getPrizeDimensionTime()
/*  92:    */   {
/*  93:154 */     return this.prizeDimensionTime;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setPrizeDimensionTime(List<OpenPromoPrizeDimension> prizeDimensionTime)
/*  97:    */   {
/*  98:157 */     this.prizeDimensionTime = prizeDimensionTime;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getPrizeEndTime()
/* 102:    */   {
/* 103:161 */     return this.prizeEndTime;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setPrizeEndTime(String prizeEndTime)
/* 107:    */   {
/* 108:164 */     this.prizeEndTime = prizeEndTime;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getPrizeLogo()
/* 112:    */   {
/* 113:168 */     return this.prizeLogo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setPrizeLogo(String prizeLogo)
/* 117:    */   {
/* 118:171 */     this.prizeLogo = prizeLogo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getPrizeName()
/* 122:    */   {
/* 123:175 */     return this.prizeName;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setPrizeName(String prizeName)
/* 127:    */   {
/* 128:178 */     this.prizeName = prizeName;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public OpenPromoPrizeRelativeTime getPrizeRelativeTime()
/* 132:    */   {
/* 133:182 */     return this.prizeRelativeTime;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setPrizeRelativeTime(OpenPromoPrizeRelativeTime prizeRelativeTime)
/* 137:    */   {
/* 138:185 */     this.prizeRelativeTime = prizeRelativeTime;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getPrizeStartTime()
/* 142:    */   {
/* 143:189 */     return this.prizeStartTime;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setPrizeStartTime(String prizeStartTime)
/* 147:    */   {
/* 148:192 */     this.prizeStartTime = prizeStartTime;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getPrizeSubtitle()
/* 152:    */   {
/* 153:196 */     return this.prizeSubtitle;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setPrizeSubtitle(String prizeSubtitle)
/* 157:    */   {
/* 158:199 */     this.prizeSubtitle = prizeSubtitle;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public List<String> getPrizeSuitableShops()
/* 162:    */   {
/* 163:203 */     return this.prizeSuitableShops;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setPrizeSuitableShops(List<String> prizeSuitableShops)
/* 167:    */   {
/* 168:206 */     this.prizeSuitableShops = prizeSuitableShops;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getPrizeTemplateEndTime()
/* 172:    */   {
/* 173:210 */     return this.prizeTemplateEndTime;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setPrizeTemplateEndTime(String prizeTemplateEndTime)
/* 177:    */   {
/* 178:213 */     this.prizeTemplateEndTime = prizeTemplateEndTime;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getPrizeTemplateStartTime()
/* 182:    */   {
/* 183:217 */     return this.prizeTemplateStartTime;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setPrizeTemplateStartTime(String prizeTemplateStartTime)
/* 187:    */   {
/* 188:220 */     this.prizeTemplateStartTime = prizeTemplateStartTime;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public List<String> getPrizeTerms()
/* 192:    */   {
/* 193:224 */     return this.prizeTerms;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setPrizeTerms(List<String> prizeTerms)
/* 197:    */   {
/* 198:227 */     this.prizeTerms = prizeTerms;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String getPrizeType()
/* 202:    */   {
/* 203:231 */     return this.prizeType;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setPrizeType(String prizeType)
/* 207:    */   {
/* 208:234 */     this.prizeType = prizeType;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getPrizeWorthAmount()
/* 212:    */   {
/* 213:238 */     return this.prizeWorthAmount;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void setPrizeWorthAmount(String prizeWorthAmount)
/* 217:    */   {
/* 218:241 */     this.prizeWorthAmount = prizeWorthAmount;
/* 219:    */   }
/* 220:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenPromoPrize
 * JD-Core Version:    0.7.0.1
 */