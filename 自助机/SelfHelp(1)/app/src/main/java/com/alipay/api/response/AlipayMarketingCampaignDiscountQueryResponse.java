/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.DateAreaModel;
/*   5:    */ import com.alipay.api.domain.DiscountDstCampPrizeModel;
/*   6:    */ import com.alipay.api.domain.DstCampRuleModel;
/*   7:    */ import com.alipay.api.domain.RandomDiscountDstCampPrizeModel;
/*   8:    */ import com.alipay.api.domain.ReduceDstCampPrizeModel;
/*   9:    */ import com.alipay.api.domain.ReduceToDiscountDstCampPrizeModel;
/*  10:    */ import com.alipay.api.domain.ResetZeroDstCampPrizeModel;
/*  11:    */ import com.alipay.api.domain.SingleDstCampPrizeModel;
/*  12:    */ import com.alipay.api.domain.StagedDiscountDstCampPrizeModel;
/*  13:    */ import com.alipay.api.internal.mapping.ApiField;
/*  14:    */ import com.alipay.api.internal.mapping.ApiListField;
/*  15:    */ import java.util.List;

/*  16:    */
/*  17:    */ public class AlipayMarketingCampaignDiscountQueryResponse
/*  18:    */   extends AlipayResponse
/*  19:    */ {
/*  20:    */   private static final long serialVersionUID = 1353243215371121649L;
/*  21:    */   @ApiField("camp_code")
/*  22:    */   private String campCode;
/*  23:    */   @ApiField("camp_desc")
/*  24:    */   private String campDesc;
/*  25:    */   @ApiField("camp_id")
/*  26:    */   private String campId;
/*  27:    */   @ApiField("camp_name")
/*  28:    */   private String campName;
/*  29:    */   @ApiField("camp_slogan")
/*  30:    */   private String campSlogan;
/*  31:    */   @ApiField("camp_status")
/*  32:    */   private String campStatus;
/*  33:    */   @ApiField("discount_dst_camp_prize_model")
/*  34:    */   private DiscountDstCampPrizeModel discountDstCampPrizeModel;
/*  35:    */   @ApiField("dst_camp_rule_model")
/*  36:    */   private DstCampRuleModel dstCampRuleModel;
/*  37:    */   @ApiListField("dst_camp_sub_time_model_list")
/*  38:    */   @ApiField("date_area_model")
/*  39:    */   private List<DateAreaModel> dstCampSubTimeModelList;
/*  40:    */   @ApiField("gmt_end")
/*  41:    */   private String gmtEnd;
/*  42:    */   @ApiField("gmt_start")
/*  43:    */   private String gmtStart;
/*  44:    */   @ApiField("prize_type")
/*  45:    */   private String prizeType;
/*  46:    */   @ApiField("random_discount_dst_camp_prize_model")
/*  47:    */   private RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel;
/*  48:    */   @ApiField("reduce_dst_camp_prize_model")
/*  49:    */   private ReduceDstCampPrizeModel reduceDstCampPrizeModel;
/*  50:    */   @ApiField("reduce_to_discount_dst_camp_prize_model")
/*  51:    */   private ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel;
/*  52:    */   @ApiField("reset_zero_dst_camp_prize_model")
/*  53:    */   private ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel;
/*  54:    */   @ApiField("single_dst_camp_prize_model")
/*  55:    */   private SingleDstCampPrizeModel singleDstCampPrizeModel;
/*  56:    */   @ApiField("staged_discount_dst_camp_prize_model")
/*  57:    */   private StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel;
/*  58:    */   
/*  59:    */   public void setCampCode(String campCode)
/*  60:    */   {
/*  61:146 */     this.campCode = campCode;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getCampCode()
/*  65:    */   {
/*  66:149 */     return this.campCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setCampDesc(String campDesc)
/*  70:    */   {
/*  71:153 */     this.campDesc = campDesc;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getCampDesc()
/*  75:    */   {
/*  76:156 */     return this.campDesc;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setCampId(String campId)
/*  80:    */   {
/*  81:160 */     this.campId = campId;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getCampId()
/*  85:    */   {
/*  86:163 */     return this.campId;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setCampName(String campName)
/*  90:    */   {
/*  91:167 */     this.campName = campName;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getCampName()
/*  95:    */   {
/*  96:170 */     return this.campName;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setCampSlogan(String campSlogan)
/* 100:    */   {
/* 101:174 */     this.campSlogan = campSlogan;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getCampSlogan()
/* 105:    */   {
/* 106:177 */     return this.campSlogan;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setCampStatus(String campStatus)
/* 110:    */   {
/* 111:181 */     this.campStatus = campStatus;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getCampStatus()
/* 115:    */   {
/* 116:184 */     return this.campStatus;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel)
/* 120:    */   {
/* 121:188 */     this.discountDstCampPrizeModel = discountDstCampPrizeModel;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel()
/* 125:    */   {
/* 126:191 */     return this.discountDstCampPrizeModel;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setDstCampRuleModel(DstCampRuleModel dstCampRuleModel)
/* 130:    */   {
/* 131:195 */     this.dstCampRuleModel = dstCampRuleModel;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public DstCampRuleModel getDstCampRuleModel()
/* 135:    */   {
/* 136:198 */     return this.dstCampRuleModel;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setDstCampSubTimeModelList(List<DateAreaModel> dstCampSubTimeModelList)
/* 140:    */   {
/* 141:202 */     this.dstCampSubTimeModelList = dstCampSubTimeModelList;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public List<DateAreaModel> getDstCampSubTimeModelList()
/* 145:    */   {
/* 146:205 */     return this.dstCampSubTimeModelList;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setGmtEnd(String gmtEnd)
/* 150:    */   {
/* 151:209 */     this.gmtEnd = gmtEnd;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getGmtEnd()
/* 155:    */   {
/* 156:212 */     return this.gmtEnd;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setGmtStart(String gmtStart)
/* 160:    */   {
/* 161:216 */     this.gmtStart = gmtStart;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getGmtStart()
/* 165:    */   {
/* 166:219 */     return this.gmtStart;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setPrizeType(String prizeType)
/* 170:    */   {
/* 171:223 */     this.prizeType = prizeType;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getPrizeType()
/* 175:    */   {
/* 176:226 */     return this.prizeType;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setRandomDiscountDstCampPrizeModel(RandomDiscountDstCampPrizeModel randomDiscountDstCampPrizeModel)
/* 180:    */   {
/* 181:230 */     this.randomDiscountDstCampPrizeModel = randomDiscountDstCampPrizeModel;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public RandomDiscountDstCampPrizeModel getRandomDiscountDstCampPrizeModel()
/* 185:    */   {
/* 186:233 */     return this.randomDiscountDstCampPrizeModel;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel)
/* 190:    */   {
/* 191:237 */     this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public ReduceDstCampPrizeModel getReduceDstCampPrizeModel()
/* 195:    */   {
/* 196:240 */     return this.reduceDstCampPrizeModel;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setReduceToDiscountDstCampPrizeModel(ReduceToDiscountDstCampPrizeModel reduceToDiscountDstCampPrizeModel)
/* 200:    */   {
/* 201:244 */     this.reduceToDiscountDstCampPrizeModel = reduceToDiscountDstCampPrizeModel;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public ReduceToDiscountDstCampPrizeModel getReduceToDiscountDstCampPrizeModel()
/* 205:    */   {
/* 206:247 */     return this.reduceToDiscountDstCampPrizeModel;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setResetZeroDstCampPrizeModel(ResetZeroDstCampPrizeModel resetZeroDstCampPrizeModel)
/* 210:    */   {
/* 211:251 */     this.resetZeroDstCampPrizeModel = resetZeroDstCampPrizeModel;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public ResetZeroDstCampPrizeModel getResetZeroDstCampPrizeModel()
/* 215:    */   {
/* 216:254 */     return this.resetZeroDstCampPrizeModel;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel)
/* 220:    */   {
/* 221:258 */     this.singleDstCampPrizeModel = singleDstCampPrizeModel;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public SingleDstCampPrizeModel getSingleDstCampPrizeModel()
/* 225:    */   {
/* 226:261 */     return this.singleDstCampPrizeModel;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setStagedDiscountDstCampPrizeModel(StagedDiscountDstCampPrizeModel stagedDiscountDstCampPrizeModel)
/* 230:    */   {
/* 231:265 */     this.stagedDiscountDstCampPrizeModel = stagedDiscountDstCampPrizeModel;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public StagedDiscountDstCampPrizeModel getStagedDiscountDstCampPrizeModel()
/* 235:    */   {
/* 236:268 */     return this.stagedDiscountDstCampPrizeModel;
/* 237:    */   }
/* 238:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDiscountQueryResponse

 * JD-Core Version:    0.7.0.1

 */