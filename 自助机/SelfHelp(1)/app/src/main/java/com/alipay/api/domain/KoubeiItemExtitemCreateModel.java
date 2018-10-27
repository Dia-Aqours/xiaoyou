/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class KoubeiItemExtitemCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8686612832932379575L;
/*  10:    */   @ApiField("brand_code")
/*  11:    */   private String brandCode;
/*  12:    */   @ApiField("category_code")
/*  13:    */   private String categoryCode;
/*  14:    */   @ApiField("count")
/*  15:    */   private Long count;
/*  16:    */   @ApiField("country")
/*  17:    */   private String country;
/*  18:    */   @ApiField("description")
/*  19:    */   private String description;
/*  20:    */   @ApiField("item_code")
/*  21:    */   private String itemCode;
/*  22:    */   @ApiField("picture")
/*  23:    */   private String picture;
/*  24:    */   @ApiField("price")
/*  25:    */   private Long price;
/*  26:    */   @ApiField("specification")
/*  27:    */   private String specification;
/*  28:    */   @ApiField("title")
/*  29:    */   private String title;
/*  30:    */   
/*  31:    */   public String getBrandCode()
/*  32:    */   {
/*  33: 77 */     return this.brandCode;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setBrandCode(String brandCode)
/*  37:    */   {
/*  38: 80 */     this.brandCode = brandCode;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getCategoryCode()
/*  42:    */   {
/*  43: 84 */     return this.categoryCode;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setCategoryCode(String categoryCode)
/*  47:    */   {
/*  48: 87 */     this.categoryCode = categoryCode;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public Long getCount()
/*  52:    */   {
/*  53: 91 */     return this.count;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setCount(Long count)
/*  57:    */   {
/*  58: 94 */     this.count = count;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getCountry()
/*  62:    */   {
/*  63: 98 */     return this.country;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setCountry(String country)
/*  67:    */   {
/*  68:101 */     this.country = country;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getDescription()
/*  72:    */   {
/*  73:105 */     return this.description;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setDescription(String description)
/*  77:    */   {
/*  78:108 */     this.description = description;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getItemCode()
/*  82:    */   {
/*  83:112 */     return this.itemCode;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setItemCode(String itemCode)
/*  87:    */   {
/*  88:115 */     this.itemCode = itemCode;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getPicture()
/*  92:    */   {
/*  93:119 */     return this.picture;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setPicture(String picture)
/*  97:    */   {
/*  98:122 */     this.picture = picture;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public Long getPrice()
/* 102:    */   {
/* 103:126 */     return this.price;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setPrice(Long price)
/* 107:    */   {
/* 108:129 */     this.price = price;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getSpecification()
/* 112:    */   {
/* 113:133 */     return this.specification;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setSpecification(String specification)
/* 117:    */   {
/* 118:136 */     this.specification = specification;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getTitle()
/* 122:    */   {
/* 123:140 */     return this.title;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setTitle(String title)
/* 127:    */   {
/* 128:143 */     this.title = title;
/* 129:    */   }
/* 130:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiItemExtitemCreateModel

 * JD-Core Version:    0.7.0.1

 */