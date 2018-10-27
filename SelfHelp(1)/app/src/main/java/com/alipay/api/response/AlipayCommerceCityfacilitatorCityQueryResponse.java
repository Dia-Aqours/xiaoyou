/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CityFunction;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayCommerceCityfacilitatorCityQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3783614214998421847L;
/* 13:   */   @ApiListField("citys")
/* 14:   */   @ApiField("city_function")
/* 15:   */   private List<CityFunction> citys;
/* 16:   */   
/* 17:   */   public void setCitys(List<CityFunction> citys)
/* 18:   */   {
/* 19:28 */     this.citys = citys;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<CityFunction> getCitys()
/* 23:   */   {
/* 24:31 */     return this.citys;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayCommerceCityfacilitatorCityQueryResponse
 * JD-Core Version:    0.7.0.1
 */