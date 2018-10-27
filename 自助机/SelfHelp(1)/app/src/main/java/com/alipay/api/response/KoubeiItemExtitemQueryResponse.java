/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ExtItem;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class KoubeiItemExtitemQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1396333423356848286L;
/* 11:   */   @ApiField("extitem")
/* 12:   */   private ExtItem extitem;
/* 13:   */   
/* 14:   */   public void setExtitem(ExtItem extitem)
/* 15:   */   {
/* 16:25 */     this.extitem = extitem;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public ExtItem getExtitem()
/* 20:   */   {
/* 21:28 */     return this.extitem;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiItemExtitemQueryResponse
 * JD-Core Version:    0.7.0.1
 */