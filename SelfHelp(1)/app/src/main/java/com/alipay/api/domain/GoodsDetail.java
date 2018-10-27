/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class GoodsDetail
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7664855288245434158L;
/*  10:    */   @ApiField("alipay_goods_id")
/*  11:    */   private String alipayGoodsId;
/*  12:    */   @ApiField("body")
/*  13:    */   private String body;
/*  14:    */   @ApiField("goods_category")
/*  15:    */   private String goodsCategory;
/*  16:    */   @ApiField("goods_id")
/*  17:    */   private String goodsId;
/*  18:    */   @ApiField("goods_name")
/*  19:    */   private String goodsName;
/*  20:    */   @ApiField("price")
/*  21:    */   private String price;
/*  22:    */   @ApiField("quantity")
/*  23:    */   private Long quantity;
/*  24:    */   @ApiField("show_url")
/*  25:    */   private String showUrl;
/*  26:    */   
/*  27:    */   public String getAlipayGoodsId()
/*  28:    */   {
/*  29: 65 */     return this.alipayGoodsId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setAlipayGoodsId(String alipayGoodsId)
/*  33:    */   {
/*  34: 68 */     this.alipayGoodsId = alipayGoodsId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getBody()
/*  38:    */   {
/*  39: 72 */     return this.body;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBody(String body)
/*  43:    */   {
/*  44: 75 */     this.body = body;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getGoodsCategory()
/*  48:    */   {
/*  49: 79 */     return this.goodsCategory;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setGoodsCategory(String goodsCategory)
/*  53:    */   {
/*  54: 82 */     this.goodsCategory = goodsCategory;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getGoodsId()
/*  58:    */   {
/*  59: 86 */     return this.goodsId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setGoodsId(String goodsId)
/*  63:    */   {
/*  64: 89 */     this.goodsId = goodsId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getGoodsName()
/*  68:    */   {
/*  69: 93 */     return this.goodsName;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setGoodsName(String goodsName)
/*  73:    */   {
/*  74: 96 */     this.goodsName = goodsName;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getPrice()
/*  78:    */   {
/*  79:100 */     return this.price;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setPrice(String price)
/*  83:    */   {
/*  84:103 */     this.price = price;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Long getQuantity()
/*  88:    */   {
/*  89:107 */     return this.quantity;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setQuantity(Long quantity)
/*  93:    */   {
/*  94:110 */     this.quantity = quantity;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getShowUrl()
/*  98:    */   {
/*  99:114 */     return this.showUrl;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setShowUrl(String showUrl)
/* 103:    */   {
/* 104:117 */     this.showUrl = showUrl;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GoodsDetail
 * JD-Core Version:    0.7.0.1
 */