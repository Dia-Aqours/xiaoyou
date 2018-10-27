/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCardDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3679564367324259319L;
/* 10:   */   @ApiField("ext_info")
/* 11:   */   private String extInfo;
/* 12:   */   @ApiField("out_serial_no")
/* 13:   */   private String outSerialNo;
/* 14:   */   @ApiField("reason_code")
/* 15:   */   private String reasonCode;
/* 16:   */   @ApiField("target_card_no")
/* 17:   */   private String targetCardNo;
/* 18:   */   @ApiField("target_card_no_type")
/* 19:   */   private String targetCardNoType;
/* 20:   */   
/* 21:   */   public String getExtInfo()
/* 22:   */   {
/* 23:55 */     return this.extInfo;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setExtInfo(String extInfo)
/* 27:   */   {
/* 28:58 */     this.extInfo = extInfo;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getOutSerialNo()
/* 32:   */   {
/* 33:62 */     return this.outSerialNo;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setOutSerialNo(String outSerialNo)
/* 37:   */   {
/* 38:65 */     this.outSerialNo = outSerialNo;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getReasonCode()
/* 42:   */   {
/* 43:69 */     return this.reasonCode;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setReasonCode(String reasonCode)
/* 47:   */   {
/* 48:72 */     this.reasonCode = reasonCode;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getTargetCardNo()
/* 52:   */   {
/* 53:76 */     return this.targetCardNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setTargetCardNo(String targetCardNo)
/* 57:   */   {
/* 58:79 */     this.targetCardNo = targetCardNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getTargetCardNoType()
/* 62:   */   {
/* 63:83 */     return this.targetCardNoType;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setTargetCardNoType(String targetCardNoType)
/* 67:   */   {
/* 68:86 */     this.targetCardNoType = targetCardNoType;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCardDeleteModel
 * JD-Core Version:    0.7.0.1
 */