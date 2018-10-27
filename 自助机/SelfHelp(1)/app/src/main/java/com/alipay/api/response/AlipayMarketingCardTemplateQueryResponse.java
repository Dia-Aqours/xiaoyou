/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.PubChannelDTO;
/*   5:    */ import com.alipay.api.domain.TemplateBenefitInfoDTO;
/*   6:    */ import com.alipay.api.domain.TemplateCardLevelConfDTO;
/*   7:    */ import com.alipay.api.domain.TemplateColumnInfoDTO;
/*   8:    */ import com.alipay.api.domain.TemplateFieldRuleDTO;
/*   9:    */ import com.alipay.api.domain.TemplateOpenCardConfDTO;
/*  10:    */ import com.alipay.api.domain.TemplateStyleInfoDTO;
/*  11:    */ import com.alipay.api.internal.mapping.ApiField;
/*  12:    */ import com.alipay.api.internal.mapping.ApiListField;
/*  13:    */ import java.util.List;
/*  14:    */ 
/*  15:    */ public class AlipayMarketingCardTemplateQueryResponse
/*  16:    */   extends AlipayResponse
/*  17:    */ {
/*  18:    */   private static final long serialVersionUID = 6532238168792479559L;
/*  19:    */   @ApiField("biz_no_prefix")
/*  20:    */   private String bizNoPrefix;
/*  21:    */   @ApiField("biz_no_suffix_len")
/*  22:    */   private String bizNoSuffixLen;
/*  23:    */   @ApiListField("card_level_confs")
/*  24:    */   @ApiField("template_card_level_conf_d_t_o")
/*  25:    */   private List<TemplateCardLevelConfDTO> cardLevelConfs;
/*  26:    */   @ApiField("card_type")
/*  27:    */   private String cardType;
/*  28:    */   @ApiListField("column_info_list")
/*  29:    */   @ApiField("template_column_info_d_t_o")
/*  30:    */   private List<TemplateColumnInfoDTO> columnInfoList;
/*  31:    */   @ApiListField("field_rule_list")
/*  32:    */   @ApiField("template_field_rule_d_t_o")
/*  33:    */   private List<TemplateFieldRuleDTO> fieldRuleList;
/*  34:    */   @ApiField("open_card_conf")
/*  35:    */   private TemplateOpenCardConfDTO openCardConf;
/*  36:    */   @ApiListField("pub_channels")
/*  37:    */   @ApiField("pub_channel_d_t_o")
/*  38:    */   private List<PubChannelDTO> pubChannels;
/*  39:    */   @ApiListField("service_label_list")
/*  40:    */   @ApiField("string")
/*  41:    */   private List<String> serviceLabelList;
/*  42:    */   @ApiListField("shop_ids")
/*  43:    */   @ApiField("string")
/*  44:    */   private List<String> shopIds;
/*  45:    */   @ApiListField("template_benefit_info")
/*  46:    */   @ApiField("template_benefit_info_d_t_o")
/*  47:    */   private List<TemplateBenefitInfoDTO> templateBenefitInfo;
/*  48:    */   @ApiField("template_style_info")
/*  49:    */   private TemplateStyleInfoDTO templateStyleInfo;
/*  50:    */   
/*  51:    */   public void setBizNoPrefix(String bizNoPrefix)
/*  52:    */   {
/*  53:110 */     this.bizNoPrefix = bizNoPrefix;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getBizNoPrefix()
/*  57:    */   {
/*  58:113 */     return this.bizNoPrefix;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setBizNoSuffixLen(String bizNoSuffixLen)
/*  62:    */   {
/*  63:117 */     this.bizNoSuffixLen = bizNoSuffixLen;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getBizNoSuffixLen()
/*  67:    */   {
/*  68:120 */     return this.bizNoSuffixLen;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setCardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs)
/*  72:    */   {
/*  73:124 */     this.cardLevelConfs = cardLevelConfs;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public List<TemplateCardLevelConfDTO> getCardLevelConfs()
/*  77:    */   {
/*  78:127 */     return this.cardLevelConfs;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setCardType(String cardType)
/*  82:    */   {
/*  83:131 */     this.cardType = cardType;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getCardType()
/*  87:    */   {
/*  88:134 */     return this.cardType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList)
/*  92:    */   {
/*  93:138 */     this.columnInfoList = columnInfoList;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public List<TemplateColumnInfoDTO> getColumnInfoList()
/*  97:    */   {
/*  98:141 */     return this.columnInfoList;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList)
/* 102:    */   {
/* 103:145 */     this.fieldRuleList = fieldRuleList;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public List<TemplateFieldRuleDTO> getFieldRuleList()
/* 107:    */   {
/* 108:148 */     return this.fieldRuleList;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf)
/* 112:    */   {
/* 113:152 */     this.openCardConf = openCardConf;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public TemplateOpenCardConfDTO getOpenCardConf()
/* 117:    */   {
/* 118:155 */     return this.openCardConf;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setPubChannels(List<PubChannelDTO> pubChannels)
/* 122:    */   {
/* 123:159 */     this.pubChannels = pubChannels;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public List<PubChannelDTO> getPubChannels()
/* 127:    */   {
/* 128:162 */     return this.pubChannels;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setServiceLabelList(List<String> serviceLabelList)
/* 132:    */   {
/* 133:166 */     this.serviceLabelList = serviceLabelList;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public List<String> getServiceLabelList()
/* 137:    */   {
/* 138:169 */     return this.serviceLabelList;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setShopIds(List<String> shopIds)
/* 142:    */   {
/* 143:173 */     this.shopIds = shopIds;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public List<String> getShopIds()
/* 147:    */   {
/* 148:176 */     return this.shopIds;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo)
/* 152:    */   {
/* 153:180 */     this.templateBenefitInfo = templateBenefitInfo;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo()
/* 157:    */   {
/* 158:183 */     return this.templateBenefitInfo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo)
/* 162:    */   {
/* 163:187 */     this.templateStyleInfo = templateStyleInfo;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public TemplateStyleInfoDTO getTemplateStyleInfo()
/* 167:    */   {
/* 168:190 */     return this.templateStyleInfo;
/* 169:    */   }
/* 170:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCardTemplateQueryResponse
 * JD-Core Version:    0.7.0.1
 */