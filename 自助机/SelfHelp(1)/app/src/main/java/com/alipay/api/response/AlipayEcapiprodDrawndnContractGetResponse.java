/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcapiprodDrawndnContractGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3368739626151449652L;
/* 10:   */   @ApiField("contract_content")
/* 11:   */   private String contractContent;
/* 12:   */   @ApiField("contract_no")
/* 13:   */   private String contractNo;
/* 14:   */   @ApiField("request_id")
/* 15:   */   private String requestId;
/* 16:   */   
/* 17:   */   public void setContractContent(String contractContent)
/* 18:   */   {
/* 19:36 */     this.contractContent = contractContent;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getContractContent()
/* 23:   */   {
/* 24:39 */     return this.contractContent;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setContractNo(String contractNo)
/* 28:   */   {
/* 29:43 */     this.contractNo = contractNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getContractNo()
/* 33:   */   {
/* 34:46 */     return this.contractNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setRequestId(String requestId)
/* 38:   */   {
/* 39:50 */     this.requestId = requestId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getRequestId()
/* 43:   */   {
/* 44:53 */     return this.requestId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcapiprodDrawndnContractGetResponse
 * JD-Core Version:    0.7.0.1
 */