/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayInsAutoCarSaveResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6284795525796527191L;
/* 10:   */   @ApiField("car_no")
/* 11:   */   private String carNo;
/* 12:   */   
/* 13:   */   public void setCarNo(String carNo)
/* 14:   */   {
/* 15:24 */     this.carNo = carNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getCarNo()
/* 19:   */   {
/* 20:27 */     return this.carNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayInsAutoCarSaveResponse
 * JD-Core Version:    0.7.0.1
 */