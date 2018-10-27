/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ShopDiscountInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4691816334159186526L;
/*  10:    */   @ApiField("cover")
/*  11:    */   private String cover;
/*  12:    */   @ApiField("description")
/*  13:    */   private String description;
/*  14:    */   @ApiField("is_all")
/*  15:    */   private String isAll;
/*  16:    */   @ApiField("item_id")
/*  17:    */   private String itemId;
/*  18:    */   @ApiField("promo_sub_type")
/*  19:    */   private String promoSubType;
/*  20:    */   @ApiField("promotion_type")
/*  21:    */   private String promotionType;
/*  22:    */   @ApiField("purchase_mode")
/*  23:    */   private String purchaseMode;
/*  24:    */   @ApiField("sales_quantity")
/*  25:    */   private String salesQuantity;
/*  26:    */   @ApiField("subject")
/*  27:    */   private String subject;
/*  28:    */   
/*  29:    */   public String getCover()
/*  30:    */   {
/*  31: 74 */     return this.cover;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setCover(String cover)
/*  35:    */   {
/*  36: 77 */     this.cover = cover;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getDescription()
/*  40:    */   {
/*  41: 81 */     return this.description;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setDescription(String description)
/*  45:    */   {
/*  46: 84 */     this.description = description;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getIsAll()
/*  50:    */   {
/*  51: 88 */     return this.isAll;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setIsAll(String isAll)
/*  55:    */   {
/*  56: 91 */     this.isAll = isAll;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getItemId()
/*  60:    */   {
/*  61: 95 */     return this.itemId;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setItemId(String itemId)
/*  65:    */   {
/*  66: 98 */     this.itemId = itemId;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getPromoSubType()
/*  70:    */   {
/*  71:102 */     return this.promoSubType;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setPromoSubType(String promoSubType)
/*  75:    */   {
/*  76:105 */     this.promoSubType = promoSubType;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getPromotionType()
/*  80:    */   {
/*  81:109 */     return this.promotionType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setPromotionType(String promotionType)
/*  85:    */   {
/*  86:112 */     this.promotionType = promotionType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getPurchaseMode()
/*  90:    */   {
/*  91:116 */     return this.purchaseMode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setPurchaseMode(String purchaseMode)
/*  95:    */   {
/*  96:119 */     this.purchaseMode = purchaseMode;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getSalesQuantity()
/* 100:    */   {
/* 101:123 */     return this.salesQuantity;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setSalesQuantity(String salesQuantity)
/* 105:    */   {
/* 106:126 */     this.salesQuantity = salesQuantity;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getSubject()
/* 110:    */   {
/* 111:130 */     return this.subject;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setSubject(String subject)
/* 115:    */   {
/* 116:133 */     this.subject = subject;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ShopDiscountInfo
 * JD-Core Version:    0.7.0.1
 */