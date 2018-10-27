/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class InvoiceItemContent
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4861471546395653155L;
/*  10:    */   @ApiField("item_amount")
/*  11:    */   private String itemAmount;
/*  12:    */   @ApiField("item_name")
/*  13:    */   private String itemName;
/*  14:    */   @ApiField("item_no")
/*  15:    */   private String itemNo;
/*  16:    */   @ApiField("item_price")
/*  17:    */   private String itemPrice;
/*  18:    */   @ApiField("item_quantity")
/*  19:    */   private Long itemQuantity;
/*  20:    */   @ApiField("item_sum_price")
/*  21:    */   private String itemSumPrice;
/*  22:    */   @ApiField("item_tax_price")
/*  23:    */   private String itemTaxPrice;
/*  24:    */   @ApiField("item_tax_rate")
/*  25:    */   private String itemTaxRate;
/*  26:    */   @ApiField("item_unit")
/*  27:    */   private String itemUnit;
/*  28:    */   @ApiField("row_type")
/*  29:    */   private Long rowType;
/*  30:    */   
/*  31:    */   public String getItemAmount()
/*  32:    */   {
/*  33: 77 */     return this.itemAmount;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setItemAmount(String itemAmount)
/*  37:    */   {
/*  38: 80 */     this.itemAmount = itemAmount;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getItemName()
/*  42:    */   {
/*  43: 84 */     return this.itemName;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setItemName(String itemName)
/*  47:    */   {
/*  48: 87 */     this.itemName = itemName;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getItemNo()
/*  52:    */   {
/*  53: 91 */     return this.itemNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setItemNo(String itemNo)
/*  57:    */   {
/*  58: 94 */     this.itemNo = itemNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getItemPrice()
/*  62:    */   {
/*  63: 98 */     return this.itemPrice;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setItemPrice(String itemPrice)
/*  67:    */   {
/*  68:101 */     this.itemPrice = itemPrice;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public Long getItemQuantity()
/*  72:    */   {
/*  73:105 */     return this.itemQuantity;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setItemQuantity(Long itemQuantity)
/*  77:    */   {
/*  78:108 */     this.itemQuantity = itemQuantity;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getItemSumPrice()
/*  82:    */   {
/*  83:112 */     return this.itemSumPrice;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setItemSumPrice(String itemSumPrice)
/*  87:    */   {
/*  88:115 */     this.itemSumPrice = itemSumPrice;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getItemTaxPrice()
/*  92:    */   {
/*  93:119 */     return this.itemTaxPrice;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setItemTaxPrice(String itemTaxPrice)
/*  97:    */   {
/*  98:122 */     this.itemTaxPrice = itemTaxPrice;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getItemTaxRate()
/* 102:    */   {
/* 103:126 */     return this.itemTaxRate;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setItemTaxRate(String itemTaxRate)
/* 107:    */   {
/* 108:129 */     this.itemTaxRate = itemTaxRate;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getItemUnit()
/* 112:    */   {
/* 113:133 */     return this.itemUnit;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setItemUnit(String itemUnit)
/* 117:    */   {
/* 118:136 */     this.itemUnit = itemUnit;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public Long getRowType()
/* 122:    */   {
/* 123:140 */     return this.rowType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setRowType(Long rowType)
/* 127:    */   {
/* 128:143 */     this.rowType = rowType;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InvoiceItemContent
 * JD-Core Version:    0.7.0.1
 */