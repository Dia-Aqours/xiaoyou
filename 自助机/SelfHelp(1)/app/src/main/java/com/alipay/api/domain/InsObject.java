/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InsObject
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8739719899186263267L;
/* 10:   */   @ApiField("insured_object_id")
/* 11:   */   private String insuredObjectId;
/* 12:   */   @ApiField("insured_object_info")
/* 13:   */   private String insuredObjectInfo;
/* 14:   */   @ApiField("type")
/* 15:   */   private Long type;
/* 16:   */   
/* 17:   */   public String getInsuredObjectId()
/* 18:   */   {
/* 19:35 */     return this.insuredObjectId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setInsuredObjectId(String insuredObjectId)
/* 23:   */   {
/* 24:38 */     this.insuredObjectId = insuredObjectId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getInsuredObjectInfo()
/* 28:   */   {
/* 29:42 */     return this.insuredObjectInfo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setInsuredObjectInfo(String insuredObjectInfo)
/* 33:   */   {
/* 34:45 */     this.insuredObjectInfo = insuredObjectInfo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Long getType()
/* 38:   */   {
/* 39:49 */     return this.type;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setType(Long type)
/* 43:   */   {
/* 44:52 */     this.type = type;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsObject
 * JD-Core Version:    0.7.0.1
 */