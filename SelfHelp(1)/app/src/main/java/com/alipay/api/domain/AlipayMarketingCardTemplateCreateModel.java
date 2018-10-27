/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayMarketingCardTemplateCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 6661389473646245993L;
/*  12:    */   @ApiField("biz_no_prefix")
/*  13:    */   private String bizNoPrefix;
/*  14:    */   @ApiField("biz_no_suffix_len")
/*  15:    */   private String bizNoSuffixLen;
/*  16:    */   @ApiField("card_level_conf")
/*  17:    */   private TemplateCardLevelConfDTO cardLevelConf;
/*  18:    */   @ApiField("card_type")
/*  19:    */   private String cardType;
/*  20:    */   @ApiListField("column_info_list")
/*  21:    */   @ApiField("template_column_info_d_t_o")
/*  22:    */   private List<TemplateColumnInfoDTO> columnInfoList;
/*  23:    */   @ApiListField("field_rule_list")
/*  24:    */   @ApiField("template_field_rule_d_t_o")
/*  25:    */   private List<TemplateFieldRuleDTO> fieldRuleList;
/*  26:    */   @ApiField("open_card_conf")
/*  27:    */   private TemplateOpenCardConfDTO openCardConf;
/*  28:    */   @ApiListField("pub_channels")
/*  29:    */   @ApiField("pub_channel_d_t_o")
/*  30:    */   private List<PubChannelDTO> pubChannels;
/*  31:    */   @ApiField("request_id")
/*  32:    */   private String requestId;
/*  33:    */   @ApiListField("service_label_list")
/*  34:    */   @ApiField("string")
/*  35:    */   private List<String> serviceLabelList;
/*  36:    */   @ApiListField("shop_ids")
/*  37:    */   @ApiField("string")
/*  38:    */   private List<String> shopIds;
/*  39:    */   @ApiListField("template_benefit_info")
/*  40:    */   @ApiField("template_benefit_info_d_t_o")
/*  41:    */   private List<TemplateBenefitInfoDTO> templateBenefitInfo;
/*  42:    */   @ApiField("template_style_info")
/*  43:    */   private TemplateStyleInfoDTO templateStyleInfo;
/*  44:    */   @ApiField("write_off_type")
/*  45:    */   private String writeOffType;
/*  46:    */   
/*  47:    */   public String getBizNoPrefix()
/*  48:    */   {
/*  49:120 */     return this.bizNoPrefix;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setBizNoPrefix(String bizNoPrefix)
/*  53:    */   {
/*  54:123 */     this.bizNoPrefix = bizNoPrefix;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getBizNoSuffixLen()
/*  58:    */   {
/*  59:127 */     return this.bizNoSuffixLen;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setBizNoSuffixLen(String bizNoSuffixLen)
/*  63:    */   {
/*  64:130 */     this.bizNoSuffixLen = bizNoSuffixLen;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public TemplateCardLevelConfDTO getCardLevelConf()
/*  68:    */   {
/*  69:134 */     return this.cardLevelConf;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCardLevelConf(TemplateCardLevelConfDTO cardLevelConf)
/*  73:    */   {
/*  74:137 */     this.cardLevelConf = cardLevelConf;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getCardType()
/*  78:    */   {
/*  79:141 */     return this.cardType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setCardType(String cardType)
/*  83:    */   {
/*  84:144 */     this.cardType = cardType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public List<TemplateColumnInfoDTO> getColumnInfoList()
/*  88:    */   {
/*  89:148 */     return this.columnInfoList;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList)
/*  93:    */   {
/*  94:151 */     this.columnInfoList = columnInfoList;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public List<TemplateFieldRuleDTO> getFieldRuleList()
/*  98:    */   {
/*  99:155 */     return this.fieldRuleList;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList)
/* 103:    */   {
/* 104:158 */     this.fieldRuleList = fieldRuleList;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public TemplateOpenCardConfDTO getOpenCardConf()
/* 108:    */   {
/* 109:162 */     return this.openCardConf;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf)
/* 113:    */   {
/* 114:165 */     this.openCardConf = openCardConf;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public List<PubChannelDTO> getPubChannels()
/* 118:    */   {
/* 119:169 */     return this.pubChannels;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setPubChannels(List<PubChannelDTO> pubChannels)
/* 123:    */   {
/* 124:172 */     this.pubChannels = pubChannels;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getRequestId()
/* 128:    */   {
/* 129:176 */     return this.requestId;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setRequestId(String requestId)
/* 133:    */   {
/* 134:179 */     this.requestId = requestId;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public List<String> getServiceLabelList()
/* 138:    */   {
/* 139:183 */     return this.serviceLabelList;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setServiceLabelList(List<String> serviceLabelList)
/* 143:    */   {
/* 144:186 */     this.serviceLabelList = serviceLabelList;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public List<String> getShopIds()
/* 148:    */   {
/* 149:190 */     return this.shopIds;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setShopIds(List<String> shopIds)
/* 153:    */   {
/* 154:193 */     this.shopIds = shopIds;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo()
/* 158:    */   {
/* 159:197 */     return this.templateBenefitInfo;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo)
/* 163:    */   {
/* 164:200 */     this.templateBenefitInfo = templateBenefitInfo;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public TemplateStyleInfoDTO getTemplateStyleInfo()
/* 168:    */   {
/* 169:204 */     return this.templateStyleInfo;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo)
/* 173:    */   {
/* 174:207 */     this.templateStyleInfo = templateStyleInfo;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getWriteOffType()
/* 178:    */   {
/* 179:211 */     return this.writeOffType;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setWriteOffType(String writeOffType)
/* 183:    */   {
/* 184:214 */     this.writeOffType = writeOffType;
/* 185:    */   }
/* 186:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardTemplateCreateModel
 * JD-Core Version:    0.7.0.1
 */