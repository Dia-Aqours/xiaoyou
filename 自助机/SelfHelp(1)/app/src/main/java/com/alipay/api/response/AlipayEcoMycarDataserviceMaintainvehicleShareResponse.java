/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MaintainVehicleInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayEcoMycarDataserviceMaintainvehicleShareResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2216265186848622435L;
/* 11:   */   @ApiField("info")
/* 12:   */   private MaintainVehicleInfo info;
/* 13:   */   
/* 14:   */   public void setInfo(MaintainVehicleInfo info)
/* 15:   */   {
/* 16:25 */     this.info = info;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public MaintainVehicleInfo getInfo()
/* 20:   */   {
/* 21:28 */     return this.info;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarDataserviceMaintainvehicleShareResponse
 * JD-Core Version:    0.7.0.1
 */