/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaMerchantOrderRentQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3442267431844621155L;
/* 10:   */   @ApiField("out_order_no")
/* 11:   */   private String outOrderNo;
/* 12:   */   @ApiField("product_code")
/* 13:   */   private String productCode;
/* 14:   */   
/* 15:   */   public String getOutOrderNo()
/* 16:   */   {
/* 17:29 */     return this.outOrderNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOutOrderNo(String outOrderNo)
/* 21:   */   {
/* 22:32 */     this.outOrderNo = outOrderNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getProductCode()
/* 26:   */   {
/* 27:36 */     return this.productCode;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setProductCode(String productCode)
/* 31:   */   {
/* 32:39 */     this.productCode = productCode;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaMerchantOrderRentQueryModel
 * JD-Core Version:    0.7.0.1
 */