/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AntMerchantExpandPersonalApplyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4195339758431615837L;
/* 10:   */   @ApiField("order_no")
/* 11:   */   private String orderNo;
/* 12:   */   @ApiField("out_biz_no")
/* 13:   */   private String outBizNo;
/* 14:   */   
/* 15:   */   public void setOrderNo(String orderNo)
/* 16:   */   {
/* 17:30 */     this.orderNo = orderNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getOrderNo()
/* 21:   */   {
/* 22:33 */     return this.orderNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setOutBizNo(String outBizNo)
/* 26:   */   {
/* 27:37 */     this.outBizNo = outBizNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getOutBizNo()
/* 31:   */   {
/* 32:40 */     return this.outBizNo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AntMerchantExpandPersonalApplyResponse
 * JD-Core Version:    0.7.0.1
 */