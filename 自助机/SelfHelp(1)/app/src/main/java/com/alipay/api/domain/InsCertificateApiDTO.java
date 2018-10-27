/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InsCertificateApiDTO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4192972538377649648L;
/*  11:    */   @ApiField("biz_data")
/*  12:    */   private String bizData;
/*  13:    */   @ApiField("certificate_no")
/*  14:    */   private String certificateNo;
/*  15:    */   @ApiField("certificate_type")
/*  16:    */   private String certificateType;
/*  17:    */   @ApiField("effect_time")
/*  18:    */   private Date effectTime;
/*  19:    */   @ApiField("expire_time")
/*  20:    */   private Date expireTime;
/*  21:    */   @ApiField("face_value")
/*  22:    */   private String faceValue;
/*  23:    */   @ApiField("ins_policy_no")
/*  24:    */   private String insPolicyNo;
/*  25:    */   @ApiField("inst_id")
/*  26:    */   private String instId;
/*  27:    */   @ApiField("order_id")
/*  28:    */   private String orderId;
/*  29:    */   @ApiField("order_source")
/*  30:    */   private String orderSource;
/*  31:    */   @ApiField("out_biz_no")
/*  32:    */   private String outBizNo;
/*  33:    */   @ApiField("owner_uid")
/*  34:    */   private String ownerUid;
/*  35:    */   @ApiField("status")
/*  36:    */   private Long status;
/*  37:    */   @ApiField("use_time")
/*  38:    */   private Date useTime;
/*  39:    */   @ApiField("user_uid")
/*  40:    */   private String userUid;
/*  41:    */   
/*  42:    */   public String getBizData()
/*  43:    */   {
/*  44:109 */     return this.bizData;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBizData(String bizData)
/*  48:    */   {
/*  49:112 */     this.bizData = bizData;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getCertificateNo()
/*  53:    */   {
/*  54:116 */     return this.certificateNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setCertificateNo(String certificateNo)
/*  58:    */   {
/*  59:119 */     this.certificateNo = certificateNo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getCertificateType()
/*  63:    */   {
/*  64:123 */     return this.certificateType;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setCertificateType(String certificateType)
/*  68:    */   {
/*  69:126 */     this.certificateType = certificateType;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public Date getEffectTime()
/*  73:    */   {
/*  74:130 */     return this.effectTime;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setEffectTime(Date effectTime)
/*  78:    */   {
/*  79:133 */     this.effectTime = effectTime;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public Date getExpireTime()
/*  83:    */   {
/*  84:137 */     return this.expireTime;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setExpireTime(Date expireTime)
/*  88:    */   {
/*  89:140 */     this.expireTime = expireTime;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getFaceValue()
/*  93:    */   {
/*  94:144 */     return this.faceValue;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setFaceValue(String faceValue)
/*  98:    */   {
/*  99:147 */     this.faceValue = faceValue;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getInsPolicyNo()
/* 103:    */   {
/* 104:151 */     return this.insPolicyNo;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setInsPolicyNo(String insPolicyNo)
/* 108:    */   {
/* 109:154 */     this.insPolicyNo = insPolicyNo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getInstId()
/* 113:    */   {
/* 114:158 */     return this.instId;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setInstId(String instId)
/* 118:    */   {
/* 119:161 */     this.instId = instId;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getOrderId()
/* 123:    */   {
/* 124:165 */     return this.orderId;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setOrderId(String orderId)
/* 128:    */   {
/* 129:168 */     this.orderId = orderId;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getOrderSource()
/* 133:    */   {
/* 134:172 */     return this.orderSource;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setOrderSource(String orderSource)
/* 138:    */   {
/* 139:175 */     this.orderSource = orderSource;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getOutBizNo()
/* 143:    */   {
/* 144:179 */     return this.outBizNo;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setOutBizNo(String outBizNo)
/* 148:    */   {
/* 149:182 */     this.outBizNo = outBizNo;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getOwnerUid()
/* 153:    */   {
/* 154:186 */     return this.ownerUid;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setOwnerUid(String ownerUid)
/* 158:    */   {
/* 159:189 */     this.ownerUid = ownerUid;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Long getStatus()
/* 163:    */   {
/* 164:193 */     return this.status;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void setStatus(Long status)
/* 168:    */   {
/* 169:196 */     this.status = status;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public Date getUseTime()
/* 173:    */   {
/* 174:200 */     return this.useTime;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setUseTime(Date useTime)
/* 178:    */   {
/* 179:203 */     this.useTime = useTime;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getUserUid()
/* 183:    */   {
/* 184:207 */     return this.userUid;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setUserUid(String userUid)
/* 188:    */   {
/* 189:210 */     this.userUid = userUid;
/* 190:    */   }
/* 191:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsCertificateApiDTO
 * JD-Core Version:    0.7.0.1
 */