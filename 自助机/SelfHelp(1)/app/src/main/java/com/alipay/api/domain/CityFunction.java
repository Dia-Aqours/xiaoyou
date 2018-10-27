/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class CityFunction
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 5623749376242468827L;
/* 12:   */   @ApiField("city_code")
/* 13:   */   private String cityCode;
/* 14:   */   @ApiField("city_name")
/* 15:   */   private String cityName;
/* 16:   */   @ApiListField("function_type")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> functionType;
/* 19:   */   
/* 20:   */   public String getCityCode()
/* 21:   */   {
/* 22:39 */     return this.cityCode;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setCityCode(String cityCode)
/* 26:   */   {
/* 27:42 */     this.cityCode = cityCode;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCityName()
/* 31:   */   {
/* 32:46 */     return this.cityName;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setCityName(String cityName)
/* 36:   */   {
/* 37:49 */     this.cityName = cityName;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<String> getFunctionType()
/* 41:   */   {
/* 42:53 */     return this.functionType;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setFunctionType(List<String> functionType)
/* 46:   */   {
/* 47:56 */     this.functionType = functionType;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CityFunction
 * JD-Core Version:    0.7.0.1
 */