/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class StaffDTO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7727833694299428914L;
/*  10:    */   @ApiField("biz_type")
/*  11:    */   private String bizType;
/*  12:    */   @ApiField("bizunit_id")
/*  13:    */   private String bizunitId;
/*  14:    */   @ApiField("email")
/*  15:    */   private String email;
/*  16:    */   @ApiField("merchant_id")
/*  17:    */   private String merchantId;
/*  18:    */   @ApiField("merchant_id_type")
/*  19:    */   private String merchantIdType;
/*  20:    */   @ApiField("remark")
/*  21:    */   private String remark;
/*  22:    */   @ApiField("staff_biz_code")
/*  23:    */   private String staffBizCode;
/*  24:    */   @ApiField("staff_id")
/*  25:    */   private String staffId;
/*  26:    */   @ApiField("staff_mobile")
/*  27:    */   private String staffMobile;
/*  28:    */   @ApiField("staff_name")
/*  29:    */   private String staffName;
/*  30:    */   @ApiField("staff_type")
/*  31:    */   private String staffType;
/*  32:    */   
/*  33:    */   public String getBizType()
/*  34:    */   {
/*  35: 83 */     return this.bizType;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setBizType(String bizType)
/*  39:    */   {
/*  40: 86 */     this.bizType = bizType;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getBizunitId()
/*  44:    */   {
/*  45: 90 */     return this.bizunitId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBizunitId(String bizunitId)
/*  49:    */   {
/*  50: 93 */     this.bizunitId = bizunitId;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getEmail()
/*  54:    */   {
/*  55: 97 */     return this.email;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setEmail(String email)
/*  59:    */   {
/*  60:100 */     this.email = email;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getMerchantId()
/*  64:    */   {
/*  65:104 */     return this.merchantId;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setMerchantId(String merchantId)
/*  69:    */   {
/*  70:107 */     this.merchantId = merchantId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getMerchantIdType()
/*  74:    */   {
/*  75:111 */     return this.merchantIdType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setMerchantIdType(String merchantIdType)
/*  79:    */   {
/*  80:114 */     this.merchantIdType = merchantIdType;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getRemark()
/*  84:    */   {
/*  85:118 */     return this.remark;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setRemark(String remark)
/*  89:    */   {
/*  90:121 */     this.remark = remark;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getStaffBizCode()
/*  94:    */   {
/*  95:125 */     return this.staffBizCode;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setStaffBizCode(String staffBizCode)
/*  99:    */   {
/* 100:128 */     this.staffBizCode = staffBizCode;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getStaffId()
/* 104:    */   {
/* 105:132 */     return this.staffId;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setStaffId(String staffId)
/* 109:    */   {
/* 110:135 */     this.staffId = staffId;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getStaffMobile()
/* 114:    */   {
/* 115:139 */     return this.staffMobile;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setStaffMobile(String staffMobile)
/* 119:    */   {
/* 120:142 */     this.staffMobile = staffMobile;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getStaffName()
/* 124:    */   {
/* 125:146 */     return this.staffName;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setStaffName(String staffName)
/* 129:    */   {
/* 130:149 */     this.staffName = staffName;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getStaffType()
/* 134:    */   {
/* 135:153 */     return this.staffType;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setStaffType(String staffType)
/* 139:    */   {
/* 140:156 */     this.staffType = staffType;
/* 141:    */   }
/* 142:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.StaffDTO

 * JD-Core Version:    0.7.0.1

 */