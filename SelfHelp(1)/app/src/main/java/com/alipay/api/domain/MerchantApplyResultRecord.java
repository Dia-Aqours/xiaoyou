/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MerchantApplyResultRecord
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2178631766755516238L;
/* 10:   */   @ApiField("prod_name")
/* 11:   */   private String prodName;
/* 12:   */   @ApiField("prop_input_key")
/* 13:   */   private String propInputKey;
/* 14:   */   @ApiField("result_msg")
/* 15:   */   private String resultMsg;
/* 16:   */   @ApiField("result_status")
/* 17:   */   private String resultStatus;
/* 18:   */   @ApiField("result_type")
/* 19:   */   private String resultType;
/* 20:   */   
/* 21:   */   public String getProdName()
/* 22:   */   {
/* 23:47 */     return this.prodName;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setProdName(String prodName)
/* 27:   */   {
/* 28:50 */     this.prodName = prodName;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getPropInputKey()
/* 32:   */   {
/* 33:54 */     return this.propInputKey;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setPropInputKey(String propInputKey)
/* 37:   */   {
/* 38:57 */     this.propInputKey = propInputKey;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getResultMsg()
/* 42:   */   {
/* 43:61 */     return this.resultMsg;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setResultMsg(String resultMsg)
/* 47:   */   {
/* 48:64 */     this.resultMsg = resultMsg;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getResultStatus()
/* 52:   */   {
/* 53:68 */     return this.resultStatus;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setResultStatus(String resultStatus)
/* 57:   */   {
/* 58:71 */     this.resultStatus = resultStatus;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getResultType()
/* 62:   */   {
/* 63:75 */     return this.resultType;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setResultType(String resultType)
/* 67:   */   {
/* 68:78 */     this.resultType = resultType;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantApplyResultRecord
 * JD-Core Version:    0.7.0.1
 */