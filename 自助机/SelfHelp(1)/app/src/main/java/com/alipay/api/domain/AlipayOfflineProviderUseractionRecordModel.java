/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayOfflineProviderUseractionRecordModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6272432911164721634L;
/*  10:    */   @ApiField("action_detail")
/*  11:    */   private String actionDetail;
/*  12:    */   @ApiField("action_outer_id")
/*  13:    */   private String actionOuterId;
/*  14:    */   @ApiField("action_type")
/*  15:    */   private String actionType;
/*  16:    */   @ApiField("alipay_app_id")
/*  17:    */   private String alipayAppId;
/*  18:    */   @ApiField("date_time")
/*  19:    */   private String dateTime;
/*  20:    */   @ApiField("entity")
/*  21:    */   private String entity;
/*  22:    */   @ApiField("industry")
/*  23:    */   private String industry;
/*  24:    */   @ApiField("mobile")
/*  25:    */   private String mobile;
/*  26:    */   @ApiField("outer_shop_do")
/*  27:    */   private OuterShopDO outerShopDo;
/*  28:    */   @ApiField("platform_user_id")
/*  29:    */   private String platformUserId;
/*  30:    */   @ApiField("source")
/*  31:    */   private String source;
/*  32:    */   @ApiField("user_id")
/*  33:    */   private String userId;
/*  34:    */   
/*  35:    */   public String getActionDetail()
/*  36:    */   {
/*  37: 89 */     return this.actionDetail;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setActionDetail(String actionDetail)
/*  41:    */   {
/*  42: 92 */     this.actionDetail = actionDetail;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getActionOuterId()
/*  46:    */   {
/*  47: 96 */     return this.actionOuterId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setActionOuterId(String actionOuterId)
/*  51:    */   {
/*  52: 99 */     this.actionOuterId = actionOuterId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getActionType()
/*  56:    */   {
/*  57:103 */     return this.actionType;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setActionType(String actionType)
/*  61:    */   {
/*  62:106 */     this.actionType = actionType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getAlipayAppId()
/*  66:    */   {
/*  67:110 */     return this.alipayAppId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setAlipayAppId(String alipayAppId)
/*  71:    */   {
/*  72:113 */     this.alipayAppId = alipayAppId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getDateTime()
/*  76:    */   {
/*  77:117 */     return this.dateTime;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setDateTime(String dateTime)
/*  81:    */   {
/*  82:120 */     this.dateTime = dateTime;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getEntity()
/*  86:    */   {
/*  87:124 */     return this.entity;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setEntity(String entity)
/*  91:    */   {
/*  92:127 */     this.entity = entity;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getIndustry()
/*  96:    */   {
/*  97:131 */     return this.industry;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setIndustry(String industry)
/* 101:    */   {
/* 102:134 */     this.industry = industry;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getMobile()
/* 106:    */   {
/* 107:138 */     return this.mobile;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setMobile(String mobile)
/* 111:    */   {
/* 112:141 */     this.mobile = mobile;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public OuterShopDO getOuterShopDo()
/* 116:    */   {
/* 117:145 */     return this.outerShopDo;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setOuterShopDo(OuterShopDO outerShopDo)
/* 121:    */   {
/* 122:148 */     this.outerShopDo = outerShopDo;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getPlatformUserId()
/* 126:    */   {
/* 127:152 */     return this.platformUserId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setPlatformUserId(String platformUserId)
/* 131:    */   {
/* 132:155 */     this.platformUserId = platformUserId;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getSource()
/* 136:    */   {
/* 137:159 */     return this.source;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setSource(String source)
/* 141:    */   {
/* 142:162 */     this.source = source;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getUserId()
/* 146:    */   {
/* 147:166 */     return this.userId;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setUserId(String userId)
/* 151:    */   {
/* 152:169 */     this.userId = userId;
/* 153:    */   }
/* 154:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderUseractionRecordModel

 * JD-Core Version:    0.7.0.1

 */