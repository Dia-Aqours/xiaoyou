/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorScriptQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6724242799356428349L;
/* 10:   */   @ApiField("card_type")
/* 11:   */   private String cardType;
/* 12:   */   @ApiField("script_type")
/* 13:   */   private String scriptType;
/* 14:   */   
/* 15:   */   public String getCardType()
/* 16:   */   {
/* 17:31 */     return this.cardType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCardType(String cardType)
/* 21:   */   {
/* 22:34 */     this.cardType = cardType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getScriptType()
/* 26:   */   {
/* 27:38 */     return this.scriptType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setScriptType(String scriptType)
/* 31:   */   {
/* 32:41 */     this.scriptType = scriptType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorScriptQueryModel
 * JD-Core Version:    0.7.0.1
 */