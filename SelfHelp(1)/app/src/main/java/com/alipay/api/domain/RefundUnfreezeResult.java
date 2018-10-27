/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RefundUnfreezeResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5262472472856413286L;
/* 10:   */   @ApiField("freeze_no")
/* 11:   */   private String freezeNo;
/* 12:   */   @ApiField("result_code")
/* 13:   */   private String resultCode;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   @ApiField("unfreeze_amount")
/* 17:   */   private String unfreezeAmount;
/* 18:   */   @ApiField("unfreeze_no")
/* 19:   */   private String unfreezeNo;
/* 20:   */   @ApiField("unfreeze_time")
/* 21:   */   private String unfreezeTime;
/* 22:   */   
/* 23:   */   public String getFreezeNo()
/* 24:   */   {
/* 25:53 */     return this.freezeNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setFreezeNo(String freezeNo)
/* 29:   */   {
/* 30:56 */     this.freezeNo = freezeNo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getResultCode()
/* 34:   */   {
/* 35:60 */     return this.resultCode;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setResultCode(String resultCode)
/* 39:   */   {
/* 40:63 */     this.resultCode = resultCode;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getStatus()
/* 44:   */   {
/* 45:67 */     return this.status;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setStatus(String status)
/* 49:   */   {
/* 50:70 */     this.status = status;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getUnfreezeAmount()
/* 54:   */   {
/* 55:74 */     return this.unfreezeAmount;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setUnfreezeAmount(String unfreezeAmount)
/* 59:   */   {
/* 60:77 */     this.unfreezeAmount = unfreezeAmount;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getUnfreezeNo()
/* 64:   */   {
/* 65:81 */     return this.unfreezeNo;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setUnfreezeNo(String unfreezeNo)
/* 69:   */   {
/* 70:84 */     this.unfreezeNo = unfreezeNo;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUnfreezeTime()
/* 74:   */   {
/* 75:88 */     return this.unfreezeTime;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUnfreezeTime(String unfreezeTime)
/* 79:   */   {
/* 80:91 */     this.unfreezeTime = unfreezeTime;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RefundUnfreezeResult
 * JD-Core Version:    0.7.0.1
 */