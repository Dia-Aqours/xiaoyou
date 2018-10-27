/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class CampDetail
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 3723791278497214967L;
/*  13:    */   @ApiField("audit_status")
/*  14:    */   private String auditStatus;
/*  15:    */   @ApiField("auto_delay_flag")
/*  16:    */   private String autoDelayFlag;
/*  17:    */   @ApiField("budget_info")
/*  18:    */   private BudgetInfo budgetInfo;
/*  19:    */   @ApiField("constraint_info")
/*  20:    */   private ConstraintInfo constraintInfo;
/*  21:    */   @ApiField("desc")
/*  22:    */   private String desc;
/*  23:    */   @ApiField("end_time")
/*  24:    */   private Date endTime;
/*  25:    */   @ApiField("ext_info")
/*  26:    */   private String extInfo;
/*  27:    */   @ApiField("id")
/*  28:    */   private String id;
/*  29:    */   @ApiField("name")
/*  30:    */   private String name;
/*  31:    */   @ApiListField("promo_tools")
/*  32:    */   @ApiField("promo_tool")
/*  33:    */   private List<PromoTool> promoTools;
/*  34:    */   @ApiListField("publish_channels")
/*  35:    */   @ApiField("publish_channel")
/*  36:    */   private List<PublishChannel> publishChannels;
/*  37:    */   @ApiField("recruit_info")
/*  38:    */   private RecruitInfo recruitInfo;
/*  39:    */   @ApiField("start_time")
/*  40:    */   private Date startTime;
/*  41:    */   @ApiField("status")
/*  42:    */   private String status;
/*  43:    */   @ApiField("type")
/*  44:    */   private String type;
/*  45:    */   
/*  46:    */   public String getAuditStatus()
/*  47:    */   {
/*  48:113 */     return this.auditStatus;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAuditStatus(String auditStatus)
/*  52:    */   {
/*  53:116 */     this.auditStatus = auditStatus;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getAutoDelayFlag()
/*  57:    */   {
/*  58:120 */     return this.autoDelayFlag;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setAutoDelayFlag(String autoDelayFlag)
/*  62:    */   {
/*  63:123 */     this.autoDelayFlag = autoDelayFlag;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public BudgetInfo getBudgetInfo()
/*  67:    */   {
/*  68:127 */     return this.budgetInfo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setBudgetInfo(BudgetInfo budgetInfo)
/*  72:    */   {
/*  73:130 */     this.budgetInfo = budgetInfo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public ConstraintInfo getConstraintInfo()
/*  77:    */   {
/*  78:134 */     return this.constraintInfo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setConstraintInfo(ConstraintInfo constraintInfo)
/*  82:    */   {
/*  83:137 */     this.constraintInfo = constraintInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getDesc()
/*  87:    */   {
/*  88:141 */     return this.desc;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setDesc(String desc)
/*  92:    */   {
/*  93:144 */     this.desc = desc;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public Date getEndTime()
/*  97:    */   {
/*  98:148 */     return this.endTime;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setEndTime(Date endTime)
/* 102:    */   {
/* 103:151 */     this.endTime = endTime;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getExtInfo()
/* 107:    */   {
/* 108:155 */     return this.extInfo;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setExtInfo(String extInfo)
/* 112:    */   {
/* 113:158 */     this.extInfo = extInfo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getId()
/* 117:    */   {
/* 118:162 */     return this.id;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setId(String id)
/* 122:    */   {
/* 123:165 */     this.id = id;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getName()
/* 127:    */   {
/* 128:169 */     return this.name;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setName(String name)
/* 132:    */   {
/* 133:172 */     this.name = name;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public List<PromoTool> getPromoTools()
/* 137:    */   {
/* 138:176 */     return this.promoTools;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setPromoTools(List<PromoTool> promoTools)
/* 142:    */   {
/* 143:179 */     this.promoTools = promoTools;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public List<PublishChannel> getPublishChannels()
/* 147:    */   {
/* 148:183 */     return this.publishChannels;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setPublishChannels(List<PublishChannel> publishChannels)
/* 152:    */   {
/* 153:186 */     this.publishChannels = publishChannels;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public RecruitInfo getRecruitInfo()
/* 157:    */   {
/* 158:190 */     return this.recruitInfo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setRecruitInfo(RecruitInfo recruitInfo)
/* 162:    */   {
/* 163:193 */     this.recruitInfo = recruitInfo;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public Date getStartTime()
/* 167:    */   {
/* 168:197 */     return this.startTime;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setStartTime(Date startTime)
/* 172:    */   {
/* 173:200 */     this.startTime = startTime;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getStatus()
/* 177:    */   {
/* 178:204 */     return this.status;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setStatus(String status)
/* 182:    */   {
/* 183:207 */     this.status = status;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getType()
/* 187:    */   {
/* 188:211 */     return this.type;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setType(String type)
/* 192:    */   {
/* 193:214 */     this.type = type;
/* 194:    */   }
/* 195:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CampDetail
 * JD-Core Version:    0.7.0.1
 */