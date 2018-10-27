/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantApplyResultRecord;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AntMerchantExpandMapplyorderQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 3453568668461272677L;
/* 13:   */   @ApiField("order_no")
/* 14:   */   private String orderNo;
/* 15:   */   @ApiField("order_status")
/* 16:   */   private String orderStatus;
/* 17:   */   @ApiField("out_biz_no")
/* 18:   */   private String outBizNo;
/* 19:   */   @ApiListField("result_info")
/* 20:   */   @ApiField("merchant_apply_result_record")
/* 21:   */   private List<MerchantApplyResultRecord> resultInfo;
/* 22:   */   
/* 23:   */   public void setOrderNo(String orderNo)
/* 24:   */   {
/* 25:46 */     this.orderNo = orderNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getOrderNo()
/* 29:   */   {
/* 30:49 */     return this.orderNo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setOrderStatus(String orderStatus)
/* 34:   */   {
/* 35:53 */     this.orderStatus = orderStatus;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getOrderStatus()
/* 39:   */   {
/* 40:56 */     return this.orderStatus;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setOutBizNo(String outBizNo)
/* 44:   */   {
/* 45:60 */     this.outBizNo = outBizNo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getOutBizNo()
/* 49:   */   {
/* 50:63 */     return this.outBizNo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setResultInfo(List<MerchantApplyResultRecord> resultInfo)
/* 54:   */   {
/* 55:67 */     this.resultInfo = resultInfo;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public List<MerchantApplyResultRecord> getResultInfo()
/* 59:   */   {
/* 60:70 */     return this.resultInfo;
/* 61:   */   }
/* 62:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AntMerchantExpandMapplyorderQueryResponse
 * JD-Core Version:    0.7.0.1
 */