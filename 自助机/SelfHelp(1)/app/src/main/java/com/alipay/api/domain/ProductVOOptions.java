/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ProductVOOptions
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3392156914786582362L;
/*  10:    */   @ApiField("include_condition_group")
/*  11:    */   private Boolean includeConditionGroup;
/*  12:    */   @ApiField("include_prod_base")
/*  13:    */   private Boolean includeProdBase;
/*  14:    */   @ApiField("include_prod_ip")
/*  15:    */   private Boolean includeProdIp;
/*  16:    */   @ApiField("include_prod_lo")
/*  17:    */   private Boolean includeProdLo;
/*  18:    */   @ApiField("include_prod_mark")
/*  19:    */   private Boolean includeProdMark;
/*  20:    */   @ApiField("include_prod_rel")
/*  21:    */   private String includeProdRel;
/*  22:    */   @ApiField("include_prod_ri")
/*  23:    */   private Boolean includeProdRi;
/*  24:    */   
/*  25:    */   public Boolean getIncludeConditionGroup()
/*  26:    */   {
/*  27: 59 */     return this.includeConditionGroup;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setIncludeConditionGroup(Boolean includeConditionGroup)
/*  31:    */   {
/*  32: 62 */     this.includeConditionGroup = includeConditionGroup;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public Boolean getIncludeProdBase()
/*  36:    */   {
/*  37: 66 */     return this.includeProdBase;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setIncludeProdBase(Boolean includeProdBase)
/*  41:    */   {
/*  42: 69 */     this.includeProdBase = includeProdBase;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public Boolean getIncludeProdIp()
/*  46:    */   {
/*  47: 73 */     return this.includeProdIp;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setIncludeProdIp(Boolean includeProdIp)
/*  51:    */   {
/*  52: 76 */     this.includeProdIp = includeProdIp;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public Boolean getIncludeProdLo()
/*  56:    */   {
/*  57: 80 */     return this.includeProdLo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setIncludeProdLo(Boolean includeProdLo)
/*  61:    */   {
/*  62: 83 */     this.includeProdLo = includeProdLo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public Boolean getIncludeProdMark()
/*  66:    */   {
/*  67: 87 */     return this.includeProdMark;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setIncludeProdMark(Boolean includeProdMark)
/*  71:    */   {
/*  72: 90 */     this.includeProdMark = includeProdMark;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getIncludeProdRel()
/*  76:    */   {
/*  77: 94 */     return this.includeProdRel;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setIncludeProdRel(String includeProdRel)
/*  81:    */   {
/*  82: 97 */     this.includeProdRel = includeProdRel;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public Boolean getIncludeProdRi()
/*  86:    */   {
/*  87:101 */     return this.includeProdRi;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setIncludeProdRi(Boolean includeProdRi)
/*  91:    */   {
/*  92:104 */     this.includeProdRi = includeProdRi;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ProductVOOptions
 * JD-Core Version:    0.7.0.1
 */