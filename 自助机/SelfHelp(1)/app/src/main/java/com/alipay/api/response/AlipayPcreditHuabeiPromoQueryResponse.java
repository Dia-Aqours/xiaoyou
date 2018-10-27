/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayPcreditHuabeiPromoQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8578948227928966364L;
/* 10:   */   @ApiField("facescore")
/* 11:   */   private String facescore;
/* 12:   */   
/* 13:   */   public void setFacescore(String facescore)
/* 14:   */   {
/* 15:24 */     this.facescore = facescore;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getFacescore()
/* 19:   */   {
/* 20:27 */     return this.facescore;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayPcreditHuabeiPromoQueryResponse

 * JD-Core Version:    0.7.0.1

 */