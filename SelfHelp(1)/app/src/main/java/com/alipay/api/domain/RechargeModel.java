/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class RechargeModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 7699688943732472144L;
/* 12:   */   @ApiField("mobile_no_segment")
/* 13:   */   private String mobileNoSegment;
/* 14:   */   @ApiField("pay_send")
/* 15:   */   private String paySend;
/* 16:   */   @ApiListField("sale_products")
/* 17:   */   @ApiField("sale_product")
/* 18:   */   private List<SaleProduct> saleProducts;
/* 19:   */   
/* 20:   */   public String getMobileNoSegment()
/* 21:   */   {
/* 22:39 */     return this.mobileNoSegment;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setMobileNoSegment(String mobileNoSegment)
/* 26:   */   {
/* 27:42 */     this.mobileNoSegment = mobileNoSegment;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getPaySend()
/* 31:   */   {
/* 32:46 */     return this.paySend;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setPaySend(String paySend)
/* 36:   */   {
/* 37:49 */     this.paySend = paySend;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<SaleProduct> getSaleProducts()
/* 41:   */   {
/* 42:53 */     return this.saleProducts;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setSaleProducts(List<SaleProduct> saleProducts)
/* 46:   */   {
/* 47:56 */     this.saleProducts = saleProducts;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RechargeModel
 * JD-Core Version:    0.7.0.1
 */