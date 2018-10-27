/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZmWatchListExtendInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6131641153264113883L;
/* 10:   */   @ApiField("description")
/* 11:   */   private String description;
/* 12:   */   @ApiField("key")
/* 13:   */   private String key;
/* 14:   */   @ApiField("value")
/* 15:   */   private String value;
/* 16:   */   
/* 17:   */   public String getDescription()
/* 18:   */   {
/* 19:35 */     return this.description;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setDescription(String description)
/* 23:   */   {
/* 24:38 */     this.description = description;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getKey()
/* 28:   */   {
/* 29:42 */     return this.key;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setKey(String key)
/* 33:   */   {
/* 34:45 */     this.key = key;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getValue()
/* 38:   */   {
/* 39:49 */     return this.value;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setValue(String value)
/* 43:   */   {
/* 44:52 */     this.value = value;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZmWatchListExtendInfo
 * JD-Core Version:    0.7.0.1
 */