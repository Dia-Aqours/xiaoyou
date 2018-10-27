/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class KoubeiTradeItemBuyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6416271766856761622L;
/*  10:    */   @ApiField("current_price")
/*  11:    */   private String currentPrice;
/*  12:    */   @ApiField("ext_info")
/*  13:    */   private String extInfo;
/*  14:    */   @ApiField("item_id")
/*  15:    */   private String itemId;
/*  16:    */   @ApiField("original_price")
/*  17:    */   private String originalPrice;
/*  18:    */   @ApiField("out_biz_no")
/*  19:    */   private String outBizNo;
/*  20:    */   @ApiField("quantity")
/*  21:    */   private Long quantity;
/*  22:    */   @ApiField("shop_id")
/*  23:    */   private String shopId;
/*  24:    */   
/*  25:    */   public String getCurrentPrice()
/*  26:    */   {
/*  27: 60 */     return this.currentPrice;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setCurrentPrice(String currentPrice)
/*  31:    */   {
/*  32: 63 */     this.currentPrice = currentPrice;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getExtInfo()
/*  36:    */   {
/*  37: 67 */     return this.extInfo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setExtInfo(String extInfo)
/*  41:    */   {
/*  42: 70 */     this.extInfo = extInfo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getItemId()
/*  46:    */   {
/*  47: 74 */     return this.itemId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setItemId(String itemId)
/*  51:    */   {
/*  52: 77 */     this.itemId = itemId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getOriginalPrice()
/*  56:    */   {
/*  57: 81 */     return this.originalPrice;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setOriginalPrice(String originalPrice)
/*  61:    */   {
/*  62: 84 */     this.originalPrice = originalPrice;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getOutBizNo()
/*  66:    */   {
/*  67: 88 */     return this.outBizNo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setOutBizNo(String outBizNo)
/*  71:    */   {
/*  72: 91 */     this.outBizNo = outBizNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public Long getQuantity()
/*  76:    */   {
/*  77: 95 */     return this.quantity;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setQuantity(Long quantity)
/*  81:    */   {
/*  82: 98 */     this.quantity = quantity;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getShopId()
/*  86:    */   {
/*  87:102 */     return this.shopId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setShopId(String shopId)
/*  91:    */   {
/*  92:105 */     this.shopId = shopId;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiTradeItemBuyModel
 * JD-Core Version:    0.7.0.1
 */