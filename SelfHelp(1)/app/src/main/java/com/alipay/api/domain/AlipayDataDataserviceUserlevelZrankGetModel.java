/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayDataDataserviceUserlevelZrankGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8753365417187966321L;
/* 10:   */   @ApiField("id")
/* 11:   */   private String id;
/* 12:   */   @ApiField("type")
/* 13:   */   private String type;
/* 14:   */   
/* 15:   */   public String getId()
/* 16:   */   {
/* 17:29 */     return this.id;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setId(String id)
/* 21:   */   {
/* 22:32 */     this.id = id;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getType()
/* 26:   */   {
/* 27:36 */     return this.type;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setType(String type)
/* 31:   */   {
/* 32:39 */     this.type = type;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataDataserviceUserlevelZrankGetModel
 * JD-Core Version:    0.7.0.1
 */