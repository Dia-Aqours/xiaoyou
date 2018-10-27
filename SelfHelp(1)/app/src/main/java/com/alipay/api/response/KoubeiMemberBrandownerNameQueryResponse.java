/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMemberBrandownerNameQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3559322788138915529L;
/* 10:   */   @ApiField("name")
/* 11:   */   private String name;
/* 12:   */   
/* 13:   */   public void setName(String name)
/* 14:   */   {
/* 15:24 */     this.name = name;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getName()
/* 19:   */   {
/* 20:27 */     return this.name;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMemberBrandownerNameQueryResponse
 * JD-Core Version:    0.7.0.1
 */