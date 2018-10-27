/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorStationQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4852919165449466389L;
/* 10:   */   @ApiField("city_code")
/* 11:   */   private String cityCode;
/* 12:   */   
/* 13:   */   public String getCityCode()
/* 14:   */   {
/* 15:24 */     return this.cityCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCityCode(String cityCode)
/* 19:   */   {
/* 20:27 */     this.cityCode = cityCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorStationQueryModel
 * JD-Core Version:    0.7.0.1
 */