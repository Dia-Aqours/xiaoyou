/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class SupportFunction
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3549521412781123339L;
/* 12:   */   @ApiField("card_name")
/* 13:   */   private String cardName;
/* 14:   */   @ApiField("card_type")
/* 15:   */   private String cardType;
/* 16:   */   @ApiListField("function_type")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> functionType;
/* 19:   */   @ApiField("goto_url")
/* 20:   */   private String gotoUrl;
/* 21:   */   
/* 22:   */   public String getCardName()
/* 23:   */   {
/* 24:45 */     return this.cardName;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setCardName(String cardName)
/* 28:   */   {
/* 29:48 */     this.cardName = cardName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getCardType()
/* 33:   */   {
/* 34:52 */     return this.cardType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setCardType(String cardType)
/* 38:   */   {
/* 39:55 */     this.cardType = cardType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public List<String> getFunctionType()
/* 43:   */   {
/* 44:59 */     return this.functionType;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setFunctionType(List<String> functionType)
/* 48:   */   {
/* 49:62 */     this.functionType = functionType;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getGotoUrl()
/* 53:   */   {
/* 54:66 */     return this.gotoUrl;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setGotoUrl(String gotoUrl)
/* 58:   */   {
/* 59:69 */     this.gotoUrl = gotoUrl;
/* 60:   */   }
/* 61:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.SupportFunction
 * JD-Core Version:    0.7.0.1
 */