/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMaintainDataUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6859718644632991722L;
/* 10:   */   @ApiField("biz_id")
/* 11:   */   private String bizId;
/* 12:   */   @ApiField("event_id")
/* 13:   */   private Long eventId;
/* 14:   */   @ApiField("source")
/* 15:   */   private String source;
/* 16:   */   @ApiField("type_id")
/* 17:   */   private String typeId;
/* 18:   */   
/* 19:   */   public String getBizId()
/* 20:   */   {
/* 21:41 */     return this.bizId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBizId(String bizId)
/* 25:   */   {
/* 26:44 */     this.bizId = bizId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public Long getEventId()
/* 30:   */   {
/* 31:48 */     return this.eventId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setEventId(Long eventId)
/* 35:   */   {
/* 36:51 */     this.eventId = eventId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getSource()
/* 40:   */   {
/* 41:55 */     return this.source;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setSource(String source)
/* 45:   */   {
/* 46:58 */     this.source = source;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTypeId()
/* 50:   */   {
/* 51:62 */     return this.typeId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTypeId(String typeId)
/* 55:   */   {
/* 56:65 */     this.typeId = typeId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainDataUpdateModel
 * JD-Core Version:    0.7.0.1
 */