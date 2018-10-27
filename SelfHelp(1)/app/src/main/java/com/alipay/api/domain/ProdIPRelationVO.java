/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ProdIPRelationVO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3698526198461672171L;
/*  10:    */   @ApiField("ip_alias_name")
/*  11:    */   private String ipAliasName;
/*  12:    */   @ApiField("ip_belong_platform")
/*  13:    */   private String ipBelongPlatform;
/*  14:    */   @ApiField("ip_code")
/*  15:    */   private String ipCode;
/*  16:    */   @ApiField("ip_name")
/*  17:    */   private String ipName;
/*  18:    */   @ApiField("ip_sub_type")
/*  19:    */   private String ipSubType;
/*  20:    */   @ApiField("ip_type")
/*  21:    */   private String ipType;
/*  22:    */   @ApiField("prod_code")
/*  23:    */   private String prodCode;
/*  24:    */   @ApiField("prod_version")
/*  25:    */   private String prodVersion;
/*  26:    */   @ApiField("role_id")
/*  27:    */   private String roleId;
/*  28:    */   
/*  29:    */   public String getIpAliasName()
/*  30:    */   {
/*  31: 71 */     return this.ipAliasName;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setIpAliasName(String ipAliasName)
/*  35:    */   {
/*  36: 74 */     this.ipAliasName = ipAliasName;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getIpBelongPlatform()
/*  40:    */   {
/*  41: 78 */     return this.ipBelongPlatform;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setIpBelongPlatform(String ipBelongPlatform)
/*  45:    */   {
/*  46: 81 */     this.ipBelongPlatform = ipBelongPlatform;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getIpCode()
/*  50:    */   {
/*  51: 85 */     return this.ipCode;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setIpCode(String ipCode)
/*  55:    */   {
/*  56: 88 */     this.ipCode = ipCode;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getIpName()
/*  60:    */   {
/*  61: 92 */     return this.ipName;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setIpName(String ipName)
/*  65:    */   {
/*  66: 95 */     this.ipName = ipName;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getIpSubType()
/*  70:    */   {
/*  71: 99 */     return this.ipSubType;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setIpSubType(String ipSubType)
/*  75:    */   {
/*  76:102 */     this.ipSubType = ipSubType;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getIpType()
/*  80:    */   {
/*  81:106 */     return this.ipType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setIpType(String ipType)
/*  85:    */   {
/*  86:109 */     this.ipType = ipType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getProdCode()
/*  90:    */   {
/*  91:113 */     return this.prodCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setProdCode(String prodCode)
/*  95:    */   {
/*  96:116 */     this.prodCode = prodCode;
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
/* 109:    */   public String getRoleId()
/* 110:    */   {
/* 111:127 */     return this.roleId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setRoleId(String roleId)
/* 115:    */   {
/* 116:130 */     this.roleId = roleId;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ProdIPRelationVO
 * JD-Core Version:    0.7.0.1
 */