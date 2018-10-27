/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ExRefRateInfoVO;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayAccountExrateRatequeryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 2486724476185535669L;
/* 13:   */   @ApiListField("rate_query_response_list")
/* 14:   */   @ApiField("ex_ref_rate_info_v_o")
/* 15:   */   private List<ExRefRateInfoVO> rateQueryResponseList;
/* 16:   */   
/* 17:   */   public void setRateQueryResponseList(List<ExRefRateInfoVO> rateQueryResponseList)
/* 18:   */   {
/* 19:28 */     this.rateQueryResponseList = rateQueryResponseList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ExRefRateInfoVO> getRateQueryResponseList()
/* 23:   */   {
/* 24:31 */     return this.rateQueryResponseList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayAccountExrateRatequeryResponse
 * JD-Core Version:    0.7.0.1
 */