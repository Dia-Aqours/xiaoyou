/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayMarketingCampaignDiscountOperateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 4885569994367369734L;
/*  12:    */   @ApiField("camp_code")
/*  13:    */   private String campCode;
/*  14:    */   @ApiField("camp_desc")
/*  15:    */   private String campDesc;
/*  16:    */   @ApiField("camp_id")
/*  17:    */   private String campId;
/*  18:    */   @ApiField("camp_name")
/*  19:    */   private String campName;
/*  20:    */   @ApiField("camp_slogan")
/*  21:    */   private String campSlogan;
/*  22:    */   @ApiField("discount_dst_camp_prize_model")
/*  23:    */   private DiscountDstCampPrizeModel discountDstCampPrizeModel;
/*  24:    */   @ApiField("dst_camp_rule_model")
/*  25:    */   private DstCampRuleModel dstCampRuleModel;
/*  26:    */   @ApiListField("dst_camp_sub_time_model_list")
/*  27:    */   @ApiField("date_area_model")
/*  28:    */   private List<DateAreaModel> dstCampSubTimeModelList;
/*  29:    */   @ApiField("gmt_end")
/*  30:    */   private String gmtEnd;
/*  31:    */   @ApiField("gmt_start")
/*  32:    */   private String gmtStart;
/*  33:    */   @ApiField("operate_type")
/*  34:    */   private String operateType;
/*  35:    */   @ApiField("prize_type")
/*  36:    */   private String prizeType;
/*  37:    */   @ApiField("random_discount_dst_camp_prize_model")
/*  38:    */   private RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel;
/*  39:    */   @ApiField("reduce_dst_camp_prize_model")
/*  40:    */   private ReduceDstCampPrizeModel reduceDstCampPrizeModel;
/*  41:    */   @ApiField("reduce_to_discount_dst_camp_prize_model")
/*  42:    */   private ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel;
/*  43:    */   @ApiField("reset_zero_dst_camp_prize_model")
/*  44:    */   private ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel;
/*  45:    */   @ApiField("single_dst_camp_prize_model")
/*  46:    */   private SingleDstCampPrizeModel singleDstCampPrizeModel;
/*  47:    */   @ApiField("staged_discount_dst_camp_prize_model")
/*  48:    */   private StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel;
/*  49:    */   
/*  50:    */   public String getCampCode()
/*  51:    */   {
/*  52:137 */     return this.campCode;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setCampCode(String campCode)
/*  56:    */   {
/*  57:140 */     this.campCode = campCode;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getCampDesc()
/*  61:    */   {
/*  62:144 */     return this.campDesc;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setCampDesc(String campDesc)
/*  66:    */   {
/*  67:147 */     this.campDesc = campDesc;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getCampId()
/*  71:    */   {
/*  72:151 */     return this.campId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setCampId(String campId)
/*  76:    */   {
/*  77:154 */     this.campId = campId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getCampName()
/*  81:    */   {
/*  82:158 */     return this.campName;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setCampName(String campName)
/*  86:    */   {
/*  87:161 */     this.campName = campName;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getCampSlogan()
/*  91:    */   {
/*  92:165 */     return this.campSlogan;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setCampSlogan(String campSlogan)
/*  96:    */   {
/*  97:168 */     this.campSlogan = campSlogan;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel()
/* 101:    */   {
/* 102:172 */     return this.discountDstCampPrizeModel;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel)
/* 106:    */   {
/* 107:175 */     this.discountDstCampPrizeModel = discountDstCampPrizeModel;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public DstCampRuleModel getDstCampRuleModel()
/* 111:    */   {
/* 112:179 */     return this.dstCampRuleModel;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setDstCampRuleModel(DstCampRuleModel dstCampRuleModel)
/* 116:    */   {
/* 117:182 */     this.dstCampRuleModel = dstCampRuleModel;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public List<DateAreaModel> getDstCampSubTimeModelList()
/* 121:    */   {
/* 122:186 */     return this.dstCampSubTimeModelList;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setDstCampSubTimeModelList(List<DateAreaModel> dstCampSubTimeModelList)
/* 126:    */   {
/* 127:189 */     this.dstCampSubTimeModelList = dstCampSubTimeModelList;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getGmtEnd()
/* 131:    */   {
/* 132:193 */     return this.gmtEnd;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setGmtEnd(String gmtEnd)
/* 136:    */   {
/* 137:196 */     this.gmtEnd = gmtEnd;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getGmtStart()
/* 141:    */   {
/* 142:200 */     return this.gmtStart;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setGmtStart(String gmtStart)
/* 146:    */   {
/* 147:203 */     this.gmtStart = gmtStart;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getOperateType()
/* 151:    */   {
/* 152:207 */     return this.operateType;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setOperateType(String operateType)
/* 156:    */   {
/* 157:210 */     this.operateType = operateType;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getPrizeType()
/* 161:    */   {
/* 162:214 */     return this.prizeType;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setPrizeType(String prizeType)
/* 166:    */   {
/* 167:217 */     this.prizeType = prizeType;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public RandomDiscountDstCampPrizeModel getRandomDiscountDstCampPrizeModel()
/* 171:    */   {
/* 172:221 */     return this.randomDiscountDstCampPrizeModel;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setRandomDiscountDstCampPrizeModel(RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel)
/* 176:    */   {
/* 177:224 */     this.randomDiscountDstCampPrizeModel = randomDiscountDstCampPrizeModel;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public ReduceDstCampPrizeModel getReduceDstCampPrizeModel()
/* 181:    */   {
/* 182:228 */     return this.reduceDstCampPrizeModel;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel)
/* 186:    */   {
/* 187:231 */     this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public ReduceToDiscountDstCampPrizeModel getReduceToDiscountDstCampPrizeModel()
/* 191:    */   {
/* 192:235 */     return this.reduceToDiscountDstCampPrizeModel;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setReduceToDiscountDstCampPrizeModel(ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel)
/* 196:    */   {
/* 197:238 */     this.reduceToDiscountDstCampPrizeModel = reduceToDiscountDstCampPrizeModel;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public ResetZeroDstCampPrizeModel getResetZeroDstCampPrizeModel()
/* 201:    */   {
/* 202:242 */     return this.resetZeroDstCampPrizeModel;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setResetZeroDstCampPrizeModel(ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel)
/* 206:    */   {
/* 207:245 */     this.resetZeroDstCampPrizeModel = resetZeroDstCampPrizeModel;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public SingleDstCampPrizeModel getSingleDstCampPrizeModel()
/* 211:    */   {
/* 212:249 */     return this.singleDstCampPrizeModel;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel)
/* 216:    */   {
/* 217:252 */     this.singleDstCampPrizeModel = singleDstCampPrizeModel;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public StagedDiscountDstCampPrizeModel getStagedDiscountDstCampPrizeModel()
/* 221:    */   {
/* 222:256 */     return this.stagedDiscountDstCampPrizeModel;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setStagedDiscountDstCampPrizeModel(StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel)
/* 226:    */   {
/* 227:259 */     this.stagedDiscountDstCampPrizeModel = stagedDiscountDstCampPrizeModel;
/* 228:    */   }
/* 229:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDiscountOperateModel
 * JD-Core Version:    0.7.0.1
 */