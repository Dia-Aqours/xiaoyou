/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ExClientRateVO;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayAccountExrateAllclientrateQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5458793982635314884L;
/* 13:   */   @ApiListField("client_rate_list")
/* 14:   */   @ApiField("ex_client_rate_v_o")
/* 15:   */   private List<ExClientRateVO> clientRateList;
/* 16:   */   
/* 17:   */   public void setClientRateList(List<ExClientRateVO> clientRateList)
/* 18:   */   {
/* 19:28 */     this.clientRateList = clientRateList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ExClientRateVO> getClientRateList()
/* 23:   */   {
/* 24:31 */     return this.clientRateList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayAccountExrateAllclientrateQueryResponse
 * JD-Core Version:    0.7.0.1
 */