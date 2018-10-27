/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class CustomsDeclareRecordInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1464822552437478565L;
/*  10:    */   @ApiField("alipay_declare_no")
/*  11:    */   private String alipayDeclareNo;
/*  12:    */   @ApiField("amount")
/*  13:    */   private String amount;
/*  14:    */   @ApiField("customs_place")
/*  15:    */   private String customsPlace;
/*  16:    */   @ApiField("customs_result_code")
/*  17:    */   private String customsResultCode;
/*  18:    */   @ApiField("customs_result_info")
/*  19:    */   private String customsResultInfo;
/*  20:    */   @ApiField("customs_result_return_time")
/*  21:    */   private String customsResultReturnTime;
/*  22:    */   @ApiField("is_split")
/*  23:    */   private String isSplit;
/*  24:    */   @ApiField("last_modified_time")
/*  25:    */   private String lastModifiedTime;
/*  26:    */   @ApiField("memo")
/*  27:    */   private String memo;
/*  28:    */   @ApiField("merchant_customs_code")
/*  29:    */   private String merchantCustomsCode;
/*  30:    */   @ApiField("merchant_customs_name")
/*  31:    */   private String merchantCustomsName;
/*  32:    */   @ApiField("out_request_no")
/*  33:    */   private String outRequestNo;
/*  34:    */   @ApiField("status")
/*  35:    */   private String status;
/*  36:    */   @ApiField("sub_out_biz_no")
/*  37:    */   private String subOutBizNo;
/*  38:    */   @ApiField("trade_no")
/*  39:    */   private String tradeNo;
/*  40:    */   
/*  41:    */   public String getAlipayDeclareNo()
/*  42:    */   {
/*  43:118 */     return this.alipayDeclareNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAlipayDeclareNo(String alipayDeclareNo)
/*  47:    */   {
/*  48:121 */     this.alipayDeclareNo = alipayDeclareNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAmount()
/*  52:    */   {
/*  53:125 */     return this.amount;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setAmount(String amount)
/*  57:    */   {
/*  58:128 */     this.amount = amount;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getCustomsPlace()
/*  62:    */   {
/*  63:132 */     return this.customsPlace;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setCustomsPlace(String customsPlace)
/*  67:    */   {
/*  68:135 */     this.customsPlace = customsPlace;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getCustomsResultCode()
/*  72:    */   {
/*  73:139 */     return this.customsResultCode;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setCustomsResultCode(String customsResultCode)
/*  77:    */   {
/*  78:142 */     this.customsResultCode = customsResultCode;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getCustomsResultInfo()
/*  82:    */   {
/*  83:146 */     return this.customsResultInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setCustomsResultInfo(String customsResultInfo)
/*  87:    */   {
/*  88:149 */     this.customsResultInfo = customsResultInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getCustomsResultReturnTime()
/*  92:    */   {
/*  93:153 */     return this.customsResultReturnTime;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setCustomsResultReturnTime(String customsResultReturnTime)
/*  97:    */   {
/*  98:156 */     this.customsResultReturnTime = customsResultReturnTime;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getIsSplit()
/* 102:    */   {
/* 103:160 */     return this.isSplit;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setIsSplit(String isSplit)
/* 107:    */   {
/* 108:163 */     this.isSplit = isSplit;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getLastModifiedTime()
/* 112:    */   {
/* 113:167 */     return this.lastModifiedTime;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setLastModifiedTime(String lastModifiedTime)
/* 117:    */   {
/* 118:170 */     this.lastModifiedTime = lastModifiedTime;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getMemo()
/* 122:    */   {
/* 123:174 */     return this.memo;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setMemo(String memo)
/* 127:    */   {
/* 128:177 */     this.memo = memo;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getMerchantCustomsCode()
/* 132:    */   {
/* 133:181 */     return this.merchantCustomsCode;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setMerchantCustomsCode(String merchantCustomsCode)
/* 137:    */   {
/* 138:184 */     this.merchantCustomsCode = merchantCustomsCode;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getMerchantCustomsName()
/* 142:    */   {
/* 143:188 */     return this.merchantCustomsName;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setMerchantCustomsName(String merchantCustomsName)
/* 147:    */   {
/* 148:191 */     this.merchantCustomsName = merchantCustomsName;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getOutRequestNo()
/* 152:    */   {
/* 153:195 */     return this.outRequestNo;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setOutRequestNo(String outRequestNo)
/* 157:    */   {
/* 158:198 */     this.outRequestNo = outRequestNo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getStatus()
/* 162:    */   {
/* 163:202 */     return this.status;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setStatus(String status)
/* 167:    */   {
/* 168:205 */     this.status = status;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getSubOutBizNo()
/* 172:    */   {
/* 173:209 */     return this.subOutBizNo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setSubOutBizNo(String subOutBizNo)
/* 177:    */   {
/* 178:212 */     this.subOutBizNo = subOutBizNo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getTradeNo()
/* 182:    */   {
/* 183:216 */     return this.tradeNo;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setTradeNo(String tradeNo)
/* 187:    */   {
/* 188:219 */     this.tradeNo = tradeNo;
/* 189:    */   }
/* 190:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.CustomsDeclareRecordInfo

 * JD-Core Version:    0.7.0.1

 */