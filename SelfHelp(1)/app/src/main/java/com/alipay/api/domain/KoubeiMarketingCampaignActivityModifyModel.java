/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class KoubeiMarketingCampaignActivityModifyModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 2432537643847453874L;
/*  13:    */   @ApiField("auto_delay_flag")
/*  14:    */   private String autoDelayFlag;
/*  15:    */   @ApiField("budget_info")
/*  16:    */   private BudgetInfo budgetInfo;
/*  17:    */   @ApiField("camp_id")
/*  18:    */   private String campId;
/*  19:    */   @ApiField("constraint_info")
/*  20:    */   private ConstraintInfo constraintInfo;
/*  21:    */   @ApiField("desc")
/*  22:    */   private String desc;
/*  23:    */   @ApiField("end_time")
/*  24:    */   private Date endTime;
/*  25:    */   @ApiField("ext_info")
/*  26:    */   private String extInfo;
/*  27:    */   @ApiField("name")
/*  28:    */   private String name;
/*  29:    */   @ApiField("operator_id")
/*  30:    */   private String operatorId;
/*  31:    */   @ApiField("operator_type")
/*  32:    */   private String operatorType;
/*  33:    */   @ApiField("out_biz_no")
/*  34:    */   private String outBizNo;
/*  35:    */   @ApiListField("promo_tools")
/*  36:    */   @ApiField("promo_tool")
/*  37:    */   private List<PromoTool> promoTools;
/*  38:    */   @ApiListField("publish_channels")
/*  39:    */   @ApiField("publish_channel")
/*  40:    */   private List<PublishChannel> publishChannels;
/*  41:    */   @ApiField("recruit_tool")
/*  42:    */   private RecruitTool recruitTool;
/*  43:    */   @ApiField("start_time")
/*  44:    */   private Date startTime;
/*  45:    */   @ApiField("type")
/*  46:    */   private String type;
/*  47:    */   
/*  48:    */   public String getAutoDelayFlag()
/*  49:    */   {
/*  50:124 */     return this.autoDelayFlag;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAutoDelayFlag(String autoDelayFlag)
/*  54:    */   {
/*  55:127 */     this.autoDelayFlag = autoDelayFlag;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public BudgetInfo getBudgetInfo()
/*  59:    */   {
/*  60:131 */     return this.budgetInfo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBudgetInfo(BudgetInfo budgetInfo)
/*  64:    */   {
/*  65:134 */     this.budgetInfo = budgetInfo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getCampId()
/*  69:    */   {
/*  70:138 */     return this.campId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setCampId(String campId)
/*  74:    */   {
/*  75:141 */     this.campId = campId;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public ConstraintInfo getConstraintInfo()
/*  79:    */   {
/*  80:145 */     return this.constraintInfo;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setConstraintInfo(ConstraintInfo constraintInfo)
/*  84:    */   {
/*  85:148 */     this.constraintInfo = constraintInfo;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getDesc()
/*  89:    */   {
/*  90:152 */     return this.desc;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setDesc(String desc)
/*  94:    */   {
/*  95:155 */     this.desc = desc;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public Date getEndTime()
/*  99:    */   {
/* 100:159 */     return this.endTime;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setEndTime(Date endTime)
/* 104:    */   {
/* 105:162 */     this.endTime = endTime;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getExtInfo()
/* 109:    */   {
/* 110:166 */     return this.extInfo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setExtInfo(String extInfo)
/* 114:    */   {
/* 115:169 */     this.extInfo = extInfo;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getName()
/* 119:    */   {
/* 120:173 */     return this.name;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setName(String name)
/* 124:    */   {
/* 125:176 */     this.name = name;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getOperatorId()
/* 129:    */   {
/* 130:180 */     return this.operatorId;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setOperatorId(String operatorId)
/* 134:    */   {
/* 135:183 */     this.operatorId = operatorId;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getOperatorType()
/* 139:    */   {
/* 140:187 */     return this.operatorType;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setOperatorType(String operatorType)
/* 144:    */   {
/* 145:190 */     this.operatorType = operatorType;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getOutBizNo()
/* 149:    */   {
/* 150:194 */     return this.outBizNo;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setOutBizNo(String outBizNo)
/* 154:    */   {
/* 155:197 */     this.outBizNo = outBizNo;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public List<PromoTool> getPromoTools()
/* 159:    */   {
/* 160:201 */     return this.promoTools;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setPromoTools(List<PromoTool> promoTools)
/* 164:    */   {
/* 165:204 */     this.promoTools = promoTools;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public List<PublishChannel> getPublishChannels()
/* 169:    */   {
/* 170:208 */     return this.publishChannels;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setPublishChannels(List<PublishChannel> publishChannels)
/* 174:    */   {
/* 175:211 */     this.publishChannels = publishChannels;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public RecruitTool getRecruitTool()
/* 179:    */   {
/* 180:215 */     return this.recruitTool;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setRecruitTool(RecruitTool recruitTool)
/* 184:    */   {
/* 185:218 */     this.recruitTool = recruitTool;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public Date getStartTime()
/* 189:    */   {
/* 190:222 */     return this.startTime;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setStartTime(Date startTime)
/* 194:    */   {
/* 195:225 */     this.startTime = startTime;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getType()
/* 199:    */   {
/* 200:229 */     return this.type;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setType(String type)
/* 204:    */   {
/* 205:232 */     this.type = type;
/* 206:    */   }
/* 207:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignActivityModifyModel
 * JD-Core Version:    0.7.0.1
 */