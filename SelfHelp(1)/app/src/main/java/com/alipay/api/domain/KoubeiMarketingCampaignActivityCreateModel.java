/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class KoubeiMarketingCampaignActivityCreateModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 8266796417632495527L;
/*  13:    */   @ApiField("auto_delay_flag")
/*  14:    */   private String autoDelayFlag;
/*  15:    */   @ApiField("budget_info")
/*  16:    */   private BudgetInfo budgetInfo;
/*  17:    */   @ApiField("constraint_info")
/*  18:    */   private ConstraintInfo constraintInfo;
/*  19:    */   @ApiField("desc")
/*  20:    */   private String desc;
/*  21:    */   @ApiField("end_time")
/*  22:    */   private Date endTime;
/*  23:    */   @ApiField("ext_info")
/*  24:    */   private String extInfo;
/*  25:    */   @ApiField("name")
/*  26:    */   private String name;
/*  27:    */   @ApiField("operator_id")
/*  28:    */   private String operatorId;
/*  29:    */   @ApiField("operator_type")
/*  30:    */   private String operatorType;
/*  31:    */   @ApiField("out_biz_no")
/*  32:    */   private String outBizNo;
/*  33:    */   @ApiListField("promo_tools")
/*  34:    */   @ApiField("promo_tool")
/*  35:    */   private List<PromoTool> promoTools;
/*  36:    */   @ApiListField("publish_channels")
/*  37:    */   @ApiField("publish_channel")
/*  38:    */   private List<PublishChannel> publishChannels;
/*  39:    */   @ApiField("recruit_tool")
/*  40:    */   private RecruitTool recruitTool;
/*  41:    */   @ApiField("start_time")
/*  42:    */   private Date startTime;
/*  43:    */   @ApiField("type")
/*  44:    */   private String type;
/*  45:    */   
/*  46:    */   public String getAutoDelayFlag()
/*  47:    */   {
/*  48:119 */     return this.autoDelayFlag;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAutoDelayFlag(String autoDelayFlag)
/*  52:    */   {
/*  53:122 */     this.autoDelayFlag = autoDelayFlag;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public BudgetInfo getBudgetInfo()
/*  57:    */   {
/*  58:126 */     return this.budgetInfo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setBudgetInfo(BudgetInfo budgetInfo)
/*  62:    */   {
/*  63:129 */     this.budgetInfo = budgetInfo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public ConstraintInfo getConstraintInfo()
/*  67:    */   {
/*  68:133 */     return this.constraintInfo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setConstraintInfo(ConstraintInfo constraintInfo)
/*  72:    */   {
/*  73:136 */     this.constraintInfo = constraintInfo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getDesc()
/*  77:    */   {
/*  78:140 */     return this.desc;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setDesc(String desc)
/*  82:    */   {
/*  83:143 */     this.desc = desc;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public Date getEndTime()
/*  87:    */   {
/*  88:147 */     return this.endTime;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setEndTime(Date endTime)
/*  92:    */   {
/*  93:150 */     this.endTime = endTime;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getExtInfo()
/*  97:    */   {
/*  98:154 */     return this.extInfo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setExtInfo(String extInfo)
/* 102:    */   {
/* 103:157 */     this.extInfo = extInfo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getName()
/* 107:    */   {
/* 108:161 */     return this.name;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setName(String name)
/* 112:    */   {
/* 113:164 */     this.name = name;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getOperatorId()
/* 117:    */   {
/* 118:168 */     return this.operatorId;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setOperatorId(String operatorId)
/* 122:    */   {
/* 123:171 */     this.operatorId = operatorId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getOperatorType()
/* 127:    */   {
/* 128:175 */     return this.operatorType;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setOperatorType(String operatorType)
/* 132:    */   {
/* 133:178 */     this.operatorType = operatorType;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getOutBizNo()
/* 137:    */   {
/* 138:182 */     return this.outBizNo;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setOutBizNo(String outBizNo)
/* 142:    */   {
/* 143:185 */     this.outBizNo = outBizNo;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public List<PromoTool> getPromoTools()
/* 147:    */   {
/* 148:189 */     return this.promoTools;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setPromoTools(List<PromoTool> promoTools)
/* 152:    */   {
/* 153:192 */     this.promoTools = promoTools;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public List<PublishChannel> getPublishChannels()
/* 157:    */   {
/* 158:196 */     return this.publishChannels;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setPublishChannels(List<PublishChannel> publishChannels)
/* 162:    */   {
/* 163:199 */     this.publishChannels = publishChannels;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public RecruitTool getRecruitTool()
/* 167:    */   {
/* 168:203 */     return this.recruitTool;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setRecruitTool(RecruitTool recruitTool)
/* 172:    */   {
/* 173:206 */     this.recruitTool = recruitTool;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public Date getStartTime()
/* 177:    */   {
/* 178:210 */     return this.startTime;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setStartTime(Date startTime)
/* 182:    */   {
/* 183:213 */     this.startTime = startTime;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getType()
/* 187:    */   {
/* 188:217 */     return this.type;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setType(String type)
/* 192:    */   {
/* 193:220 */     this.type = type;
/* 194:    */   }
/* 195:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignActivityCreateModel
 * JD-Core Version:    0.7.0.1
 */