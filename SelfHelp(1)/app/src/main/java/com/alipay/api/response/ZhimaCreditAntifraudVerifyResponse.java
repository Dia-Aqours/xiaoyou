/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class ZhimaCreditAntifraudVerifyResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1575616898917122592L;
/* 12:   */   @ApiField("biz_no")
/* 13:   */   private String bizNo;
/* 14:   */   @ApiListField("verify_code")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> verifyCode;
/* 17:   */   
/* 18:   */   public void setBizNo(String bizNo)
/* 19:   */   {
/* 20:33 */     this.bizNo = bizNo;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String getBizNo()
/* 24:   */   {
/* 25:36 */     return this.bizNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setVerifyCode(List<String> verifyCode)
/* 29:   */   {
/* 30:40 */     this.verifyCode = verifyCode;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public List<String> getVerifyCode()
/* 34:   */   {
/* 35:43 */     return this.verifyCode;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaCreditAntifraudVerifyResponse
 * JD-Core Version:    0.7.0.1
 */