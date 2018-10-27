/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InsMktObjectDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2414249839873633194L;
/* 10:   */   @ApiField("obj_id")
/* 11:   */   private String objId;
/* 12:   */   @ApiField("type")
/* 13:   */   private Long type;
/* 14:   */   
/* 15:   */   public String getObjId()
/* 16:   */   {
/* 17:29 */     return this.objId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setObjId(String objId)
/* 21:   */   {
/* 22:32 */     this.objId = objId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Long getType()
/* 26:   */   {
/* 27:36 */     return this.type;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setType(Long type)
/* 31:   */   {
/* 32:39 */     this.type = type;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktObjectDTO
 * JD-Core Version:    0.7.0.1
 */