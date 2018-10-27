/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.YLBPriceDetailInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class MybankFinanceYulibaoPriceQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1596184754171362184L;
/* 13:   */   @ApiListField("ylb_price_detail_infos")
/* 14:   */   @ApiField("y_l_b_price_detail_info")
/* 15:   */   private List<YLBPriceDetailInfo> ylbPriceDetailInfos;
/* 16:   */   
/* 17:   */   public void setYlbPriceDetailInfos(List<YLBPriceDetailInfo> ylbPriceDetailInfos)
/* 18:   */   {
/* 19:28 */     this.ylbPriceDetailInfos = ylbPriceDetailInfos;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<YLBPriceDetailInfo> getYlbPriceDetailInfos()
/* 23:   */   {
/* 24:31 */     return this.ylbPriceDetailInfos;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.MybankFinanceYulibaoPriceQueryResponse
 * JD-Core Version:    0.7.0.1
 */