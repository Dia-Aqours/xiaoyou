/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class InsCoverage
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7713831596725285727L;
/*  10:    */   @ApiField("coverage_name")
/*  11:    */   private String coverageName;
/*  12:    */   @ApiField("coverage_no")
/*  13:    */   private String coverageNo;
/*  14:    */   @ApiField("effect_end_time")
/*  15:    */   private String effectEndTime;
/*  16:    */   @ApiField("effect_start_time")
/*  17:    */   private String effectStartTime;
/*  18:    */   @ApiField("iop")
/*  19:    */   private Long iop;
/*  20:    */   @ApiField("iop_premium")
/*  21:    */   private Long iopPremium;
/*  22:    */   @ApiField("premium")
/*  23:    */   private Long premium;
/*  24:    */   @ApiField("sum_insured")
/*  25:    */   private Long sumInsured;
/*  26:    */   
/*  27:    */   public String getCoverageName()
/*  28:    */   {
/*  29: 66 */     return this.coverageName;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setCoverageName(String coverageName)
/*  33:    */   {
/*  34: 69 */     this.coverageName = coverageName;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getCoverageNo()
/*  38:    */   {
/*  39: 73 */     return this.coverageNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setCoverageNo(String coverageNo)
/*  43:    */   {
/*  44: 76 */     this.coverageNo = coverageNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getEffectEndTime()
/*  48:    */   {
/*  49: 80 */     return this.effectEndTime;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setEffectEndTime(String effectEndTime)
/*  53:    */   {
/*  54: 83 */     this.effectEndTime = effectEndTime;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getEffectStartTime()
/*  58:    */   {
/*  59: 87 */     return this.effectStartTime;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setEffectStartTime(String effectStartTime)
/*  63:    */   {
/*  64: 90 */     this.effectStartTime = effectStartTime;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public Long getIop()
/*  68:    */   {
/*  69: 94 */     return this.iop;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setIop(Long iop)
/*  73:    */   {
/*  74: 97 */     this.iop = iop;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public Long getIopPremium()
/*  78:    */   {
/*  79:101 */     return this.iopPremium;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setIopPremium(Long iopPremium)
/*  83:    */   {
/*  84:104 */     this.iopPremium = iopPremium;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Long getPremium()
/*  88:    */   {
/*  89:108 */     return this.premium;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setPremium(Long premium)
/*  93:    */   {
/*  94:111 */     this.premium = premium;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public Long getSumInsured()
/*  98:    */   {
/*  99:115 */     return this.sumInsured;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setSumInsured(Long sumInsured)
/* 103:    */   {
/* 104:118 */     this.sumInsured = sumInsured;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsCoverage
 * JD-Core Version:    0.7.0.1
 */