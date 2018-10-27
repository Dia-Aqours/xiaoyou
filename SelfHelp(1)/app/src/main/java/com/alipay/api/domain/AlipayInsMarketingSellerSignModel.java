/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayInsMarketingSellerSignModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1767794272511931983L;
/* 10:   */   @ApiField("out_biz_no")
/* 11:   */   private String outBizNo;
/* 12:   */   @ApiField("prod_code")
/* 13:   */   private String prodCode;
/* 14:   */   @ApiField("seller")
/* 15:   */   private InsPerson seller;
/* 16:   */   @ApiField("sign_alipay_id")
/* 17:   */   private String signAlipayId;
/* 18:   */   
/* 19:   */   public String getOutBizNo()
/* 20:   */   {
/* 21:41 */     return this.outBizNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setOutBizNo(String outBizNo)
/* 25:   */   {
/* 26:44 */     this.outBizNo = outBizNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getProdCode()
/* 30:   */   {
/* 31:48 */     return this.prodCode;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setProdCode(String prodCode)
/* 35:   */   {
/* 36:51 */     this.prodCode = prodCode;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public InsPerson getSeller()
/* 40:   */   {
/* 41:55 */     return this.seller;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setSeller(InsPerson seller)
/* 45:   */   {
/* 46:58 */     this.seller = seller;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getSignAlipayId()
/* 50:   */   {
/* 51:62 */     return this.signAlipayId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setSignAlipayId(String signAlipayId)
/* 55:   */   {
/* 56:65 */     this.signAlipayId = signAlipayId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingSellerSignModel
 * JD-Core Version:    0.7.0.1
 */