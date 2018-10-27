/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoMycarMaintainDataUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5645912838744695674L;
/* 10:   */   @ApiField("info")
/* 11:   */   private String info;
/* 12:   */   
/* 13:   */   public void setInfo(String info)
/* 14:   */   {
/* 15:24 */     this.info = info;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getInfo()
/* 19:   */   {
/* 20:27 */     return this.info;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarMaintainDataUpdateResponse

 * JD-Core Version:    0.7.0.1

 */