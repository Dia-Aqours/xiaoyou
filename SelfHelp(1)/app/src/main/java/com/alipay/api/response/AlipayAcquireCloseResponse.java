/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayAcquireCloseResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3617827382623393521L;
/*  10:    */   @ApiField("detail_error_code")
/*  11:    */   private String detailErrorCode;
/*  12:    */   @ApiField("detail_error_des")
/*  13:    */   private String detailErrorDes;
/*  14:    */   @ApiField("is_success")
/*  15:    */   private String isSuccess;
/*  16:    */   @ApiField("out_trade_no")
/*  17:    */   private String outTradeNo;
/*  18:    */   @ApiField("result_code")
/*  19:    */   private String resultCode;
/*  20:    */   @ApiField("trade_no")
/*  21:    */   private String tradeNo;
/*  22:    */   
/*  23:    */   public void setDetailErrorCode(String detailErrorCode)
/*  24:    */   {
/*  25: 62 */     this.detailErrorCode = detailErrorCode;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getDetailErrorCode()
/*  29:    */   {
/*  30: 65 */     return this.detailErrorCode;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setDetailErrorDes(String detailErrorDes)
/*  34:    */   {
/*  35: 69 */     this.detailErrorDes = detailErrorDes;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getDetailErrorDes()
/*  39:    */   {
/*  40: 72 */     return this.detailErrorDes;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setIsSuccess(String isSuccess)
/*  44:    */   {
/*  45: 76 */     this.isSuccess = isSuccess;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getIsSuccess()
/*  49:    */   {
/*  50: 79 */     return this.isSuccess;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setOutTradeNo(String outTradeNo)
/*  54:    */   {
/*  55: 83 */     this.outTradeNo = outTradeNo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getOutTradeNo()
/*  59:    */   {
/*  60: 86 */     return this.outTradeNo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setResultCode(String resultCode)
/*  64:    */   {
/*  65: 90 */     this.resultCode = resultCode;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getResultCode()
/*  69:    */   {
/*  70: 93 */     return this.resultCode;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setTradeNo(String tradeNo)
/*  74:    */   {
/*  75: 97 */     this.tradeNo = tradeNo;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getTradeNo()
/*  79:    */   {
/*  80:100 */     return this.tradeNo;
/*  81:    */   }
/*  82:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayAcquireCloseResponse
 * JD-Core Version:    0.7.0.1
 */