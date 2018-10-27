/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class AlipayInsMarketingCertificateBatchqueryModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1884884478156952214L;
/*  11:    */   @ApiField("certificate_no")
/*  12:    */   private String certificateNo;
/*  13:    */   @ApiField("certificate_type")
/*  14:    */   private String certificateType;
/*  15:    */   @ApiField("current_page_no")
/*  16:    */   private Long currentPageNo;
/*  17:    */   @ApiField("effect_time")
/*  18:    */   private Date effectTime;
/*  19:    */   @ApiField("inst_id")
/*  20:    */   private String instId;
/*  21:    */   @ApiField("is_enabled")
/*  22:    */   private String isEnabled;
/*  23:    */   @ApiField("order_id")
/*  24:    */   private String orderId;
/*  25:    */   @ApiField("order_source")
/*  26:    */   private String orderSource;
/*  27:    */   @ApiField("out_biz_no")
/*  28:    */   private String outBizNo;
/*  29:    */   @ApiField("owner_uid")
/*  30:    */   private String ownerUid;
/*  31:    */   @ApiField("page_size")
/*  32:    */   private Long pageSize;
/*  33:    */   @ApiField("status")
/*  34:    */   private Long status;
/*  35:    */   
/*  36:    */   public String getCertificateNo()
/*  37:    */   {
/*  38: 91 */     return this.certificateNo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setCertificateNo(String certificateNo)
/*  42:    */   {
/*  43: 94 */     this.certificateNo = certificateNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getCertificateType()
/*  47:    */   {
/*  48: 98 */     return this.certificateType;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setCertificateType(String certificateType)
/*  52:    */   {
/*  53:101 */     this.certificateType = certificateType;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public Long getCurrentPageNo()
/*  57:    */   {
/*  58:105 */     return this.currentPageNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setCurrentPageNo(Long currentPageNo)
/*  62:    */   {
/*  63:108 */     this.currentPageNo = currentPageNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public Date getEffectTime()
/*  67:    */   {
/*  68:112 */     return this.effectTime;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setEffectTime(Date effectTime)
/*  72:    */   {
/*  73:115 */     this.effectTime = effectTime;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getInstId()
/*  77:    */   {
/*  78:119 */     return this.instId;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setInstId(String instId)
/*  82:    */   {
/*  83:122 */     this.instId = instId;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getIsEnabled()
/*  87:    */   {
/*  88:126 */     return this.isEnabled;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setIsEnabled(String isEnabled)
/*  92:    */   {
/*  93:129 */     this.isEnabled = isEnabled;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getOrderId()
/*  97:    */   {
/*  98:133 */     return this.orderId;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setOrderId(String orderId)
/* 102:    */   {
/* 103:136 */     this.orderId = orderId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getOrderSource()
/* 107:    */   {
/* 108:140 */     return this.orderSource;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setOrderSource(String orderSource)
/* 112:    */   {
/* 113:143 */     this.orderSource = orderSource;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getOutBizNo()
/* 117:    */   {
/* 118:147 */     return this.outBizNo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setOutBizNo(String outBizNo)
/* 122:    */   {
/* 123:150 */     this.outBizNo = outBizNo;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getOwnerUid()
/* 127:    */   {
/* 128:154 */     return this.ownerUid;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setOwnerUid(String ownerUid)
/* 132:    */   {
/* 133:157 */     this.ownerUid = ownerUid;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public Long getPageSize()
/* 137:    */   {
/* 138:161 */     return this.pageSize;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setPageSize(Long pageSize)
/* 142:    */   {
/* 143:164 */     this.pageSize = pageSize;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public Long getStatus()
/* 147:    */   {
/* 148:168 */     return this.status;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setStatus(Long status)
/* 152:    */   {
/* 153:171 */     this.status = status;
/* 154:    */   }
/* 155:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingCertificateBatchqueryModel

 * JD-Core Version:    0.7.0.1

 */