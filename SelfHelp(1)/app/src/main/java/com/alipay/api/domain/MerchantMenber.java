/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MerchantMenber
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5663648466294238558L;
/* 10:   */   @ApiField("birth")
/* 11:   */   private String birth;
/* 12:   */   @ApiField("cell")
/* 13:   */   private String cell;
/* 14:   */   @ApiField("gende")
/* 15:   */   private String gende;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
/* 18:   */   
/* 19:   */   public String getBirth()
/* 20:   */   {
/* 21:41 */     return this.birth;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBirth(String birth)
/* 25:   */   {
/* 26:44 */     this.birth = birth;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCell()
/* 30:   */   {
/* 31:48 */     return this.cell;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCell(String cell)
/* 35:   */   {
/* 36:51 */     this.cell = cell;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getGende()
/* 40:   */   {
/* 41:55 */     return this.gende;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setGende(String gende)
/* 45:   */   {
/* 46:58 */     this.gende = gende;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getName()
/* 50:   */   {
/* 51:62 */     return this.name;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setName(String name)
/* 55:   */   {
/* 56:65 */     this.name = name;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantMenber
 * JD-Core Version:    0.7.0.1
 */