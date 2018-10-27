/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayTradeOrderSettleModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8348885413369645795L;
/* 12:   */   @ApiField("operator_id")
/* 13:   */   private String operatorId;
/* 14:   */   @ApiField("out_request_no")
/* 15:   */   private String outRequestNo;
/* 16:   */   @ApiListField("royalty_parameters")
/* 17:   */   @ApiField("open_api_royalty_detail_info_pojo")
/* 18:   */   private List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters;
/* 19:   */   @ApiField("trade_no")
/* 20:   */   private String tradeNo;
/* 21:   */   
/* 22:   */   public String getOperatorId()
/* 23:   */   {
/* 24:45 */     return this.operatorId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setOperatorId(String operatorId)
/* 28:   */   {
/* 29:48 */     this.operatorId = operatorId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getOutRequestNo()
/* 33:   */   {
/* 34:52 */     return this.outRequestNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setOutRequestNo(String outRequestNo)
/* 38:   */   {
/* 39:55 */     this.outRequestNo = outRequestNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public List<OpenApiRoyaltyDetailInfoPojo> getRoyaltyParameters()
/* 43:   */   {
/* 44:59 */     return this.royaltyParameters;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters)
/* 48:   */   {
/* 49:62 */     this.royaltyParameters = royaltyParameters;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getTradeNo()
/* 53:   */   {
/* 54:66 */     return this.tradeNo;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setTradeNo(String tradeNo)
/* 58:   */   {
/* 59:69 */     this.tradeNo = tradeNo;
/* 60:   */   }
/* 61:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeOrderSettleModel
 * JD-Core Version:    0.7.0.1
 */