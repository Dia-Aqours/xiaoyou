/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicPartnerMenuQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6233757797743576363L;
/* 10:   */   @ApiField("public_menu")
/* 11:   */   private String publicMenu;
/* 12:   */   
/* 13:   */   public void setPublicMenu(String publicMenu)
/* 14:   */   {
/* 15:24 */     this.publicMenu = publicMenu;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getPublicMenu()
/* 19:   */   {
/* 20:27 */     return this.publicMenu;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicPartnerMenuQueryResponse
 * JD-Core Version:    0.7.0.1
 */