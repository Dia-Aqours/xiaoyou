/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class ItemInfo
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 7854282791185877852L;
/*  12:    */   @ApiListField("item_ids")
/*  13:    */   @ApiField("string")
/*  14:    */   private List<String> itemIds;
/*  15:    */   @ApiListField("item_imgs")
/*  16:    */   @ApiField("string")
/*  17:    */   private List<String> itemImgs;
/*  18:    */   @ApiField("item_link")
/*  19:    */   private String itemLink;
/*  20:    */   @ApiField("item_name")
/*  21:    */   private String itemName;
/*  22:    */   @ApiField("item_text")
/*  23:    */   private String itemText;
/*  24:    */   @ApiField("max_discount_num")
/*  25:    */   private String maxDiscountNum;
/*  26:    */   @ApiField("min_consume_num")
/*  27:    */   private String minConsumeNum;
/*  28:    */   @ApiField("original_price")
/*  29:    */   private String originalPrice;
/*  30:    */   
/*  31:    */   public List<String> getItemIds()
/*  32:    */   {
/*  33: 74 */     return this.itemIds;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setItemIds(List<String> itemIds)
/*  37:    */   {
/*  38: 77 */     this.itemIds = itemIds;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public List<String> getItemImgs()
/*  42:    */   {
/*  43: 81 */     return this.itemImgs;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setItemImgs(List<String> itemImgs)
/*  47:    */   {
/*  48: 84 */     this.itemImgs = itemImgs;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getItemLink()
/*  52:    */   {
/*  53: 88 */     return this.itemLink;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setItemLink(String itemLink)
/*  57:    */   {
/*  58: 91 */     this.itemLink = itemLink;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getItemName()
/*  62:    */   {
/*  63: 95 */     return this.itemName;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setItemName(String itemName)
/*  67:    */   {
/*  68: 98 */     this.itemName = itemName;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getItemText()
/*  72:    */   {
/*  73:102 */     return this.itemText;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setItemText(String itemText)
/*  77:    */   {
/*  78:105 */     this.itemText = itemText;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getMaxDiscountNum()
/*  82:    */   {
/*  83:109 */     return this.maxDiscountNum;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setMaxDiscountNum(String maxDiscountNum)
/*  87:    */   {
/*  88:112 */     this.maxDiscountNum = maxDiscountNum;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getMinConsumeNum()
/*  92:    */   {
/*  93:116 */     return this.minConsumeNum;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setMinConsumeNum(String minConsumeNum)
/*  97:    */   {
/*  98:119 */     this.minConsumeNum = minConsumeNum;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getOriginalPrice()
/* 102:    */   {
/* 103:123 */     return this.originalPrice;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setOriginalPrice(String originalPrice)
/* 107:    */   {
/* 108:126 */     this.originalPrice = originalPrice;
/* 109:    */   }
/* 110:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ItemInfo
 * JD-Core Version:    0.7.0.1
 */