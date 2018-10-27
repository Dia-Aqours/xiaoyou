/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class OrderDetail
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5533366154367887727L;
/*  12:    */   @ApiField("app_id")
/*  13:    */   private String appId;
/*  14:    */   @ApiField("body")
/*  15:    */   private String body;
/*  16:    */   @ApiListField("goods_detail")
/*  17:    */   @ApiField("goods_detail")
/*  18:    */   private List<GoodsDetail> goodsDetail;
/*  19:    */   @ApiField("out_trade_no")
/*  20:    */   private String outTradeNo;
/*  21:    */   @ApiField("passback_params")
/*  22:    */   private String passbackParams;
/*  23:    */   @ApiField("product_code")
/*  24:    */   private String productCode;
/*  25:    */   @ApiField("seller_id")
/*  26:    */   private String sellerId;
/*  27:    */   @ApiField("seller_logon_id")
/*  28:    */   private String sellerLogonId;
/*  29:    */   @ApiField("show_url")
/*  30:    */   private String showUrl;
/*  31:    */   @ApiField("subject")
/*  32:    */   private String subject;
/*  33:    */   @ApiField("total_amount")
/*  34:    */   private String totalAmount;
/*  35:    */   
/*  36:    */   public String getAppId()
/*  37:    */   {
/*  38: 89 */     return this.appId;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAppId(String appId)
/*  42:    */   {
/*  43: 92 */     this.appId = appId;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getBody()
/*  47:    */   {
/*  48: 96 */     return this.body;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setBody(String body)
/*  52:    */   {
/*  53: 99 */     this.body = body;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public List<GoodsDetail> getGoodsDetail()
/*  57:    */   {
/*  58:103 */     return this.goodsDetail;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setGoodsDetail(List<GoodsDetail> goodsDetail)
/*  62:    */   {
/*  63:106 */     this.goodsDetail = goodsDetail;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getOutTradeNo()
/*  67:    */   {
/*  68:110 */     return this.outTradeNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setOutTradeNo(String outTradeNo)
/*  72:    */   {
/*  73:113 */     this.outTradeNo = outTradeNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getPassbackParams()
/*  77:    */   {
/*  78:117 */     return this.passbackParams;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setPassbackParams(String passbackParams)
/*  82:    */   {
/*  83:120 */     this.passbackParams = passbackParams;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getProductCode()
/*  87:    */   {
/*  88:124 */     return this.productCode;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setProductCode(String productCode)
/*  92:    */   {
/*  93:127 */     this.productCode = productCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getSellerId()
/*  97:    */   {
/*  98:131 */     return this.sellerId;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setSellerId(String sellerId)
/* 102:    */   {
/* 103:134 */     this.sellerId = sellerId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getSellerLogonId()
/* 107:    */   {
/* 108:138 */     return this.sellerLogonId;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setSellerLogonId(String sellerLogonId)
/* 112:    */   {
/* 113:141 */     this.sellerLogonId = sellerLogonId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getShowUrl()
/* 117:    */   {
/* 118:145 */     return this.showUrl;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setShowUrl(String showUrl)
/* 122:    */   {
/* 123:148 */     this.showUrl = showUrl;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getSubject()
/* 127:    */   {
/* 128:152 */     return this.subject;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setSubject(String subject)
/* 132:    */   {
/* 133:155 */     this.subject = subject;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getTotalAmount()
/* 137:    */   {
/* 138:159 */     return this.totalAmount;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setTotalAmount(String totalAmount)
/* 142:    */   {
/* 143:162 */     this.totalAmount = totalAmount;
/* 144:    */   }
/* 145:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OrderDetail
 * JD-Core Version:    0.7.0.1
 */