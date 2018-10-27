/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class KoubeiMarketingAdvertisingCreateModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 2574786366367667999L;
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
/*  27:    */   
/*  28:    */   public String getActionUrl()
/*  29:    */   {
/*  30: 67 */     return this.actionUrl;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setActionUrl(String actionUrl)
/*  34:    */   {
/*  35: 70 */     this.actionUrl = actionUrl;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getAdCode()
/*  39:    */   {
/*  40: 74 */     return this.adCode;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setAdCode(String adCode)
/*  44:    */   {
/*  45: 77 */     this.adCode = adCode;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getAdRules()
/*  49:    */   {
/*  50: 81 */     return this.adRules;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAdRules(String adRules)
/*  54:    */   {
/*  55: 84 */     this.adRules = adRules;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getContent()
/*  59:    */   {
/*  60: 88 */     return this.content;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setContent(String content)
/*  64:    */   {
/*  65: 91 */     this.content = content;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getContentType()
/*  69:    */   {
/*  70: 95 */     return this.contentType;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setContentType(String contentType)
/*  74:    */   {
/*  75: 98 */     this.contentType = contentType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Date getEndTime()
/*  79:    */   {
/*  80:102 */     return this.endTime;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setEndTime(Date endTime)
/*  84:    */   {
/*  85:105 */     this.endTime = endTime;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getHeight()
/*  89:    */   {
/*  90:109 */     return this.height;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setHeight(String height)
/*  94:    */   {
/*  95:112 */     this.height = height;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public Date getStartTime()
/*  99:    */   {
/* 100:116 */     return this.startTime;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setStartTime(Date startTime)
/* 104:    */   {
/* 105:119 */     this.startTime = startTime;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingAdvertisingCreateModel
 * JD-Core Version:    0.7.0.1
 */