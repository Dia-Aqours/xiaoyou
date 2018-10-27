/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarOrderRefundResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1182979787664493837L;
/* 10:   */   @ApiField("err_msg")
/* 11:   */   private String errMsg;
/* 12:   */   @ApiField("success")
/* 13:   */   private String success;
/* 14:   */   
/* 15:   */   public void setErrMsg(String errMsg)
/* 16:   */   {
/* 17:30 */     this.errMsg = errMsg;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getErrMsg()
/* 21:   */   {
/* 22:33 */     return this.errMsg;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setSuccess(String success)
/* 26:   */   {
/* 27:37 */     this.success = success;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getSuccess()
/* 31:   */   {
/* 32:40 */     return this.success;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarOrderRefundResponse
 * JD-Core Version:    0.7.0.1
 */