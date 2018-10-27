/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.InsPolicy;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class AlipayInsSceneApplicationQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 8462749489144158598L;
/* 13:   */   @ApiField("application_status")
/* 14:   */   private String applicationStatus;
/* 15:   */   @ApiField("operation_id")
/* 16:   */   private String operationId;
/* 17:   */   @ApiField("out_biz_no")
/* 18:   */   private String outBizNo;
/* 19:   */   @ApiListField("policys")
/* 20:   */   @ApiField("ins_policy")
/* 21:   */   private List<InsPolicy> policys;
/* 22:   */   @ApiField("trade_no")
/* 23:   */   private String tradeNo;
/* 24:   */   
/* 25:   */   public void setApplicationStatus(String applicationStatus)
/* 26:   */   {
/* 27:52 */     this.applicationStatus = applicationStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getApplicationStatus()
/* 31:   */   {
/* 32:55 */     return this.applicationStatus;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setOperationId(String operationId)
/* 36:   */   {
/* 37:59 */     this.operationId = operationId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getOperationId()
/* 41:   */   {
/* 42:62 */     return this.operationId;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setOutBizNo(String outBizNo)
/* 46:   */   {
/* 47:66 */     this.outBizNo = outBizNo;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String getOutBizNo()
/* 51:   */   {
/* 52:69 */     return this.outBizNo;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setPolicys(List<InsPolicy> policys)
/* 56:   */   {
/* 57:73 */     this.policys = policys;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public List<InsPolicy> getPolicys()
/* 61:   */   {
/* 62:76 */     return this.policys;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void setTradeNo(String tradeNo)
/* 66:   */   {
/* 67:80 */     this.tradeNo = tradeNo;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public String getTradeNo()
/* 71:   */   {
/* 72:83 */     return this.tradeNo;
/* 73:   */   }
/* 74:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayInsSceneApplicationQueryResponse

 * JD-Core Version:    0.7.0.1

 */