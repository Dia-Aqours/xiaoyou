/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayMarketingCardTemplateModifyModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1814212421247382832L;
/*  12:    */   @ApiField("biz_no_prefix")
/*  13:    */   private String bizNoPrefix;
/*  14:    */   @ApiField("card_level_conf")
/*  15:    */   private TemplateCardLevelConfDTO cardLevelConf;
/*  16:    */   @ApiListField("column_info_list")
/*  17:    */   @ApiField("template_column_info_d_t_o")
/*  18:    */   private List<TemplateColumnInfoDTO> columnInfoList;
/*  19:    */   @ApiListField("field_rule_list")
/*  20:    */   @ApiField("template_field_rule_d_t_o")
/*  21:    */   private List<TemplateFieldRuleDTO> fieldRuleList;
/*  22:    */   @ApiField("open_card_conf")
/*  23:    */   private TemplateOpenCardConfDTO openCardConf;
/*  24:    */   @ApiListField("pub_channels")
/*  25:    */   @ApiField("pub_channel_d_t_o")
/*  26:    */   private List<PubChannelDTO> pubChannels;
/*  27:    */   @ApiField("request_id")
/*  28:    */   private String requestId;
/*  29:    */   @ApiListField("shop_ids")
/*  30:    */   @ApiField("string")
/*  31:    */   private List<String> shopIds;
/*  32:    */   @ApiListField("template_benefit_info")
/*  33:    */   @ApiField("template_benefit_info_d_t_o")
/*  34:    */   private List<TemplateBenefitInfoDTO> templateBenefitInfo;
/*  35:    */   @ApiField("template_id")
/*  36:    */   private String templateId;
/*  37:    */   @ApiField("template_style_info")
/*  38:    */   private TemplateStyleInfoDTO templateStyleInfo;
/*  39:    */   @ApiField("write_off_type")
/*  40:    */   private String writeOffType;
/*  41:    */   
/*  42:    */   public String getBizNoPrefix()
/*  43:    */   {
/*  44:105 */     return this.bizNoPrefix;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBizNoPrefix(String bizNoPrefix)
/*  48:    */   {
/*  49:108 */     this.bizNoPrefix = bizNoPrefix;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public TemplateCardLevelConfDTO getCardLevelConf()
/*  53:    */   {
/*  54:112 */     return this.cardLevelConf;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setCardLevelConf(TemplateCardLevelConfDTO cardLevelConf)
/*  58:    */   {
/*  59:115 */     this.cardLevelConf = cardLevelConf;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public List<TemplateColumnInfoDTO> getColumnInfoList()
/*  63:    */   {
/*  64:119 */     return this.columnInfoList;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList)
/*  68:    */   {
/*  69:122 */     this.columnInfoList = columnInfoList;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public List<TemplateFieldRuleDTO> getFieldRuleList()
/*  73:    */   {
/*  74:126 */     return this.fieldRuleList;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList)
/*  78:    */   {
/*  79:129 */     this.fieldRuleList = fieldRuleList;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public TemplateOpenCardConfDTO getOpenCardConf()
/*  83:    */   {
/*  84:133 */     return this.openCardConf;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf)
/*  88:    */   {
/*  89:136 */     this.openCardConf = openCardConf;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public List<PubChannelDTO> getPubChannels()
/*  93:    */   {
/*  94:140 */     return this.pubChannels;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setPubChannels(List<PubChannelDTO> pubChannels)
/*  98:    */   {
/*  99:143 */     this.pubChannels = pubChannels;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getRequestId()
/* 103:    */   {
/* 104:147 */     return this.requestId;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setRequestId(String requestId)
/* 108:    */   {
/* 109:150 */     this.requestId = requestId;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public List<String> getShopIds()
/* 113:    */   {
/* 114:154 */     return this.shopIds;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setShopIds(List<String> shopIds)
/* 118:    */   {
/* 119:157 */     this.shopIds = shopIds;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo()
/* 123:    */   {
/* 124:161 */     return this.templateBenefitInfo;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo)
/* 128:    */   {
/* 129:164 */     this.templateBenefitInfo = templateBenefitInfo;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getTemplateId()
/* 133:    */   {
/* 134:168 */     return this.templateId;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setTemplateId(String templateId)
/* 138:    */   {
/* 139:171 */     this.templateId = templateId;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public TemplateStyleInfoDTO getTemplateStyleInfo()
/* 143:    */   {
/* 144:175 */     return this.templateStyleInfo;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo)
/* 148:    */   {
/* 149:178 */     this.templateStyleInfo = templateStyleInfo;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getWriteOffType()
/* 153:    */   {
/* 154:182 */     return this.writeOffType;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setWriteOffType(String writeOffType)
/* 158:    */   {
/* 159:185 */     this.writeOffType = writeOffType;
/* 160:    */   }
/* 161:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardTemplateModifyModel
 * JD-Core Version:    0.7.0.1
 */