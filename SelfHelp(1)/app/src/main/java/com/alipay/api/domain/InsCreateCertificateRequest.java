/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class InsCreateCertificateRequest
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 2575855891461389249L;
/*  11:    */   @ApiField("biz_data")
/*  12:    */   private String bizData;
/*  13:    */   @ApiField("certificate_type")
/*  14:    */   private String certificateType;
/*  15:    */   @ApiField("effect_time")
/*  16:    */   private Date effectTime;
/*  17:    */   @ApiField("expire_time")
/*  18:    */   private Date expireTime;
/*  19:    */   @ApiField("face_value")
/*  20:    */   private String faceValue;
/*  21:    */   @ApiField("ins_policy_no")
/*  22:    */   private String insPolicyNo;
/*  23:    */   @ApiField("inst_id")
/*  24:    */   private String instId;
/*  25:    */   @ApiField("order_id")
/*  26:    */   private String orderId;
/*  27:    */   @ApiField("order_source")
/*  28:    */   private String orderSource;
/*  29:    */   @ApiField("out_biz_no")
/*  30:    */   private String outBizNo;
/*  31:    */   @ApiField("owner_uid")
/*  32:    */   private String ownerUid;
/*  33:    */   
/*  34:    */   public String getBizData()
/*  35:    */   {
/*  36: 85 */     return this.bizData;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setBizData(String bizData)
/*  40:    */   {
/*  41: 88 */     this.bizData = bizData;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getCertificateType()
/*  45:    */   {
/*  46: 92 */     return this.certificateType;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setCertificateType(String certificateType)
/*  50:    */   {
/*  51: 95 */     this.certificateType = certificateType;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public Date getEffectTime()
/*  55:    */   {
/*  56: 99 */     return this.effectTime;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setEffectTime(Date effectTime)
/*  60:    */   {
/*  61:102 */     this.effectTime = effectTime;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public Date getExpireTime()
/*  65:    */   {
/*  66:106 */     return this.expireTime;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setExpireTime(Date expireTime)
/*  70:    */   {
/*  71:109 */     this.expireTime = expireTime;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getFaceValue()
/*  75:    */   {
/*  76:113 */     return this.faceValue;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setFaceValue(String faceValue)
/*  80:    */   {
/*  81:116 */     this.faceValue = faceValue;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getInsPolicyNo()
/*  85:    */   {
/*  86:120 */     return this.insPolicyNo;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setInsPolicyNo(String insPolicyNo)
/*  90:    */   {
/*  91:123 */     this.insPolicyNo = insPolicyNo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getInstId()
/*  95:    */   {
/*  96:127 */     return this.instId;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setInstId(String instId)
/* 100:    */   {
/* 101:130 */     this.instId = instId;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getOrderId()
/* 105:    */   {
/* 106:134 */     return this.orderId;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setOrderId(String orderId)
/* 110:    */   {
/* 111:137 */     this.orderId = orderId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getOrderSource()
/* 115:    */   {
/* 116:141 */     return this.orderSource;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setOrderSource(String orderSource)
/* 120:    */   {
/* 121:144 */     this.orderSource = orderSource;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getOutBizNo()
/* 125:    */   {
/* 126:148 */     return this.outBizNo;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setOutBizNo(String outBizNo)
/* 130:    */   {
/* 131:151 */     this.outBizNo = outBizNo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getOwnerUid()
/* 135:    */   {
/* 136:155 */     return this.ownerUid;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setOwnerUid(String ownerUid)
/* 140:    */   {
/* 141:158 */     this.ownerUid = ownerUid;
/* 142:    */   }
/* 143:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsCreateCertificateRequest
 * JD-Core Version:    0.7.0.1
 */