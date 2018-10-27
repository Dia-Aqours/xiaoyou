/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ExproductconfResponse
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 5469684112317442762L;
/*  10:    */   @ApiField("charge_inst")
/*  11:    */   private String chargeInst;
/*  12:    */   @ApiField("chargeinst_name")
/*  13:    */   private String chargeinstName;
/*  14:    */   @ApiField("chargeoff_inst")
/*  15:    */   private String chargeoffInst;
/*  16:    */   @ApiField("chargeoffinst_name")
/*  17:    */   private String chargeoffinstName;
/*  18:    */   @ApiField("city")
/*  19:    */   private String city;
/*  20:    */   @ApiField("extend")
/*  21:    */   private String extend;
/*  22:    */   @ApiField("province")
/*  23:    */   private String province;
/*  24:    */   @ApiField("status")
/*  25:    */   private String status;
/*  26:    */   
/*  27:    */   public String getChargeInst()
/*  28:    */   {
/*  29: 65 */     return this.chargeInst;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setChargeInst(String chargeInst)
/*  33:    */   {
/*  34: 68 */     this.chargeInst = chargeInst;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getChargeinstName()
/*  38:    */   {
/*  39: 72 */     return this.chargeinstName;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setChargeinstName(String chargeinstName)
/*  43:    */   {
/*  44: 75 */     this.chargeinstName = chargeinstName;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getChargeoffInst()
/*  48:    */   {
/*  49: 79 */     return this.chargeoffInst;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setChargeoffInst(String chargeoffInst)
/*  53:    */   {
/*  54: 82 */     this.chargeoffInst = chargeoffInst;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getChargeoffinstName()
/*  58:    */   {
/*  59: 86 */     return this.chargeoffinstName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setChargeoffinstName(String chargeoffinstName)
/*  63:    */   {
/*  64: 89 */     this.chargeoffinstName = chargeoffinstName;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCity()
/*  68:    */   {
/*  69: 93 */     return this.city;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCity(String city)
/*  73:    */   {
/*  74: 96 */     this.city = city;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getExtend()
/*  78:    */   {
/*  79:100 */     return this.extend;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setExtend(String extend)
/*  83:    */   {
/*  84:103 */     this.extend = extend;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getProvince()
/*  88:    */   {
/*  89:107 */     return this.province;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setProvince(String province)
/*  93:    */   {
/*  94:110 */     this.province = province;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getStatus()
/*  98:    */   {
/*  99:114 */     return this.status;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setStatus(String status)
/* 103:    */   {
/* 104:117 */     this.status = status;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ExproductconfResponse
 * JD-Core Version:    0.7.0.1
 */