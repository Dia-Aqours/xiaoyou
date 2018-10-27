/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ExtBrand;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiItemExtitemBrandQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 8649417757235235435L;
/* 13:   */   @ApiListField("brand_list")
/* 14:   */   @ApiField("ext_brand")
/* 15:   */   private List<ExtBrand> brandList;
/* 16:   */   
/* 17:   */   public void setBrandList(List<ExtBrand> brandList)
/* 18:   */   {
/* 19:28 */     this.brandList = brandList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ExtBrand> getBrandList()
/* 23:   */   {
/* 24:31 */     return this.brandList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiItemExtitemBrandQueryResponse
 * JD-Core Version:    0.7.0.1
 */