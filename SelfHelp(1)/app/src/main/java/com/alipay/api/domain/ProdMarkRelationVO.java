/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ProdMarkRelationVO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1517156221953922452L;
/* 10:   */   @ApiField("mark_code")
/* 11:   */   private String markCode;
/* 12:   */   @ApiField("mark_type")
/* 13:   */   private String markType;
/* 14:   */   @ApiField("prod_code")
/* 15:   */   private String prodCode;
/* 16:   */   @ApiField("prod_version")
/* 17:   */   private String prodVersion;
/* 18:   */   
/* 19:   */   public String getMarkCode()
/* 20:   */   {
/* 21:41 */     return this.markCode;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setMarkCode(String markCode)
/* 25:   */   {
/* 26:44 */     this.markCode = markCode;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getMarkType()
/* 30:   */   {
/* 31:48 */     return this.markType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setMarkType(String markType)
/* 35:   */   {
/* 36:51 */     this.markType = markType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getProdCode()
/* 40:   */   {
/* 41:55 */     return this.prodCode;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setProdCode(String prodCode)
/* 45:   */   {
/* 46:58 */     this.prodCode = prodCode;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getProdVersion()
/* 50:   */   {
/* 51:62 */     return this.prodVersion;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setProdVersion(String prodVersion)
/* 55:   */   {
/* 56:65 */     this.prodVersion = prodVersion;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ProdMarkRelationVO
 * JD-Core Version:    0.7.0.1
 */