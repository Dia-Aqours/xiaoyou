/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ProdRelationVO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5742429439724983143L;
/*  10:    */   @ApiField("num")
/*  11:    */   private Long num;
/*  12:    */   @ApiField("num_type")
/*  13:    */   private String numType;
/*  14:    */   @ApiField("prod_code")
/*  15:    */   private String prodCode;
/*  16:    */   @ApiField("prod_rel_code")
/*  17:    */   private String prodRelCode;
/*  18:    */   @ApiField("prod_rel_name")
/*  19:    */   private String prodRelName;
/*  20:    */   @ApiField("prod_rel_type")
/*  21:    */   private String prodRelType;
/*  22:    */   @ApiField("prod_rel_version")
/*  23:    */   private String prodRelVersion;
/*  24:    */   @ApiField("prod_version")
/*  25:    */   private String prodVersion;
/*  26:    */   @ApiField("sub_prod_rel_type")
/*  27:    */   private String subProdRelType;
/*  28:    */   
/*  29:    */   public Long getNum()
/*  30:    */   {
/*  31: 71 */     return this.num;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setNum(Long num)
/*  35:    */   {
/*  36: 74 */     this.num = num;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getNumType()
/*  40:    */   {
/*  41: 78 */     return this.numType;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setNumType(String numType)
/*  45:    */   {
/*  46: 81 */     this.numType = numType;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getProdCode()
/*  50:    */   {
/*  51: 85 */     return this.prodCode;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setProdCode(String prodCode)
/*  55:    */   {
/*  56: 88 */     this.prodCode = prodCode;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getProdRelCode()
/*  60:    */   {
/*  61: 92 */     return this.prodRelCode;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setProdRelCode(String prodRelCode)
/*  65:    */   {
/*  66: 95 */     this.prodRelCode = prodRelCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getProdRelName()
/*  70:    */   {
/*  71: 99 */     return this.prodRelName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setProdRelName(String prodRelName)
/*  75:    */   {
/*  76:102 */     this.prodRelName = prodRelName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getProdRelType()
/*  80:    */   {
/*  81:106 */     return this.prodRelType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setProdRelType(String prodRelType)
/*  85:    */   {
/*  86:109 */     this.prodRelType = prodRelType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getProdRelVersion()
/*  90:    */   {
/*  91:113 */     return this.prodRelVersion;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setProdRelVersion(String prodRelVersion)
/*  95:    */   {
/*  96:116 */     this.prodRelVersion = prodRelVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getProdVersion()
/* 100:    */   {
/* 101:120 */     return this.prodVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setProdVersion(String prodVersion)
/* 105:    */   {
/* 106:123 */     this.prodVersion = prodVersion;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getSubProdRelType()
/* 110:    */   {
/* 111:127 */     return this.subProdRelType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setSubProdRelType(String subProdRelType)
/* 115:    */   {
/* 116:130 */     this.subProdRelType = subProdRelType;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ProdRelationVO
 * JD-Core Version:    0.7.0.1
 */