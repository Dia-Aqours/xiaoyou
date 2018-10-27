/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InfoSecHitDetectItem
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5786365841488635939L;
/* 10:   */   @ApiField("detect_resource_level")
/* 11:   */   private String detectResourceLevel;
/* 12:   */   @ApiField("detect_type_code")
/* 13:   */   private String detectTypeCode;
/* 14:   */   @ApiField("hit_content")
/* 15:   */   private String hitContent;
/* 16:   */   @ApiField("hit_detect_resource")
/* 17:   */   private String hitDetectResource;
/* 18:   */   
/* 19:   */   public String getDetectResourceLevel()
/* 20:   */   {
/* 21:52 */     return this.detectResourceLevel;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setDetectResourceLevel(String detectResourceLevel)
/* 25:   */   {
/* 26:55 */     this.detectResourceLevel = detectResourceLevel;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getDetectTypeCode()
/* 30:   */   {
/* 31:59 */     return this.detectTypeCode;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setDetectTypeCode(String detectTypeCode)
/* 35:   */   {
/* 36:62 */     this.detectTypeCode = detectTypeCode;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getHitContent()
/* 40:   */   {
/* 41:66 */     return this.hitContent;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setHitContent(String hitContent)
/* 45:   */   {
/* 46:69 */     this.hitContent = hitContent;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getHitDetectResource()
/* 50:   */   {
/* 51:73 */     return this.hitDetectResource;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setHitDetectResource(String hitDetectResource)
/* 55:   */   {
/* 56:76 */     this.hitDetectResource = hitDetectResource;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InfoSecHitDetectItem
 * JD-Core Version:    0.7.0.1
 */