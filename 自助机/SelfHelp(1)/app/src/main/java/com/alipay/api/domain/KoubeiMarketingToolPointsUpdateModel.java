/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class KoubeiMarketingToolPointsUpdateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6258712256854419244L;
/*  10:    */   @ApiField("activity_account")
/*  11:    */   private String activityAccount;
/*  12:    */   @ApiField("biz_no")
/*  13:    */   private String bizNo;
/*  14:    */   @ApiField("ext_info")
/*  15:    */   private String extInfo;
/*  16:    */   @ApiField("memo")
/*  17:    */   private String memo;
/*  18:    */   @ApiField("req_id")
/*  19:    */   private String reqId;
/*  20:    */   @ApiField("shop_id")
/*  21:    */   private String shopId;
/*  22:    */   @ApiField("trans_amount")
/*  23:    */   private String transAmount;
/*  24:    */   @ApiField("trans_type")
/*  25:    */   private String transType;
/*  26:    */   @ApiField("user_id")
/*  27:    */   private String userId;
/*  28:    */   
/*  29:    */   public String getActivityAccount()
/*  30:    */   {
/*  31: 79 */     return this.activityAccount;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setActivityAccount(String activityAccount)
/*  35:    */   {
/*  36: 82 */     this.activityAccount = activityAccount;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getBizNo()
/*  40:    */   {
/*  41: 86 */     return this.bizNo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setBizNo(String bizNo)
/*  45:    */   {
/*  46: 89 */     this.bizNo = bizNo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getExtInfo()
/*  50:    */   {
/*  51: 93 */     return this.extInfo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setExtInfo(String extInfo)
/*  55:    */   {
/*  56: 96 */     this.extInfo = extInfo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getMemo()
/*  60:    */   {
/*  61:100 */     return this.memo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setMemo(String memo)
/*  65:    */   {
/*  66:103 */     this.memo = memo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getReqId()
/*  70:    */   {
/*  71:107 */     return this.reqId;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setReqId(String reqId)
/*  75:    */   {
/*  76:110 */     this.reqId = reqId;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getShopId()
/*  80:    */   {
/*  81:114 */     return this.shopId;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setShopId(String shopId)
/*  85:    */   {
/*  86:117 */     this.shopId = shopId;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getTransAmount()
/*  90:    */   {
/*  91:121 */     return this.transAmount;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setTransAmount(String transAmount)
/*  95:    */   {
/*  96:124 */     this.transAmount = transAmount;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getTransType()
/* 100:    */   {
/* 101:128 */     return this.transType;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTransType(String transType)
/* 105:    */   {
/* 106:131 */     this.transType = transType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getUserId()
/* 110:    */   {
/* 111:135 */     return this.userId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setUserId(String userId)
/* 115:    */   {
/* 116:138 */     this.userId = userId;
/* 117:    */   }
/* 118:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingToolPointsUpdateModel

 * JD-Core Version:    0.7.0.1

 */