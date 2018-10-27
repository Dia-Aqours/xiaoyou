/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class KoubeiAdvertCommissionAdvertQueryModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1561639511476239819L;
/* 12:   */   @ApiListField("identifies")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> identifies;
/* 15:   */   @ApiField("identify_type")
/* 16:   */   private String identifyType;
/* 17:   */   
/* 18:   */   public List<String> getIdentifies()
/* 19:   */   {
/* 20:39 */     return this.identifies;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setIdentifies(List<String> identifies)
/* 24:   */   {
/* 25:42 */     this.identifies = identifies;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getIdentifyType()
/* 29:   */   {
/* 30:46 */     return this.identifyType;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setIdentifyType(String identifyType)
/* 34:   */   {
/* 35:49 */     this.identifyType = identifyType;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiAdvertCommissionAdvertQueryModel
 * JD-Core Version:    0.7.0.1
 */