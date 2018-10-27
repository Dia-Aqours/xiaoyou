/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class KoubeiMarketingToolMallPointsSyncModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 2742961135936562191L;
/*  11:    */   @ApiField("activity_id")
/*  12:    */   private String activityId;
/*  13:    */   @ApiField("biz_type")
/*  14:    */   private String bizType;
/*  15:    */   @ApiField("gmt_end")
/*  16:    */   private Date gmtEnd;
/*  17:    */   @ApiField("json_content")
/*  18:    */   private String jsonContent;
/*  19:    */   @ApiField("mall_id")
/*  20:    */   private String mallId;
/*  21:    */   @ApiField("operate")
/*  22:    */   private String operate;
/*  23:    */   @ApiField("out_biz_id")
/*  24:    */   private String outBizId;
/*  25:    */   @ApiField("state")
/*  26:    */   private String state;
/*  27:    */   @ApiField("trade_id")
/*  28:    */   private String tradeId;
/*  29:    */   @ApiField("user_id")
/*  30:    */   private String userId;
/*  31:    */   
/*  32:    */   public String getActivityId()
/*  33:    */   {
/*  34: 79 */     return this.activityId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setActivityId(String activityId)
/*  38:    */   {
/*  39: 82 */     this.activityId = activityId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getBizType()
/*  43:    */   {
/*  44: 86 */     return this.bizType;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBizType(String bizType)
/*  48:    */   {
/*  49: 89 */     this.bizType = bizType;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public Date getGmtEnd()
/*  53:    */   {
/*  54: 93 */     return this.gmtEnd;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setGmtEnd(Date gmtEnd)
/*  58:    */   {
/*  59: 96 */     this.gmtEnd = gmtEnd;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getJsonContent()
/*  63:    */   {
/*  64:100 */     return this.jsonContent;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setJsonContent(String jsonContent)
/*  68:    */   {
/*  69:103 */     this.jsonContent = jsonContent;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getMallId()
/*  73:    */   {
/*  74:107 */     return this.mallId;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setMallId(String mallId)
/*  78:    */   {
/*  79:110 */     this.mallId = mallId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getOperate()
/*  83:    */   {
/*  84:114 */     return this.operate;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setOperate(String operate)
/*  88:    */   {
/*  89:117 */     this.operate = operate;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getOutBizId()
/*  93:    */   {
/*  94:121 */     return this.outBizId;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setOutBizId(String outBizId)
/*  98:    */   {
/*  99:124 */     this.outBizId = outBizId;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getState()
/* 103:    */   {
/* 104:128 */     return this.state;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setState(String state)
/* 108:    */   {
/* 109:131 */     this.state = state;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getTradeId()
/* 113:    */   {
/* 114:135 */     return this.tradeId;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setTradeId(String tradeId)
/* 118:    */   {
/* 119:138 */     this.tradeId = tradeId;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getUserId()
/* 123:    */   {
/* 124:142 */     return this.userId;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setUserId(String userId)
/* 128:    */   {
/* 129:145 */     this.userId = userId;
/* 130:    */   }
/* 131:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingToolMallPointsSyncModel

 * JD-Core Version:    0.7.0.1

 */