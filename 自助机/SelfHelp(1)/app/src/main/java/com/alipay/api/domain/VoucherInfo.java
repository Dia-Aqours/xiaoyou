/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class VoucherInfo
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5361247685191969641L;
/*  12:    */   @ApiField("can_give_friend")
/*  13:    */   private Boolean canGiveFriend;
/*  14:    */   @ApiField("use_rule")
/*  15:    */   private UseRuleInfo useRule;
/*  16:    */   @ApiField("valid_date")
/*  17:    */   private ValidDateInfo validDate;
/*  18:    */   @ApiField("voucher_desc")
/*  19:    */   private String voucherDesc;
/*  20:    */   @ApiField("voucher_img")
/*  21:    */   private String voucherImg;
/*  22:    */   @ApiField("voucher_logo")
/*  23:    */   private String voucherLogo;
/*  24:    */   @ApiField("voucher_name")
/*  25:    */   private String voucherName;
/*  26:    */   @ApiListField("voucher_terms")
/*  27:    */   @ApiField("voucher_term_info")
/*  28:    */   private List<VoucherTermInfo> voucherTerms;
/*  29:    */   @ApiField("voucher_type")
/*  30:    */   private String voucherType;
/*  31:    */   
/*  32:    */   public Boolean getCanGiveFriend()
/*  33:    */   {
/*  34: 75 */     return this.canGiveFriend;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setCanGiveFriend(Boolean canGiveFriend)
/*  38:    */   {
/*  39: 78 */     this.canGiveFriend = canGiveFriend;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public UseRuleInfo getUseRule()
/*  43:    */   {
/*  44: 82 */     return this.useRule;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setUseRule(UseRuleInfo useRule)
/*  48:    */   {
/*  49: 85 */     this.useRule = useRule;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public ValidDateInfo getValidDate()
/*  53:    */   {
/*  54: 89 */     return this.validDate;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setValidDate(ValidDateInfo validDate)
/*  58:    */   {
/*  59: 92 */     this.validDate = validDate;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getVoucherDesc()
/*  63:    */   {
/*  64: 96 */     return this.voucherDesc;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setVoucherDesc(String voucherDesc)
/*  68:    */   {
/*  69: 99 */     this.voucherDesc = voucherDesc;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getVoucherImg()
/*  73:    */   {
/*  74:103 */     return this.voucherImg;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setVoucherImg(String voucherImg)
/*  78:    */   {
/*  79:106 */     this.voucherImg = voucherImg;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getVoucherLogo()
/*  83:    */   {
/*  84:110 */     return this.voucherLogo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setVoucherLogo(String voucherLogo)
/*  88:    */   {
/*  89:113 */     this.voucherLogo = voucherLogo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getVoucherName()
/*  93:    */   {
/*  94:117 */     return this.voucherName;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setVoucherName(String voucherName)
/*  98:    */   {
/*  99:120 */     this.voucherName = voucherName;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public List<VoucherTermInfo> getVoucherTerms()
/* 103:    */   {
/* 104:124 */     return this.voucherTerms;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setVoucherTerms(List<VoucherTermInfo> voucherTerms)
/* 108:    */   {
/* 109:127 */     this.voucherTerms = voucherTerms;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getVoucherType()
/* 113:    */   {
/* 114:131 */     return this.voucherType;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setVoucherType(String voucherType)
/* 118:    */   {
/* 119:134 */     this.voucherType = voucherType;
/* 120:    */   }
/* 121:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.VoucherInfo
 * JD-Core Version:    0.7.0.1
 */