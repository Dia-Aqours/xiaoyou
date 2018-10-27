/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;

/*   7:    */
/*   8:    */ public class TemplateStyleInfoDTO
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 4362553934596319654L;
/*  12:    */   @ApiField("background_id")
/*  13:    */   private String backgroundId;
/*  14:    */   @ApiField("bg_color")
/*  15:    */   private String bgColor;
/*  16:    */   @ApiField("brand_name")
/*  17:    */   private String brandName;
/*  18:    */   @ApiField("card_show_name")
/*  19:    */   private String cardShowName;
/*  20:    */   @ApiField("color")
/*  21:    */   private String color;
/*  22:    */   @ApiListField("feature_descriptions")
/*  23:    */   @ApiField("string")
/*  24:    */   private List<String> featureDescriptions;
/*  25:    */   @ApiField("logo_id")
/*  26:    */   private String logoId;
/*  27:    */   @ApiField("slogan")
/*  28:    */   private String slogan;
/*  29:    */   @ApiField("slogan_img_id")
/*  30:    */   private String sloganImgId;
/*  31:    */   
/*  32:    */   public String getBackgroundId()
/*  33:    */   {
/*  34: 83 */     return this.backgroundId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setBackgroundId(String backgroundId)
/*  38:    */   {
/*  39: 86 */     this.backgroundId = backgroundId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getBgColor()
/*  43:    */   {
/*  44: 90 */     return this.bgColor;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBgColor(String bgColor)
/*  48:    */   {
/*  49: 93 */     this.bgColor = bgColor;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getBrandName()
/*  53:    */   {
/*  54: 97 */     return this.brandName;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setBrandName(String brandName)
/*  58:    */   {
/*  59:100 */     this.brandName = brandName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getCardShowName()
/*  63:    */   {
/*  64:104 */     return this.cardShowName;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setCardShowName(String cardShowName)
/*  68:    */   {
/*  69:107 */     this.cardShowName = cardShowName;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getColor()
/*  73:    */   {
/*  74:111 */     return this.color;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setColor(String color)
/*  78:    */   {
/*  79:114 */     this.color = color;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public List<String> getFeatureDescriptions()
/*  83:    */   {
/*  84:118 */     return this.featureDescriptions;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setFeatureDescriptions(List<String> featureDescriptions)
/*  88:    */   {
/*  89:121 */     this.featureDescriptions = featureDescriptions;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getLogoId()
/*  93:    */   {
/*  94:125 */     return this.logoId;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setLogoId(String logoId)
/*  98:    */   {
/*  99:128 */     this.logoId = logoId;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getSlogan()
/* 103:    */   {
/* 104:132 */     return this.slogan;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setSlogan(String slogan)
/* 108:    */   {
/* 109:135 */     this.slogan = slogan;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getSloganImgId()
/* 113:    */   {
/* 114:139 */     return this.sloganImgId;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setSloganImgId(String sloganImgId)
/* 118:    */   {
/* 119:142 */     this.sloganImgId = sloganImgId;
/* 120:    */   }
/* 121:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.TemplateStyleInfoDTO

 * JD-Core Version:    0.7.0.1

 */