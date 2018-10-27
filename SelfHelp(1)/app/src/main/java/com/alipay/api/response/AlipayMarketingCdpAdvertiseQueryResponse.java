/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class AlipayMarketingCdpAdvertiseQueryResponse
/*   8:    */   extends AlipayResponse
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6239414572731384546L;
/*  11:    */   @ApiField("action_url")
/*  12:    */   private String actionUrl;
/*  13:    */   @ApiField("ad_code")
/*  14:    */   private String adCode;
/*  15:    */   @ApiField("ad_rules")
/*  16:    */   private String adRules;
/*  17:    */   @ApiField("content")
/*  18:    */   private String content;
/*  19:    */   @ApiField("content_type")
/*  20:    */   private String contentType;
/*  21:    */   @ApiField("end_time")
/*  22:    */   private Date endTime;
/*  23:    */   @ApiField("height")
/*  24:    */   private String height;
/*  25:    */   @ApiField("start_time")
/*  26:    */   private Date startTime;
/*  27:    */   @ApiField("status")
/*  28:    */   private String status;
/*  29:    */   
/*  30:    */   public void setActionUrl(String actionUrl)
/*  31:    */   {
/*  32: 73 */     this.actionUrl = actionUrl;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getActionUrl()
/*  36:    */   {
/*  37: 76 */     return this.actionUrl;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAdCode(String adCode)
/*  41:    */   {
/*  42: 80 */     this.adCode = adCode;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getAdCode()
/*  46:    */   {
/*  47: 83 */     return this.adCode;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setAdRules(String adRules)
/*  51:    */   {
/*  52: 87 */     this.adRules = adRules;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getAdRules()
/*  56:    */   {
/*  57: 90 */     return this.adRules;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setContent(String content)
/*  61:    */   {
/*  62: 94 */     this.content = content;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getContent()
/*  66:    */   {
/*  67: 97 */     return this.content;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setContentType(String contentType)
/*  71:    */   {
/*  72:101 */     this.contentType = contentType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getContentType()
/*  76:    */   {
/*  77:104 */     return this.contentType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setEndTime(Date endTime)
/*  81:    */   {
/*  82:108 */     this.endTime = endTime;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public Date getEndTime()
/*  86:    */   {
/*  87:111 */     return this.endTime;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setHeight(String height)
/*  91:    */   {
/*  92:115 */     this.height = height;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getHeight()
/*  96:    */   {
/*  97:118 */     return this.height;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setStartTime(Date startTime)
/* 101:    */   {
/* 102:122 */     this.startTime = startTime;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public Date getStartTime()
/* 106:    */   {
/* 107:125 */     return this.startTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setStatus(String status)
/* 111:    */   {
/* 112:129 */     this.status = status;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getStatus()
/* 116:    */   {
/* 117:132 */     return this.status;
/* 118:    */   }
/* 119:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayMarketingCdpAdvertiseQueryResponse

 * JD-Core Version:    0.7.0.1

 */