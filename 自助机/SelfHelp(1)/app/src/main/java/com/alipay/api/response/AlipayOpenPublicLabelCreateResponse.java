/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicLabelCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6722699824266412388L;
/* 10:   */   @ApiField("id")
/* 11:   */   private Long id;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   
/* 15:   */   public void setId(Long id)
/* 16:   */   {
/* 17:30 */     this.id = id;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public Long getId()
/* 21:   */   {
/* 22:33 */     return this.id;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setName(String name)
/* 26:   */   {
/* 27:37 */     this.name = name;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getName()
/* 31:   */   {
/* 32:40 */     return this.name;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicLabelCreateResponse
 * JD-Core Version:    0.7.0.1
 */