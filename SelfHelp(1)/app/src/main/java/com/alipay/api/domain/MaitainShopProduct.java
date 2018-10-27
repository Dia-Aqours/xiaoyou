/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MaitainShopProduct
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7394833167527612158L;
/*  10:    */   @ApiField("off_price")
/*  11:    */   private Long offPrice;
/*  12:    */   @ApiField("orig_price")
/*  13:    */   private Long origPrice;
/*  14:    */   @ApiField("out_privilege_id")
/*  15:    */   private String outPrivilegeId;
/*  16:    */   @ApiField("out_shop_id")
/*  17:    */   private String outShopId;
/*  18:    */   @ApiField("privilege_close_time")
/*  19:    */   private String privilegeCloseTime;
/*  20:    */   @ApiField("privilege_price")
/*  21:    */   private Long privilegePrice;
/*  22:    */   @ApiField("privilege_start_time")
/*  23:    */   private String privilegeStartTime;
/*  24:    */   @ApiField("privilege_tags")
/*  25:    */   private String privilegeTags;
/*  26:    */   @ApiField("product_desc")
/*  27:    */   private String productDesc;
/*  28:    */   @ApiField("product_name")
/*  29:    */   private String productName;
/*  30:    */   @ApiField("service_category_id")
/*  31:    */   private Long serviceCategoryId;
/*  32:    */   @ApiField("status")
/*  33:    */   private String status;
/*  34:    */   
/*  35:    */   public Long getOffPrice()
/*  36:    */   {
/*  37:143 */     return this.offPrice;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setOffPrice(Long offPrice)
/*  41:    */   {
/*  42:146 */     this.offPrice = offPrice;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public Long getOrigPrice()
/*  46:    */   {
/*  47:150 */     return this.origPrice;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setOrigPrice(Long origPrice)
/*  51:    */   {
/*  52:153 */     this.origPrice = origPrice;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOutPrivilegeId()
/*  56:    */   {
/*  57:157 */     return this.outPrivilegeId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOutPrivilegeId(String outPrivilegeId)
/*  61:    */   {
/*  62:160 */     this.outPrivilegeId = outPrivilegeId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOutShopId()
/*  66:    */   {
/*  67:164 */     return this.outShopId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutShopId(String outShopId)
/*  71:    */   {
/*  72:167 */     this.outShopId = outShopId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getPrivilegeCloseTime()
/*  76:    */   {
/*  77:171 */     return this.privilegeCloseTime;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setPrivilegeCloseTime(String privilegeCloseTime)
/*  81:    */   {
/*  82:174 */     this.privilegeCloseTime = privilegeCloseTime;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public Long getPrivilegePrice()
/*  86:    */   {
/*  87:178 */     return this.privilegePrice;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setPrivilegePrice(Long privilegePrice)
/*  91:    */   {
/*  92:181 */     this.privilegePrice = privilegePrice;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getPrivilegeStartTime()
/*  96:    */   {
/*  97:185 */     return this.privilegeStartTime;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setPrivilegeStartTime(String privilegeStartTime)
/* 101:    */   {
/* 102:188 */     this.privilegeStartTime = privilegeStartTime;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getPrivilegeTags()
/* 106:    */   {
/* 107:192 */     return this.privilegeTags;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setPrivilegeTags(String privilegeTags)
/* 111:    */   {
/* 112:195 */     this.privilegeTags = privilegeTags;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getProductDesc()
/* 116:    */   {
/* 117:199 */     return this.productDesc;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setProductDesc(String productDesc)
/* 121:    */   {
/* 122:202 */     this.productDesc = productDesc;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getProductName()
/* 126:    */   {
/* 127:206 */     return this.productName;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setProductName(String productName)
/* 131:    */   {
/* 132:209 */     this.productName = productName;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public Long getServiceCategoryId()
/* 136:    */   {
/* 137:213 */     return this.serviceCategoryId;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setServiceCategoryId(Long serviceCategoryId)
/* 141:    */   {
/* 142:216 */     this.serviceCategoryId = serviceCategoryId;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getStatus()
/* 146:    */   {
/* 147:220 */     return this.status;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setStatus(String status)
/* 151:    */   {
/* 152:223 */     this.status = status;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MaitainShopProduct
 * JD-Core Version:    0.7.0.1
 */