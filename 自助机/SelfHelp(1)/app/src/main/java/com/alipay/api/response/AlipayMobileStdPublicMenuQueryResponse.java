/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobileStdPublicMenuQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6247386442799191951L;
/* 10:   */   @ApiField("all_menu_list")
/* 11:   */   private String allMenuList;
/* 12:   */   
/* 13:   */   public void setAllMenuList(String allMenuList)
/* 14:   */   {
/* 15:24 */     this.allMenuList = allMenuList;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getAllMenuList()
/* 19:   */   {
/* 20:27 */     return this.allMenuList;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobileStdPublicMenuQueryResponse
 * JD-Core Version:    0.7.0.1
 */