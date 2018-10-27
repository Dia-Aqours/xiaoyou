/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class InsMktCampaignDTO
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 1298812687951619174L;
/*  13:    */   @ApiField("campaign_id")
/*  14:    */   private String campaignId;
/*  15:    */   @ApiField("circulation")
/*  16:    */   private Long circulation;
/*  17:    */   @ApiField("coupon_config")
/*  18:    */   private InsMktCouponConfigDTO couponConfig;
/*  19:    */   @ApiField("end_time")
/*  20:    */   private Date endTime;
/*  21:    */   @ApiField("memo")
/*  22:    */   private String memo;
/*  23:    */   @ApiListField("mkt_objects")
/*  24:    */   @ApiField("ins_mkt_object_d_t_o")
/*  25:    */   private List<InsMktObjectDTO> mktObjects;
/*  26:    */   @ApiField("name")
/*  27:    */   private String name;
/*  28:    */   @ApiField("send_algorithm")
/*  29:    */   private String sendAlgorithm;
/*  30:    */   @ApiField("send_frqnc_type")
/*  31:    */   private Long sendFrqncType;
/*  32:    */   @ApiField("send_frqnc_value")
/*  33:    */   private Long sendFrqncValue;
/*  34:    */   @ApiField("start_time")
/*  35:    */   private Date startTime;
/*  36:    */   @ApiField("status")
/*  37:    */   private Long status;
/*  38:    */   
/*  39:    */   public String getCampaignId()
/*  40:    */   {
/*  41:101 */     return this.campaignId;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setCampaignId(String campaignId)
/*  45:    */   {
/*  46:104 */     this.campaignId = campaignId;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public Long getCirculation()
/*  50:    */   {
/*  51:108 */     return this.circulation;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setCirculation(Long circulation)
/*  55:    */   {
/*  56:111 */     this.circulation = circulation;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public InsMktCouponConfigDTO getCouponConfig()
/*  60:    */   {
/*  61:115 */     return this.couponConfig;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCouponConfig(InsMktCouponConfigDTO couponConfig)
/*  65:    */   {
/*  66:118 */     this.couponConfig = couponConfig;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public Date getEndTime()
/*  70:    */   {
/*  71:122 */     return this.endTime;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setEndTime(Date endTime)
/*  75:    */   {
/*  76:125 */     this.endTime = endTime;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getMemo()
/*  80:    */   {
/*  81:129 */     return this.memo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setMemo(String memo)
/*  85:    */   {
/*  86:132 */     this.memo = memo;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public List<InsMktObjectDTO> getMktObjects()
/*  90:    */   {
/*  91:136 */     return this.mktObjects;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setMktObjects(List<InsMktObjectDTO> mktObjects)
/*  95:    */   {
/*  96:139 */     this.mktObjects = mktObjects;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getName()
/* 100:    */   {
/* 101:143 */     return this.name;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setName(String name)
/* 105:    */   {
/* 106:146 */     this.name = name;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getSendAlgorithm()
/* 110:    */   {
/* 111:150 */     return this.sendAlgorithm;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setSendAlgorithm(String sendAlgorithm)
/* 115:    */   {
/* 116:153 */     this.sendAlgorithm = sendAlgorithm;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Long getSendFrqncType()
/* 120:    */   {
/* 121:157 */     return this.sendFrqncType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setSendFrqncType(Long sendFrqncType)
/* 125:    */   {
/* 126:160 */     this.sendFrqncType = sendFrqncType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Long getSendFrqncValue()
/* 130:    */   {
/* 131:164 */     return this.sendFrqncValue;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setSendFrqncValue(Long sendFrqncValue)
/* 135:    */   {
/* 136:167 */     this.sendFrqncValue = sendFrqncValue;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Date getStartTime()
/* 140:    */   {
/* 141:171 */     return this.startTime;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setStartTime(Date startTime)
/* 145:    */   {
/* 146:174 */     this.startTime = startTime;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public Long getStatus()
/* 150:    */   {
/* 151:178 */     return this.status;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setStatus(Long status)
/* 155:    */   {
/* 156:181 */     this.status = status;
/* 157:    */   }
/* 158:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktCampaignDTO
 * JD-Core Version:    0.7.0.1
 */