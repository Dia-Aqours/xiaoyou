/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class PublishChannel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6185943924854892147L;
/* 10:   */   @ApiField("config")
/* 11:   */   private String config;
/* 12:   */   @ApiField("ext_info")
/* 13:   */   private String extInfo;
/* 14:   */   @ApiField("name")
/* 15:   */   private String name;
/* 16:   */   @ApiField("type")
/* 17:   */   private String type;
/* 18:   */   
/* 19:   */   public String getConfig()
/* 20:   */   {
/* 21:48 */     return this.config;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setConfig(String config)
/* 25:   */   {
/* 26:51 */     this.config = config;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getExtInfo()
/* 30:   */   {
/* 31:55 */     return this.extInfo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setExtInfo(String extInfo)
/* 35:   */   {
/* 36:58 */     this.extInfo = extInfo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getName()
/* 40:   */   {
/* 41:62 */     return this.name;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setName(String name)
/* 45:   */   {
/* 46:65 */     this.name = name;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getType()
/* 50:   */   {
/* 51:69 */     return this.type;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setType(String type)
/* 55:   */   {
/* 56:72 */     this.type = type;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.PublishChannel

 * JD-Core Version:    0.7.0.1

 */