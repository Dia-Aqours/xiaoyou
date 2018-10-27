/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ZhimaMerchantOrderRentCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4743292178192616562L;
/*  10:    */   @ApiField("borrow_cycle")
/*  11:    */   private String borrowCycle;
/*  12:    */   @ApiField("borrow_cycle_unit")
/*  13:    */   private String borrowCycleUnit;
/*  14:    */   @ApiField("borrow_shop_name")
/*  15:    */   private String borrowShopName;
/*  16:    */   @ApiField("deposit_amount")
/*  17:    */   private String depositAmount;
/*  18:    */   @ApiField("deposit_state")
/*  19:    */   private String depositState;
/*  20:    */   @ApiField("goods_name")
/*  21:    */   private String goodsName;
/*  22:    */   @ApiField("invoke_return_url")
/*  23:    */   private String invokeReturnUrl;
/*  24:    */   @ApiField("invoke_state")
/*  25:    */   private String invokeState;
/*  26:    */   @ApiField("invoke_type")
/*  27:    */   private String invokeType;
/*  28:    */   @ApiField("notify_url")
/*  29:    */   private String notifyUrl;
/*  30:    */   @ApiField("out_order_no")
/*  31:    */   private String outOrderNo;
/*  32:    */   @ApiField("product_code")
/*  33:    */   private String productCode;
/*  34:    */   @ApiField("rent_amount")
/*  35:    */   private String rentAmount;
/*  36:    */   @ApiField("rent_info")
/*  37:    */   private String rentInfo;
/*  38:    */   @ApiField("rent_unit")
/*  39:    */   private String rentUnit;
/*  40:    */   
/*  41:    */   public String getBorrowCycle()
/*  42:    */   {
/*  43:117 */     return this.borrowCycle;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setBorrowCycle(String borrowCycle)
/*  47:    */   {
/*  48:120 */     this.borrowCycle = borrowCycle;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getBorrowCycleUnit()
/*  52:    */   {
/*  53:124 */     return this.borrowCycleUnit;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBorrowCycleUnit(String borrowCycleUnit)
/*  57:    */   {
/*  58:127 */     this.borrowCycleUnit = borrowCycleUnit;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBorrowShopName()
/*  62:    */   {
/*  63:131 */     return this.borrowShopName;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBorrowShopName(String borrowShopName)
/*  67:    */   {
/*  68:134 */     this.borrowShopName = borrowShopName;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getDepositAmount()
/*  72:    */   {
/*  73:138 */     return this.depositAmount;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setDepositAmount(String depositAmount)
/*  77:    */   {
/*  78:141 */     this.depositAmount = depositAmount;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getDepositState()
/*  82:    */   {
/*  83:145 */     return this.depositState;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setDepositState(String depositState)
/*  87:    */   {
/*  88:148 */     this.depositState = depositState;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getGoodsName()
/*  92:    */   {
/*  93:152 */     return this.goodsName;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setGoodsName(String goodsName)
/*  97:    */   {
/*  98:155 */     this.goodsName = goodsName;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getInvokeReturnUrl()
/* 102:    */   {
/* 103:159 */     return this.invokeReturnUrl;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setInvokeReturnUrl(String invokeReturnUrl)
/* 107:    */   {
/* 108:162 */     this.invokeReturnUrl = invokeReturnUrl;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getInvokeState()
/* 112:    */   {
/* 113:166 */     return this.invokeState;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setInvokeState(String invokeState)
/* 117:    */   {
/* 118:169 */     this.invokeState = invokeState;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getInvokeType()
/* 122:    */   {
/* 123:173 */     return this.invokeType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setInvokeType(String invokeType)
/* 127:    */   {
/* 128:176 */     this.invokeType = invokeType;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getNotifyUrl()
/* 132:    */   {
/* 133:180 */     return this.notifyUrl;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setNotifyUrl(String notifyUrl)
/* 137:    */   {
/* 138:183 */     this.notifyUrl = notifyUrl;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getOutOrderNo()
/* 142:    */   {
/* 143:187 */     return this.outOrderNo;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setOutOrderNo(String outOrderNo)
/* 147:    */   {
/* 148:190 */     this.outOrderNo = outOrderNo;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getProductCode()
/* 152:    */   {
/* 153:194 */     return this.productCode;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setProductCode(String productCode)
/* 157:    */   {
/* 158:197 */     this.productCode = productCode;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getRentAmount()
/* 162:    */   {
/* 163:201 */     return this.rentAmount;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setRentAmount(String rentAmount)
/* 167:    */   {
/* 168:204 */     this.rentAmount = rentAmount;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getRentInfo()
/* 172:    */   {
/* 173:208 */     return this.rentInfo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setRentInfo(String rentInfo)
/* 177:    */   {
/* 178:211 */     this.rentInfo = rentInfo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getRentUnit()
/* 182:    */   {
/* 183:215 */     return this.rentUnit;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setRentUnit(String rentUnit)
/* 187:    */   {
/* 188:218 */     this.rentUnit = rentUnit;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaMerchantOrderRentCreateModel
 * JD-Core Version:    0.7.0.1
 */