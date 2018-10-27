/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class TemplateOpenCardConfDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4492678955995793911L;
/* 10:   */   @ApiField("conf")
/* 11:   */   private String conf;
/* 12:   */   @ApiField("open_card_source_type")
/* 13:   */   private String openCardSourceType;
/* 14:   */   @ApiField("open_card_url")
/* 15:   */   private String openCardUrl;
/* 16:   */   @ApiField("source_app_id")
/* 17:   */   private String sourceAppId;
/* 18:   */   
/* 19:   */   public String getConf()
/* 20:   */   {
/* 21:42 */     return this.conf;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setConf(String conf)
/* 25:   */   {
/* 26:45 */     this.conf = conf;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOpenCardSourceType()
/* 30:   */   {
/* 31:49 */     return this.openCardSourceType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOpenCardSourceType(String openCardSourceType)
/* 35:   */   {
/* 36:52 */     this.openCardSourceType = openCardSourceType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getOpenCardUrl()
/* 40:   */   {
/* 41:56 */     return this.openCardUrl;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setOpenCardUrl(String openCardUrl)
/* 45:   */   {
/* 46:59 */     this.openCardUrl = openCardUrl;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getSourceAppId()
/* 50:   */   {
/* 51:63 */     return this.sourceAppId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setSourceAppId(String sourceAppId)
/* 55:   */   {
/* 56:66 */     this.sourceAppId = sourceAppId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TemplateOpenCardConfDTO
 * JD-Core Version:    0.7.0.1
 */