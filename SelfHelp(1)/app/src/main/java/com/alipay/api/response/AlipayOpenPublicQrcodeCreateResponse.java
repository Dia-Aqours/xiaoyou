/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicQrcodeCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2399329219313841619L;
/* 10:   */   @ApiField("code_img")
/* 11:   */   private String codeImg;
/* 12:   */   @ApiField("expire_second")
/* 13:   */   private String expireSecond;
/* 14:   */   
/* 15:   */   public void setCodeImg(String codeImg)
/* 16:   */   {
/* 17:30 */     this.codeImg = codeImg;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCodeImg()
/* 21:   */   {
/* 22:33 */     return this.codeImg;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setExpireSecond(String expireSecond)
/* 26:   */   {
/* 27:37 */     this.expireSecond = expireSecond;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getExpireSecond()
/* 31:   */   {
/* 32:40 */     return this.expireSecond;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicQrcodeCreateResponse
 * JD-Core Version:    0.7.0.1
 */