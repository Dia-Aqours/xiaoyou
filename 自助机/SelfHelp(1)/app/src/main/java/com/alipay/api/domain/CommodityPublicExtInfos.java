/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class CommodityPublicExtInfos
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3437387625113324726L;
/*  10:    */   @ApiField("action_url")
/*  11:    */   private String actionUrl;
/*  12:    */   @ApiField("app_id")
/*  13:    */   private String appId;
/*  14:    */   @ApiField("category_name")
/*  15:    */   private String categoryName;
/*  16:    */   @ApiField("city_name")
/*  17:    */   private String cityName;
/*  18:    */   @ApiField("commodity_id")
/*  19:    */   private String commodityId;
/*  20:    */   @ApiField("create_user_id")
/*  21:    */   private String createUserId;
/*  22:    */   @ApiField("displayapp_id")
/*  23:    */   private String displayappId;
/*  24:    */   @ApiField("displayapp_memo")
/*  25:    */   private String displayappMemo;
/*  26:    */   @ApiField("displayapp_name")
/*  27:    */   private String displayappName;
/*  28:    */   @ApiField("displayapp_status")
/*  29:    */   private String displayappStatus;
/*  30:    */   @ApiField("displayapp_url")
/*  31:    */   private String displayappUrl;
/*  32:    */   @ApiField("export_url")
/*  33:    */   private String exportUrl;
/*  34:    */   @ApiField("property_id")
/*  35:    */   private String propertyId;
/*  36:    */   
/*  37:    */   public String getActionUrl()
/*  38:    */   {
/*  39: 95 */     return this.actionUrl;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setActionUrl(String actionUrl)
/*  43:    */   {
/*  44: 98 */     this.actionUrl = actionUrl;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getAppId()
/*  48:    */   {
/*  49:102 */     return this.appId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setAppId(String appId)
/*  53:    */   {
/*  54:105 */     this.appId = appId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getCategoryName()
/*  58:    */   {
/*  59:109 */     return this.categoryName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCategoryName(String categoryName)
/*  63:    */   {
/*  64:112 */     this.categoryName = categoryName;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCityName()
/*  68:    */   {
/*  69:116 */     return this.cityName;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCityName(String cityName)
/*  73:    */   {
/*  74:119 */     this.cityName = cityName;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getCommodityId()
/*  78:    */   {
/*  79:123 */     return this.commodityId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setCommodityId(String commodityId)
/*  83:    */   {
/*  84:126 */     this.commodityId = commodityId;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getCreateUserId()
/*  88:    */   {
/*  89:130 */     return this.createUserId;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setCreateUserId(String createUserId)
/*  93:    */   {
/*  94:133 */     this.createUserId = createUserId;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getDisplayappId()
/*  98:    */   {
/*  99:137 */     return this.displayappId;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setDisplayappId(String displayappId)
/* 103:    */   {
/* 104:140 */     this.displayappId = displayappId;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getDisplayappMemo()
/* 108:    */   {
/* 109:144 */     return this.displayappMemo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setDisplayappMemo(String displayappMemo)
/* 113:    */   {
/* 114:147 */     this.displayappMemo = displayappMemo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getDisplayappName()
/* 118:    */   {
/* 119:151 */     return this.displayappName;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setDisplayappName(String displayappName)
/* 123:    */   {
/* 124:154 */     this.displayappName = displayappName;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getDisplayappStatus()
/* 128:    */   {
/* 129:158 */     return this.displayappStatus;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setDisplayappStatus(String displayappStatus)
/* 133:    */   {
/* 134:161 */     this.displayappStatus = displayappStatus;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getDisplayappUrl()
/* 138:    */   {
/* 139:165 */     return this.displayappUrl;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setDisplayappUrl(String displayappUrl)
/* 143:    */   {
/* 144:168 */     this.displayappUrl = displayappUrl;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getExportUrl()
/* 148:    */   {
/* 149:172 */     return this.exportUrl;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setExportUrl(String exportUrl)
/* 153:    */   {
/* 154:175 */     this.exportUrl = exportUrl;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getPropertyId()
/* 158:    */   {
/* 159:179 */     return this.propertyId;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setPropertyId(String propertyId)
/* 163:    */   {
/* 164:182 */     this.propertyId = propertyId;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CommodityPublicExtInfos
 * JD-Core Version:    0.7.0.1
 */