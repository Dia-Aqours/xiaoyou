/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarDataserviceViolationinfoShareResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2744258782941496159L;
/* 10:   */   @ApiField("body_num")
/* 11:   */   private String bodyNum;
/* 12:   */   @ApiField("engine_num")
/* 13:   */   private String engineNum;
/* 14:   */   @ApiField("vehicle_id")
/* 15:   */   private String vehicleId;
/* 16:   */   @ApiField("vi_number")
/* 17:   */   private String viNumber;
/* 18:   */   
/* 19:   */   public void setBodyNum(String bodyNum)
/* 20:   */   {
/* 21:42 */     this.bodyNum = bodyNum;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getBodyNum()
/* 25:   */   {
/* 26:45 */     return this.bodyNum;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setEngineNum(String engineNum)
/* 30:   */   {
/* 31:49 */     this.engineNum = engineNum;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getEngineNum()
/* 35:   */   {
/* 36:52 */     return this.engineNum;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setVehicleId(String vehicleId)
/* 40:   */   {
/* 41:56 */     this.vehicleId = vehicleId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getVehicleId()
/* 45:   */   {
/* 46:59 */     return this.vehicleId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setViNumber(String viNumber)
/* 50:   */   {
/* 51:63 */     this.viNumber = viNumber;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getViNumber()
/* 55:   */   {
/* 56:66 */     return this.viNumber;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarDataserviceViolationinfoShareResponse
 * JD-Core Version:    0.7.0.1
 */